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

package com.anozimada.theme.process;

import java.util.logging.Level;

import org.adempiere.exceptions.FillMandatoryException;
import org.adempiere.webui.apps.AEnv;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zul.theme.Themes;

import com.anozimada.theme.model.MTheme;

public class SwitchTheme extends SvrProcess {

	private int	p_TM_Theme_ID = 0;
	
	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++) {
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("TM_Theme_ID"))
				p_TM_Theme_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}

	@Override
	protected String doIt() throws Exception {
		if (log.isLoggable(Level.INFO)) 
			log.info("doIt - TM_Theme_ID=" + p_TM_Theme_ID);
		
		if (p_TM_Theme_ID <= 0) {
			throw new FillMandatoryException(MTheme.COLUMNNAME_TM_Theme_ID);
		}
		MTheme theme = new MTheme(getCtx(), p_TM_Theme_ID, get_TrxName());
		
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				Themes.setTheme(Executions.getCurrent(), theme.getValue());
				Executions.sendRedirect("");
			}
		};
		AEnv.executeAsyncDesktopTask(runnable);
		
		return "";
	}

}
