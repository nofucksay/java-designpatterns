# Java-Demos

## 目录
- [设计模式](#设计模式)
	- [设计原则](#设计原则)
	- [状态模式](#状态模式)
	- [策略模式](#策略模式)
##  

## 设计模式
- ### 设计原则
	- #### 设计原则一
		把会变化的部分取出并封装起来，好让代码变化引起的不经意后果变少，系统变得更有弹性。
	- #### 设计原则二
		针对接口编程，类不需要知道行为的实现细节。
	- #### 设计原则三
		多用组合，少用继承。

- ### 状态模式
	- #### 模式定义
		- 状态模式，又称`状态对象模式`，状态模式是对象的行为模式。
		- 状态模式允许一个对象在其内部状态改变的时候改变其行为。这个对象看上去就像是改变了它的类一样。
	- #### 使用示例
		- #### 糖果机
		1. 实现一个糖果机从投币到出糖的过程。
		2. 糖果机共5种状态：无币，已投币，发售糖果，中奖发售糖果（10%几率），无糖。
		3. 糖果机共3种操作：投币，退币，转动摇杆。
		4. 代码地址：*[CandyMachine](https://github.com/nofucksay/java-demo/tree/master/src/main/java/com/jyc/designpatterns/_20_state/candymachine)*
		
- ### 策略模式
	- #### 模式定义
		- 策略模式定义了算法族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。
	- #### 使用示例
		- #### 鸭子呱呱
		1. 只需要会呱呱叫并且外表不同的鸭子。
			- Duck类实现`quack()`和定义`display()`，不同的鸭子继承Duck类重写`display()`。
		2. 需要加入会飞的鸭子。
			- 在Duck中实现`fly()`，不会飞的鸭子需要对`fly()`进行覆盖，使得`fly()`什么都不做。
		3. 需要加入不会呱呱叫也不会飞行的橡皮鸭。
			- 继承Duck类后需要覆盖其中的`fly()`和`quack()`，使得`fly()`和`quack()`什么都不做。
		4. 需要加入本来不会飞但是点火后可以飞的火箭鸭。
			- 现有的继承结构无法在运行时改变鸭子的行为。
		5. 随着需求的不断变化，继承Duck类使得改变会牵一发动全身，造成其他鸭子不想要的改变。
		6. 代码地址：*[Duck](https://github.com/nofucksay/java-demo/tree/master/src/main/java/com/jyc/designpatterns/_01_strategy/duck)*
