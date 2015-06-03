package pl.unity.solveit.logic;

import pl.unity.solveit.domain.IGeneration;

public interface IGenerationCalculator {

	public IGeneration nextGeneration(IGeneration oldGeneration);
}
