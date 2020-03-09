	import java.io.Serializable;
public class Codes {

	private int id;
	private String name;
	private String path;
	
	public Codes(int id, String name, String path) {
		
		super();
		this.id = id;
		this.name = name;
		this.path = path;
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Codes other = (Codes) obj;
		if (id != other.id)
			return false;
		return true;
	}
		public int getId() {
			return id;
		}
	 
		public void setId(int id) {
			this.id = id;
		}
	 
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
	}
		public void setPath(String name) {
			this.name = name;
	}
		public String getPath() {
			return name;
		}
	 
		
	
}
