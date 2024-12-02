package main.group.spring.controllers;

import main.group.shapes.Rectangle;
import main.group.shapes.Shape;
import main.group.shapes.Triangle;
import main.group.shapes.Circle;
import main.group.spring.repositories.CircleRepository;
import main.group.spring.repositories.RectangleRepository;
import main.group.spring.repositories.TriangleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/shapes")
public class ShapeController {

    @Autowired
    private RectangleRepository rectangleRepository;

    @Autowired
    private TriangleRepository triangleRepository;

    @Autowired
    private CircleRepository circleRepository;

    @GetMapping
    public List<Shape> getAllShapes() {
        List<Shape> allShapes = new ArrayList<>();
        allShapes.addAll(rectangleRepository.findAll());
        allShapes.addAll(triangleRepository.findAll());
        allShapes.addAll(circleRepository.findAll());
        return allShapes;
    }

    @PostMapping("/rectangle")
    public Rectangle createRectangle(@RequestBody Rectangle rectangle) {
        return rectangleRepository.save(rectangle);
    }

    @PostMapping("/triangle")
    public Triangle createTriangle(@RequestBody Triangle triangle) {
        return triangleRepository.save(triangle);
    }

    @PostMapping("/circle")
    public Circle createCircle(@RequestBody Circle circle) {
        return circleRepository.save(circle);
    }
}


