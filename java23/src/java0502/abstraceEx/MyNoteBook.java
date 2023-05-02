package java0502.abstraceEx;
public class MyNoteBook extends NoteBook{ //notebook에서 display를 구현했으니, mynotebook에서는 typing만 구현하면 됨
    @Override
    public void typing() {

    }
    @Override
    public void display() { //오버라이딩 가능
        super.display();
    }
}
