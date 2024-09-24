package br;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class DeliveryDroneT {

    @Test
    void testSmallBoxThroughWindow() {
        Assertions.assertEquals("S", DroneDelivery.canPassThroughWindow(30, 50, 80, 60));
    }

    @Test
    void testLargeBoxNotThroughWindow() {
        Assertions.assertEquals("N", DroneDelivery.canPassThroughWindow(75, 100, 50, 100));
    }

    @Test
    void testBoxSameSizeAsWindow() {
        Assertions.assertEquals("S", DroneDelivery.canPassThroughWindow(22, 5, 20, 10));
    }
}
