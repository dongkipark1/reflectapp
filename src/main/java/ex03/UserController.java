package ex03;


//B개발자
//A개발자가 B개발자에게 어노테이션만 붙이면 됩니다.
@Controller //깃발 꽂음
public class UserController {

    // /login
    @RequestMapping(uri="/login")
    public void login(){
        System.out.println("로그인 호출됨");
    }

    // /join
    @RequestMapping(uri="/join")
    public void join(){
        System.out.println("회원가입 호출됨");
    }

    @RequestMapping(uri="/userinfo")
    public void userinfo(){
        System.out.println("유저정보 보기");
        // 죽어도 이 정보를 호출 할 수있는 방법이 없다.
        // 이러면 라우터에 재설계를 요청해야한다.
        // 계속 이럴 수는 없다....
    }
    @RequestMapping(uri = "/update-password")
    public void updatePassword(){
        System.out.println("패스워드 수정하기");
    }
}
