package googleAuth;

public class Email {
  private String firtsName;
  private String lastName;
  private String Email;
  private String password;
public Email(String firtsName, String lastName, String email, String password) {
	super();
	this.firtsName = firtsName;
	this.lastName = lastName;
	Email = email;
	this.password = password;
}
public String getFirtsName() {
	return firtsName;
}
public void setFirtsName(String firtsName) {
	this.firtsName = firtsName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}
