package cis232.lab;

public class Student implements Comparable<Student>{
	String name;
	int points;
	boolean here;
	
	
	public String getStringHere(){
		if(here){
			return "y";
		}else{
			return "n";
		}
	}
	public boolean getHere(){
		return here;
	}
	public void setHere(String here){
		if(here.equalsIgnoreCase("N")){
			this.here = false;
		}else{
			this.here = true;
		}
	}
	public Student(){
		
	}
	public Student(String name, int points, String here){
		this.name = name;
		this.points = points;
		setHere(here);
	}
	
	public void addPoint(){
		points++;
	}
	
	public String toString(){
		return name;
	}
	
	public String toCsvString(){
		return String.format("%s,%d,%s", name, points, getStringHere() );
	}
	
	public int getPoints(){
		return points;
	}


	/**
	 * Compares this student object to another student object to sort highest points to lowest.
	 * @return -1 if this student has more points, 1 if this student has
	 * fewer points, or 0 if they have the same number of points.
	 */
	@Override
	public int compareTo(Student other) {
		if(this.points < other.points){
			return 1;
		} else if(this.points > other.points){
			return - 1;
		} else {
			return 0;
		}
	}
}
