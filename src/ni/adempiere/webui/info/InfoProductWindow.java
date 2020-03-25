package ni.adempiere.webui.info;

import org.adempiere.webui.info.InfoWindow;

public class InfoProductWindow extends InfoWindow{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3450085664018558364L;

	public InfoProductWindow(int WindowNo, String tableName, String keyColumn, String queryValue,
			boolean multipleSelection, String whereClause, int AD_InfoWindow_ID, boolean lookup) {
		super(WindowNo, tableName, keyColumn, queryValue, multipleSelection, whereClause, AD_InfoWindow_ID, lookup);
		// TODO Auto-generated constructor stub
	}

	public InfoProductWindow(int WindowNo, String tableName, String keyColumn, String queryValue,
			boolean multipleSelection, String whereClause, int AD_InfoWindow_ID) {
		super(WindowNo, tableName, keyColumn, queryValue, multipleSelection, whereClause, AD_InfoWindow_ID);
		// TODO Auto-generated constructor stub
	}


}
