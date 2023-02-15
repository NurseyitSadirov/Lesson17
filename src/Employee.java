public class Employee extends Person{
    private long id;

    public Employee(String name, char gender, long id) {
        super(name, gender);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                "} " + super.toString();
    }

    @Override
    public String work() {
        if (getId()==0){
            return "Jumushchu ishtebeyt";
        }
        return "Jumushchu ishteyt";
    }
}
