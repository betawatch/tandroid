package v2;

import u2.d1;
import u2.e1;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class g implements e1 {
    public final i a;
    public final d1 b;
    public final int c;
    public boolean d;
    public final /* synthetic */ i e;

    public g(i iVar, i iVar2, d1 d1Var, int i10) {
        this.e = iVar;
        this.a = iVar2;
        this.b = d1Var;
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

    @Override // u2.e1
    public final boolean e() {
        i iVar = this.e;
        return !iVar.y() && this.b.A(iVar.P);
    }

    @Override // u2.e1
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        i iVar = this.e;
        if (iVar.y()) {
            return -3;
        }
        a aVar = iVar.L;
        d1 d1Var = this.b;
        if (aVar != null && aVar.d(this.c + 1) <= d1Var.v()) {
            return -3;
        }
        b();
        return d1Var.F(bVar, hVar, i10, iVar.P);
    }

    @Override // u2.e1
    public final int h(long j10) {
        i iVar = this.e;
        if (iVar.y()) {
            return 0;
        }
        boolean z10 = iVar.P;
        d1 d1Var = this.b;
        int x10 = d1Var.x(j10, z10);
        a aVar = iVar.L;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(this.c + 1) - d1Var.v());
        }
        d1Var.L(x10);
        if (x10 > 0) {
            b();
        }
        return x10;
    }

    @Override // u2.e1
    public final void a() {
    }
}
