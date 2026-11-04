package wd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n0 implements x0 {
    public final boolean a;

    public n0(boolean z10) {
        this.a = z10;
    }

    @Override // wd.x0
    public final o1 b() {
        return null;
    }

    @Override // wd.x0
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
