package main.group.spring.classes;

import main.group.shapes.ShapeExt;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/shapes")
public class ShapeController {
    private final ShapeService shapeService;

    public ShapeController(ShapeService shapeService) {
        this.shapeService = shapeService;
    }

    @GetMapping
    public List<ShapeExt> getAllShapes() {
        return shapeService.getAllShapes();
    }

    @PostMapping
    public ShapeExt createShape(@RequestBody ShapeExt shape) {
        return shapeService.saveShape(shape);
    }
}