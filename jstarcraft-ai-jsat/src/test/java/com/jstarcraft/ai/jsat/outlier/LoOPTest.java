/*
 * Copyright (C) 2018 Edward Raff <Raff.Edward@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jstarcraft.ai.jsat.outlier;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.jstarcraft.ai.jsat.SimpleDataSet;
import com.jstarcraft.ai.jsat.distributions.Normal;
import com.jstarcraft.ai.jsat.outlier.LoOP;
import com.jstarcraft.ai.jsat.utils.GridDataGenerator;

/**
 *
 * @author Edward Raff <Raff.Edward@gmail.com>
 */
public class LoOPTest {

    public LoOPTest() {
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
     * Test of fit method, of class .
     */
    @Test
    public void testFit() {
        System.out.println("fit");
        int N = 5000;
        SimpleDataSet trainData = new GridDataGenerator(new Normal(), 1, 1, 1).generateData(N);

        SimpleDataSet outlierData = new GridDataGenerator(new Normal(10, 1.0), 1, 1, 1).generateData(N);

        LoOP instance = new LoOP();

        for (boolean parallel : new boolean[] { false, true }) {
            instance.fit(trainData, parallel);

            double numOutliersInTrain = trainData.getDataPoints().stream().mapToDouble(instance::score).filter(x -> x < 0).count();
            assertEquals(0, numOutliersInTrain / trainData.size(), 0.05);// Better say something like 95% are inliers!

            double numOutliersInOutliers = outlierData.getDataPoints().stream().mapToDouble(instance::score).filter(x -> x < 0).count();
            assertEquals(1.0, numOutliersInOutliers / outlierData.size(), 0.1);// Better say 90% are outliers!
        }
    }

}
