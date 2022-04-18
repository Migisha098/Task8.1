package pl.vistula.tasks;

   import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


interface salary {
    public void salaryToPayFabrine57098(int hoursFabrine57098, int rateFabrine57098, int computeSalary57098);

    default int salaryOvertimeFabrine57098(int hoursFabrine57098, int rateFabrine57098) {
        int computeSalary57098 = hoursFabrine57098 * rateFabrine57098;
        return computeSalary57098;
    };
    static int bonusFabrine57098(int yearsOfExperienceFabrine57098 ) {

        if (yearsOfExperienceFabrine57098 > 5) {
            return 100;

        } else {
            return 0;
        }
    };


     public class Person{
        String nameFabrine57098;
        String surnameFabrine57098 ;
        String streetFabrine57098 ;
        String zipCodeFabrine57098;
        String cityFabrine57098;

        public void initialize ()throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("This program retrieves data from a person");
            System.out.println("Enter your surname: " );
            surnameFabrine57098 = br.readLine();
            System.out.println("Enter your name : ");
            nameFabrine57098 = br.readLine();
            System.out.println("Enter your street :");
            streetFabrine57098 = br.readLine();
            System.out.println("Enter your zipCode : ");
            zipCodeFabrine57098= br.readLine();
            System.out.println("Enter the city : ");
            cityFabrine57098 = br.readLine();
        }

        public void print(){
            System.out.println("Displaying the data.");
            System.out.println("............................");
            System.out.println("surname : "+ surnameFabrine57098);
            System.out.println("name :"+ nameFabrine57098 );
            System.out.println("street : "+ streetFabrine57098);
            System.out.println("zipCode: " + zipCodeFabrine57098);
            System.out.println("city : "+ cityFabrine57098 );

        }

         public int salaryToPayFabrine57098(int i, int i1) {
             return 0;
         }


         public static class Staff {
        }
    }class Staff extends Person implements salary{
        String education;
        String position;

        public void initialize1() throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            initialize();
            System.out.println("Enter your Education :");
            education = br.readLine();
            System.out.println("Enter your Position :");
            position=br.readLine();
        }

        public void print1() {
            print();
            System.out.println(" Education: " +  education);
            System.out.println(" position :"+ position);


        }

        @Override
        public void salaryToPayFabrine57098(int hoursFabrine57098, int rateFabrine57098, int computeSalary57098) {

        }

        @Override
        public int salaryOvertimeFabrine57098(int hoursFabrine57098, int rateFabrine57098) {
            return salary.super.salaryOvertimeFabrine57098(hoursFabrine57098, rateFabrine57098);
        }
    }

class HR{
    public static void main(String[] args) throws IOException{
        Staff employee = new Staff ();

        employee.initialize1();
        employee.print1();

        int salary = employee.salaryToPayFabrine57098(150,30);
        System.out.println("The Employee received a salary in the amount of"+ salary);

        int salaryOvertime = employee.salaryOvertimeFabrine57098(12 ,75 );
        System.out.println("The Employee received a salary for overtime in the amount of ");

        pl.vistula.tasks.salary Salary;
        int bonusFabrine57098 = pl.vistula.tasks.salary.bonusFabrine57098(7);
        System.out.println("The employee received a bonus in the amount of "+ bonusFabrine57098);
    }

}
















}