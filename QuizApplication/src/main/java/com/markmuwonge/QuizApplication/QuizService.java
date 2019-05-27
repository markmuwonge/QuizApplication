package com.markmuwonge.QuizApplication;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/quizzes")
public class QuizService {
	//http://localhost:8080/QuizApplication/rest/quizzes/getAll
	@GET
	@Path("/getAll")
	public String sayHello()
	{
		return "Nothing here yet";
	}

}
