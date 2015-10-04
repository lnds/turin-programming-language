package me.tomassetti.jvm;

public class JvmMethodDefinition extends JvmInvokableDefinition {

    private boolean _static;
    private boolean declaredOnInterface;

    public JvmMethodDefinition(String ownerInternalName, String methodName, String descriptor, boolean _static, boolean declaredOnInterface) {
        super(ownerInternalName, methodName, descriptor);
        this._static = _static;
        this.declaredOnInterface = declaredOnInterface;
    }

    public boolean isStatic() {
        return _static;
    }

    public boolean isDeclaredOnInterface() {
        return declaredOnInterface;
    }
}