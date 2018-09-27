package InternalData;

public class ImportedItem {
	
	private String  name;
	private String  base_type;
	private boolean shaped;
	private boolean elder;
	private int     sockets;
	private int     links;
	
	
	
	public ImportedItem(){
		this.name      = "";
		this.base_type = "";
		this.shaped    = false;
		this.elder     = false;
		this.sockets   = 0;
		this.links     = 0;
	}
	
	public void initialize(String item_string){
		// parse item string here
		
		// store item data
		
	}

}
