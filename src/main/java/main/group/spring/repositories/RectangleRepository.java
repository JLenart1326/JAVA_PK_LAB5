package main.group.spring.repositories;

import main.group.shapes.Rectangle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RectangleRepository extends JpaRepository<Rectangle, Long> { }