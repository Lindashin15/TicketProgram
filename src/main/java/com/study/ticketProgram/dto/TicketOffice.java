package com.study.ticketProgram.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
	private Long amount;
	private List<Ticket> tickets = new ArrayList<>();
	
	public TicketOffice(Long amount, Ticket ticket) {
		this.amount = amount;
		this.tickets.addAll(Arrays.asList(ticket));
	}
	
	private Ticket getTickets() {
		return tickets.remove(0);
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
	
	public void minusAmount(Long amount) {
		this.amount -= amount;
	}
	
	private void plusAmount(Long amount) {
		this.amount += amount;
	}	
	
	public void sellTicketTo(Audience audience) {
		plusAmount(audience.buy(getTickets()));
	}
	
}
