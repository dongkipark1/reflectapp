package ex01;

public class UserController {


    // /login
    public void login(){
        System.out.println("로그인 호출됨");
    }

    // /join
    public void join(){
        System.out.println("회원가입 호출됨");
    }

    public void userinfo(){
        System.out.println("유저정보 보기");
        // 죽어도 이 정보를 호출 할 수있는 방법이 없다.
        // 이러면 라우터에 재설계를 요청해야한다.
        // 계속 이럴 수는 없다....
    }
}
