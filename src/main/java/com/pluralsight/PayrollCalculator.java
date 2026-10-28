package com.pluralsight;
import java.io.*;

//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;


public class PayrollCalculator {
    public static void main(String[] args) throws FileNotFoundException {


        try {
            FileReader file = new FileReader("employees.csv");
            BufferedReader reader = new BufferedReader(file);

            String input;

            while ((input = reader.readLine()) != null) {

               String[] employeeInformation  = input.split("\\|");

               int intEmployeeId = Integer.parseInt(employeeInformation[0]);
               String employeeName = employeeInformation[1];
               double newHoursWorked = Double.parseDouble(employeeInformation[2]);
               double newPayRate = Double.parseDouble(employeeInformation[3]);

               Employee chosenEmployee = new Employee(intEmployeeId,employeeName,newHoursWorked, newPayRate);


//                System.out.println("Name: " + chosenEmployee.getName());
//
//                System.out.println("Employee ID: " + chosenEmployee.getEmployeeId());
//
//                System.out.println("Gross Pay: " + chosenEmployee.getGrossPay());
//                System.out.println(" ");

                //double grossPay = chosenEmployee.getGrossPay();



                System.out.printf(" Name: %s%n ID: %d%n Gross Pay: %.2f%n \n",chosenEmployee.getName(),
                        chosenEmployee.getEmployeeId(),chosenEmployee.getGrossPay());


            }
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}



/*
throws IOException {

    BufferedWriter writer =
            new BufferedWriter(new FileWriter("employees.csv", true));

    writer.write("|"+"|"+"|" );
    writer.newLine();


    writer.close();


 */
