/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jstarcraft.ai.jsat.clustering.hierarchical;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.List;
import java.util.Random;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.jstarcraft.ai.jsat.SimpleDataSet;
import com.jstarcraft.ai.jsat.classifiers.DataPoint;
import com.jstarcraft.ai.jsat.clustering.dissimilarity.SingleLinkDissimilarity;
import com.jstarcraft.ai.jsat.distributions.Uniform;
import com.jstarcraft.ai.jsat.linear.distancemetrics.EuclideanDistance;
import com.jstarcraft.ai.jsat.utils.GridDataGenerator;

import it.unimi.dsi.fastutil.ints.IntOpenHashSet;

/**
 *
 * @author Edward Raff
 */
public class SimpleHACTest {
    /*
     * README: KMeans is a very heuristic algorithm, so its not easy to make a test
     * where we are very sure it will get the correct awnser. That is why only 2 of
     * the methods are tested [ Using KPP, becase random seed selection still isnt
     * consistent enough]
     * 
     */
    static private SimpleHAC simpleHAC;
    static private SimpleDataSet easyData10;

    public SimpleHACTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        simpleHAC = new SimpleHAC(new SingleLinkDissimilarity(new EuclideanDistance()));
        GridDataGenerator gdg = new GridDataGenerator(new Uniform(-0.15, 0.15), new Random(12), 2, 5);
        easyData10 = gdg.generateData(30);// HAC is O(n^3), so we make the data set a good deal smaller
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {

    }

    /**
     * Test of cluster method, of class KMeans.
     */
    @Test
    public void testCluster_DataSet_int() {
        System.out.println("cluster(dataset, int)");
        List<List<DataPoint>> clusters = simpleHAC.cluster(easyData10, 10);
        assertEquals(10, clusters.size());
        IntOpenHashSet seenBefore = new IntOpenHashSet();
        for (List<DataPoint> cluster : clusters) {
            int thisClass = cluster.get(0).getCategoricalValue(0);
            assertFalse(seenBefore.contains(thisClass));
            for (DataPoint dp : cluster)
                assertEquals(thisClass, dp.getCategoricalValue(0));
        }
    }

    @Test
    public void testCluster_DataSet() {
        System.out.println("cluster(dataset)");
        List<List<DataPoint>> clusters = simpleHAC.cluster(easyData10);
        assertEquals(10, clusters.size());
        IntOpenHashSet seenBefore = new IntOpenHashSet();
        for (List<DataPoint> cluster : clusters) {
            int thisClass = cluster.get(0).getCategoricalValue(0);
            assertFalse(seenBefore.contains(thisClass));
            for (DataPoint dp : cluster)
                assertEquals(thisClass, dp.getCategoricalValue(0));
        }
    }

    @Test
    public void testCluster_DataSet_ExecutorService() {
        System.out.println("cluster(dataset, ExecutorService)");
        List<List<DataPoint>> clusters = simpleHAC.cluster(easyData10, true);
        assertEquals(10, clusters.size());
        IntOpenHashSet seenBefore = new IntOpenHashSet();
        for (List<DataPoint> cluster : clusters) {
            int thisClass = cluster.get(0).getCategoricalValue(0);
            assertFalse(seenBefore.contains(thisClass));
            for (DataPoint dp : cluster)
                assertEquals(thisClass, dp.getCategoricalValue(0));
        }
    }

    @Test
    public void testCluster_DataSet_int_int() {
        System.out.println("cluster(dataset, int, int)");
        List<List<DataPoint>> clusters = simpleHAC.cluster(easyData10, 2, 20);
        assertEquals(10, clusters.size());
        IntOpenHashSet seenBefore = new IntOpenHashSet();
        for (List<DataPoint> cluster : clusters) {
            int thisClass = cluster.get(0).getCategoricalValue(0);
            assertFalse(seenBefore.contains(thisClass));
            for (DataPoint dp : cluster)
                assertEquals(thisClass, dp.getCategoricalValue(0));
        }
    }

    @Test
    public void testCluster_DataSet_int_int_ExecutorService() {
        System.out.println("cluster(dataset, int, int, ExecutorService)");
        List<List<DataPoint>> clusters = simpleHAC.cluster(easyData10, 2, 20, true);
        assertEquals(10, clusters.size());
        IntOpenHashSet seenBefore = new IntOpenHashSet();
        for (List<DataPoint> cluster : clusters) {
            int thisClass = cluster.get(0).getCategoricalValue(0);
            assertFalse(seenBefore.contains(thisClass));
            for (DataPoint dp : cluster)
                assertEquals(thisClass, dp.getCategoricalValue(0));
        }
    }

    /**
     * Test of cluster method, of class KMeans.
     */
    @Test
    public void testCluster_DataSet_int_ExecutorService() {
        System.out.println("cluster(dataset, int, ExecutorService)");
        List<List<DataPoint>> clusters = simpleHAC.cluster(easyData10, 10, true);
        assertEquals(10, clusters.size());
        IntOpenHashSet seenBefore = new IntOpenHashSet();
        for (List<DataPoint> cluster : clusters) {
            int thisClass = cluster.get(0).getCategoricalValue(0);
            assertFalse(seenBefore.contains(thisClass));
            for (DataPoint dp : cluster)
                assertEquals(thisClass, dp.getCategoricalValue(0));
        }
    }
}
