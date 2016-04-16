package br.unicamp.ic.mc302.builder;

import java.awt.Color;
import java.awt.Point;

public class ExemploMain {
	public static void main(String args[]) {
		StreetMap map = new StreetMap.Builder(new Point(50, 50),
				new Point(100, 100)).landColor(Color.GRAY)
						.waterColor(Color.BLUE.brighter()).build();
		System.out.println(map);

		// Reescrevendo passo a passo:
		StreetMap.Builder builder = new StreetMap.Builder(new Point(50, 50),
				new Point(100, 100));
		builder.landColor(Color.GRAY);
		builder.waterColor(Color.BLUE.brighter());
		map = builder.build();
		System.out.println(map);
	}
}
