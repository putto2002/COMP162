
public class AddressBookApp{
   private static AddressBookEntry addressBook;
   public static void main(String[] args){
      addNewContact(new AddressBookEntry("James", "Harden", "0210453323", "harden@nets.com"));
      addNewContact(new AddressBookEntry("Kevin", "Durant", "0210453323", "Kevin@nets.com"));
      addNewContact(new AddressBookEntry("Kyrie", "irving", "0210453323", "Kyrie@nets.com"));
   
   
      System.out.println(addressBook);
      
      removeContactByName("Kyrie", "irving");
      System.out.println(addressBook);
   }
   public static void addNewContact(AddressBookEntry contact){
      if(addressBook == null){
         addressBook = contact;
         return;
      }
      contact.nextPtr = addressBook;
      addressBook = contact;
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
}