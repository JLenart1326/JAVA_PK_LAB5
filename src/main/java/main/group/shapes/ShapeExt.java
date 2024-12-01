package main.group.shapes;
import jakarta.persistence.*;
import main.group.color.Color;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class ShapeExt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    Color color;

    public ShapeExt() {
        this.color = new Color();
    }
    public ShapeExt(Color color) {
        this.color = color;
    }

    //Metody wirtualne
    public float getArea(){return 0;};
    public float getPerimeter(){return 0;};
    public void getColorDescription(){ color.print();};
    public String getShapeColor(){ return color.getColor();};
}