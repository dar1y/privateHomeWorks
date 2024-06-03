package homework2.insurance;

public class Client {
    private String name;
    private int age;
    private int insurancePlan;


    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void buyInsurancePlan(){
        if(this.getAge()<18){
            this.setInsurancePlan(1000);
        } else if (this.getAge()<31) {
            this.setInsurancePlan(700);
        } else {
            this.setInsurancePlan(500);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getInsurancePlan() {
        return insurancePlan;
    }

    public void setInsurancePlan(int insurancePlan) {
        this.insurancePlan = insurancePlan;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", insurancePlan=" + insurancePlan +
                '}';
    }
}

