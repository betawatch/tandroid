package x2;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class u extends r {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(e2.l1 l1Var, int i7) {
        super(l1Var);
        this.f = i7;
    }

    @Override // x2.r, e2.l1
    public int e(int i7, int i10, boolean z10) {
        switch (this.f) {
            case 0:
                e2.l1 l1Var = this.e;
                int e10 = l1Var.e(i7, i10, z10);
                return e10 == -1 ? l1Var.a(z10) : e10;
            default:
                return super.e(i7, i10, z10);
        }
    }

    @Override // x2.r, e2.l1
    public e2.i1 f(int i7, e2.i1 i1Var, boolean z10) {
        switch (this.f) {
            case 1:
                super.f(i7, i1Var, z10);
                i1Var.f = true;
                return i1Var;
            default:
                return super.f(i7, i1Var, z10);
        }
    }

    @Override // x2.r, e2.l1
    public int k(int i7, int i10, boolean z10) {
        switch (this.f) {
            case 0:
                e2.l1 l1Var = this.e;
                int k10 = l1Var.k(i7, i10, z10);
                return k10 == -1 ? l1Var.c(z10) : k10;
            default:
                return super.k(i7, i10, z10);
        }
    }

    @Override // x2.r, e2.l1
    public e2.k1 m(int i7, e2.k1 k1Var, long j3) {
        switch (this.f) {
            case 1:
                super.m(i7, k1Var, j3);
                k1Var.k = true;
                return k1Var;
            default:
                return super.m(i7, k1Var, j3);
        }
    }
}
