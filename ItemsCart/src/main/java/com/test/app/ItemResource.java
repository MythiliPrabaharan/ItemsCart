package com.test.app;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemResource extends ItemsDAO
{
	ItemsDAO repo = new ItemsDAO();

	@RequestMapping(value = "/AllItems", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	private ResponseEntity<Object> getAllItems()
	{
		try
		{
			return new ResponseEntity<Object>(repo.getItems(),HttpStatus.OK);
		}

		catch(Exception e)
		{
			new ResponseEntity<Object>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Object>(null,HttpStatus.INTERNAL_SERVER_ERROR);
	}


	@RequestMapping(value = "/{id}", method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public Items getItem(@PathVariable("id") int id) 
	{
		return repo.getItems(id);
	}

}

