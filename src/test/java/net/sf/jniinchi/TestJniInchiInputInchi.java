/*
 * JNI InChI Wrapper - A Java Native Interface Wrapper for InChI.
 * Copyright (C) 2006-2007  Sam Adams
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA
 */
package net.sf.jniinchi;

import org.junit.Assert;
import org.junit.Test;

public class TestJniInchiInputInchi {

    /*
     * Test method for 'net.sf.jniinchi.JniInchiInputInchi.getOptions()'
     */
    @Test
    public void testGetOptions() {
        JniInchiInputInchi input = new JniInchiInputInchi("InChI=1/C6H6/c1-2-4-6-5-3-1/h1-6H");
        input.options = "-compress";
        Assert.assertEquals("-compress", input.getOptions());
    }

    /*
     * Test method for 'net.sf.jniinchi.JniInchiInputInchi.getInchi()'
     */
    @Test
    public void testGetInchi() {
        JniInchiInputInchi input = new JniInchiInputInchi("InChI=1/C6H6/c1-2-4-6-5-3-1/h1-6H");
        Assert.assertEquals("InChI=1/C6H6/c1-2-4-6-5-3-1/h1-6H", input.getInchi());
    }
}
