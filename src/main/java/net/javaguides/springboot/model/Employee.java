package net.javaguides.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name="employees")
//@AllArgsConstructor
//@NoArgsConstructor
//@Setter
//@Getter
@Data
public class Employee {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
    private String lastName;
	
	@Column(name="email")
	private String email;
}