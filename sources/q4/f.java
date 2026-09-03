package q4;

import b4.e0;
import o4.k0;
import o4.l0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        e0Var.h(iArr[i10], hVar.c[i10], 0, null, hVar.G);
        this.d = true;
    }

    @Override // o4.l0
    public final boolean h() {
        h hVar = this.e;
        return !hVar.y() && this.b.u(hVar.J);
    }

    @Override // o4.l0
    public final int l(long j10) {
        h hVar = this.e;
        if (hVar.y()) {
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
    public final int p(f7.b bVar, n3.i iVar, int i10) {
        h hVar = this.e;
        if (hVar.y()) {
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
