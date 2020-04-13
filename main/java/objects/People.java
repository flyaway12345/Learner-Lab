package objects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable {
    List<Person> personList = new ArrayList<>();

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id) {
        for (Person person : personList) {
            if (person.getId() == id) return person;
        }
        return null;
    }
    public boolean contains(Person person){
        return personList.contains(person);
    }
    public void removeObject(Person person){
        personList.remove(person);
    }
    public void removeIndex(long id){
        personList.remove(id);
    }
    public void removeALL(){
        personList.removeAll(personList);
    }
    public int count(){
        return personList.size();
    }
    public Person[] Array(){
        Person[] x = (Person[]) personList.toArray();
        return x;
    }

    public Iterator iterator() {
        return this.personList.iterator();
    }
}
