package com.example.linguaggio.matrici;

/**
 * @see https://en.wikipedia.org/wiki/Row-_and_column-major_order
 * @see https://stackoverflow.com/questions/12429492/how-to-convert-a-monodimensional-index-to-corresponding-indices-in-a-multidimens
 * @author paolo
 *
 */
public class MatrixDemo extends Object {
	private int[][] matrix = { 
			{ 1,2,3,4,5 },
			{ 6,7,8,9,10 },
			{11,12,13,14,15 },
			{ 16,17,18,19,20 } };

	public int getValue(int rows, int column)
	{
	  return matrix[rows][column];
	}

	/**
	 * @see https://stackoverflow.com/questions/12429492/how-to-convert-a-monodimensional-index-to-corresponding-indices-in-a-multidimens
	 * @param index
	 * @param numberOfRows
	 * @param numberOfColumns
	 * @return
	 **/
	public int[] getRowColumnFromIndexRowMajorV1(int index, int numberOfRows, int numberOfColumns) {
		int column = index % numberOfColumns;
		int row = (index / numberOfColumns) % numberOfRows;
		return new int[] { row, column };
	}

	/**
	 * @see https://stackoverflow.com/questions/1817631/iterating-one-dimension-array-as-two-dimension-array
	 * @param index
	 * @param numberOfColumns
	 * @return
	 */
	public int[] getRowColumnFromIndexRowMajorV2(int index, int numberOfColumns) {
		int column = index % numberOfColumns;
		int row = (index - column) / numberOfColumns;
		return new int[] { row, column };
	}

	/**
	 * @see https://stackoverflow.com/questions/1817631/iterating-one-dimension-array-as-two-dimension-array
	 *      <p>
	 *      If you want row-major order, given row rowIndex, column columnIndex and
	 *      are faking (for lack of a better term) a two-dimensional array with
	 *      numberOfColumns columns, the formula is
	 * 
	 *      <pre>
	 * <code>rowIndex * numberOfColumns + columnIndex</code>
	 *      </pre>
	 * 
	 *      If you want row-major order, given row rowIndex, column columnIndex and
	 *      are faking (for lack of a better term) a two-dimensional array with
	 *      numberOfRow rows, the formula is
	 * 
	 *      <pre>
	 * <code>columnIndex * numberOfRows + rowIndex</code>
	 *      </pre>
	 *      </p>
	 * @param row
	 * @param column
	 * @param numberOfColumns
	 * @return
	 */
	public int getLinearIndexFromRowMajor(int row, int column, int numberOfColumns) {
		return row * numberOfColumns + column;
	}

	public int[] getRowColumnFromIndexColumnMajorV1(int index, int numberOfRows, int numberOfColumns) {
		int row = index % numberOfRows;
		int column = (index / numberOfRows) % numberOfColumns;
		return new int[] { row, column };
	}

	/**
	 * @see https://stackoverflow.com/questions/1817631/iterating-one-dimension-array-as-two-dimension-array
	 * @param index
	 * @param numberOfRows
	 * @return
	 */
	public int[] getRowColumnFromIndexColumnMajorV2(int index, int numberOfRows) {
		int row = index % numberOfRows;
		int column = (index - row) / numberOfRows;
		return new int[] { row, column };
	}

	/**
	 * @see https://stackoverflow.com/questions/1817631/iterating-one-dimension-array-as-two-dimension-array
	 *      <p>
	 *      If you want row-major order, given row rowIndex, column columnIndex and
	 *      are faking (for lack of a better term) a two-dimensional array with
	 *      numberOfColumns columns, the formula is
	 * 
	 *      <pre>
	 * <code>rowIndex * numberOfColumns + columnIndex</code>
	 *      </pre>
	 * 
	 *      If you want row-major order, given row rowIndex, column columnIndex and
	 *      are faking (for lack of a better term) a two-dimensional array with
	 *      numberOfRow rows, the formula is
	 * 
	 *      <pre>
	 * <code>columnIndex * numberOfRows + rowIndex</code>
	 *      </pre>
	 *      </p>
	 * @param row
	 * @param column
	 * @param numberOfRows
	 * @return
	 */
	public int getLinearIndexFromColumnMajor(int row, int column, int numberOfRows) {
		return column * numberOfRows + row;
	}

}