public class AnnalynsInfiltration {

    public static boolean checkSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean spy = false;
        if(knightIsAwake == true || archerIsAwake == true || prisonerIsAwake == true){
            spy = true;
        }
        else{
            spy = false;
        }
        return spy;
    }
    public static boolean checkSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean signal = false;
        if(prisonerIsAwake == true && archerIsAwake == false){
            signal = true;
        }
        else{
            signal = false;
        }
        return signal;
    }
    public static boolean actionAttack(boolean knightIsAwake) {
        boolean attack = false;
        if(knightIsAwake == false){
            attack = true;
        }
        else{
            attack = false;
        }
        return attack;
    }
    public static boolean actionFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        boolean freePri = false;
        if(prisonerIsAwake == true && knightIsAwake == false && archerIsAwake == false){
            freePri = true;
        }
        else if(prisonerIsAwake == true && petDogIsPresent == true && archerIsAwake == false){
            freePri = true;
        }
        else if(prisonerIsAwake == false && petDogIsPresent == true && archerIsAwake == false && knightIsAwake == false){
            freePri = true;
        }
        else if(prisonerIsAwake == false && petDogIsPresent == true && archerIsAwake == false && knightIsAwake == true){
            freePri = true;
        }
        else{
            freePri = false;
        }
        return freePri;
    }
}

