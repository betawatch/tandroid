package v2;

import a8.ng;
import n4.s;
import u2.c1;
import u2.d1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class g implements d1 {
    public final i a;
    public final c1 b;
    public final int c;
    public boolean d;
    public final /* synthetic */ i e;

    public g(i iVar, i iVar2, c1 c1Var, int i10) {
        this.e = iVar;
        this.a = iVar2;
        this.b = c1Var;
        this.c = i10;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        i iVar = this.e;
        ng ngVar = iVar.h;
        int[] iArr = iVar.b;
        int i10 = this.c;
        ngVar.l(iArr[i10], iVar.c[i10], 0, null, iVar.J);
        this.d = true;
    }

    @Override // u2.d1
    public final boolean e() {
        i iVar = this.e;
        return !iVar.v() && this.b.A(iVar.P);
    }

    @Override // u2.d1
    public final int f(s sVar, h2.h hVar, int i10) {
        i iVar = this.e;
        if (iVar.v()) {
            return -3;
        }
        a aVar = iVar.L;
        c1 c1Var = this.b;
        if (aVar != null && aVar.d(this.c + 1) <= c1Var.v()) {
            return -3;
        }
        a();
        return c1Var.F(sVar, hVar, i10, iVar.P);
    }

    @Override // u2.d1
    public final int j(long j10) {
        i iVar = this.e;
        if (iVar.v()) {
            return 0;
        }
        boolean z10 = iVar.P;
        c1 c1Var = this.b;
        int x9 = c1Var.x(j10, z10);
        a aVar = iVar.L;
        if (aVar != null) {
            x9 = Math.min(x9, aVar.d(this.c + 1) - c1Var.v());
        }
        c1Var.L(x9);
        if (x9 > 0) {
            a();
        }
        return x9;
    }

    @Override // u2.d1
    public final void d() {
    }
}
