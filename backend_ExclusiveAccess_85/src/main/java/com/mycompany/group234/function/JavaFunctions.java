package com.mycompany.group234.function;

import com.mycompany.group234.model.Category;
import com.mycompany.group234.model.Product;
import com.mycompany.group234.model.Document;
import com.mycompany.group234.enums.ProductCreator;
import com.mycompany.group234.converter.ProductCreatorConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.mycompany.group234.repository.CategoryRepository;
import com.mycompany.group234.repository.ProductRepository;
import com.mycompany.group234.repository.DocumentRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
