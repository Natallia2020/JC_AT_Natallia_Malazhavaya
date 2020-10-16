package main.java.project.stuff;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SparklingWater extends Water {
    private boolean isOpened;
    private List<Bubble> bubbles;

    public boolean getOpened() {
        return isOpened;
    }

    public void setOpened(boolean isOpened) {
        this.isOpened = isOpened;
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

    public void pump(List<Bubble> bubbles) {
        System.out.println("Making the water sparkling");
        this.bubbles = bubbles;
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
        while (bubbles.size() != 0) {
            int crampBubbles = 10 + 5 * this.getTemperature();
            System.out.println("crampBubbles is: " + crampBubbles);
            for (int i = 0; i < crampBubbles && i < bubbles.size(); i++) {
                bubbles.get(i).cramp();
            }
            if (bubbles.size() > crampBubbles) {
                for (int j = 0; j < crampBubbles; j++) {
                    bubbles.remove(bubbles.size()-1);
                }
                System.out.println("bubbles.size is: " + bubbles.size());

                Thread.sleep(1000);
            } else {
                for (int i = 0; i < bubbles.size(); i++) {
                    bubbles.remove(bubbles.size()-1);
                }
                break;
            }
        }
        System.out.println("Bubbles size is: " + bubbles.size());

        long l2 = System.currentTimeMillis() - l1;
        System.out.println("The water became still in" + " " + l2 / 1000 + " " + "seconds");
    }

            public boolean isSparkle() {
                System.out.println("Check if the water has bubbles");
                if (this.bubbles.size() > 0) {
                    System.out.println("There are bubbles in this bottle");
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

