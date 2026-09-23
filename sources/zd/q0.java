package zd;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
