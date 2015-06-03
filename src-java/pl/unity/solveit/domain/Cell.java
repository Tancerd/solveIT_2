package pl.unity.solveit.domain;

public class Cell {

	private final int x;
	private final int y;

	private boolean alive;


	public Cell(int x, int y) {

		this.x = x;
		this.y = y;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;

		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Cell other = (Cell) obj;

		if (x != other.x)
			return false;
		if (y != other.y)
			return false;

		return true;
	}

}
