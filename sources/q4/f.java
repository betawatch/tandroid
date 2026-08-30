package q4;

import b4.e0;
import o4.k0;
import o4.l0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class f implements l0 {
    public final h a;
    public final k0 b;
    public final int c;
    public boolean d;
    public final /* synthetic */ h e;

    public f(h hVar, h hVar2, k0 k0Var, int i10) {
        this.e = hVar;
        this.a = hVar2;
        this.b = k0Var;
        this.c = i10;
    }

    public final void b() {
        if (this.d) {
            return;
        }
        h hVar = this.e;
        e0 e0Var = hVar.h;
        int[] iArr = hVar.b;
        int i10 = this.c;
        e0Var.g(iArr[i10], hVar.c[i10], 0, null, hVar.G);
        this.d = true;
    }

    @Override // o4.l0
    public final boolean d() {
        h hVar = this.e;
        return !hVar.k() && this.b.u(hVar.J);
    }

    @Override // o4.l0
    public final int e(long j10) {
        h hVar = this.e;
        if (hVar.k()) {
            return 0;
        }
        boolean z4 = hVar.J;
        k0 k0Var = this.b;
        int s6 = k0Var.s(j10, z4);
        a aVar = hVar.I;
        if (aVar != null) {
            s6 = Math.min(s6, aVar.d(this.c + 1) - k0Var.q());
        }
        k0Var.E(s6);
        if (s6 > 0) {
            b();
        }
        return s6;
    }

    @Override // o4.l0
    public final int f(f7.b bVar, n3.i iVar, int i10) {
        h hVar = this.e;
        if (hVar.k()) {
            return -3;
        }
        a aVar = hVar.I;
        k0 k0Var = this.b;
        if (aVar != null && aVar.d(this.c + 1) <= k0Var.q()) {
            return -3;
        }
        b();
        return k0Var.z(bVar, iVar, i10, hVar.J);
    }

    @Override // o4.l0
    public final void a() {
    }
}
