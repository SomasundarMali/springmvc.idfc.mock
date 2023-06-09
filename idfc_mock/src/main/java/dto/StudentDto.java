package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class StudentDto {
	@Id
private int id;
private String name;
private String email;
private long number;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getNumber() {
	return number;
}
public void setNumber(long number) {
	this.number = number;
}


}
