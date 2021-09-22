package com.reach.bookStore;

import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;


@RestController
@CrossOrigin(origins= "*",allowedHeaders = "*")
public class store {
	List<Books> akhil = new ArrayList<Books>();
	@PostMapping("addBook")
	public List<Books> addBook(@RequestBody Books user)
	{
		akhil.add(user);
		//System.out.println(user.getTitle());
		return akhil;
	}
	
	@GetMapping("getBooks")
	@RequestMapping("getBooks")
	public List<Books> getBooks()
	{
		//List<Books> akhil = new ArrayList<Books>();
		
		//akhil.add(new Books("akhil", "akhil" ,600,"akhil")) ;
		//akhil.add(new Books("akhil2", "akhil2" ,5000,"akhil2"));
		//akhil.add(new Books("akhil 3", "akhil 3" ,9000,"akhil 3"));
		
		return akhil;
		
	}

}
