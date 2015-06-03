package pl.unity.solveit.logic;

import java.util.HashSet;
import java.util.Set;

import pl.unity.solveit.domain.Cell;
import pl.unity.solveit.domain.Generation;
import pl.unity.solveit.domain.IGeneration;


public class GenerationCalculator implements IGenerationCalculator {

	@Override
	public IGeneration nextGeneration(IGeneration oldGeneration) {

		Set<Cell> newGenerationAliveCells = new HashSet<>();

		return new Generation(newGenerationAliveCells);
	}

}
