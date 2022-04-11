package pl.vistula.tasks;

   import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class Person {
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


        public class Staff {
        }
    }class Staff extends Person{
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
    }

class HR{
    public static void main(String[] args) throws IOException{
        Staff employee = new Staff ();

        employee.initialize1();
        employee.print1();
    }
}
