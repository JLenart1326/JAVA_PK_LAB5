package main.group.spring.interfaces;

import main.group.shapes.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShapeRepository extends JpaRepository<ShapeExt, Long> {
}
