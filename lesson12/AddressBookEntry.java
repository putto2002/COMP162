public class AddressBookEntry{
 private String fName;
 private String lName;
 private String phoneNumber;
 private String email;
 public AddressBookEntry nextPtr;
 
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