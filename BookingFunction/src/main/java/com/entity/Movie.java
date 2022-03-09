package com.entity;

import java.util.Arrays;
import java.util.Base64;
import java.util.Date;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;



import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;



@Component
@Entity
@Table(name = "movie")
public class Movie {



@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "movie_id")
private int id;



@Column(name = "movie_name")
private String name;



@Column(name = "duration")
private String duration;



private byte[] image;



@Column(name = "image")
public byte[] getImage() {
return this.image;
}



private String base64Image;



@Transient
public String getBase64Image() {
base64Image = Base64.getEncoder().encodeToString(this.image);
return base64Image;
}



public void setBase64Image(String base64Image) {
this.base64Image = base64Image;
}



@Column(name = "Actors_names")
private String cast_names;



@Column(name = "language")
private String Language;



@Column(name = "Ticket_price")
private int Price;// after execution make changes in JSP page.



@Column(name = "movie_start_date")
@DateTimeFormat(pattern = "dd/MM/yyyy")
@Temporal(TemporalType.DATE) // USED TO REMOVE THE TIME FRAME THAT PLACING BESIDE DATE WHEN PRINTING THE
// DATE.
private Date MovieStartDate;



@Column(name = "movie_end_date")
@DateTimeFormat(pattern = "dd/MM/yyyy")
@Temporal(TemporalType.DATE)
private Date MovieEndDate;



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



public String getDuration() {
return duration;
}



public void setDuration(String duration) {
this.duration = duration;
}



public String getCast_names() {
return cast_names;
}



public void setCast_names(String cast_names) {
this.cast_names = cast_names;
}



public String getLanguage() {
return Language;
}



public void setLanguage(String language) {
Language = language;
}



public int getPrice() {
return Price;
}



public void setPrice(int price) {
Price = price;
}



public Date getMovieStartDate() {
return MovieStartDate;
}



public void setMovieStartDate(Date movieStartDate) {
MovieStartDate = movieStartDate;
}



public Date getMovieEndDate() {
return MovieEndDate;
}



public void setMovieEndDate(Date movieEndDate) {
MovieEndDate = movieEndDate;
}



public Movie(String name, String duration, byte[] image, String base64Image, String cast_names, String language,
int price, Date movieStartDate, Date movieEndDate) {
super();
this.name = name;
this.duration = duration;
this.image = image;
this.base64Image = base64Image;
this.cast_names = cast_names;
Language = language;
Price = price;
MovieStartDate = movieStartDate;
MovieEndDate = movieEndDate;
}



public Movie() {
super();
}



@Override
public String toString() {
return "ShowMovie [id=" + id + ", name=" + name + ", duration=" + duration + ", image=" + Arrays.toString(image)
+ ", base64Image=" + base64Image + ", cast_names=" + cast_names + ", Language=" + Language + ", Price="
+ Price + ", MovieStartDate=" + MovieStartDate + ", MovieEndDate=" + MovieEndDate + "]";
}



}
