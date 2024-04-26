package com.DAH.graphEducation.Models.Converters;

import com.DAH.graphEducation.Models.Users.DAHVenue.VenueType;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)

public class VenueTypeConverter implements AttributeConverter<VenueType,String>{

    @Override
    public String convertToDatabaseColumn(VenueType venueType) {
        if (venueType == null) {
            return null;
        }
        return venueType.toString();
    }

    @Override
    public VenueType convertToEntityAttribute(String code) {
        if (code == null) {
            return null;
        }
    
        return Stream.of(VenueType.values())
          .filter(c -> c.toString().equals(code))
          .findFirst()
          .orElseThrow(IllegalArgumentException::new);
    }
}
