package com.startech.default_methods;

public class DiamondProblem implements PoetDiamond, WriterDiamond {

	@Override
	public void write() {
		System.out.println("1651651");
	}

	public static void main(String[] args) {
		DiamondProblem dp = new DiamondProblem();
		dp.write();
	}

}
