// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class qs4 extends sa1 implements ps4, ax5 {
    private final int arity;
    private final int flags;

    public qs4(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = 0;
    }

    @Override // sa1
    public yw5 computeReflected() {
        h79.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qs4) {
            qs4 qs4Var = (qs4) obj;
            return getName().equals(qs4Var.getName()) && getSignature().equals(qs4Var.getSignature()) && this.flags == qs4Var.flags && this.arity == qs4Var.arity && rr5.a(getBoundReceiver(), qs4Var.getBoundReceiver()) && rr5.a(getOwner(), qs4Var.getOwner());
        }
        if (obj instanceof ax5) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // ps4
    public int getArity() {
        return this.arity;
    }

    @Override // sa1
    public ax5 getReflected() {
        yw5 compute = compute();
        if (compute != this) {
            return (ax5) compute;
        }
        throw new oy2("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // ax5
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // ax5
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // ax5
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // ax5
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // ax5
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        yw5 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
