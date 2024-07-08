public class User {
   private String name;
   private String userID;
   
   public User(String name, String userID){
    this.name = name;
    this.userID = userID;
   }
   public String getName(){
    return name;
   } 
   public String getUserID(){
    return userID;
   } 
   @Override 
   public String toString(){
    return "Name: " + name + ",UserID: " + userID;
   }

}
