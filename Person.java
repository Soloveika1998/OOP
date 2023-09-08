import java.util.Iterator;

public class Person implements Iterator<String>, Comparable<Person>{
    private String namePerson;
    private String cityPerson;
    private Integer agePerson;
    private Integer postIndex;

    public Person(String namePerson, String cityPerson, Integer agePerson, Integer postIndex) {
        this.namePerson = namePerson;
        this.cityPerson = cityPerson;
        this.agePerson = agePerson;
        this.postIndex = postIndex;
    }

    public Person(String namePerson, String cityPerson, Integer agePerson) {
        this(namePerson, cityPerson, agePerson, null);
    }

    public Person(String namePerson, String cityPerson) {
        this(namePerson, cityPerson, 0, 0);
    }

    public Person(String namePerson) {
        this(namePerson, "none", 0, 0);
    }
    
    public Integer getAge() {
        return agePerson;
    }
    int index;

    @Override
    public boolean hasNext() {
        return index++ < 4;
    }

    @Override
    public String next() {
        switch (index) {
            case 1:
                return String.format("Имя клиента: " + namePerson);
            case 2:
                return String.format("Город клиента: " + cityPerson);
            case 3:
                return String.format("Возраст клиента клиента: " + agePerson);
            default:
                return String.format("Почтовый индекс клиента: " + postIndex);   
        }
    }
    @Override
    public int compareTo(Person age) {
        return Integer.compare(this.agePerson, age.agePerson);
    }
}

