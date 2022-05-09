package beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

@Named(value = "bean_data")
@RequestScoped
public class Person {

//     @NotNull
//     @DecimalMin("40")
//    @DecimalMax("140")
    private double weight;
    
//     @NotNull
//     @DecimalMin("120")
//     @DecimalMax("250")
    private double height;
    

    double bmi;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }
}
