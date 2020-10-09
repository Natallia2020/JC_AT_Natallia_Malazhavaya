package main.java.project.stuff;

import java.util.List;

public class SparklingWater extends Water {
    private boolean isOpened;
    private List<Bubble> bubbles;

    public boolean getOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        this.isOpened = opened;
    }

    public List<Bubble> getBubbles() {
        return bubbles;
    }

    public void setBubbles(List<Bubble> bubbles) {
        this.bubbles = bubbles;
    }

    public SparklingWater() {
        checkIsOpened();
    }

    public SparklingWater(String color, String transparency, String smell, int temperature) {
        super(color, transparency, smell, temperature);
        checkIsOpened();
    }


    public void pump(List<Bubble> bubbles) {
        System.out.println("Making the water sparkling");
        this.bubbles = bubbles;
        setBubbles(bubbles);
    }

    public void checkIsOpened() {
        System.out.println("Check if the bottle is opened");
        Thread thread = new Thread() {
            public void run() {
                while (!isOpened) {
                    System.out.println("Bottle is closed..");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    degas();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }

    private void degas() throws InterruptedException {
        System.out.println("Making the water still");
        long l1 = System.currentTimeMillis();
        try {
            double crampBubbles = 0;
            for (int i = 0; i < this.bubbles.size() && this.bubbles.size() >= crampBubbles; i++) {
                crampBubbles = 10 + 5 * Math.floor(this.getTemperature());
                for (int j = 0; j <= crampBubbles; j++) {
                    bubbles.remove(j);
                }
                if(this.bubbles.size() < crampBubbles) {
                        for (int k = 0; k < this.bubbles.size(); k++) {
                            bubbles.remove(k);
                        }
                    }
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long l2 = System.currentTimeMillis() - l1;
        System.out.println("The water became still in" + " " + l2 / 1000 + " " + "seconds");
    }

    public boolean isSparkle() {
        System.out.println("Check if the water has bubbles");
        if (this.bubbles.size() > 0) {
            return true;
        } else {
            System.out.println("There are no bubbles in this bottle");
            return false;
        }
    }

    @Override
    public void mix() {
    }

}
