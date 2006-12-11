/* File: INCHI_RADICAL.java
 * Author: Sam Adams
 * 
 * Copyright (C) 2006 Sam Adams
 */
package net.sf.jniinchi;

/**
 * Type-safe enumeration of InChI radical definitions.  See <tt>inchi_api.h</tt>.
 * @author Sam Adams
 */
public class INCHI_RADICAL {
    
    
    /**
     * No radical status recorded.
     */
    public static final INCHI_RADICAL NONE      = new INCHI_RADICAL("NONE", 0);
    
    /**
     * Singlet.
     */
    public static final INCHI_RADICAL SINGLET   = new INCHI_RADICAL("SINGLET", 1);
    
    /**
     * Doublet.
     */
    public static final INCHI_RADICAL DOUBLET   = new INCHI_RADICAL("DOUBLET", 2);
    
    /**
     * Triplet.
     */
    public static final INCHI_RADICAL TRIPLET   = new INCHI_RADICAL("TRIPLET", 3);
    
    
    
    
    /**
     * Name.
     */
    private final String name;
    
    /**
     * Internal InChI index (from inchi_api.h).
     */
    private final int indx;
    
    /**
     * Constructor.
     */
    private INCHI_RADICAL(String name, int indx) { this.name = name; this.indx = indx; };
    
    public int getIndx() {
        return indx;
    } 
    
    public String toString() {
        return name;
    }
}