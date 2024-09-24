package com.sonata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonata.Model.Event;

@Repository
public interface EventRepository  extends JpaRepository<Event, Long>{

}
