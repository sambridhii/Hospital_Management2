package model;

import java.util.Scanner;

public class bill extends Test{

    int bill_id;
    boolean ask;
    int n;
    double cost1;
    double cost2;
    double cost3;
    double cost4;
  Scanner scanner1 = new Scanner(System.in);
    public bill(int id, String name, int patient_id, String patient_name,double blood_test,double urine_test, double wholebody_test,double eye_test) {
        super(id, name, patient_id, patient_name,blood_test,urine_test,wholebody_test,eye_test);
    }

    public void printBill() {
        Scanner Bill = new Scanner(System.in);

        System.out.println("Enter the required test number" );
        System.out.println("1 for blood test");
        System.out.println( "2 for urine test");
        System.out.println( "3 for whole body test" );
        System.out.println("4 for eye test");


        int bill = Bill.nextInt();

            if (bill == 1) {
                System.out.println("**************BILL****************");
                cost1 = this.blood_test;
                System.out.println("The cost for the test will be :"+cost1);
                double total1 = 500 + cost1;
                System.out.println("Your total amount is " + total1);


            }
            if (bill == 2) {
                System.out.println("**************BILL****************");
                cost2 = this.urine_test;
                System.out.println("The cost for the test will be :"+cost2);
                double total2 = 500 + cost2;
                System.out.println("Your total amount is " + total2);
            }
            if (bill == 3) {
                System.out.println("**************BILL****************");
                cost3 = this.wholebody_test;
                System.out.println("The cost for the test will be :"+cost3);
                double total3 = 500 + cost3;

                System.out.println("Your total amount is " + total3);
            }
            if (bill == 4) {
                System.out.println("**************BILL****************");
                cost4 = this.eye_test;
                System.out.println("The cost for the test will be :"+cost4);
                double total4 = 500 + cost4;
                System.out.println("Your total amount is " + total4);
            }
        }
    }

