package extend1.access.child;

import extend1.access.parent.Parent;

public class Child extends Parent {
    public void call() {
        publicValue = 1;
        protectValue = 1;

        publicMethod();
        protectedMethod();

        printParent();
    }
}
