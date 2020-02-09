package com.email.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.email.model.Email;
import com.email.model.EmailList;
import com.email.utils.EmailFilter;

@RestController
@RequestMapping("/email")
public class EmailController {

		@PostMapping("/filter/distinct")
		public Integer filterDistinctEmails(@RequestBody EmailList elist) {
			EmailFilter efilter = new EmailFilter();
			elist = efilter.filter(elist);			
			return elist.getEmails().size();
		}
}
