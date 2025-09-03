class GradeEvaluationSystem{

public static void main(String args[]){

     int maths = 90;
	 int science = 95;
	 int history = 94;
	 
	 int averageMarks = (maths+science+history)/3;
	 
	  String grade;
        if (averageMarks >= 90) {
            grade = "A";
        } else if (averageMarks >= 70) {
            grade = "B";
        } else if (averageMarks >= 50) {
            grade = "C";
        } else if (averageMarks >= 30) {
            grade = "D";
        } else {
            grade = "Fail";
        }
		
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);
  }
}