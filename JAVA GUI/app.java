import javax.swing.JOptionPane;



//Vural&Erik 
public class app{
    public static void main(String[] args) throws Exception{

        boolean anotherSurvey = true;

        while (anotherSurvey == true){
            int survey = Integer.parseInt(JOptionPane.showInputDialog("Input the number of the survey you would like to take. \n \n 1. Music survey \n 2. Videogame survey \n 3. Movie survey"));
            while (survey <1 || survey >3){
                survey = Integer.parseInt(JOptionPane.showInputDialog("Invalid number. Input the number of the survey you would like to take. \n \n 1. Music survey \n 2. Videogame survey \n 3. Movie survey"));
            }//Vural&Erik 
            if (survey == 1){
                musicSurvey mSurvey = new musicSurvey();
                mSurvey.surveyOne();
            }//Vural&Erik 
            else if (survey == 2){
                gameSurvey gSurvey = new gameSurvey();
                gSurvey.surveyTwo();
            }//Vural&Erik 
            else if (survey == 3){
                movieSurvey moSurvey = new movieSurvey();
                moSurvey.surveyThree();
            }
            anotherSurvey = JOptionPane.showConfirmDialog(null, "Would you like to take another survey?") == JOptionPane.YES_OPTION;
            //Vural&Erik 
            if (anotherSurvey == false){ 
                JOptionPane.showMessageDialog(null, "Thanks for taking the survey!");
                anotherSurvey = false;
            }
        }
    }
}
