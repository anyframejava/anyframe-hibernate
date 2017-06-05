package org.anyframe.sample.hibernate.model.bidirection.concurrency.pessimistic;

// Generated 2008. 9. 1 ���� 1:00:42 by Hibernate Tools 3.2.1.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Movie generated by hbm2java
 */
public class Movie implements java.io.Serializable {

	private String movieId;
	private Country country;
	private String title;
	private String director;
	private Date releaseDate;
	private Set categories = new HashSet(0);

	// add some attributes for selecting result
	private String categoryName;
	private String countryName;

	public Movie() {
	}

	public Movie(String movieId, String title, String director) {
		this.movieId = movieId;
		this.title = title;
		this.director = director;
	}

	public Movie(String movieId, Country country, String title,
			String director, Date releaseDate, Set categories) {
		this.movieId = movieId;
		this.country = country;
		this.title = title;
		this.director = director;
		this.releaseDate = releaseDate;
		this.categories = categories;
	}

	public Movie(String movieId, String title, String director,
			String categoryName, String countryName) {
		this.movieId = movieId;
		this.title = title;
		this.director = director;
		this.categoryName = categoryName;
		this.countryName = countryName;
	}

	public String getMovieId() {
		return this.movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return this.director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Date getReleaseDate() {
		return this.releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Set getCategories() {
		return this.categories;
	}

	public void setCategories(Set categories) {
		this.categories = categories;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public String getCountryName() {
		return countryName;
	}

}
