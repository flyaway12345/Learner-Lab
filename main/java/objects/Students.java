package objects;

public final class Students extends People{
    final static private Students INSTANCE = new Students();
    private Students(){
        add(new Student(1L,"Billy BadAss"));
        add(new Student(2L,"Queen Of Code"));
        add(new Student(3L,"Foreman Mills"));
        add(new Student(4L,"Game Girl"));
        add(new Student(5L,"Lord Eric"));

    }
    public static Students getInstance(){
        return INSTANCE;
    }

}
