package fakedatamaker.contact.online;

public enum TopLevelDomains {
	COM {
		@Override
		public String value() {
			return ".com";
		}
	},
	NET {
		@Override
		public String value() {
			return ".net";
		}
	},
	ORG {
		@Override
		public String value() {
			return ".org";
		}
	},
	EDU {
		@Override
		public String value() {
			return ".edu";
		}
	},
	GOV {
		@Override
		public String value() {
			return ".gov";
		}
	};

	public abstract String value();
}