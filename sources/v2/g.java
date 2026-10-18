package v2;

import u2.b1;
import u2.c1;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class g implements c1 {
    public final i a;
    public final b1 b;
    public final int c;
    public boolean d;
    public final /* synthetic */ i e;

    public g(i iVar, i iVar2, b1 b1Var, int i10) {
        this.e = iVar;
        this.a = iVar2;
        this.b = b1Var;
        this.c = i10;
    }

    public final void b() {
        if (this.d) {
            return;
        }
        i iVar = this.e;
        a5.a aVar = iVar.h;
        int[] iArr = iVar.b;
        int i10 = this.c;
        aVar.m(iArr[i10], iVar.c[i10], 0, null, iVar.J);
        this.d = true;
    }

    @Override // u2.c1
    public final boolean e() {
        i iVar = this.e;
        return !iVar.y() && this.b.A(iVar.P);
    }

    @Override // u2.c1
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        i iVar = this.e;
        if (iVar.y()) {
            return -3;
        }
        a aVar = iVar.L;
        b1 b1Var = this.b;
        if (aVar != null && aVar.d(this.c + 1) <= b1Var.v()) {
            return -3;
        }
        b();
        return b1Var.F(bVar, hVar, i10, iVar.P);
    }

    @Override // u2.c1
    public final int h(long j10) {
        i iVar = this.e;
        if (iVar.y()) {
            return 0;
        }
        boolean z10 = iVar.P;
        b1 b1Var = this.b;
        int x10 = b1Var.x(j10, z10);
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

    @Override // u2.c1
    public final void a() {
    }
}
