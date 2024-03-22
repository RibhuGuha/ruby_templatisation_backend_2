package com.mycompany.group234.enums;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmEnumeration;

@EdmEnumeration	  
public enum ProductCreator{
	    Replicacia,
	    Others; 
    public int value(ProductCreator productCreator) {
        return productCreator.ordinal();
    }
    public static ProductCreator getProductCreator(int ordinal) {
        for(ProductCreator productCreator : ProductCreator.values())
                if(productCreator.ordinal() == ordinal)
                        return productCreator;
        return null;
    }
}


