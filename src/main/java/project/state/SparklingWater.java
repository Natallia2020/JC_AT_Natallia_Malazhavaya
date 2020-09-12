package main.java.project.state;

public class SparklingWater extends Water {
    private boolean isOpened;
    private Bubble[] bubbles;

    public boolean getIsOpened() {
        return isOpened;
    }

    public void setIsOpened(boolean opened) {
        isOpened = opened;
    }

    public Bubble[] getBubbles() {
        return bubbles;
    }

    public void setBubbles(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    public SparklingWater() {
        checkIsOpened();
    }

    public void pump(Bubble[] bubbles) {
        System.out.println("Making the water sparkling");
        setBubbles(bubbles);
    }

    public void setOpened(boolean isOpened) {
        System.out.println("Opening the bottle");
        isOpened = true;
    }

    public void checkIsOpened() {
        System.out.println("Check if the bottle is opened");
//        Thread thread = run() → {
        while (!isOpened) {
            System.out.println("Bottle is closed..");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        degas();
    }
    ;
//        thread.start();
//    }

    private void degas() {
        System.out.println("Making the water still");
        long l1 = System.currentTimeMillis();
        try {
            double crampBubbles = 0;
            for (int i = 0; i < bubbles.length && bubbles.length >= crampBubbles; i++) {
                crampBubbles = 10 + 5 * Math.floor(getTemperature());
                for (int j = 0; j <= crampBubbles; j++) {
                    bubbles[i].cramp();
                }
                Bubble[] newBubbles = new Bubble[bubbles.length - (int)crampBubbles];
                for (int j = 0; j < newBubbles.length; j++) {
                    newBubbles[j] = new Bubble("CO2");
                }
                bubbles = newBubbles;
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long l2 = System.currentTimeMillis() - l1;
        System.out.println("The water became still in" + " " + l2/1000 + " " + "seconds");
    }

    public boolean isSparkle() {
        System.out.println("Check if the water has bubbles");
        if (bubbles.length != 0) {
        }
        return true;
    }
    @Override
    public void mix() {

    }
}
