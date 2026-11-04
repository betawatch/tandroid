package w2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class v extends s {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(d2.n1 n1Var, int i3) {
        super(n1Var);
        this.f = i3;
    }

    @Override // w2.s, d2.n1
    public int e(int i3, int i10, boolean z10) {
        switch (this.f) {
            case 0:
                d2.n1 n1Var = this.e;
                int e10 = n1Var.e(i3, i10, z10);
                return e10 == -1 ? n1Var.a(z10) : e10;
            default:
                return super.e(i3, i10, z10);
        }
    }

    @Override // w2.s, d2.n1
    public d2.k1 f(int i3, d2.k1 k1Var, boolean z10) {
        switch (this.f) {
            case 1:
                super.f(i3, k1Var, z10);
                k1Var.f = true;
                return k1Var;
            default:
                return super.f(i3, k1Var, z10);
        }
    }

    @Override // w2.s, d2.n1
    public int k(int i3, int i10, boolean z10) {
        switch (this.f) {
            case 0:
                d2.n1 n1Var = this.e;
                int k10 = n1Var.k(i3, i10, z10);
                return k10 == -1 ? n1Var.c(z10) : k10;
            default:
                return super.k(i3, i10, z10);
        }
    }

    @Override // w2.s, d2.n1
    public d2.m1 m(int i3, d2.m1 m1Var, long j10) {
        switch (this.f) {
            case 1:
                super.m(i3, m1Var, j10);
                m1Var.k = true;
                return m1Var;
            default:
                return super.m(i3, m1Var, j10);
        }
    }
}
