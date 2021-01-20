package tpju.course;

public class CourseFactory {
	
	   public Course getCourse(String courseType){
		   
	      if(courseType == null){
	         return null;
	      }		
	      if(courseType.equalsIgnoreCase("voiture")){
	         return new CourseVoiture();
	         
	      } else if(courseType.equalsIgnoreCase("moto")){
	         return new CourseMoto();
	         
	      }
	      
	      return null;
	   }
	}
