class IncrementalDecrementalValues {

    public static void main(String[] args) {
        int step = 1;
        int floor = 21;

        //Increasing one value for step
        step++;
        // Decreasing one value for floor
        floor--;

        System.out.println(step);
        System.out.println(floor);

        // See that when we print inmediately the value using the increasing by means ++
        // We obtain the first value saved, if we print again the variable, this appears with a plus 1
        int number = 10;
        System.out.println(number++);
        System.out.println(number);

        // We can use the incresing (decreasing) operator adding ++ (or --) before the variable 
        int number2 = 100;
        System.out.println(--number2);
        System.out.println(number2);
    }
}