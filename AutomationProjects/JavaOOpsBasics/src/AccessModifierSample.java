//public,private,protected,default

public class AccessModifierSample {
	//default- access method anywhere in the package.
	//If we make this method as public then we can access in other packages by importing this package
	void abc() {
		//default
	}
	
	//public- variable/method as public: then will be able to access them in all the packages.
	//private- varibales/methods as private: you cannot access them outside the class in same package
	//protected-variables/methods as protected: you can access them only in subclass +other package subclasses.
	//default- variables/methods as default: these cannot be accessed outside the package even though we inherit it.
	//The only way we use class outside the package is by inherit it or by using protected
public void abc1() {
		//public
	}
protected void abc2() {
	//protected
}
private void abc3() {
	//private
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
