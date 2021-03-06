package com.jyc.designpatterns._02_strategy.duck.impl;

import com.jyc.designpatterns._02_strategy.duck.vo.Duck;
import com.jyc.designpatterns._02_strategy.duck.fly.impl.CanNotFlyBehavior;
import com.jyc.designpatterns._02_strategy.duck.quack.impl.CanNotQuackBehavior;

public class RocketDuck extends Duck {

	@Override
	public void display() {
		System.out.println("I am a rocket duck !");
	}

	public RocketDuck() {
		quackBehavior = new CanNotQuackBehavior();
		flyBehavior = new CanNotFlyBehavior();
	}
}
