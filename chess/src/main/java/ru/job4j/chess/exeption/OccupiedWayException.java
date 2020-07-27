package ru.job4j.chess.exeption;

public class OccupiedWayException extends RuntimeException {
    public OccupiedWayException() {
    }

    public OccupiedWayException(String message) {
        super(message);
    }
}