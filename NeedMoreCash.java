public class NeedMoreCash {

    private String name;
    public String hiWorld(){
        return "HI!";
    }
    public void inputName(String name){
        this.name = name;
    }
    public String yareyare(){
        if(name == null){
            return "아가씨 이름이 뭐에요?";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("오죠 사마 is time to goto bed");
        stringBuilder.append("또 핸드폰 하는거에요?");
        stringBuilder.append(name+"아가씨 지금 잠에 들지 않으면");
        return stringBuilder.toString();
    }
}
