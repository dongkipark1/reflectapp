package ex03;

@Controller //SET에 담김 // 깃발을 꽂음 App의 코드는 중요하지 않음 어차피 다 설계가 되어있음
public class BoardController {
    @RequestMapping(uri="/write")
    public void write(){
        System.out.println("글쓰기 호출됨");
    }
}
