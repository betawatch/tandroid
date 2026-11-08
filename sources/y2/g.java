package y2;

import a8.wa;
import x2.b1;
import x2.c1;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class g implements c1 {
    public final i a;
    public final b1 b;
    public final int c;
    public boolean d;
    public final /* synthetic */ i e;

    public g(i iVar, i iVar2, b1 b1Var, int i7) {
        this.e = iVar;
        this.a = iVar2;
        this.b = b1Var;
        this.c = i7;
    }

    public final void b() {
        if (this.d) {
            return;
        }
        i iVar = this.e;
        wa waVar = iVar.h;
        int[] iArr = iVar.b;
        int i7 = this.c;
        waVar.j(iArr[i7], iVar.c[i7], 0, null, iVar.J);
        this.d = true;
    }

    @Override // x2.c1
    public final boolean f() {
        i iVar = this.e;
        return !iVar.v() && this.b.A(iVar.P);
    }

    @Override // x2.c1
    public final int l(long j3) {
        i iVar = this.e;
        if (iVar.v()) {
            return 0;
        }
        boolean z9 = iVar.P;
        b1 b1Var = this.b;
        int x10 = b1Var.x(j3, z9);
        a aVar = iVar.L;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(this.c + 1) - b1Var.v());
        }
        b1Var.L(x10);
        if (x10 > 0) {
            b();
        }
        return x10;
    }

    @Override // x2.c1
    public final int m(wf.b bVar, k2.h hVar, int i7) {
        i iVar = this.e;
        if (iVar.v()) {
            return -3;
        }
        a aVar = iVar.L;
        b1 b1Var = this.b;
        if (aVar != null && aVar.d(this.c + 1) <= b1Var.v()) {
            return -3;
        }
        b();
        return b1Var.F(bVar, hVar, i7, iVar.P);
    }

    @Override // x2.c1
    public final void a() {
    }
}
