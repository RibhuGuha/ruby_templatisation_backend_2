package com.mycompany.group234.converter;

import com.mycompany.group234.enums.ProductCreator;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = false)
public class ProductCreatorConverter implements AttributeConverter<ProductCreator, Integer> {

    @Override
    public Integer convertToDatabaseColumn(ProductCreator productCreator) {
        return productCreator != null ? productCreator.ordinal() : null;
    }

    @Override
    public ProductCreator convertToEntityAttribute(Integer dbData) {
      if (dbData == null) {
        return null;
      }
		  return ProductCreator.getProductCreator(dbData);
    }
}
