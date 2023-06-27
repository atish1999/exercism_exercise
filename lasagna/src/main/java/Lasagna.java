public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int timeInOven) {
        return expectedMinutesInOven() - timeInOven;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers) {
        int timeInMinutesToPrepareOneLayer = 2;
        return timeInMinutesToPrepareOneLayer*layers;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int timeInOven) {
        int timeToPrepareLayersOfLasagna = preparationTimeInMinutes(layers);
        int totalTime = timeToPrepareLayersOfLasagna + timeInOven;
        return totalTime;

    }
}
