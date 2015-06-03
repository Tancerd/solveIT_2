package pl.unity.solveit.domain;

import java.util.HashSet;
import java.util.Set;

public class Generation implements IGeneration {

	private Set<Cell> aliveCells = new HashSet<Cell>();


	public Generation(Set<Cell> aliveCells) {
		this.aliveCells = aliveCells;
	}

	@Override
	public boolean isCellAliveAtPosition(int x, int y) {

		Cell cell = new Cell(x, y);

		return aliveCells.contains(cell) && aliveCells.stream().filter((c)-> c.equals(cell)).findAny().get().isAlive();
	}

	@Override
	public Set<Cell> getAllAliveCells() {
		return aliveCells;
	}
}
