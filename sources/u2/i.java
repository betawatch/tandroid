package u2;

import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class i extends r1 {
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final ArrayList r;
    public final b2.j1 s;
    public g t;
    public h u;
    public long v;
    public long w;

    public i(f fVar) {
        super(fVar.a);
        this.l = fVar.b;
        this.m = fVar.c;
        this.n = fVar.d;
        this.o = fVar.e;
        this.p = fVar.f;
        this.q = fVar.g;
        this.r = new ArrayList();
        this.s = new b2.j1();
    }

    @Override // u2.r1
    public final void A(b2.k1 k1Var) {
        if (this.u != null) {
            return;
        }
        D(k1Var);
    }

    public final void D(b2.k1 k1Var) {
        long j3;
        long j10;
        long j11;
        b2.j1 j1Var = this.s;
        k1Var.n(0, j1Var);
        long j12 = j1Var.p;
        g gVar = this.t;
        long j13 = this.m;
        ArrayList arrayList = this.r;
        if (gVar == null || arrayList.isEmpty() || this.o) {
            boolean z10 = this.p;
            j3 = this.l;
            if (z10) {
                long j14 = j1Var.l;
                j3 += j14;
                j10 = j14 + j13;
            } else {
                j10 = j13;
            }
            this.v = j12 + j3;
            this.w = j13 != Long.MIN_VALUE ? j12 + j10 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = (e) arrayList.get(i10);
                long j15 = this.v;
                long j16 = this.w;
                eVar.e = j15;
                eVar.f = j16;
            }
            j11 = j10;
        } else {
            j3 = this.v - j12;
            j11 = j13 != Long.MIN_VALUE ? this.w - j12 : Long.MIN_VALUE;
        }
        try {
            g gVar2 = new g(k1Var, j3, j11, this.q);
            this.t = gVar2;
            n(gVar2);
        } catch (h e) {
            this.u = e;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((e) arrayList.get(i11)).h = this.u;
            }
        }
    }

    @Override // u2.r1, u2.a
    public final boolean a(b2.k0 k0Var) {
        a aVar = this.k;
        return aVar.i().e.equals(k0Var.e) && aVar.a(k0Var);
    }

    @Override // u2.a
    public final e0 c(g0 g0Var, y2.d dVar, long j3) {
        e eVar = new e(this.k.c(g0Var, dVar, j3), this.n, this.v, this.w);
        this.r.add(eVar);
        return eVar;
    }

    @Override // u2.m, u2.a
    public final void k() {
        h hVar = this.u;
        if (hVar != null) {
            throw hVar;
        }
        super.k();
    }

    @Override // u2.a
    public final void o(e0 e0Var) {
        ArrayList arrayList = this.r;
        e2.d.g(arrayList.remove(e0Var));
        this.k.o(((e) e0Var).a);
        if (!arrayList.isEmpty() || this.o) {
            return;
        }
        g gVar = this.t;
        gVar.getClass();
        D(gVar.e);
    }

    @Override // u2.m, u2.a
    public final void q() {
        super.q();
        this.u = null;
        this.t = null;
    }
}
