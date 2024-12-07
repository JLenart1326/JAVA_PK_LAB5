package main.group.spring.controllers;

import main.group.shapes.Rectangle;
import main.group.shapes.Shape;
import main.group.shapes.Triangle;
import main.group.shapes.Circle;
import main.group.spring.repositories.CircleRepository;
import main.group.spring.repositories.RectangleRepository;
import main.group.spring.repositories.TriangleRepository;
import main.group.spring.services.ShapeService;
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

    private final ShapeService shapeService;

    public ShapeController(ShapeService shapeService) {
        this.shapeService = shapeService;
    }

    @Autowired
    private RectangleRepository rectangleRepository;

    @Autowired
    private TriangleRepository triangleRepository;

    @Autowired
    private CircleRepository circleRepository;

    @GetMapping
    public List<Shape> getAllShapes() {
        return shapeService.getAllShapes();
    }

    @PostMapping("/rectangle")
    public Shape createRectangle(@RequestBody Rectangle rectangle) {
        return shapeService.saveShape(rectangle);
    }

    @PostMapping("/triangle")
    public Shape createTriangle(@RequestBody Triangle triangle) {
        return shapeService.saveShape(triangle);
    }

    @PostMapping("/circle")
    public Shape createCircle(@RequestBody Circle circle) {
        return shapeService.saveShape(circle);
    }
}


