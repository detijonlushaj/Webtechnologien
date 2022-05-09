
package beans;

import backend.calBMI;
import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@Named(value = "bean_handler")
@RequestScoped
public class EventHandler {
    
    public Date today() {
        return new Date();
    }
    
    public String calculateBMI(Person person) {
        calBMI cal = calBMI.getCalculator();
        double bmi = cal.calculateBMI(person.getWeight(),person.getHeight());
        person.setBmi(bmi);
        return "BMI_result.xhtml";
    }

    public String createMessage(Person person) {
       calBMI cal = calBMI.getCalculator();
       return cal.bmiMessage(person.getWeight(), person.getHeight());
    }

    public double getMax(){
        calBMI cal = calBMI.getCalculator();
        return cal.getMax();
    }
}
