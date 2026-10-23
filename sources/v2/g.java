package v2;

import u2.e1;
import u2.f1;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class g implements f1 {
    public final i a;
    public final e1 b;
    public final int c;
    public boolean d;
    public final /* synthetic */ i e;

    public g(i iVar, i iVar2, e1 e1Var, int i10) {
        this.e = iVar;
        this.a = iVar2;
        this.b = e1Var;
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

    @Override // u2.f1
    public final boolean f() {
        i iVar = this.e;
        return !iVar.y() && this.b.A(iVar.P);
    }

    @Override // u2.f1
    public final int g(qf.b bVar, h2.h hVar, int i10) {
        i iVar = this.e;
        if (iVar.y()) {
            return -3;
        }
        a aVar = iVar.L;
        e1 e1Var = this.b;
        if (aVar != null && aVar.d(this.c + 1) <= e1Var.v()) {
            return -3;
        }
        b();
        return e1Var.F(bVar, hVar, i10, iVar.P);
    }

    @Override // u2.f1
    public final int m(long j10) {
        i iVar = this.e;
        if (iVar.y()) {
            return 0;
        }
        boolean z10 = iVar.P;
        e1 e1Var = this.b;
        int x10 = e1Var.x(j10, z10);
        a aVar = iVar.L;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(this.c + 1) - e1Var.v());
        }
        e1Var.L(x10);
        if (x10 > 0) {
            b();
        }
        return x10;
    }

    @Override // u2.f1
    public final void a() {
    }
}
