
package test.java;


public class EngStudent {
    
    private String name;
    private int age;
    private String UniverstiyName;
    
   public  EngStudent(String name ,int age , String UniverstiyName){
       
       this.name=name;
       this.age=age;
       this.UniverstiyName=UniverstiyName;
       
       
   }

   
  public String getName() {
      return name;
  } 
    
   public int getAge() {
      return age;
  } 
     
  public String getUniverstiyName() {
      return UniverstiyName;
  } 
      
    
   public void setName(String name) {
      this.name=name;
  } 
     
   public void setAge(int age) {
      this.age=age;
  }  
    
    public void setUniverstiyName(String UniverstiyName) {
      this.UniverstiyName=UniverstiyName;
  } 
    
    
    
    
}
