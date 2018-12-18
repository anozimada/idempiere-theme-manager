/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package com.anozimada.theme.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Model for TM_Theme
 *  @author iDempiere (generated) 
 *  @version Release 6.1 - $Id$ */
public class X_TM_Theme extends PO implements I_TM_Theme, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20181217L;

    /** Standard Constructor */
    public X_TM_Theme (Properties ctx, int TM_Theme_ID, String trxName)
    {
      super (ctx, TM_Theme_ID, trxName);
      /** if (TM_Theme_ID == 0)
        {
			setTM_Theme_ID (0);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_TM_Theme (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 6 - System - Client 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_TM_Theme[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getName());
    }

	/** Set Theme.
		@param TM_Theme_ID Theme	  */
	public void setTM_Theme_ID (int TM_Theme_ID)
	{
		if (TM_Theme_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TM_Theme_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TM_Theme_ID, Integer.valueOf(TM_Theme_ID));
	}

	/** Get Theme.
		@return Theme	  */
	public int getTM_Theme_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TM_Theme_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TM_Theme_UU.
		@param TM_Theme_UU TM_Theme_UU	  */
	public void setTM_Theme_UU (String TM_Theme_UU)
	{
		set_Value (COLUMNNAME_TM_Theme_UU, TM_Theme_UU);
	}

	/** Get TM_Theme_UU.
		@return TM_Theme_UU	  */
	public String getTM_Theme_UU () 
	{
		return (String)get_Value(COLUMNNAME_TM_Theme_UU);
	}

	/** Set Search Key.
		@param Value 
		Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue () 
	{
		return (String)get_Value(COLUMNNAME_Value);
	}
}