package objects;

public final class Instructors extends People{
    final static private Instructors INSTANCE = new Instructors();
    private Instructors(){
        add(new Instructor(1L,"Mavrick Mikaila"));
        add(new Instructor(2L,"Chad The Chad"));
        add(new Instructor(3L,"Missy \"Miss High Energy\" Black"));

    }
    public static Instructors getInstance(){
        return INSTANCE;
    }

}

