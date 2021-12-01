package uk.epl.player;

public class Midfielder extends Player {

    private int PASSING_POINT = 10;

    public Midfielder (String name, int jerseyNumber, int speed, int stamina, int passing) {
        super(name, jerseyNumber, speed, stamina, passing);
        position = new Position(0, 0);
    }

    @Override
    protected float getPassing() {
        return super.getPassing() + PASSING_POINT;
    }
    @Override
    public String toString() {
        return String.format("Player Name='%s. JerseyNumber=%d ", getName(), getJerseyNumber()) + getPosition() +
                String.format("Midfielder SPEED=%.1f, , STAMINA=%.1f, , PASSING=%.1f", getSpeed(), getStamina(), getPassing());
    }
}