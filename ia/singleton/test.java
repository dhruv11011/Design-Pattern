package singleton;//In singleton folder all file are been made, and all classes are public so that they can share data with each other by its requirement

public class test//make a test class which is public 
{
    public static void main(String[] args) {
        patient_name p1 = patient_name.get_ptd();//make object
        p1.patient_details();//get patient 2 details
        System.out.println();//print black space
        patient_name_2 p2 = patient_name_2.get_ptd();//make object 
        p2.patient_details();//get patient 2 details
    }
}