package basic2;

/**
 * Created by user on 14/5/14.
 */
public class HelloWorld {
    private String message;
    private String name;

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message);
    }



    public void setName(String name) {
        this.name = name;
    }
    public void getName() {
        System.out.println(name);
    }
}
