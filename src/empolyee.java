

public class empolyee {
   public  String name;
   protected  Integer hours;
   protected  Double valuePerHours;

    public empolyee(Integer hours, String name, Double valuePerHours) {
        this.hours = hours;
        this.name = name;
        this.valuePerHours = valuePerHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHours() {
        return valuePerHours;
    }

    public void setValuePerHours(Double valuePerHours) {
        this.valuePerHours = valuePerHours;
    }

public Double payment() {
    return valuePerHours *hours; 
}



    
}