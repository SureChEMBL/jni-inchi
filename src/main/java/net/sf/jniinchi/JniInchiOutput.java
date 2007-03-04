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

/**
 * Encapsulates output from InChI generation.
 * @author Sam Adams
 */
public class JniInchiOutput {

    /**
     * InChI return status
     */
    private INCHI_RET retStatus;

    /**
     * InChI ASCIIZ string
     */
    private String sInchi;

    /**
     * Aux info ASCIIZ string
     */
    private String sAuxInfo;

    /**
     * Error/warning ASCIIZ message
     */
    private String sMessage;

    /**
     * log-file ASCIIZ string, contains a human-readable list of recognized
     * options and possibly an Error/warning message
     */
    private String sLog;


    /**
     * Gets return status from InChI process.  OKAY and WARNING indicate
     * InChI has been generated, in all other cases InChI generation
     * has failed.
     */
    public INCHI_RET getReturnStatus() {
        return retStatus;
    }

    /**
     * Gets generated InChI string.
     */
    public String getInchi() {
        return sInchi;
    }

    /**
     * Gets generated InChI string.
     */
    public String getAuxInfo() {
        return sAuxInfo;
    }

    /**
     * Gets generated (error/warning) messages.
     */
    public String getMessage() {
        return sMessage;
    }

    /**
     * Gets generated log.
     */
    public String getLog() {
        return sLog;
    }

    protected void setLog(final String log) {
        this.sLog = log;
    }

    protected void setMessage(final String message) {
        this.sMessage = message;
    }

    protected void setRetStatus(final INCHI_RET retStatus) {
        this.retStatus = retStatus;
    }

    protected void setInchi(final String inchi) {
        this.sInchi = inchi;
    }

    protected void setAuxInfo(final String auxInfo) {
        this.sAuxInfo = auxInfo;
    }

}
