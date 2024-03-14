package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.service;

@RestController
public class MsgRestController {
	
	@Autowired
	private service msgService;
	
	@GetMapping("/welcome")
	public String getMsg()
	{
		return msgService.getWelcomeMsg();
	}

}
