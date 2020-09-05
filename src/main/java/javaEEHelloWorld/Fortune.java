package javaEEHelloWorld;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Fortune {

    String[] fortunes = {
            "A dubious friend may be an enemy in camouflage.",
            "Your success will astonish everyone.",
            "You will soon be surrounded by good friends and laughter.",
            "Many will travel to hear you speak.",
            "Now is a good time to buy stock.",
            "Physical activity will dramatically improve your outlook today.",
            "Say hello to others. You will have a happier day.",
            "You should be able to undertake and complete anything.",
            "You will be pleasantly surprised tonight.",
            "You will be traveling and coming into a fortune.",
    };

    private String name;
    private String color;
    private String food;
    private String result="";
    private String msg="";


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }


    public String[] getFortunes() {
        return fortunes;
    }

    public void setFortunes(String[] fortunes) {
        this.fortunes = fortunes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void tellFortune(){
        int tmpname = name.length();
        int tmpcolor = color.length();
        int tmpfood = food.length();
        int tmp = tmpname + tmpcolor + tmpfood;
        tmp = tmp % fortunes.length;
        setResult((fortunes[tmp]));
        check();
    }

    public void check(){
        if(name.equals("")) {
            msg = "no name selected";
            setResult(msg);
        }
            else if (color.equals("")) {
            msg = "no color selected";
            setResult(msg);
        }
                else if (food.equals("")){
                    msg="no food selected";
                    setResult(msg);
                }
            }
        }
