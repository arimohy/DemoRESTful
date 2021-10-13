package com.example.DemoRESTful.repositories;

import com.example.DemoRESTful.models.Empleado;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioEmpleado extends MongoRepository<Empleado, String> {
}
