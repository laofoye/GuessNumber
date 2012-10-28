package guessNumber;

public class GuessNumber {

    private String randomNumber;

    public GuessNumber(String randomNumber) {
        this.randomNumber = randomNumber;
    }

    public String validate(String userInput) {
        int x=0,y=0;
        char A[],B[];
        for (int i=0;i<4;i++){
        for (int j=0;j<4;j++){    if(i=j&A[i]==B[j]) x++;
            else if (i<j&A[i]==B[j]|i>j&A[i]==B[j])  y++;

     }
           return x"a"y"b";
    }
}
