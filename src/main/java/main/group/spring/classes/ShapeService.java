package main.group.spring.classes;

import main.group.shapes.ShapeExt;
import main.group.spring.interfaces.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShapeService {

    private final ShapeRepository shapeRepository;

    public ShapeService(ShapeRepository shapeRepository) {
        this.shapeRepository = shapeRepository;
    }

    public ShapeExt saveShape(ShapeExt shape) {
        return shapeRepository.save(shape);
    }

    public List<ShapeExt> getAllShapes() {
        return shapeRepository.findAll();
    }
}