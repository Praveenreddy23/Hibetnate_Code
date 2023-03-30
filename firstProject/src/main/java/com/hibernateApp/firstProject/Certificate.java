package com.hibernateApp.firstProject;

import javax.persistence.Embeddable;

 //The @Embeddable annotation is used to mark a class as being embeddable, meaning its properties can be included in another class as a value type. The class marked with @Embeddable is called the embeddable class

@Embeddable
public class Certificate {
	
		private String course;
		private String duration;
		
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public String getDuration() {
			return duration;
		}
		public void setDuration(String duration) {
			this.duration = duration;
		}
		public Certificate() {
			super();
		}
		public Certificate(String course, String duration) {
			super();
			this.course = course;
			this.duration = duration;
		}
		@Override
		public String toString() {
			return "Certificate [course=" + course + ", duration=" + duration + "]";
		}
		
		
		
	

}
