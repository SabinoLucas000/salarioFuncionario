

public class Outsourceemployee extends  empolyee {

private Double additionalChange;

    public Outsourceemployee(Double additionalChange, Integer hours, String name, Double valuePerHours) {
        super(hours, name, valuePerHours);
        this.additionalChange = additionalChange;
    }
    @Override
    public   Double payment() {
        return  super.payment() + additionalChange * 1.1;

    }

   
 

}