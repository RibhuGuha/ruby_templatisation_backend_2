package com.mycompany.group234.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.mycompany.group234.model.Category;
import com.mycompany.group234.model.Product;
import com.mycompany.group234.model.Document;
import com.mycompany.group234.enums.ProductCreator;
import com.mycompany.group234.converter.ProductCreatorConverter;

@Entity(name = "ProductOtherImages")
@Table(schema = "\"ExclusiveAccess\"", name = "\"ProductOtherImages\"")
@Data
public class ProductOtherImages{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"ProductId\"")
	private Long productId;

    
    @Column(name = "\"DocId\"")
    private Long docId;
 
}