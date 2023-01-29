package com.codebloggingapplication.blog.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@Data
public class UserDto {

	private int id;

	@NotEmpty
	@Size(min = 4, message = "Name should atleast contain 4 letters")
	private String name;

	@Email(message = "Email address is not valid!")
	private String email;

	@NotEmpty
	@Size(min = 3, max = 10, message = "Password must be min of 3 characters and should not exceed 10 characters")
	private String password;

	@NotEmpty
	private String about;

	public Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

}
