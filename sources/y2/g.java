package y2;

import a8.xa;
import x2.a1;
import x2.b1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class g implements b1 {
    public final i a;
    public final a1 b;
    public final int c;
    public boolean d;
    public final /* synthetic */ i e;

    public g(i iVar, i iVar2, a1 a1Var, int i7) {
        this.e = iVar;
        this.a = iVar2;
        this.b = a1Var;
        this.c = i7;
    }

    public final void b() {
        if (this.d) {
            return;
        }
        i iVar = this.e;
        xa xaVar = iVar.h;
        int[] iArr = iVar.b;
        int i7 = this.c;
        xaVar.i(iArr[i7], iVar.c[i7], 0, null, iVar.K);
        this.d = true;
    }

    @Override // x2.b1
    public final boolean f() {
        i iVar = this.e;
        return !iVar.z() && this.b.A(iVar.Q);
    }

    @Override // x2.b1
    public final int n(long j3) {
        i iVar = this.e;
        if (iVar.z()) {
            return 0;
        }
        boolean z10 = iVar.Q;
        a1 a1Var = this.b;
        int x10 = a1Var.x(j3, z10);
        a aVar = iVar.M;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(this.c + 1) - a1Var.v());
        }
        a1Var.L(x10);
        if (x10 > 0) {
            b();
        }
        return x10;
    }

    @Override // x2.b1
    public final int q(k8.a aVar, k2.h hVar, int i7) {
        i iVar = this.e;
        if (iVar.z()) {
            return -3;
        }
        a aVar2 = iVar.M;
        a1 a1Var = this.b;
        if (aVar2 != null && aVar2.d(this.c + 1) <= a1Var.v()) {
            return -3;
        }
        b();
        return a1Var.F(aVar, hVar, i7, iVar.Q);
    }

    @Override // x2.b1
    public final void a() {
    }
}
