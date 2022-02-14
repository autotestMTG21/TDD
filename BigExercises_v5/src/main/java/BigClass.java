public class BigClass {
    private int number;
    private String text;

    // Konstruktor-metoder för samtliga signaturer:
    //a. BigClass();
    //b. BigClass(int number);
    //c. BigClass(String text);
    //d. BigClass(int number, String text);
    public BigClass(){

    }

    public BigClass(int number){
        this.number =number;
    }

    public BigClass(String text){
        this.text = text;
    }

    public BigClass(int number, String text){
        this.number = number;
        this.text = text;
    }

    // 2.Getter och setter för number-variabeln. Ett negativt tal skall ej accepteras till setNumber.
    public int getNumber(){
        return this.number;
    }

    public void setNumber(int number){
        if(number >= 0){
            this.number = number;
        }else {
            throw new IllegalArgumentException();
        }
    }

    // 3.Getter och setter för text-variabeln.

    public String getText(){
        return this.text;
    }

    public void setText(String text){
        this.text = text;
    }

    // 4. En metod för att göra om text-variabeln till stora bokstäver.
    public String returnStringUppCase(String text){
        return text.toUpperCase();
    }

    // 5. En metod för att göra om text-variabeln till null.
    public String returnStringNull(String text){
        return null;
    }

    // 6. En metod som adderar number med ett nytt tal, och ersätter number-variabeln med summan.
    // Ett negativt tal skall ej accepteras.
    public int addAndSum (int a){
        if (a > 0 ) {   // use setNumber() here ?
            int b = a + 5;
            return b + getNumber();
        }else {
            throw new IllegalArgumentException();
        }

    }

    // 7.  En toString metod. Tips: Detta kan autogenereras i IntelliJ.
    public String toString(){
        return getNumber() + getText();
    }

    /*@Override
    public String toString() {
        return "BigClass{" + "number=" + number + ", text='" + text + '\'' + '}';
    }*/







}