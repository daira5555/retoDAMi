package model;

import java.sql.Date;

public class Vinyl {
private int vinylCode;
private String title;
private int artistCode;
private String artistName;
private int genreCode;
private double price;
private Date publicationDate;
private String description;
private boolean onSale;
private double salePercentage;
private int stock;
private int amountSold;
private String cover;

public Vinyl(int vinylCode, String title, int artistCode, int genreCode, double price, Date publicationDate,
		String description, boolean onSale, double salePercentage, int stock, int amountSold, String cover, String artistName) {
	super();
	this.vinylCode = vinylCode;
	this.title = title;
	this.artistName = artistName;
	this.artistCode = artistCode;
	this.genreCode = genreCode;
	this.price = price;
	this.publicationDate = publicationDate;
	this.description = description;
	this.onSale = onSale;
	this.salePercentage = salePercentage;
	this.stock = stock;
	this.amountSold = amountSold;
	this.cover = cover;
}

public Vinyl() {
	super();
}

public int getVinylCode() {
	return vinylCode;
}

public void setVinylCode(int vinylCode) {
	this.vinylCode = vinylCode;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public int getArtistCode() {
	return artistCode;
}

public void setArtistCode(int artistCode) {
	this.artistCode = artistCode;
}

public int getGenreCode() {
	return genreCode;
}

public void setGenreCode(int genreCode) {
	this.genreCode = genreCode;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Date getPublicationDate() {
	return publicationDate;
}

public void setPublicationDate(Date publicationDate) {
	this.publicationDate = publicationDate;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public boolean isOnSale() {
	return onSale;
}

public void setOnSale(boolean onSale) {
	this.onSale = onSale;
}

public double getSalePercentage() {
	return salePercentage;
}

public void setSalePercentage(double salePercentage) {
	this.salePercentage = salePercentage;
}

public int getStock() {
	return stock;
}

public void setStock(int stock) {
	this.stock = stock;
}

public int getAmountSold() {
	return amountSold;
}

public void setAmountSold(int amountSold) {
	this.amountSold = amountSold;
}

public String getCover() {
	return cover;
}

public void setCover(String cover) {
	this.cover = cover;
}

public String getArtistName() {
	return artistName;
}

public void setArtistName(String artistName) {
	this.artistName = artistName;
}


	
	
	
	
}
