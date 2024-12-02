package main.group.spring.repositories;

import main.group.shapes.Triangle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TriangleRepository extends JpaRepository<Triangle, Long> { }

