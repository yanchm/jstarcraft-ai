/*
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * Copyright (C) 2006 University of Waikato, Hamilton, New Zealand
 */

package weka.filters.unsupervised.attribute;

import junit.framework.Test;
import junit.framework.TestSuite;
import weka.core.Instances;
import weka.filters.AbstractFilterTest;
import weka.filters.Filter;

/**
 * Tests Center. Run from the command line with:
 * <p>
 * java weka.filters.unsupervised.attribute.CenterTest
 *
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision$
 */
public class CenterTest extends AbstractFilterTest {

    public CenterTest(String name) {
        super(name);
    }

    /** Creates a default Center */
    public Filter getFilter() {
        return new Center();
    }

    public void testTypical() {
        Instances result = useFilter();
        // Number of attributes and instances shouldn't change
        assertEquals(m_Instances.numAttributes(), result.numAttributes());
        assertEquals(m_Instances.numInstances(), result.numInstances());
    }

    public static Test suite() {
        return new TestSuite(CenterTest.class);
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }
}
