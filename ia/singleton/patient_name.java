package singleton;//In singleton folder all file are been made, and all classes are public so that they can share data with each other by its requirement

public class patient_name // make a public class patient_name
{
    int test_no;// test_no is an interger type
    String P_name;// P_name is a String type variable
    String p_email_id;// p_email_id is a String type variable

    private patient_name(int test_no, String P_name, String p_email_id)// parameterized constractor
    {
        this.test_no = test_no;// instance variable call declare
        this.P_name = P_name;// instance variable call declare
        this.p_email_id = p_email_id;// instance variable call declare
    }

    private static patient_name ptd = new patient_name(12, "dhruv bhatt", "dhruv.bce21@gmail.com");

    public static patient_name get_ptd() {
        return ptd;// return ptd
    }

    public void patient_details()// we make patient_details which return type is void means null
    {
        System.out.println("Patient No :" + ptd.test_no);// printing details
        System.out.println("Patient Name :" + ptd.P_name);// printing details
        System.out.println("Patient Emailid :" + ptd.p_email_id);// printing details
    }
}