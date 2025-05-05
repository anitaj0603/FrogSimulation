public class FrogSimulation {
    private int goalDistance;
    private int maxHops;
    private int[] testHops;
    private int testIndex;

    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }

    public void setTestHops(int[] hops) {
        testHops = hops;
        testIndex = 0;
    }

    private int hopDistance() {
        if (testHops != null && testIndex < testHops.length) {
            return testHops[testIndex++];
        }
        return 0;
    }

    public boolean simulate() {
        int hops = 0;
        int distance = 0;
        while (hops < maxHops) {
            distance += hopDistance();
            if (distance < 0) return false;
            if (distance >= goalDistance) return true;
            hops++;
        }
        return false;
    }

    public double runSimulations(int num) {
        double successes = 0;
        for (int i = 0; i < num; i++) {
            if (simulate()) successes++;
        }
        return successes / num;
    }
}