package com.example.flawtrack.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.flawtrack.model.Contact;

public interface ContactRepository extends CrudRepository<Contact,Long> {

}
