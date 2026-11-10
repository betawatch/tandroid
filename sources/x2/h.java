package x2;

import a8.ia;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class h extends r1 {
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final ArrayList r;
    public final e2.k1 s;
    public f t;
    public g u;
    public long v;
    public long w;

    public h(e eVar) {
        super(eVar.a);
        this.l = eVar.b;
        this.m = eVar.c;
        this.n = eVar.d;
        this.o = eVar.e;
        this.p = eVar.f;
        this.q = eVar.g;
        this.r = new ArrayList();
        this.s = new e2.k1();
    }

    @Override // x2.r1
    public final void A(e2.l1 l1Var) {
        if (this.u != null) {
            return;
        }
        D(l1Var);
    }

    public final void D(e2.l1 l1Var) {
        long j3;
        long j10;
        long j11;
        e2.k1 k1Var = this.s;
        l1Var.n(0, k1Var);
        long j12 = k1Var.p;
        f fVar = this.t;
        long j13 = this.m;
        ArrayList arrayList = this.r;
        if (fVar == null || arrayList.isEmpty() || this.o) {
            boolean z9 = this.p;
            j3 = this.l;
            if (z9) {
                long j14 = k1Var.l;
                j3 += j14;
                j10 = j14 + j13;
            } else {
                j10 = j13;
            }
            this.v = j12 + j3;
            this.w = j13 != Long.MIN_VALUE ? j12 + j10 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                d dVar = (d) arrayList.get(i7);
                long j15 = this.v;
                long j16 = this.w;
                dVar.f = j15;
                dVar.h = j16;
            }
            j11 = j10;
        } else {
            j3 = this.v - j12;
            j11 = j13 != Long.MIN_VALUE ? this.w - j12 : Long.MIN_VALUE;
        }
        try {
            f fVar2 = new f(l1Var, j3, j11, this.q);
            this.t = fVar2;
            n(fVar2);
        } catch (g e10) {
            this.u = e10;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((d) arrayList.get(i10)).n = this.u;
            }
        }
    }

    @Override // x2.r1, x2.a
    public final boolean a(e2.l0 l0Var) {
        a aVar = this.k;
        return aVar.i().e.equals(l0Var.e) && aVar.a(l0Var);
    }

    @Override // x2.a
    public final d0 c(f0 f0Var, h6.m mVar, long j3) {
        d dVar = new d(this.k.c(f0Var, mVar, j3), this.n, this.v, this.w, 0);
        this.r.add(dVar);
        return dVar;
    }

    @Override // x2.l, x2.a
    public final void k() {
        g gVar = this.u;
        if (gVar != null) {
            throw gVar;
        }
        super.k();
    }

    @Override // x2.a
    public final void o(d0 d0Var) {
        ArrayList arrayList = this.r;
        ia.p(arrayList.remove(d0Var));
        this.k.o(((d) d0Var).a);
        if (!arrayList.isEmpty() || this.o) {
            return;
        }
        f fVar = this.t;
        fVar.getClass();
        D(fVar.e);
    }

    @Override // x2.l, x2.a
    public final void q() {
        super.q();
        this.u = null;
        this.t = null;
    }
}
