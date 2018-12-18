/******************************************************************************
 * Copyright (C) 2018 Anozi Mada                                              *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 *****************************************************************************/

package com.anozimada.theme.factory;

import java.sql.ResultSet;

import org.adempiere.base.IModelFactory;
import org.compiere.model.PO;
import org.compiere.util.Env;

import com.anozimada.theme.model.MTheme;

public class ModelFactory implements IModelFactory {

	@Override
	public Class<?> getClass(String tableName) {
		Class<?> clazz = null;
		if (tableName.equals(MTheme.Table_Name)) {
			clazz = MTheme.class;
		}
		return clazz;
	}

	@Override
	public PO getPO(String tableName, int Record_ID, String trxName) {
		PO po = null;
		if (tableName.equals(MTheme.Table_Name)) {
			po = new MTheme(Env.getCtx(), Record_ID, trxName);
		}
		return po;
	}

	@Override
	public PO getPO(String tableName, ResultSet rs, String trxName) {
		PO po = null;
		if (tableName.equals(MTheme.Table_Name)) {
			po = new MTheme(Env.getCtx(), rs, trxName);
		}
		return po;
	}

}
