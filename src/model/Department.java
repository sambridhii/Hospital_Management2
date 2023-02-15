
package model;

public class Department extends Hospital {

    String Department_name;

    public Department(int id, String name, int department_id, String department_name) {

    }

    public String getDepartment_name() {
        return Department_name;
    }

    public void setDepartment_name(String department_name) {
        Department_name = department_name;
    }


    public Department(int id, String department_name) {
//        super(hospital_name, hospital_address, hospital_ph);
        Department_name = department_name;
    }




    public void getDepartment () {
        System.out.println("****************** DEPARTMENT *************************");
        System.out.println("Departments: " + this.getDepartment_name());
    }
}