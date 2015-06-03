package pl.unity.solveit.domain;

import java.util.Set;

public interface IGeneration {

	public boolean isCellAliveAtPosition(int x, int y);

	public Set<Cell> getAllAliveCells();
}
