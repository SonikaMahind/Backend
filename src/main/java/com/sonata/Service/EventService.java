package com.sonata.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sonata.Model.Event;
import com.sonata.Repository.EventRepository;

@Service
public class EventService {
	 
	@Autowired
	private EventRepository eventRepository;
	
	public Event saveEvent(Event event) {
		return eventRepository.save(event);
	}
	
	public List<Event> getAllEvent(){
		return eventRepository.findAll();
	}
	
	public Event getEventById(Long id) {
	    return eventRepository.findById(id).orElse(null);
	}
	
	public Event updateEvent(Long eventId, Event updatedEvent) {
        Event existingEvent = eventRepository.findById(eventId).orElse(null);
        
        if (existingEvent == null) {
            throw new RuntimeException("Event not found.");
        }
        existingEvent.setEventName(updatedEvent.getEventName());
        existingEvent.setCategory(updatedEvent.getCategory());
        existingEvent.setStartDate(updatedEvent.getStartDate());
        existingEvent.setStartTime(updatedEvent.getStartTime());
        existingEvent.setEndDate(updatedEvent.getEndDate());
        existingEvent.setEndTime(updatedEvent.getEndTime());
        existingEvent.setLocation(updatedEvent.getLocation());
        existingEvent.setPrice(updatedEvent.getPrice());
        existingEvent.setTotalTickets(updatedEvent.getTotalTickets());
        existingEvent.setDescription(updatedEvent.getDescription());
        existingEvent.setImageUrl(updatedEvent.getImageUrl());
        return eventRepository.save(existingEvent);
    }
	
	public void deleteEvent(Long event_id) {
		eventRepository.deleteById(event_id);
	}
	
}
