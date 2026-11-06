package zd;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class n0 implements x0 {
    public final boolean a;

    public n0(boolean z9) {
        this.a = z9;
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
