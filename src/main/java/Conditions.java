public class Conditions {



    public boolean checkWin(Player currPlayer){

        if (currPlayer.getSixScore() > 5){

            return true;


        }
        else{
            return false;
        }
    }

}
