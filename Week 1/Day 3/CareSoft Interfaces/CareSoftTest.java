public class CareSoftTest {
    public static void main(String[] args) {
        System.out.println("Physician Tests");
        System.out.println("--------------");

        Physician doctor = new Physician(1);

        boolean physicianPinTest1 = doctor.assignPin(1234); 
        System.out.println("Physician pin assign test 1: " + (physicianPinTest1 ? "PASS" : "FAIL"));

        boolean physicianPinTest2 = !doctor.assignPin(123);  
        System.out.println("Physician pin assign test 2: " + (physicianPinTest2 ? "PASS" : "FAIL"));

        boolean physicianAuthTest1 = doctor.accessAuthorized(1);  
        System.out.println("Physician auth test 1: " + (physicianAuthTest1 ? "PASS" : "FAIL"));

        boolean physicianAuthTest2 = !doctor.accessAuthorized(2);  
        System.out.println("Physician auth test 2: " + (physicianAuthTest2 ? "PASS" : "FAIL"));
        System.out.println();

        System.out.println("AdminUser Tests");
        System.out.println("--------------");

        AdminUser admin = new AdminUser(3, "Manager");

        boolean adminPinTest1 = admin.assignPin(123456);  
        System.out.println("Admin pin assign test 1: " + (adminPinTest1 ? "PASS" : "FAIL"));

        boolean adminPinTest2 = !admin.assignPin(12345);  
        System.out.println("Admin pin assign test 2: " + (adminPinTest2 ? "PASS" : "FAIL"));

        boolean adminAuthTest1 = admin.accessAuthorized(3);  
        System.out.println("Admin auth test 1: " + (adminAuthTest1 ? "PASS" : "FAIL"));

        boolean adminAuthTest2 = !admin.accessAuthorized(101);  
        admin.accessAuthorized(102);  
        admin.accessAuthorized(103);  
        System.out.println("Admin auth test 2: " + (adminAuthTest2 ? "PASS" : "FAIL"));
        System.out.println();

        for (String incident : admin.reportSecurityIncidents()) {
            System.out.println(incident);
        }
    }
}