package v2;

import u2.c1;
import u2.d1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class f implements d1 {
    public final h a;
    public final c1 b;
    public final int c;
    public boolean d;
    public final /* synthetic */ h e;

    public f(h hVar, h hVar2, c1 c1Var, int i10) {
        this.e = hVar;
        this.a = hVar2;
        this.b = c1Var;
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
        aVar.i(iArr[i10], hVar.c[i10], 0, null, hVar.J);
        this.d = true;
    }

    @Override // u2.d1
    public final boolean e() {
        h hVar = this.e;
        return !hVar.y() && this.b.x(hVar.O);
    }

    @Override // u2.d1
    public final int g(long j3) {
        h hVar = this.e;
        if (hVar.y()) {
            return 0;
        }
        boolean z10 = hVar.O;
        c1 c1Var = this.b;
        int v = c1Var.v(j3, z10);
        a aVar = hVar.L;
        if (aVar != null) {
            v = Math.min(v, aVar.d(this.c + 1) - c1Var.t());
        }
        c1Var.H(v);
        if (v > 0) {
            b();
        }
        return v;
    }

    @Override // u2.d1
    public final int t(of.b bVar, h2.h hVar, int i10) {
        h hVar2 = this.e;
        if (hVar2.y()) {
            return -3;
        }
        a aVar = hVar2.L;
        c1 c1Var = this.b;
        if (aVar != null && aVar.d(this.c + 1) <= c1Var.t()) {
            return -3;
        }
        b();
        return c1Var.C(bVar, hVar, i10, hVar2.O);
    }

    @Override // u2.d1
    public final void a() {
    }
}
