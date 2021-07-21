package com.example.linguaggio.matrici;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatrixDemoTest {
	private static final int REFERENCE_INDEX =7;
	private static final int REFERENCE_ROW_VALUE =1;
	private static final int REFERENCE_COLUMN_VALUE =2;
	private static final int NUMBER_OF_ROWS =4;
	private static final int NUMBER_OF_COLUMNS =5;
	private static final int REFERENCE_VALUE =8;
	private static final int X =0;
	private static final int Y =1;
	@Test
	void fromIndexToXYV1() {
		MatrixDemo md = new MatrixDemo();
		int [] rowCol = md.getRowColumnFromIndexRowMajorV1(REFERENCE_INDEX, NUMBER_OF_ROWS, NUMBER_OF_COLUMNS);
		// risultato atteso [1, 2]
		assertEquals(REFERENCE_ROW_VALUE,rowCol[X]);
		assertEquals(REFERENCE_COLUMN_VALUE,rowCol[Y]);
		// risultato atteso 8
		assertEquals(md.getValue(rowCol[X], rowCol[Y]), REFERENCE_VALUE);
	}
	@Test
	void fromIndexToXYV2() {
		MatrixDemo md = new MatrixDemo();
		int[] rowCol = md.getRowColumnFromIndexRowMajorV2(REFERENCE_INDEX, NUMBER_OF_COLUMNS);
		// risultato atteso [1, 2]
		assertEquals(REFERENCE_ROW_VALUE, rowCol[X]);
		assertEquals(REFERENCE_COLUMN_VALUE, rowCol[Y]);
		// risultato atteso 8
		assertEquals(md.getValue(rowCol[X], rowCol[Y]), REFERENCE_VALUE);
	}
	@Test
	void fromIndexToXYV3() {
		MatrixDemo md = new MatrixDemo();
		int rowCol = md.getLinearIndexFromRowMajor(1,2,NUMBER_OF_COLUMNS);
		// risultato atteso [1, 2]
		assertEquals(REFERENCE_INDEX, rowCol);
		// risultato atteso 8
	}
}
