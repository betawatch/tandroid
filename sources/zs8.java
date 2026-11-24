// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class zs8 extends j91 implements bv5 {
    public final boolean a;

    public zs8(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.a = false;
    }

    @Override // j91
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final bv5 getReflected() {
        if (this.a) {
            fyb.i("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
            return null;
        }
        yu5 compute = compute();
        if (compute != this) {
            return (bv5) compute;
        }
        throw new ex2("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    @Override // j91
    public final yu5 compute() {
        return this.a ? this : super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zs8) {
            zs8 zs8Var = (zs8) obj;
            return getOwner().equals(zs8Var.getOwner()) && getName().equals(zs8Var.getName()) && getSignature().equals(zs8Var.getSignature()) && rp5.a(getBoundReceiver(), zs8Var.getBoundReceiver());
        }
        if (obj instanceof bv5) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        yu5 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
