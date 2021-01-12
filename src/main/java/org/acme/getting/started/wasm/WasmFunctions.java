package org.acme.getting.started.wasm;

import de.mirkosertic.bytecoder.api.Export;

public class WasmFunctions {

	public static void main(String[] args) {
	}

	@Export("thePurposeOfLife")
	public static int getThePurposeOfLife() {
		return 42;
	}

}
