package Q1;

import java.util.ArrayList;
import java.util.List;

// Memento
class Memento {
    private int position_x;
    private int position_y;

    public Memento(int x, int y) {
        this.position_x = x;
        this.position_y = y;
    }

    public int getPositionX() {
        return position_x;
    }

    public int getPositionY() {
        return position_y;
    }
}

// Originator
class Flag {
    private int position_x;
    private int position_y;
    private List<Player> players = new ArrayList<>();

    public Flag(int x, int y) {
        this.position_x = x;
        this.position_y = y;
    }

    public void setPositionX(int x) {
        this.position_x = x;
        notifyObservers();
    }

    public void setPositionY(int y) {
        this.position_y = y;
        notifyObservers();
    }

    public int getPositionX() {
        return position_x;
    }

    public int getPositionY() {
        return position_y;
    }

    public Memento createMemento() {
        return new Memento(position_x, position_y);
    }

    public void restoreFromMemento(Memento memento) {
        this.position_x = memento.getPositionX();
        this.position_y = memento.getPositionY();
        notifyObservers();  // Players will be notified about the change in position
    }

    public void registerObserver(Player player) {
        players.add(player);
    }

    public void unregisterObserver(Player player) {
        players.remove(player);
    }

    private void notifyObservers() {
        for (Player player : players) {
            player.update(position_x, position_y);
        }
    }
}

// Observer
class Player {
    public void update(int x, int y) {
        System.out.println("Player is notified about the change in position: (" + x + ", " + y + ")");
    }
}

// Caretaker
class GameManager {
    private List<Memento> mementoList = new ArrayList<>();

    public void saveMemento(Memento memento) {
        mementoList.add(memento);
    }

    public Memento getMemento(int index) {
        return mementoList.get(index);
    }
}

public class Main {
    public static void main(String[] args) {
        Flag flag = new Flag(0, 0);
        Player player1 = new Player();
        Player player2 = new Player();

        flag.registerObserver(player1);
        flag.registerObserver(player2);

        flag.setPositionX(10); // Players will be notified about the change in position

        GameManager gameManager = new GameManager();
        gameManager.saveMemento(flag.createMemento());

        flag.setPositionY(20); // Players will be notified about the change in position

        gameManager.saveMemento(flag.createMemento());

        flag.restoreFromMemento(gameManager.getMemento(0)); // Restoring the first memento
    }
}
