package u2;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class u extends r {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(b2.k1 k1Var, int i10) {
        super(k1Var);
        this.f = i10;
    }

    @Override // u2.r, b2.k1
    public int e(int i10, int i11, boolean z10) {
        switch (this.f) {
            case 0:
                b2.k1 k1Var = this.e;
                int e7 = k1Var.e(i10, i11, z10);
                return e7 == -1 ? k1Var.a(z10) : e7;
            default:
                return super.e(i10, i11, z10);
        }
    }

    @Override // u2.r, b2.k1
    public b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        switch (this.f) {
            case 1:
                super.f(i10, h1Var, z10);
                h1Var.f = true;
                return h1Var;
            default:
                return super.f(i10, h1Var, z10);
        }
    }

    @Override // u2.r, b2.k1
    public int k(int i10, int i11, boolean z10) {
        switch (this.f) {
            case 0:
                b2.k1 k1Var = this.e;
                int k10 = k1Var.k(i10, i11, z10);
                return k10 == -1 ? k1Var.c(z10) : k10;
            default:
                return super.k(i10, i11, z10);
        }
    }

    @Override // u2.r, b2.k1
    public b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        switch (this.f) {
            case 1:
                super.m(i10, j1Var, j3);
                j1Var.k = true;
                return j1Var;
            default:
                return super.m(i10, j1Var, j3);
        }
    }
}
