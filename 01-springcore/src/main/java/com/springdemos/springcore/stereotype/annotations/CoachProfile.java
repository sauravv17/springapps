package com.springdemos.springcore.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CoachProfile {
	@Value("Cricket Coach")
	private String title;
	@Value("XYZ coaching")
	private String company;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "CoachProfile [title=" + title + ", company=" + company + "]";
	}
	

}
