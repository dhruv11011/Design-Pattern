package singleton;//In singleton folder all file are been made, and all classes are public so that they can share data with each other by its requirement

public class patient_name_2 {
    int test_no;// test_no is an interger type
    String P_name;// P_name is a String type variable
    String p_email_id;// p_email_id is a String type variable
    static patient_name_2 ptd = null;

    private patient_name_2(int test_no, String P_name, String string) 
    {
        this.test_no = test_no;//instance variable call declare
        this.P_name = P_name;//instance variable call declare
    }

    public static patient_name_2 get_ptd() 
    {
        if (ptd == null)//if ptd null ke equal hoga to if ka code execute hoga
        {
            ptd = new patient_name_2(13, "Niv Doshi", "niv.nce21@gmail.com");
        }
        return ptd;
    }

    public void patient_details() {
        System.out.println("Patient No :" + ptd.test_no);// printing details
        System.out.println("Patient Name :" + ptd.P_name);// printing details
        System.out.println("Patient Emailid :" + ptd.p_email_id);// printing details
    }
}