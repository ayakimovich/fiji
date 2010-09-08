package fiji.plugin.spottracker.tracking.costmatrix;

import mpicbg.imglib.algorithm.Algorithm;

/**
 * Interface for creating cost matrices that can be used in LAP problems.
 * 
 * @author Nicholas Perry
 *
 */
public interface CostMatrixCreator extends Algorithm {

	public double[][] getCostMatrix();
	
}
