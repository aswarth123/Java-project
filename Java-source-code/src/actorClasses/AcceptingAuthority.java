package actorClasses;

import database.DBAccess;

public class AcceptingAuthority {
	
	DBAccess db = new DBAccess();
	
	public AcceptingAuthority()
	{
		
	}
	
	public String[][] getRawMaterials()
	{
		String rawMaterials[][] = db.getRawMaterials();
		return(rawMaterials);
	}
	
	public String[][] showUnallocatedMaterials()
	{
		String unallocatedRawMaterials[][] = db.getUnallocatedRawMaterials();
		return(unallocatedRawMaterials);
	}
	
	public void approveRawMaterial(String rId, String siteId, String materialModel, String materialName)
	{
		db.approveRawMaterials(rId,siteId,materialModel,materialName);
	}
	
	public void approveSubcontracts(String pId)
	{
		db.approveSubcontracts(pId);
	}
	
	public String[][] viewSubcontracts()
	{
		String subcontracts[][] = db.viewSubcontracts();
		return(subcontracts);
	}

}
