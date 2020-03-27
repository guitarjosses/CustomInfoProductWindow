package ni.adempiere.webui.factory;

import org.adempiere.webui.factory.IInfoFactory;
import org.adempiere.webui.info.InfoWindow;
import org.adempiere.webui.panel.InfoPanel;
import org.compiere.model.GridField;
import org.compiere.model.Lookup;
import org.compiere.util.CLogger;

import ni.adempiere.webui.info.InfoProductWindow;

public class InfoWindowFactory implements IInfoFactory{

	private CLogger log = CLogger.getCLogger(InfoWindowFactory.class);
			
	@Override
	public InfoPanel create(int WindowNo, String tableName, String keyColumn, String value, boolean multiSelection,
			String whereClause, int AD_InfoWindow_ID, boolean lookup) {

		log.warning("1");
		
		if(tableName.equalsIgnoreCase("M_Product")){
			
			InfoPanel p =  new InfoProductWindow(WindowNo, tableName, keyColumn, null, multiSelection, whereClause, AD_InfoWindow_ID,lookup);
			if(p.loadedOK())
				return p;
		}
		
		return null;
	}

	@Override
	public InfoPanel create(Lookup lookup, GridField field, String tableName, String keyColumn, String value,
			boolean multiSelection, String whereClause, int AD_InfoWindow_ID) {
		
		
		log.warning("2");
		
		if(tableName.equalsIgnoreCase("M_Product")) {
			InfoPanel p = new InfoProductWindow(lookup.getWindowNo(),tableName, keyColumn, null, multiSelection, whereClause, AD_InfoWindow_ID, true);
			if(p.loadedOK())
				return p;
		}
		
		return null;
	}

	@Override
	public InfoWindow create(int AD_InfoWindow_ID) {
		
		log.warning("3");
		
		return null;
	}

}
