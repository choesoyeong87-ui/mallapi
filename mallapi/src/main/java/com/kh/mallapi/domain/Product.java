package com.kh.mallapi.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity 
@Table(name = "tbl_product") 
@Getter 
@ToString(exclude = "imageList") 
@Builder 
@AllArgsConstructor 
@NoArgsConstructor 
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRODUCT_SEQ_GEN")
	private Long  pno; 
	private String  pname; 
	private int price; 
	private String  pdesc;  
	
	@ElementCollection
	@Builder.Default
	private List<ProductImage> imageList = new ArrayList<>();
}
