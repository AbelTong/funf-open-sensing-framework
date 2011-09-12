/**
 *
 * This file is part of the FunF Software System
 * Copyright © 2011, Massachusetts Institute of Technology
 * Do not distribute or use without explicit permission.
 * Contact: funf.mit.edu
 *
 *
 */
package edu.mit.media.funf.probe.builtin;

import android.os.Bundle;

public class BluetoothProbeTest extends ProbeTestCase<BluetoothProbe> {

	public BluetoothProbeTest() {
		super(BluetoothProbe.class);
	}

	public void testBluetoothProbe() {
		Bundle params = new Bundle();
		startProbe(params);
		Bundle data = getData(20);
		assertNotNull(data.get("DEVICES"));
	}
}