package edu.step.plannerback.controller.rest;



import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriorityController {
  private Long id;
  private  String name;
  private  String color;

    public PriorityController(Long id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public PriorityController(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public PriorityController() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
