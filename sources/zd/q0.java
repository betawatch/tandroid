package zd;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class q0 implements a1 {
    public final boolean a;

    public q0(boolean z10) {
        this.a = z10;
    }

    @Override // zd.a1
    public final v1 c() {
        return null;
    }

    @Override // zd.a1
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
