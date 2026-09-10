package u2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class v extends s {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(b2.k1 k1Var, int i10) {
        super(k1Var);
        this.f = i10;
    }

    @Override // u2.s, b2.k1
    public int e(int i10, int i11, boolean z10) {
        switch (this.f) {
            case 0:
                b2.k1 k1Var = this.e;
                int e = k1Var.e(i10, i11, z10);
                return e == -1 ? k1Var.a(z10) : e;
            default:
                return super.e(i10, i11, z10);
        }
    }

    @Override // u2.s, b2.k1
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

    @Override // u2.s, b2.k1
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

    @Override // u2.s, b2.k1
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
