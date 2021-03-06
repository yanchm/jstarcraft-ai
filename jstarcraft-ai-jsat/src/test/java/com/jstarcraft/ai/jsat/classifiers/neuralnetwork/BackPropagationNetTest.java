/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jstarcraft.ai.jsat.classifiers.neuralnetwork;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.jstarcraft.ai.jsat.FixedProblems;
import com.jstarcraft.ai.jsat.TestTools;
import com.jstarcraft.ai.jsat.classifiers.ClassificationDataSet;
import com.jstarcraft.ai.jsat.classifiers.neuralnetwork.BackPropagationNet;
import com.jstarcraft.ai.jsat.utils.random.RandomUtil;

/**
 *
 * @author Edward Raff
 */
public class BackPropagationNetTest {
    /*
     * RBF is a bit heuristic and works best with more data - so the training set
     * size is enlarged
     */

    public BackPropagationNetTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of train method, of class DReDNetSimple.
     */
    @Test
    public void testTrainC_ClassificationDataSet_ExecutorService() {
        System.out.println("trainC");
        ClassificationDataSet trainSet = FixedProblems.getInnerOuterCircle(2000, RandomUtil.getRandom());
        ClassificationDataSet testSet = FixedProblems.getInnerOuterCircle(200, RandomUtil.getRandom());

        BackPropagationNet net = new BackPropagationNet(500).clone();
        net.setEpochs(20);
        net.train(trainSet, true);

        net = net.clone();
        for (int i = 0; i < testSet.size(); i++)
            assertEquals(testSet.getDataPointCategory(i), net.classify(testSet.getDataPoint(i)).mostLikely());

    }

    /**
     * Test of train method, of class DReDNetSimple.
     */
    @Test
    public void testTrainC_ClassificationDataSet() {
        System.out.println("trainC");
        ClassificationDataSet trainSet = FixedProblems.getInnerOuterCircle(2000, RandomUtil.getRandom());
        ClassificationDataSet testSet = FixedProblems.getInnerOuterCircle(200, RandomUtil.getRandom());

        BackPropagationNet net = new BackPropagationNet(500).clone();
        net.setEpochs(20);
        // serialization check
        net = TestTools.deepCopy(net);
        net.train(trainSet);

        net = net.clone();
        for (int i = 0; i < testSet.size(); i++)
            assertEquals(testSet.getDataPointCategory(i), net.classify(testSet.getDataPoint(i)).mostLikely());
        // serialization check
        net = TestTools.deepCopy(net);
        for (int i = 0; i < testSet.size(); i++)
            assertEquals(testSet.getDataPointCategory(i), net.classify(testSet.getDataPoint(i)).mostLikely());
    }

}
