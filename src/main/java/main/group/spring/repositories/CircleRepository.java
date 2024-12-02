package main.group.spring.repositories;

import main.group.shapes.Circle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CircleRepository extends JpaRepository<Circle, Long> { }