package u2;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class v extends s {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(b2.o1 o1Var, int i10) {
        super(o1Var);
        this.f = i10;
    }

    @Override // u2.s, b2.o1
    public int e(int i10, int i11, boolean z10) {
        switch (this.f) {
            case 0:
                b2.o1 o1Var = this.e;
                int e = o1Var.e(i10, i11, z10);
                return e == -1 ? o1Var.a(z10) : e;
            default:
                return super.e(i10, i11, z10);
        }
    }

    @Override // u2.s, b2.o1
    public b2.l1 f(int i10, b2.l1 l1Var, boolean z10) {
        switch (this.f) {
            case 1:
                super.f(i10, l1Var, z10);
                l1Var.f = true;
                return l1Var;
            default:
                return super.f(i10, l1Var, z10);
        }
    }

    @Override // u2.s, b2.o1
    public int k(int i10, int i11, boolean z10) {
        switch (this.f) {
            case 0:
                b2.o1 o1Var = this.e;
                int k10 = o1Var.k(i10, i11, z10);
                return k10 == -1 ? o1Var.c(z10) : k10;
            default:
                return super.k(i10, i11, z10);
        }
    }

    @Override // u2.s, b2.o1
    public b2.n1 m(int i10, b2.n1 n1Var, long j10) {
        switch (this.f) {
            case 1:
                super.m(i10, n1Var, j10);
                n1Var.k = true;
                return n1Var;
            default:
                return super.m(i10, n1Var, j10);
        }
    }
}
