package v2;

import n4.y;
import u2.a1;
import u2.b1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class f implements b1 {
    public final h a;
    public final a1 b;
    public final int c;
    public boolean d;
    public final /* synthetic */ h e;

    public f(h hVar, h hVar2, a1 a1Var, int i10) {
        this.e = hVar;
        this.a = hVar2;
        this.b = a1Var;
        this.c = i10;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        h hVar = this.e;
        a5.a aVar = hVar.h;
        int[] iArr = hVar.b;
        int i10 = this.c;
        aVar.j(iArr[i10], hVar.c[i10], 0, null, hVar.J);
        this.d = true;
    }

    @Override // u2.b1
    public final boolean e() {
        h hVar = this.e;
        return !hVar.z() && this.b.x(hVar.O);
    }

    @Override // u2.b1
    public final int f(y yVar, h2.h hVar, int i10) {
        h hVar2 = this.e;
        if (hVar2.z()) {
            return -3;
        }
        a aVar = hVar2.L;
        a1 a1Var = this.b;
        if (aVar != null && aVar.d(this.c + 1) <= a1Var.t()) {
            return -3;
        }
        a();
        return a1Var.C(yVar, hVar, i10, hVar2.O);
    }

    @Override // u2.b1
    public final int m(long j3) {
        h hVar = this.e;
        if (hVar.z()) {
            return 0;
        }
        boolean z10 = hVar.O;
        a1 a1Var = this.b;
        int v = a1Var.v(j3, z10);
        a aVar = hVar.L;
        if (aVar != null) {
            v = Math.min(v, aVar.d(this.c + 1) - a1Var.t());
        }
        a1Var.H(v);
        if (v > 0) {
            a();
        }
        return v;
    }

    @Override // u2.b1
    public final void b() {
    }
}
