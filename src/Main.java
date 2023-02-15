
import model.Department;
import model.Doctor;
import model.patient;
import model.bill;

import javax.naming.Name;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int input1;
        int input2;
        int input3;
        int input4;
        int input5;
        int inputbooking;
        boolean inputtest;

        bill bill1 = new bill(1, "ssddd", 1, "hshshs", 200, 300, 2000, 500);

        Department department1 = new Department(1, "Emergency");

        patient p1 = new patient(2, "Ram");

        Doctor d1 = new Doctor(1, "civil", "Dr someone", "Neuro", "2-3");
        Doctor d2 = new Doctor(1, "civil", "Dr OJ", "Neuro", "3-4");
        Doctor d3 = new Doctor(1, "civil", "Dr Bhola", "Neuro", "4-5");
        Doctor d4 = new Doctor(1, "civil", "Dr Elsa", "ENT", "2-3");
        Doctor d5 = new Doctor(1, "civil", "Dr Phoebe", "ENT", "3-4");
        Doctor d6 = new Doctor(1, "civil", "Dr diya", "ENT", "4-5");
        Doctor d7 = new Doctor(1, "civil", "Dr miya", "Dental", "2-3");
        Doctor d8 = new Doctor(1, "civil", "Dr siya", "Dental", "3-4");
        Doctor d9 = new Doctor(1, "civil", "Dr hello", "Dental", "4-5");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for Appointment");
        System.out.println("Enter 2 for Booking");
        input1 = scanner.nextInt();
        if (input1 == 1) {
            System.out.println("In which department will you like to make an appointment");
            System.out.println("1 Neuro");
            System.out.println("2 ENT");
            System.out.println("3 Dental");

            System.out.println("Enter");
            input2 = scanner.nextInt();

            if (input2 == 1) {
                System.out.println("Enter Appointment date");
                Scanner Appointment = new Scanner(System.in);
                String Appointment_date = Appointment.nextLine();
                System.out.println("Press 1 to select ");
                d1.getDoctor();
                System.out.println("Press 2 to select ");
                d2.getDoctor();
                System.out.println("Press 3 to select ");
                d3.getDoctor();


                input3 = scanner.nextInt();

                if (input3 == 1) {


                    System.out.println("Your appointment is set with " + d1.getDoctor_name() + " on " + Appointment_date + " at " + d1.getAvailability());
                }
                if (input3 == 2) {
                    System.out.println("Your appointment is set with " + d2.getDoctor_name() + " on " + Appointment_date + " at " + d1.getAvailability());
                }
                if (input3 == 3) {
                    System.out.println("Your appointment is set with " + d3.getDoctor_name() + " on " + Appointment_date + " at " + d1.getAvailability());
                }
                System.out.println("Appointment fee: Rs 500");

            }


            if (input2 == 2) {
                System.out.println("Enter Appointment date");
                Scanner Appointment1 = new Scanner(System.in);
                String Appointment_date1 = Appointment1.nextLine();
                System.out.println("Press 1 to select");
                d1.getDoctor();
                System.out.println("Press 2 to select");
                d2.getDoctor();
                System.out.println("Press 3 to select");
                d3.getDoctor();
                input4 = scanner.nextInt();
                if (input4 == 1) {
                    System.out.println("Your appointment is set with " + d4.getDoctor_name() + " on " + Appointment_date1 + " at " + d4.getAvailability());
                }
                if (input4 == 2) {
                    System.out.println("Your appointment is set with " + d5.getDoctor_name() + " on " + Appointment_date1 + " at " + d5.getAvailability());
                }
                if (input4 == 3) {
                    System.out.println("Your appointment is set with " + d6.getDoctor_name() + " on " + Appointment_date1 + " at " + d6.getAvailability());
                }
                System.out.println("Appointment fee: Rs 500");

            }

            if (input2 == 3) {
                Scanner Appointment2 = new Scanner(System.in);
                String Appointment_date2 = Appointment2.nextLine();
                System.out.println("Press 1 to select");
                d4.getDoctor();
                System.out.println("Press 2 to select");
                d5.getDoctor();
                System.out.println("Press 3 to select");
                d6.getDoctor();
                input5 = scanner.nextInt();
                if (input5 == 1) {
                    System.out.println("Your appointment is set with " + d7.getDoctor_name() + " on " + Appointment_date2 + " at " + d7.getAvailability());
                }
                if (input5 == 2) {
                    System.out.println("Your appointment is set with " + d8.getDoctor_name() + " on " + Appointment_date2 + " at " + d8.getAvailability());
                }
                if (input5 == 3) {
                    System.out.println("Your appointment is set with " + d9.getDoctor_name() + " on " + Appointment_date2 + " at " + d9.getAvailability());
                }
                System.out.println("Appointment fee: Rs 500");
            }
            System.out.println("Do you want any kind of test?");
            inputtest = scanner.nextBoolean();
            if (inputtest == true) {
                bill1.printBill();


            } else {
                System.out.println("Appointment fee: Rs 500");
            }

        }

        if (input1 == 2) {
            System.out.println("What kind of ward room do you want ?");
            System.out.println("Press 1 for General ward");
            System.out.println("Pess 2 for Premium ward");
            System.out.println("Press 3 for VIP ward");


            inputbooking = scanner.nextInt();

            System.out.println("Enter your name");
            System.out.println("Enter your Age");
            System.out.println("Enter number of beds required");

            Scanner name = new Scanner(System.in);
            String Name = name.nextLine();
            Scanner age = new Scanner(System.in);
            int Age = age.nextInt();
            Scanner bed = new Scanner(System.in);
            int Bed = bed.nextInt();

            if (inputbooking == 1) {
                System.out.println("************************BOOKING************************");
                System.out.println("Name  | Age |   Ward_Type | Number of room |  Price per bed ");
                System.out.println(Name+" | "+Age+"  |  "+"General Ward"+ " |    "+ Bed + "          |"+"3000" );

                double t1 = Bed*3000;
                double vat_rate=0.13;
                double tvat= (vat_rate * t1);
                double final_price = tvat+t1;
                System.out.println("Total cost:"+t1);
                System.out.println("VAT Amount:"+tvat );
                System.out.println("Your total payable amount is:" + final_price);

            }
            if (inputbooking == 2) {
                System.out.println("************************BOOKING************************");
                System.out.println("Name  | Age |   Ward_Type | Number of room | Total Price");
                System.out.println(Name + " | " + Age + "  |  " + "Premium Ward" + " |    " + Bed + "          |" + "  60000");
                double t1 = Bed*6000;
                double vat_rate=0.13;
                double tvat= (vat_rate * t1);
                double final_price = tvat+t1;
                System.out.println("Total cost:"+t1);
                System.out.println("VAT Amount:"+tvat );
                System.out.println("Your total payable amount is:" + final_price);

            }
            if (inputbooking == 3) {
                System.out.println("************************BOOKING************************");
                System.out.println("Name  | Age |   Ward_Type | Number of room | Total Price");
                System.out.println(Name + " | " + Age + "  |  " + "VIP Ward" + " |    " + Bed + "          |" + "  10000");
                double t1 = Bed*10000;
                double vat_rate=0.13;
                double tvat= (vat_rate * t1);
                double final_price = tvat+t1;
                System.out.println("Total cost:"+t1);
                System.out.println("VAT Amount:"+tvat );
                System.out.println("Your total payable amount is:" + final_price);

            }

        }
    }
}

