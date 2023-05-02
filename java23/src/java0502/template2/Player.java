package java0502.template2;

public class Player {
    private PlayerLevel level; //상속 없이 객체 사용이 되나?
    public Player(){
        level = new BeginnerLevel();
        level.showLevelMessage();
    }
    public PlayerLevel getLevel(){
        return level;
    }
    public void upgradeLevel(PlayerLevel level){
        this.level = level;
        level.showLevelMessage();
    }
    public void play(int count){
        level.go(count);
    }
}
