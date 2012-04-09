package fakedatamaker.people;

public enum TitlePrefix {
	MR{
		public String value(){
			return "Mr.";
		}
	},
	MS{
		public String value(){
			return "Ms.";
		}
	},
	MRS{
		public String value(){
			return "Mrs.";
		}
	},
	MISS{
		public String value(){
			return "Miss";
		}
	},
	SIR{
		public String value(){
			return "Sir";
		}
	},
	DR{
		public String value(){
			return "Dr.";
		}
	};
	
	public abstract String value();
}
