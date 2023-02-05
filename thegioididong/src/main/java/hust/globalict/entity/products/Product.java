package hust.globalict.entity.products;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "product.products", catalog = "thegioididong")
public class Product implements Serializable{
	private static final long serialVersionUID = 1L;

	@Column(name = "product_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long product_id;
	
	@Column(name = "product_name", length = 255, nullable = false)
	private String product_name;
	
	@JoinColumn(name = "brand_id")
	@ManyToOne(cascade = CascadeType.ALL, optional = false)
	private Brand brand;
	
	@JoinColumn(name = "category_id")
	@ManyToOne(cascade = CascadeType.ALL, optional = false)
	private Category category;
	
	@Column(name = "model_year", length = 4, nullable = false)
	private String model_year;
	
	@Column(name = "list_price")
	private int list_price;
	
	@Column(name = "avg_rating")
	private int avg_rating;
	
	@Column(name = "total_review")
	private int total_review;
	
}