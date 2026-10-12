package u2;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class v extends s {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(b2.p1 p1Var, int i10) {
        super(p1Var);
        this.f = i10;
    }

    @Override // u2.s, b2.p1
    public int e(int i10, int i11, boolean z10) {
        switch (this.f) {
            case 0:
                b2.p1 p1Var = this.e;
                int e = p1Var.e(i10, i11, z10);
                return e == -1 ? p1Var.a(z10) : e;
            default:
                return super.e(i10, i11, z10);
        }
    }

    @Override // u2.s, b2.p1
    public b2.m1 f(int i10, b2.m1 m1Var, boolean z10) {
        switch (this.f) {
            case 1:
                super.f(i10, m1Var, z10);
                m1Var.f = true;
                return m1Var;
            default:
                return super.f(i10, m1Var, z10);
        }
    }

    @Override // u2.s, b2.p1
    public int k(int i10, int i11, boolean z10) {
        switch (this.f) {
            case 0:
                b2.p1 p1Var = this.e;
                int k10 = p1Var.k(i10, i11, z10);
                return k10 == -1 ? p1Var.c(z10) : k10;
            default:
                return super.k(i10, i11, z10);
        }
    }

    @Override // u2.s, b2.p1
    public b2.o1 m(int i10, b2.o1 o1Var, long j10) {
        switch (this.f) {
            case 1:
                super.m(i10, o1Var, j10);
                o1Var.k = true;
                return o1Var;
            default:
                return super.m(i10, o1Var, j10);
        }
    }
}
