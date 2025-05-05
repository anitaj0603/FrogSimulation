public class Main {
    public static void main(String[] args) {
        testExample1();
        testExample2();
        testExample3();
        testExample4();
        testExample5();
    }

    private static void testExample1() {
        FrogSimulation sim = new FrogSimulation(24, 5);
        sim.setTestHops(new int[]{5, 7, -2, 8, 6});
        boolean result = sim.simulate();
        System.out.println("Example 1: " + result + " (Expected: true)");
    }

    private static void testExample2() {
        FrogSimulation sim = new FrogSimulation(24, 5);
        sim.setTestHops(new int[]{6, 7, 6, 6});
        boolean result = sim.simulate();
        System.out.println("Example 2: " + result + " (Expected: true)");
    }

    private static void testExample3() {
        FrogSimulation sim = new FrogSimulation(24, 5);
        sim.setTestHops(new int[]{6, -6, 31});
        boolean result = sim.simulate();
        System.out.println("Example 3: " + result + " (Expected: true)");
    }

    private static void testExample4() {
        FrogSimulation sim = new FrogSimulation(24, 5);
        sim.setTestHops(new int[]{4, 2, -8});
        boolean result = sim.simulate();
        System.out.println("Example 4: " + result + " (Expected: false)");
    }

    private static void testExample5() {
        FrogSimulation sim = new FrogSimulation(24, 5);
        sim.setTestHops(new int[]{5, 4, 2, 4, 3});
        boolean result = sim.simulate();
        System.out.println("Example 5: " + result + " (Expected: false)");
    }
}