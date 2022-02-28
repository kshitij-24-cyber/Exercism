public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutesLasagnaHasBeenInOven) {
        actualMinutesLasagnaHasBeenInOven = expectedMinutesInOven() - actualMinutesLasagnaHasBeenInOven;
        return actualMinutesLasagnaHasBeenInOven;
    }


    // TODO: define the 'preparationTimeInMinutes()' method

     public int preparationTimeInMinutes(int numberOfLayersAddedInLasagna) {
        int timeTakenByOneLayer = 2;
        int totalTime = timeTakenByOneLayer * numberOfLayersAddedInLasagna;
        return totalTime;
    }

    // TODO: define the 'totalTimeInMinutes()' method

   public int  totalTimeInMinutes(int numberOfLayersAdded , int numberOfMinutes ){
       return this.preparationTimeInMinutes(numberOfLayersAdded)+numberOfMinutes;
          }

}

/*
Define the totalTimeInMinutes() method that takes two parameters: the first parameter
is the number of layers you added to the lasagna, and the second parameter is the number
 of minutes the lasagna has been in the oven. The function should return how many minutes in
 total you've worked on cooking the lasagna, which is the sum of the preparation time in minutes,
  and the time in minutes the lasagna has spent in the oven at the moment.
 */