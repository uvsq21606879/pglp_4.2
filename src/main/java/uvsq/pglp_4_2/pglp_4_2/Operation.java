package uvsq.pglp_4_2.pglp_4_2;

public enum Operation {

	PLUS ('+') {
		@Override
		public float eval( float a, float b ) {
			return a + b;
		}
	},
	MOINS ('-') {
		@Override
		public float eval( float a, float b) {
			return b - a;
		}
	},
	MULT ('*'){
		@Override
		public float eval( float a, float b ) {
			return a * b;
		}
	},
	DIV ('/'){
		@Override
		public float eval( float a, float b ) throws IllegalOperator {
			if ( a == 0 )
				throw new IllegalOperator();
			else
				return b / a;
		}
	};
	
	public char symbole;
	
	Operation( char symbole ) {
		this.symbole = symbole;
	}
	
	public abstract float eval( float a, float b ) throws IllegalOperator;
	
	public static Operation getOpFromValue( char op )  {
		for ( Operation o : Operation.values() ) {
	        if ( o.symbole == op ) {
	            return o;
	        }
	    }
		return null;
	}
	
	public static boolean contains( char op ) {
		
	    for ( Operation o : Operation.values()) {
	        if ( o.symbole == op ) {
	            return true;
	        }
	    }
	    return false;
	}
	
		
	
}
