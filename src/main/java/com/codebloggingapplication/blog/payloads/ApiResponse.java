package com.codebloggingapplication.blog.payloads;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Data
public class ApiResponse {
	public ApiResponse(String string, boolean b) {
		this.message=string;
		this.success=b;
		// TODO Auto-generated constructor stub
	}
	private String message;
	private boolean success;
}
