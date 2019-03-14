package mapping;
public abstract class Edge extends MazeObject {

    //test field
    protected boolean isBoundary;

	
	public Edge (Coordinate topoPos) {
        super(topoPos);
		traversable = true;

        //test field
        isBoundary = false;
	}

    //testing method
    public void setBoundary() {
        isBoundary = true;
        setNoGo();
    }

    //testing method
    public boolean isBoundaryWall() {
        return isBoundary;
    }
}