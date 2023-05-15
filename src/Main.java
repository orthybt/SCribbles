public class Main {
	public static void main(String[] args) {
		// Initial planned movements
		double initialBuccal = 1.0;
		double initialMesial = 1.4;
		double initialLingual = -0.9;
		double initialTorque = 2.5;
		double initialTip = 1.5;
		double initialRotation = 5.0;
		double initialDistal = 0.6;

		// Reactionary movements
		double buccalReactionary = initialBuccal * 0.02; // 2% of buccal
		double mesialReactionary = initialMesial * 0.1; // 10% of mesial
		double lingualReactionary = initialLingual * 0.02; // 2% of lingual
		double distalReactionary = initialDistal * 0.1; // 10% of distal

		// Final tooth position
		double finalBuccal =
				Math.round
						((initialBuccal + buccalReactionary) * 100.0) / 100.0;
		double finalMesial =
				Math.round
						((initialMesial + mesialReactionary) * 100.0) / 100.0;
		double finalLingual =
				Math.round
						((initialLingual + lingualReactionary) * 100.0) / 100.0;
		double finalDistal =
				Math.round
						((initialDistal + distalReactionary) * 100.0) / 100.0;
		double finalTorque =
				Math.round
						((initialTorque + buccalReactionary - lingualReactionary) * 100.0) / 100.0;
		double finalTip =
				Math.round
						((initialTip + mesialReactionary - distalReactionary) * 100.0) / 100.0;
		double finalRotation =
				Math.round
						((initialRotation + mesialReactionary - distalReactionary) * 100.0) / 100.0;

		// Print final tooth position
		System.out.println("Final Tooth Position:");
		System.out.println("Buccal: " + finalBuccal + " mm");
		System.out.println("Mesial: " + finalMesial + " mm");
		System.out.println("Lingual: " + finalLingual + " mm");
		System.out.println("Distal: " + finalDistal + " mm");
		System.out.println("Torque: " + finalTorque + " degrees");
		System.out.println("Tip: " + finalTip + " degrees");
		System.out.println("Rotation: " + finalRotation + " degrees");
	}
}
