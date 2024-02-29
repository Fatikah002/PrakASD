package P2.dragonGame;

public class dragon12 {
     int x;
     int y;
     int width;
     int height;

    public dragon12(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void moveLeft() {
        if (x - 1 >= 0) {
            x--;
        } else {
            detectCollision();
        }
    }

    void moveRight() {
        if (x + 1 < width) {
            x++;
        } else {
            detectCollision();
        }
    }

    void moveUp() {
        if (y - 1 >= 0) {
            y--;
        } else {
            detectCollision();
        }
    }

    void moveDown() {
        if (y + 1 < height) {
            y++;
        } else {
            detectCollision();
        }
    }

    void printPosition() {
        System.out.println("Dragon position: (" + x + ", " + y + ")");
    }

    void detectCollision() {
        System.out.println("Game Over");
        System.exit(0);
        
    }
}

