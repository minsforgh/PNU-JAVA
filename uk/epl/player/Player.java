package uk.epl.player;

public abstract class Player {
    private String name;
    private int jerseyNumber;

    private int[] abilities = new int[3];
    final int SPEED = 0;
    final int STAMINA = 1;
    final int PASSING = 2;

    Position position;

    public class Position {
        public int x;
        public int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return String.format(" Position (%d , %d) ", x, y);
        }
    }
    public Player(String name, int jerseyNumber, int speed, int stamina, int passing) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        abilities[SPEED] = speed;
        abilities[STAMINA] = stamina;
        abilities[PASSING] = passing;
    }

    public Position getPosition() {
        return new Position(position.x, position.y);
    }

    public void setPosition(int x, int y) {
        position.x = x;
        position.y = y;
    }

    public void moveUp() {
        float move_delta = getMove_Delta();
        position.y = (int)(position.y - move_delta);
        decreaseStamina();
    }

    public void moveDown() {
        float move_delta = getMove_Delta();
        position.y = (int)(position.y + move_delta);
        decreaseStamina();
    }

    public void moveLeft() {
        float move_delta = getMove_Delta();
        position.x = (int)(position.x - move_delta);
        decreaseStamina();
    }

    public void moveRight() {
        float move_delta = getMove_Delta();
        position.x = (int)(position.x + move_delta);
        decreaseStamina();
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }
    public String getName() {
        return name;
    }

    private void decreaseStamina() {
        abilities[STAMINA] = (int)(abilities[STAMINA] - 2);
    }

    private float getMove_Delta() {
        return 1 + getSpeed() / 100 * getStamina() / 100;
    }

    protected float getSpeed() {
        return (float)abilities[SPEED];
    }

    protected float getStamina() {
        return (float)abilities[STAMINA];
    }

    protected float getPassing() {
        return (float)abilities[PASSING];
    }

    public abstract String toString();
}