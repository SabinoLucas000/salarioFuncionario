import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

      List <empolyee> emp = new ArrayList<>();

   System.out.print("Enter the number of employees: ");
   int n = sc.nextInt();
   for(int i = 0; i<n; i++) {
 System.out.println("Employee #" + (i+1) +" data:");
 System.out.print("Outsourced (y/n)?");
 char cd = sc.next().charAt(0);
 System.out.print("Name:");
 sc.nextLine();
 String name = sc.nextLine();
 System.out.print("Hours:");
 int  hours = sc.nextInt();
 System.out.print("Value per hour: "); 
 double valuePerHours = sc.nextDouble();
 if (cd == 'n') {
  emp.add(new empolyee(hours, name, valuePerHours));
 }
  else {
   
    System.out.print("Additional charge:");
    Double additionalChange = sc.nextDouble();
    emp.add(new Outsourceemployee(additionalChange, hours, name, valuePerHours));
  } 


   }
   System.out.println("");
   System.out.println("PAYMENTS:");

   for( empolyee c : emp) {
    System.out.print( c.getName() + "- $" + c.payment());
}
sc.close();
}}



    