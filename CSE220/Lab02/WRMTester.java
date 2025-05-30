public class WRMTester {
    public static void main(String[] args) {
        System.out.println("** Welcome to Waiting Room Management System **");
          
        System.out.println("==============Test Case 1=============");
        WRM room = new WRM();
        System.out.println("Expected output:Success registering patient");
        room.registerPatient(112,"Nafiz",22,"O+");
        System.out.println("Expected output:Success registering patient");
        room.registerPatient(113,"Shahriar",23,"A+");
        System.out.println("Expected output:Success registering patient");
        room.registerPatient(112,"Sami",24,"B+");
        System.out.println("Expected output:Nafiz is served");
        room.servePatient();
        System.out.println("Expected output:false");
        System.out.println(room.canDoctorGoHome());
        System.out.println("Expected output:Shahriar Sami");
        room.showAllPatient();
        System.out.println("Expected output:Successfully reversed the line");
        room.reverseTheLine();
        System.out.println("Expected output:Sami Shahriar");
        room.showAllPatient();
        System.out.println("Expected output:All appointments cancelled");
        room.cancelAll();
        System.out.println("Expected output:true");
        System.out.println(room.canDoctorGoHome());      
        System.out.println("==============Test Case 2=============");
        WRM room2= new WRM();
        System.out.println("Expected output:Success registering patient");
        room2.registerPatient(420,"Joseph",22,"O+");
        System.out.println("Expected output:Success registering patient");
        room.registerPatient(421,"Arham",23,"A+");
        System.out.println("Expected output:Success registering patient");
        room2.registerPatient(434,"Ibsund",24,"B+");
        System.out.println("Expected output:Success registering patient");
        room2.registerPatient(475,"Aftab",24,"O-");
        System.out.println("Expected output:Joseph is served");
        room2.servePatient();
        System.out.println("Expected output:false");
        System.out.println(room2.canDoctorGoHome());
        System.out.println("Expected output:Arham Ibsund Aftab");
        room2.showAllPatient();
        System.out.println("Expected output:Successfully reversed the line");
        room2.reverseTheLine();
        System.out.println("Expected output:Aftab Ibsund Arham");
        room2.showAllPatient();
        System.out.println("Expected output:Aftab is served");
        room2.servePatient();
        System.out.println("Expected output:All appointments cancelled");
        room2.cancelAll();
        System.out.println("Expected output:true");
        System.out.println(room2.canDoctorGoHome());  
        
    }
}