package model;

public class Test extends patient{


    public Test(int id, String name, int patient_id, String patient_name,double blood_test,double urine_test, double wholebody_test,double eye_test) {
        super(id, name, patient_id, patient_name);
        this.blood_test = blood_test;
        this.urine_test = urine_test;
        this.wholebody_test = wholebody_test;
        this.eye_test = eye_test;
    }

    double blood_test = 500;
    double urine_test = 200;
    double wholebody_test = 2000;
    double eye_test = 1000;


//    public Test(int id, String name, int patient_id, String patient_name) {
//        super();
//    }
}

