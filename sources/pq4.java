// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class pq4 extends j91 implements oq4, av5 {
    private final int arity;
    private final int flags;

    public pq4(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = 0;
    }

    @Override // j91
    public yu5 computeReflected() {
        f59.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pq4) {
            pq4 pq4Var = (pq4) obj;
            return getName().equals(pq4Var.getName()) && getSignature().equals(pq4Var.getSignature()) && this.flags == pq4Var.flags && this.arity == pq4Var.arity && rp5.a(getBoundReceiver(), pq4Var.getBoundReceiver()) && rp5.a(getOwner(), pq4Var.getOwner());
        }
        if (obj instanceof av5) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // oq4
    public int getArity() {
        return this.arity;
    }

    @Override // j91
    public av5 getReflected() {
        yu5 compute = compute();
        if (compute != this) {
            return (av5) compute;
        }
        throw new ex2("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // av5
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // av5
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // av5
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // av5
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // av5
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        yu5 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
