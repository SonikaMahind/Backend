package com.sonata.Controller;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.Model.Event;
import com.sonata.Service.EventService;


@RestController
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@PostMapping("/addEvent")
	public Event addEvent(@RequestBody Event event) {
		return eventService.saveEvent(event);
	}
	
	@GetMapping("/listEvents")
	public List<Event> getAllEvents(){
		return eventService.getAllEvent();
	}
	
	@GetMapping("/listEvent/{event_id}")
	public Event getEventById(@PathVariable Long event_id){
		 return eventService.getEventById(event_id);
	}
	
	@PutMapping("/editEvent/{event_id}")
	public Event editEvent(@PathVariable Long event_id,@RequestBody Event editEvent) {
		return eventService.updateEvent(event_id, editEvent);
	}
	
	@DeleteMapping("/deleteEvent/{event_id}")
	public void deleteEvent(@PathVariable Long event_id) {
		eventService.deleteEvent(event_id);
	}
}
