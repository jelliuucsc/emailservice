package com.email.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.email.model.Email;
import com.email.model.EmailList;


public class EmailFilter {
	public EmailList filter(EmailList emailList){
		List<Email> emails = emailList.getEmails();
		
		List<Email> filtered = emails
		.stream()
		.map(email -> {
			String f = email.getEmail_address().replaceAll("\\.", "");
			email.setEmail_address(f);
			return email;
		})
		.map(email -> {
			StringBuilder sb = new StringBuilder();
			for(int i = 0 ; i < email.getEmail_address().length(); i++) {
				if(email.getEmail_address().charAt(i) == '+') {
					sb.append(email.getEmail_address().substring(0, i) + "@gmailcom");
					email.setEmail_address(sb.toString());
					return email;
				}
					
			}			
			return email;
		})
		.distinct()
		.collect(Collectors.toList());
		for(int i = 0 ; i < filtered.size(); i++) {
			System.out.println(filtered.get(i).getEmail_address());
		}
		emailList.setEmails(filtered);
		return emailList;
	}
}
