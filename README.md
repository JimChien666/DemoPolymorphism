# 物件導向 多型

案例：
動物的叫聲
狗：汪汪
貓：喵喵
鳥：吱吱

首先，先創建Animal類別：

Animal.java

```
public class Animal {
	public static final int DOG = 0;
    public static final int BIRD = 1;
    public static final int CAT = 2;
    private String name;
    private int type;
    
	public Animal(String name, int type) {
		this.name = name;
		this.type = type;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
}
```



進行聊天

Main.java

```
public static void main(String[] argv){
    Animal[] animals = new Animal[] {new Animal("鳥", Animal.BIRD), new Animal("狗", Animal.DOG), new Animal("貓", Animal.CAT)};
	    for(Animal animal: animals){
	    	System.out.println(animal.getName()+":");
	    	switch (animal.getType()) {
			case Animal.BIRD:
				System.out.println("吱吱");
				break;
			case Animal.DOG:
				System.out.println("汪汪");
				break;
			case Animal.CAT:
				System.out.println("喵喵");
				break;
			default:
				break;
			}
	    }
    
    };
```

這時候，程式開發就完成了，然而，當我們這時候需要新增其他動物的時候，我們會非常麻煩。
