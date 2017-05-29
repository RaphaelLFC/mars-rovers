package br.com.zup.marsrovers.space;

public class Plateau {

    private Coordinates topRightCoord = null;
    private Coordinates bottomLeftCoord = new Coordinates(0, 0);

    public Plateau(int topRightX, int topRightY) {
        this.topRightCoord = new Coordinates(topRightX, topRightY);
    }

    public boolean containsCoordinates(Coordinates coord) {
        boolean xValid = coord.getX() >= bottomLeftCoord.getX() && coord.getX() <= topRightCoord.getX();
        boolean yValid = coord.getY() >= bottomLeftCoord.getY() && coord.getY() <= topRightCoord.getY();

        return xValid && yValid;
    }
}