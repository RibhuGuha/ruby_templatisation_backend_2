package com.mycompany.group234.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.mycompany.group234.model.Category;
import com.mycompany.group234.model.Product;
import com.mycompany.group234.model.Document;
import com.mycompany.group234.enums.ProductCreator;
import com.mycompany.group234.converter.ProductCreatorConverter;
import com.mycompany.group234.converter.DurationConverter;
import com.mycompany.group234.converter.UUIDToByteConverter;
import com.mycompany.group234.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Product")
@Table(name = "\"Product\"", schema =  "\"ExclusiveAccess\"")
@Data
                        
public class Product {
	public Product () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"ProductId\"", nullable = true )
  private Long productId;
	  
  @Column(name = "\"ProductName\"", nullable = true )
  private String productName;
  
	  
  @Column(name = "\"ProductDescription\"", nullable = true )
  private String productDescription;
  
	  
  @Column(name = "\"IconName\"", nullable = true )
  private String iconName;
  
	  
  @Column(name = "\"Dispatched\"", nullable = true )
  private Boolean dispatched;
  
	  
  @Column(name = "\"CreatedDate\"", nullable = true )
  @Temporal(value = TemporalType.TIMESTAMP)
  private Date createdDate;  
  
	  
  @Column(name = "\"Creator\"", nullable = true)
  @Enumerated(value = EnumType.ORDINAL)
  @Convert(converter = ProductCreatorConverter.class)
  private ProductCreator creator;
  
  
  
  
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "\"ProductP_Category\"", referencedColumnName = "\"CategoryId\"", insertable = false, updatable = false)
	private Category p_Category;
	
	@Column(name = "\"ProductP_Category\"")
	private Long productP_Category;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "\"ProductScreenShotBig\"", referencedColumnName = "\"DocId\"", insertable = false, updatable = false)
	private Document screenShotBig;
	
	@Column(name = "\"ProductScreenShotBig\"")
	private Long productScreenShotBig;
   
	
@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"ProductOtherImages\"",
            joinColumns = @JoinColumn( name="\"ProductId\""),
            inverseJoinColumns = @JoinColumn( name="\"DocId\""), schema = "\"ExclusiveAccess\"")
private List<Document> otherImages = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Product [" 
  + "ProductId= " + productId  + ", " 
  + "ProductName= " + productName  + ", " 
  + "ProductDescription= " + productDescription  + ", " 
  + "IconName= " + iconName  + ", " 
  + "Dispatched= " + dispatched  + ", " 
  + "CreatedDate= " + createdDate  + ", " 
  + "Creator= " + creator 
 + "]";
	}
	
}