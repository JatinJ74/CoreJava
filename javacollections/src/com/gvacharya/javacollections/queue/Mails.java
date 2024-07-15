package com.gvacharya.javacollections.queue;

import java.util.Objects;

public class Mails {

	private String mailId;
	private String priority;
	
	public Mails(String mailId, String priority) {
		super();
		this.mailId = mailId;
		this.priority = priority;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mails) {
		this.mailId = mails;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	@Override
	public String toString() {
		return "Mails [Mails=" + mailId + ", Priority=" + priority + "]";
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj == null)
//			return false;
//		
//		if(obj.getClass() != this.getClass())
//			return false;
//		
//		Mails temp = (Mails) obj;
//		
//		return this.getMailId().equalsIgnoreCase(temp.mailId) && this.mailId.equalsIgnoreCase(temp.mailId);
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(mailId, priority);
//	}
	
//	@Override
//	public int compareTo(Mails o) {
//		return this.priority.toLowerCase().compareTo(o.priority);
//	}
}
