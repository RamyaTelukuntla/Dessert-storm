package basic2;

/**
 * Created by user on 15/5/14.
 */
public class Seven {
    private String message;



    public void setMessage(String message) {
        this.message = message;
    }
    public void getMessage() {
        System.out.println(message);
    }

    public void init()
    {
        System.out.println("init");
    }
    public void destroy()
    {
        System.out.println("destroying");
    }

}
