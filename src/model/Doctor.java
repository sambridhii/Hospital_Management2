package model;

public class Doctor extends Department{
    String doctor_name;
    String speciality;
    String availability;

    public Doctor(int id, String name, int department_id, String department_name) {
        super(id, name, department_id, department_name);
    }



    public Doctor(int id, String name, String doctor_name, String speciality, String availability) {
        super(id, name);
        this.doctor_name = doctor_name;
        this.speciality = speciality;
        this.availability = availability;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }



    public void getDoctor() {
        System.out.println("***DOCTOR***");
        System.out.println("Name: " + this.getDoctor_name());
        System.out.println("Speciality: " + this.getSpeciality());
        System.out.println("Availability: " + this.availability);
    }

}

