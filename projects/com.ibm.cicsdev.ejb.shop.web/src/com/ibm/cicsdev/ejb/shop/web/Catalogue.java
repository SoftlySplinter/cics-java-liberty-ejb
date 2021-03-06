/* Licensed Materials - Property of IBM                               */
/*                                                                    */
/* SAMPLE                                                             */
/*                                                                    */
/* (c) Copyright IBM Corp. 2017 All Rights Reserved                   */
/*                                                                    */
/* US Government Users Restricted Rights - Use, duplication or        */
/* disclosure restricted by GSA ADP Schedule Contract with IBM Corp   */
/*                                                                    */
package com.ibm.cicsdev.ejb.shop.web;

import java.io.IOException;
import java.util.Collection;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ibm.cicsdev.ejb.CatalogueBean;
import com.ibm.cicsdev.ejb.Item;

/**
 * JSF managed bean which acts as a proxy to the {@link CatalogueBean}.
 * 
 * @author Alexander Brown
 */
@ManagedBean
public class Catalogue
{
    /** The catalogue session bean */
    @EJB
    private CatalogueBean catalogue;
    
    /**
     * Proxy to {@link CatalogueBean#getCatalogue()}.
     * 
     * @return All items in the catalogue.
     * @throws IOException
     */
    public Collection<Item> getItems() throws IOException
    {
        return this.catalogue.getCatalogue();
    }
}
