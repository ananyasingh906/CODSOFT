import java.util.*;
public class grade_calc {
  float maths;
  float science;
  float english;
  float art;

  grade_calc(){
    maths=0f;
    science=0f;
    english=0f;
    art=0f;
  }

  void input(){
    Scanner sc = new Scanner(System.in);
    try{
    System.out.println("Enter marks of Maths: ");
    maths = sc.nextFloat();
    System.out.println("Enter marks of Science: ");
    science = sc.nextFloat();
    System.out.println("Enter marks of English: ");
    english = sc.nextFloat();
    System.out.println("Enter marks of Arts: ");
    art = sc.nextFloat();
    } finally{
      sc.close();
    }
  }

  float calc_sum(){
    float sum = maths + science + english + art;
    return sum;
  }

  float calc_avg(){
    float avg =(maths+science+english+art)/4;
    return avg;
  }
  String calc_grade(){
    String grd = "";
    if (calc_avg() >= 90)
      grd = "A+";
    if (calc_avg() < 90 && calc_avg() >= 80)
      grd="A";
    if (calc_avg() < 80 && calc_avg() >= 70)
      grd ="B+";
    if (calc_avg() < 70 && calc_avg() >= 60)
      grd = "B";
    if (calc_avg() < 60 && calc_avg() >= 50)
      grd = "C+";
    if (calc_avg() < 50 && calc_avg() >= 40)
      grd = "C";
    if (calc_avg() < 40 && calc_avg() >= 30)
      grd = "D";
    if (calc_avg() < 30)
      grd = "F";
    return grd;
  }
  
  void display(){
    System.out.println("Sum of all marks: " + calc_sum());
    System.out.println("Average % of all marks: " + calc_avg() + "%");
    System.out.println("Grade: " + calc_grade());
  }
  public static void main(String args[]){
    int size;
    Scanner sc = new Scanner (System.in); 
    try{
      System.out.println("Enter number of students: ");
      size = sc.nextInt();
    } finally {
      sc.close();
    }
    grade_calc obj[] = new grade_calc[size];
    for (int i=0 ; i<size; i++){
      obj [i] =new grade_calc ();
      obj [i].input();
      obj [i].display();
    }
  }
}
