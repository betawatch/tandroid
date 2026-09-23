package v2;

import n4.y;
import u2.a1;
import u2.z0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class f implements a1 {
    public final h a;
    public final z0 b;
    public final int c;
    public boolean d;
    public final /* synthetic */ h e;

    public f(h hVar, h hVar2, z0 z0Var, int i10) {
        this.e = hVar;
        this.a = hVar2;
        this.b = z0Var;
        this.c = i10;
    }

    public final void b() {
        if (this.d) {
            return;
        }
        h hVar = this.e;
        a5.a aVar = hVar.h;
        int[] iArr = hVar.b;
        int i10 = this.c;
        aVar.k(iArr[i10], hVar.c[i10], 0, null, hVar.J);
        this.d = true;
    }

    @Override // u2.a1
    public final boolean e() {
        h hVar = this.e;
        return !hVar.y() && this.b.x(hVar.O);
    }

    @Override // u2.a1
    public final int f(y yVar, h2.h hVar, int i10) {
        h hVar2 = this.e;
        if (hVar2.y()) {
            return -3;
        }
        a aVar = hVar2.L;
        z0 z0Var = this.b;
        if (aVar != null && aVar.d(this.c + 1) <= z0Var.t()) {
            return -3;
        }
        b();
        return z0Var.C(yVar, hVar, i10, hVar2.O);
    }

    @Override // u2.a1
    public final int j(long j3) {
        h hVar = this.e;
        if (hVar.y()) {
            return 0;
        }
        boolean z10 = hVar.O;
        z0 z0Var = this.b;
        int v = z0Var.v(j3, z10);
        a aVar = hVar.L;
        if (aVar != null) {
            v = Math.min(v, aVar.d(this.c + 1) - z0Var.t());
        }
        z0Var.H(v);
        if (v > 0) {
            b();
        }
        return v;
    }

    @Override // u2.a1
    public final void a() {
    }
}
