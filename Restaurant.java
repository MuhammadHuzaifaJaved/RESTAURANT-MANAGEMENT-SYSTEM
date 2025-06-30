package RestaurantManagement;
 class Restaurant {
 String name;
 String address;
String phoneNumber;
// Here we create constructor
public Restaurant ( ){
	name="HUZAIFA's RESTAURANT";
	address="QUEEN's ROAD SARGODHA";
	phoneNumber="03036829426";
}
// Here we create Getter and Setter
public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getAddress() {
    return address;
}

public void setAddress(String address) {
    this.address = address;
}

public String getPhoneNumber() {
    return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
}

void display (){
	System.out.println("RESTAURANT NAME:"+name);
	System.out.println("RESTAURANT ADDRESS:"+address);
	System.out.println("RESTAURANT PHONE NUMBER:"	+phoneNumber);
 }
 }
