//a java program to demostrate use of comparable
import java.io.*;
import java.util.*;

class Movie implements Comparable<Movie>{
	private double rating;
	private String name;
	private int year;
	public Movie(String name,double rating,int year){
		this.rating=rating;
		this.name=name;
		this.year=year;
	}
	//used to short movies by year
	public int compareTo(Movie m){
		return this.year-m.year;
	}	
	//Getter methods for accessing private data
	public double getRating(){return rating;}
	public String getName(){return name;}
	public int getYear(){return year;}
}

//Driver class
class Main6{
	public static void main(String[] args){
		ArrayList<Movie> list=new ArrayList<Movie>();
		list.add(new Movie("Force Awakens",8.3,2015));
		list.add(new Movie("Star wars",8.7,1977));
		list.add(new Movie("Empire strikes back",8.8,1980));
		list.add(new Movie("Return of the Jedi",8.4,1983));

		Collections.sort(list);

		System.out.println("Movies after sorting: ");
		for(Movie movie: list){
			System.out.println(movie.getName()+" "+movie.getRating()+" "+movie.getYear());
		}
	}
}
