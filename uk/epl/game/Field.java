package uk.epl.game;
import uk.epl.player.*;
import java.util.List;

import java.util.ArrayList;

public class Field {
    private  List<Player> players = new ArrayList<>();

    public void add(Player newPlayer) {
        players.add(newPlayer);
    }

    public void moveUp(int jerseyNumber) {
        for(final Player player : players) {
            if(player.getJerseyNumber() == jerseyNumber)
                player.moveUp();
        }
    }

    public void moveDown(int jerseyNumber) {
        for(final Player player : players) {
            if(player.getJerseyNumber() == jerseyNumber)
                player.moveDown();
        }
    }
    public void moveLeft(int jerseyNumber) {
        for(final Player player : players) {
            if(player.getJerseyNumber() == jerseyNumber)
                player.moveLeft();
        }
    }
    public void moveRight(int jerseyNumber) {
        for(final Player player : players) {
            if(player.getJerseyNumber() == jerseyNumber)
                player.moveRight();
        }
    }

    public void info() {
        for(final Player player : players) {
            System.out.println(player);
        }
    }

    public void start() {
        for (final Player player : players) {
            if(player instanceof Forward)
                player.setPosition(34,25);
            else if(player instanceof Midfielder)
                player.setPosition(34, 50);
            else if(player instanceof Defender)
                player.setPosition(34,75);
        }
    }

    public void stop() {
        for (final Player player : players) {
            player.setPosition(0,0);
        }
    }
}