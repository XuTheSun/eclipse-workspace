package com.guanxu.interfaceTest;

public interface ITest {
	public void test();
	public abstract class InnerTest implements ITest {

		class a implements ITest{
			@Override
			public void test() {
				// TODO Auto-generated method stub
					
			}
		}

	}
}
