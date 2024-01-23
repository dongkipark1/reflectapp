package ex02;


import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//A개발자
// uri를 받아서 라우팅
public class App {
    public static void main(String[] args) {
        String path = "/update-password";

        UserController con = new UserController();

        Method[] methods = con.getClass().getDeclaredMethods(); //유저 컨트롤러 객체에 선언된 메서드 전체를 들고와!
       //System.out.println(methods.length);

        for(Method method : methods){
            //System.out.println(method.getName());
            RequestMapping rm = method.getDeclaredAnnotation(RequestMapping.class);

            if (rm == null) continue;
            if (rm.uri().equals(path)){
                try {
                    method.invoke(con); // con.login();
                    break;
                }  catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
