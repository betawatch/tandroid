// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class ts4 extends s91 implements ss4, fx5 {
    private final int arity;
    private final int flags;

    public ts4(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = 0;
    }

    @Override // s91
    public dx5 computeReflected() {
        s89.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ts4) {
            ts4 ts4Var = (ts4) obj;
            return getName().equals(ts4Var.getName()) && getSignature().equals(ts4Var.getSignature()) && this.flags == ts4Var.flags && this.arity == ts4Var.arity && ur5.a(getBoundReceiver(), ts4Var.getBoundReceiver()) && ur5.a(getOwner(), ts4Var.getOwner());
        }
        if (obj instanceof fx5) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // ss4
    public int getArity() {
        return this.arity;
    }

    @Override // s91
    public fx5 getReflected() {
        dx5 compute = compute();
        if (compute != this) {
            return (fx5) compute;
        }
        throw new yx2("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // fx5
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // fx5
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // fx5
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // fx5
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // fx5
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        dx5 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
