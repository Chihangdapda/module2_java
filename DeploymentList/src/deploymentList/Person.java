package deploymentList;

public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Person)?(((Person)obj).getId() == this.id):false;
    }
}
