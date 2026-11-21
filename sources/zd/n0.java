package zd;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class n0 implements x0 {
    public final boolean a;

    public n0(boolean z10) {
        this.a = z10;
    }

    @Override // zd.x0
    public final o1 b() {
        return null;
    }

    @Override // zd.x0
    public final boolean isActive() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Empty{");
        sb2.append(this.a ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
