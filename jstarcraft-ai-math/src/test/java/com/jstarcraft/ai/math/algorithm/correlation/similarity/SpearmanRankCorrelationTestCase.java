package com.jstarcraft.ai.math.algorithm.correlation.similarity;

import com.jstarcraft.ai.math.algorithm.correlation.AbstractSimilarityTestCase;
import com.jstarcraft.ai.math.algorithm.correlation.MathCorrelation;
import com.jstarcraft.ai.math.algorithm.correlation.similarity.SpearmanRankCorrelation;

public class SpearmanRankCorrelationTestCase extends AbstractSimilarityTestCase {

    @Override
    protected MathCorrelation getCorrelation() {
        return new SpearmanRankCorrelation();
    }

}
