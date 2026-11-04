package w2;

import b8.zb;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h extends t1 {
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final ArrayList r;
    public final d2.m1 s;
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
        this.s = new d2.m1();
    }

    @Override // w2.t1
    public final void A(d2.n1 n1Var) {
        if (this.u != null) {
            return;
        }
        D(n1Var);
    }

    public final void D(d2.n1 n1Var) {
        long j10;
        long j11;
        long j12;
        d2.m1 m1Var = this.s;
        n1Var.n(0, m1Var);
        long j13 = m1Var.p;
        f fVar = this.t;
        long j14 = this.m;
        ArrayList arrayList = this.r;
        if (fVar == null || arrayList.isEmpty() || this.o) {
            boolean z10 = this.p;
            j10 = this.l;
            if (z10) {
                long j15 = m1Var.l;
                j10 += j15;
                j11 = j15 + j14;
            } else {
                j11 = j14;
            }
            this.v = j13 + j10;
            this.w = j14 != Long.MIN_VALUE ? j13 + j11 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                d dVar = (d) arrayList.get(i3);
                long j16 = this.v;
                long j17 = this.w;
                dVar.f = j16;
                dVar.h = j17;
            }
            j12 = j11;
        } else {
            j10 = this.v - j13;
            j12 = j14 != Long.MIN_VALUE ? this.w - j13 : Long.MIN_VALUE;
        }
        try {
            f fVar2 = new f(n1Var, j10, j12, this.q);
            this.t = fVar2;
            n(fVar2);
        } catch (g e10) {
            this.u = e10;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((d) arrayList.get(i10)).n = this.u;
            }
        }
    }

    @Override // w2.t1, w2.a
    public final boolean a(d2.n0 n0Var) {
        a aVar = this.k;
        return aVar.i().e.equals(n0Var.e) && aVar.a(n0Var);
    }

    @Override // w2.a
    public final e0 c(g0 g0Var, android.support.v4.media.session.a0 a0Var, long j10) {
        d dVar = new d(this.k.c(g0Var, a0Var, j10), this.n, this.v, this.w, 0);
        this.r.add(dVar);
        return dVar;
    }

    @Override // w2.l, w2.a
    public final void k() {
        g gVar = this.u;
        if (gVar != null) {
            throw gVar;
        }
        super.k();
    }

    @Override // w2.a
    public final void o(e0 e0Var) {
        ArrayList arrayList = this.r;
        zb.p(arrayList.remove(e0Var));
        this.k.o(((d) e0Var).a);
        if (!arrayList.isEmpty() || this.o) {
            return;
        }
        f fVar = this.t;
        fVar.getClass();
        D(fVar.e);
    }

    @Override // w2.l, w2.a
    public final void q() {
        super.q();
        this.u = null;
        this.t = null;
    }
}
