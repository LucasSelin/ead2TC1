package br;

public class DroneDelivery {
    public static String canPassThroughWindow(int boxHeight, int boxLength,
                                              int windowHeight, int windowLength) {

        boolean verticalFit = boxHeight <= windowHeight;
        boolean horizontalFit = boxLength <= windowLength;

        return verticalFit || horizontalFit ? "S" : "N";
    }
}