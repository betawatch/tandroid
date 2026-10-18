package u2;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class u extends r {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(b2.o1 o1Var, int i10) {
        super(o1Var);
        this.f = i10;
    }

    @Override // u2.r, b2.o1
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

    @Override // u2.r, b2.o1
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

    @Override // u2.r, b2.o1
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

    @Override // u2.r, b2.o1
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
