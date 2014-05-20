package basic2;

/**
 * Created by user on 14/5/14.
 */
public class Two implements One {



    public void subtract() {
            System.out.println("subtract");
    }
    public void add()
    {
        System.out.println("add");
    }

    public static void main(String[] args)
    {
        Two t=new Two();
        t.subtract();
        t.add();
    }
}
