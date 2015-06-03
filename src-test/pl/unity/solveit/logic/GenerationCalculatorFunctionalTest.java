package pl.unity.solveit.logic;

import static org.junit.Assert.assertEquals;
import static pl.unity.solveit.util.StringToGenerationProcessor.process;

import org.junit.Test;

import pl.unity.solveit.domain.IGeneration;

public class GenerationCalculatorFunctionalTest {

	/**
	 * O or o - alive string cell
	 */

	@Test
	public void shouldGenerateNewGeneration1() {

		String stringGeneration = "O";

		IGenerationCalculator generationCalculator = new GenerationCalculator();

		IGeneration startGeneration = process(stringGeneration);
		IGeneration nextGeneration = generationCalculator.nextGeneration(startGeneration);

		assertEquals(nextGeneration.getAllAliveCells().size(), 0);
	}

	@Test
	public void shouldGenerateNewGeneration2() {

		String stringGeneration = "O O"
								+ "O X";

		IGenerationCalculator generationCalculator = new GenerationCalculator();

		IGeneration startGeneration = process(stringGeneration);
		IGeneration nextGeneration = generationCalculator.nextGeneration(startGeneration);

		assertEquals(nextGeneration.getAllAliveCells().size(), 4);
		assertEquals(nextGeneration.isCellAliveAtPosition(0, 0), true);
		assertEquals(nextGeneration.isCellAliveAtPosition(0, 1), true);
		assertEquals(nextGeneration.isCellAliveAtPosition(1, 0), true);
		assertEquals(nextGeneration.isCellAliveAtPosition(1, 1), true);
	}

	@Test
	public void shouldGenerateNewGeneration3() {

		String stringGeneration = "O O"
								+ "O O";

		IGenerationCalculator generationCalculator = new GenerationCalculator();

		IGeneration startGeneration = process(stringGeneration);
		IGeneration nextGeneration = generationCalculator.nextGeneration(startGeneration);

		assertEquals(nextGeneration.getAllAliveCells().size(), 4);
		assertEquals(nextGeneration.isCellAliveAtPosition(0, 0), true);
		assertEquals(nextGeneration.isCellAliveAtPosition(0, 1), true);
		assertEquals(nextGeneration.isCellAliveAtPosition(1, 0), true);
		assertEquals(nextGeneration.isCellAliveAtPosition(1, 1), true);
	}

	@Test
	public void shouldGenerateNewGeneration4() {

		String stringGeneration = "O O O";

		IGenerationCalculator generationCalculator = new GenerationCalculator();

		IGeneration startGeneration = process(stringGeneration);
		IGeneration nextGeneration = generationCalculator.nextGeneration(startGeneration);

		assertEquals(nextGeneration.getAllAliveCells().size(), 3);
		assertEquals(nextGeneration.isCellAliveAtPosition(1, 0), true);
		assertEquals(nextGeneration.isCellAliveAtPosition(1, -1), true);
		assertEquals(nextGeneration.isCellAliveAtPosition(1, 1), true);
	}

	@Test
	public void shouldGenerateNewGeneration5() {

		String stringGeneration = "O O O"
								+ "O O O"
								+ "O O O";

		IGenerationCalculator generationCalculator = new GenerationCalculator();

		IGeneration firstGeneration = process(stringGeneration);
		IGeneration secondGeneration = generationCalculator.nextGeneration(firstGeneration);
		IGeneration thirdGeneration = generationCalculator.nextGeneration(secondGeneration);
		IGeneration fourthGeneration = generationCalculator.nextGeneration(thirdGeneration);

		assertEquals(secondGeneration.getAllAliveCells().size(), 8);
		assertEquals(thirdGeneration.getAllAliveCells().size(), 12);
		assertEquals(fourthGeneration.getAllAliveCells().size(), 12);
	}
}
