package main.group.spring.services;

import main.group.shapes.Rectangle;
import main.group.shapes.Shape;
import main.group.shapes.Triangle;
import main.group.shapes.Circle;
import main.group.spring.repositories.RectangleRepository;
import main.group.spring.repositories.TriangleRepository;
import main.group.spring.repositories.CircleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class ShapeService {

    private final RectangleRepository rectangleRepository;
    private final TriangleRepository triangleRepository;
    private final CircleRepository circleRepository;

    @Autowired
    public ShapeService(RectangleRepository rectangleRepository, TriangleRepository triangleRepository, CircleRepository circleRepository) {
        this.rectangleRepository = rectangleRepository;
        this.triangleRepository = triangleRepository;
        this.circleRepository = circleRepository;
    }

    public Shape saveShape(Shape shape) {
        if (shape instanceof Rectangle) {
            return rectangleRepository.save((Rectangle) shape);
        } else if (shape instanceof Triangle) {
            return triangleRepository.save((Triangle) shape);}
        else if (shape instanceof Circle) {
            return circleRepository.save((Circle) shape);
        } else {
            throw new IllegalArgumentException("Unknown shape type");
        }
    }

    public List<Shape> getAllShapes() {
        List<Shape> allShapes = new ArrayList<>();
        allShapes.addAll(rectangleRepository.findAll());
        allShapes.addAll(triangleRepository.findAll());
        allShapes.addAll(circleRepository.findAll());
        return allShapes;
    }
}
