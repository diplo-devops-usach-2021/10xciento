package ejemplopipeline;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiezxcientoTest {
	Diezxciento diezxciento = new Diezxciento(230000000,2800000);
	
	@Test
	public void testDiezxciento() throws Exception {	
		
		assertEquals(23000000, diezxciento.diezxciento());
	}

	@Test
	public void testImpuesto() throws Exception {
		assertEquals(0.135f, diezxciento.impuesto(diezxciento.sueldo), 0.001);
	}

	@Test
	public void testSaldoAhorro() throws Exception {
		assertEquals(18000000, diezxciento.saldoAhorro());
	}

}
