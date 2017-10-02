package interfaces;

/**
 * Created by kang on 17/10/1.
 */
public class OneInterfaceIml implements OneInterface{


    @Override
    public void say(String string) {
        System.out.println("ServiceImpl say :" + string);
    }
}
