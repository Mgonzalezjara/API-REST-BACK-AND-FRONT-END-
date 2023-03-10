package com.edutecno.PruebaTDBack.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "stocks")

public class Stocks {

	@Id
	@JoinColumn(name = "store_id", referencedColumnName = "store_id")
	@Column(name= "store_id")
	private Integer storeId;
	
	@JoinColumn(name = "product_id", referencedColumnName = "product_id")
	@Column(name= "product_id")
	private Integer productId;
	
	@Column(name= "quantity")
	private Integer quantity;
	
}
