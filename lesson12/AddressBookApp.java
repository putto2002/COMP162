
public class AddressBookApp{
   private static AddressBookEntry addressBook;
   public static void main(String[] args){
      addNewContact(new AddressBookEntry("James", "Harden", "0210453323", "harden@nets.com"));
      addNewContact(new AddressBookEntry("Kevin", "Durant", "0210453323", "Kevin@nets.com"));
      addNewContact(new AddressBookEntry("Kyrie", "Irving", "0210453323", "Kyrie@nets.com"));
      
      
   
   
      System.out.println(display());
      
      removeContactByName("James", "Harden");
      
      System.out.println(display());


      
     
   
   }
   public static void addNewContact(AddressBookEntry contact){
      if(addressBook == null){
         addressBook = contact;
         return;
      }
      AddressBookEntry current = addressBook;

      if(contact.getLName().compareTo(current.getFName()) < 0 ){
         contact.nextPtr = current;
         addressBook = contact;
         return;
      }
      
      while(current != null){
         if(contact.getLName().compareTo(current.getLName()) >= 0){
            contact.nextPtr = current.nextPtr;
            current.nextPtr = contact;
            return;
       
         }
         current = current.nextPtr;
      }

   }
   
   public static void removeContactByName(String fName, String lName){
      AddressBookEntry current = addressBook;
      AddressBookEntry prev = null;
      while(current != null){
         if(current.getFName().equals(fName) & current.getLName().equals(lName)){
            if(current == addressBook){
               addressBook = current.nextPtr;
               return;
            } else {
               prev.nextPtr = current.nextPtr;
               return;
            }
         }
         prev = current;
         current = current.nextPtr;
      }
   }

   public static AddressBookEntry getContactByLName(String lName){
      AddressBookEntry current = addressBook;
      while(current != null){
         if(current.getLName().equals(lName)){
            return current;
         }
         current = current.nextPtr;
      }
      return null;
   }

   public static AddressBookEntry getContactByPhoneNumber(String phoneNumber){
      AddressBookEntry current = addressBook;
      while(current != null){
         if(current.getPhoneNumber().equals(phoneNumber)){
            return current;
         }
         current = current.nextPtr;

      }
      return null;
   }

   public static String display(){
      StringBuilder output = new StringBuilder();
      AddressBookEntry current = addressBook;
      while(current != null){
         output.append(current.getFName());
         output.append(" ");
         output.append(current.getLName());
         output.append(" -> ");
         current = current.nextPtr;
      }
      output.append("null\n");
      return output.toString();
   }

   private static class AddressBookEntry{
      private String fName;
      private String lName;
      private String phoneNumber;
      private String email;
      private AddressBookEntry nextPtr;
      
      public AddressBookEntry(){};
      
      public AddressBookEntry(String fName, String lName, String phoneNumber, String email){
       this.fName = fName;
       this.lName = lName;
       this.phoneNumber = phoneNumber;
       this.email = email; 
      }
      
      public void setFName(String fName){
       this.fName = fName;
      }
      
      public void setLName(String lName){
       this.lName = lName;
      }
      
      public void setPhoneNumber(String phoneNumber){
       this.phoneNumber = phoneNumber;
      }
      
      public void setEmail(String email){
       this.email = email;
      }
      
      public String getFName(){
       return this.fName;
      }
      
      public String getLName(){
       return this.lName;
      }
      
      public String getPhoneNumber(){
       return this.phoneNumber;
      }
      
      public String getEmail(){
       return this.email;
      }
      
      public String toString(){
       return "First name: " + this.fName + "\nLast name: " + this.lName + "\nPhone number: " + this.phoneNumber + "\nEmail: " + this.email + "\n"; 
      }
     }

  
   
}