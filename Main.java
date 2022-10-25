
package test.java;


public class Main {
    public static void main (String args[]){
        
       
      EngStudent sc = new   EngStudent("Nancy" , 20 ,"Alazhar" );
      sc.setName("Nancy");
      sc.setAge(20);
      sc.setUniverstiyName("Alazhar");
      System.out.println(sc.getName());
      System.out.println(sc.getAge());  
      System.out.println(sc.getUniverstiyName()); 
      
       System.out.println("##################");
       sc.setName("Nour");
       System.out.println(sc.getName());
      
       
      MedicalStudent sc1 = new  MedicalStudent("Muhamed" , 24 , "AUC");
     
     sc1.setName("Muhamed");
     sc1.setAge(24);
     sc1.setUniverstiyName("AUC");
      System.out.println(sc1.getName());
      System.out.println(sc1.getAge());  
      System.out.println(sc1.getUniverstiyName()); 
      
     
       
       
    }
}
