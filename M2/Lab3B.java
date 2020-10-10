import java.util.Scanner;

class Lab3B {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int Course1Hours;
      System.out.print("Course 1 Hours: ");
      Course1Hours = scan.nextInt();
      int Course1Grade;
      System.out.print("Grade for Course 1: ");
      Course1Grade = scan.nextInt();
      int Course2Hours;
      System.out.print("Course 2 Hours: ");
      Course2Hours = scan.nextInt();
      int Course2Grade;
      System.out.print("Grade for Course 2: ");
      Course2Grade = scan.nextInt();
      int Course3Hours;
      System.out.print("Course 3 Hours: ");
      Course3Hours = scan.nextInt();
      int Course3Grade;
      System.out.print("Grade for Course 3: ");
      Course3Grade = scan.nextInt();
      int Course4Hours;
      System.out.print("Course 4 Hours: ");
      Course4Hours = scan.nextInt();
      int Course4Grade;
      System.out.print("Grade for Course 4: ");
      Course4Grade = scan.nextInt();

//  To calculate the quality points that you earn for just one course, multiply the number of hours of that course * the quality points you earn for that course.
      double CourseHours = Course1Hours + Course2Hours + Course3Hours + Course4Hours;
      double QP1 = Course1Hours * Course1Grade;
      double QP2 = Course2Hours * Course2Grade;
      double QP3 = Course3Hours * Course3Grade;
      double QP4 = Course4Hours * Course4Grade;

//  To calculate your GPA for an entire semester, you take the total number of quality points earned that semester and divide through by the total number of hours taken that semester.
      double QPTotal = QP1 + QP2 + QP3 + QP4;
      double GPA = QPTotal / CourseHours;
      System.out.println("Total hours is: " + CourseHours);
      System.out.println("Total quality points is: " + QPTotal);
      System.out.println("Your GPA for this semester is " + GPA);

  }
}
