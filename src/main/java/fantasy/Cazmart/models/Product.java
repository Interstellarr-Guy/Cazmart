package fantasy.Cazmart.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class Product {
    
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	
	private String name;
	private String brand;
	private String category;
	private Double price;
	
	@Column(columnDefinition = "TEXT")
	private String Description;
	private Date cretaed_at;
	private String imageFileName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	
	public Date getCretaed_at() {
		return cretaed_at;
	}
	public void setCretaed_at(Date cretaed_at) {
		this.cretaed_at = cretaed_at;
	}
	public String getImageFileName() {
		return imageFileName;
	}
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}
	
	
}
