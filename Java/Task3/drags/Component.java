package Task3.drags;

public class Component {
    private String name;
    private String weight;
    private int power;
    

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Component{" +
                "name = '" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", power = " + power +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Component component = (Component) obj;
        return 
            this.name.equals(component.getName()) ||
            this.weight.equals(component.getWeight()) ||
            this.power == component.getPower();
    }

    @Override
    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        result += weight == null ? 0 : weight.hashCode();
        result += power;
        return result;
    }

}