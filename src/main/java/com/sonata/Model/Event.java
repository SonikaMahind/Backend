package com.sonata.Model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="events")
public class Event {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long event_id;
	
	@Column(name="event_name", nullable=false,length=100)
	private String eventName;
	
	@Column(nullable=false,length=100)
	private String category;
	
	 @Column(name = "start_date", nullable = false)
	    private LocalDate startDate;

	    @Column(name = "start_time", nullable = false)
	    private LocalTime startTime;

	    @Column(name = "end_date", nullable = false)
	    private LocalDate endDate;

	    @Column(name = "end_time", nullable = false)
	    private LocalTime endTime;

	    @Column(nullable = false, length = 200)
	    private String location;

	    @Column(nullable = false)
	    private double price;

	    @Column(name = "total_tickets", nullable = false)
	    private int totalTickets;

	    @Column(nullable = false, length = 1500)
	    private String description;

	    @Column(name = "image_url", nullable = false, length = 1000)
	    private String imageUrl;

		public Long getEvent_id() {
			return event_id;
		}

		public void setEvent_id(Long event_id) {
			this.event_id = event_id;
		}

		public String getEventName() {
			return eventName;
		}

		public void setEventName(String eventName) {
			this.eventName = eventName;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public LocalDate getStartDate() {
			return startDate;
		}

		public void setStartDate(LocalDate startDate) {
			this.startDate = startDate;
		}

		public LocalTime getStartTime() {
			return startTime;
		}

		public void setStartTime(LocalTime startTime) {
			this.startTime = startTime;
		}

		public LocalDate getEndDate() {
			return endDate;
		}

		public void setEndDate(LocalDate endDate) {
			this.endDate = endDate;
		}

		public LocalTime getEndTime() {
			return endTime;
		}

		public void setEndTime(LocalTime endTime) {
			this.endTime = endTime;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public int getTotalTickets() {
			return totalTickets;
		}

		public void setTotalTickets(int totalTickets) {
			this.totalTickets = totalTickets;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getImageUrl() {
			return imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		} 
}
