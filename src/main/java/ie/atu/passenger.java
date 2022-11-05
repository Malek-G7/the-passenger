package ie.atu;

public class passenger {
    private String title;
    private  String name;
    private String ID ;
    private String phone;
    private int age ;

    public passenger(String title, String name, String ID, String phone, int age) {
        if(title != "Mr" && title != "Mrs"  && title != "Ms"){
            throw new IllegalArgumentException("This is not a valid title, try Mr, Mrs or Ms");
        }

        if(name.length()<3){
            throw new IllegalArgumentException("name must contain min 3 characters");
        }

        if(ID.length()<10){
            throw new IllegalArgumentException("ID must contain min 10 characters");
        }

        if(phone.length()<7){
            throw new IllegalArgumentException("phone no must contain min 7 characters");
        }

        if(age<16){
            throw new IllegalArgumentException("age must be 16 or higher");
        }

        this.title = title;
        this.name = name;
        this.ID = ID;
        this.phone = phone;
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }
}
