package ni.adempiere.webui.factory;

import org.adempiere.webui.factory.IInfoFactory;
import org.adempiere.webui.info.InfoWindow;
import org.adempiere.webui.panel.InfoPanel;
import org.compiere.model.GridField;
import org.compiere.model.Lookup;
import org.compiere.util.CLogger;

public class InfoWindowFactory implements IInfoFactory{

	private CLogger log = CLogger.getCLogger(InfoWindowFactory.class);
			
	@Override
	public InfoPanel create(int WindowNo, String tableName, String keyColumn, String value, boolean multiSelection,
			String whereClause, int AD_InfoWindow_ID, boolean lookup) {

		log.warning("1");
		
		return null;
	}

	@Override
	public InfoPanel create(Lookup lookup, GridField field, String tableName, String keyColumn, String value,
			boolean multiSelection, String whereClause, int AD_InfoWindow_ID) {
		
		
		log.warning("2");
		
		return null;
	}

	@Override
	public InfoWindow create(int AD_InfoWindow_ID) {
		
		log.warning("3");
		
		return null;
	}

}
