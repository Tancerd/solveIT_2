package pl.unity.solveit.util;

import java.util.HashSet;
import java.util.Set;

import pl.unity.solveit.domain.Cell;
import pl.unity.solveit.domain.Generation;
import pl.unity.solveit.domain.IGeneration;

public class StringToGenerationProcessor {

	public static IGeneration process(String stringGeneration) {

		Set<Cell> aliveCells = new HashSet<>();

		String[] rows = stringGeneration.split("\n");

		for (int i = 0; i < rows.length; i++) {

			String[] columns = rows[i].split(" ");

			for (int j = 0; j < columns.length; j++) {

				Cell cell = new Cell(j, i);

				if (columns[j].equalsIgnoreCase("O")) {

					cell.setAlive(true);
					aliveCells.add(cell);
				}
			}
		}

		return new Generation(aliveCells);
	}
}
