package problem5;

public class Parallel extends Circuit{

	Circuit first;
	Circuit second;
	public Parallel(Circuit a, Circuit b) {
		this.first = a;
		this.second = b;
	}
	
	@Override
	public double getResistance() {
		return Math.pow(1/first.getResistance() + 1/second.getResistance(), -1);
	}

	@Override
	public double getPotentialDiff() {
		if (first.getPotentialDiff() == second.getPotentialDiff()) {
			return first.getPotentialDiff();
		} else {
		double current = first.getCurrent() + second.getCurrent();
		return getResistance() * current;
		}
	}

	@Override
	public void applyPotentialDiif(double V) {
		first.applyPotentialDiif(V);
		second.applyPotentialDiif(V);
		
	}

}
