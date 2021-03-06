package cp.measure;

import cp.Utils;

public class MeasureLambda {
	public static int summation( int n ) {
		if( n < 1 ) {
			return 0;
		}
		return n + summation( n - 1 );
	}

	public static void main() {
		Utils.doAndMeasure( () -> {
			System.out.println( "Result: " + summation( 5 ) );
		} );
	}
}
