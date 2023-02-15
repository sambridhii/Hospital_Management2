package model;

public class Ward extends   Department {


    public Ward(int id, String name, int department_id, String department_name, int ward_no, String ward_type, int no_of_beds) {
        super(id, name, department_id, department_name);
        this.ward_no = ward_no;
        this.ward_type = ward_type;
        this.no_of_beds = no_of_beds;
    }

    public int getWard_no() {
        return ward_no;
    }

    public void setWard_no(int ward_no) {
        this.ward_no = ward_no;
    }

    public String getWard_type() {
        return ward_type;
    }

    public void setWard_type(String ward_type) {
        this.ward_type = ward_type;
    }

    public int getNo_of_beds() {
        return no_of_beds;
    }

    public void setNo_of_beds(int no_of_beds) {
        this.no_of_beds = no_of_beds;
    }

    int ward_no;
    String ward_type;
    int no_of_beds;

    public void getWard() {
        System.out.println("*********************** Ward *********************************** ");
        System.out.println("Ward no : " + this.getWard_no());
        System.out.println("Ward Type: " + this.getWard_type());
        System.out.println("Bed no: " + this.getNo_of_beds());

    }
}
