package u2;

import java.util.ArrayList;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h extends t1 {
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final ArrayList r;
    public final b2.n1 s;
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
        this.s = new b2.n1();
    }

    @Override // u2.t1
    public final void A(b2.o1 o1Var) {
        if (this.u != null) {
            return;
        }
        D(o1Var);
    }

    public final void D(b2.o1 o1Var) {
        long j10;
        long j11;
        long j12;
        b2.n1 n1Var = this.s;
        o1Var.n(0, n1Var);
        long j13 = n1Var.p;
        f fVar = this.t;
        long j14 = this.m;
        ArrayList arrayList = this.r;
        if (fVar == null || arrayList.isEmpty() || this.o) {
            boolean z10 = this.p;
            j10 = this.l;
            if (z10) {
                long j15 = n1Var.l;
                j10 += j15;
                j11 = j15 + j14;
            } else {
                j11 = j14;
            }
            this.v = j13 + j10;
            this.w = j14 != Long.MIN_VALUE ? j13 + j11 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
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
            f fVar2 = new f(o1Var, j10, j12, this.q);
            this.t = fVar2;
            n(fVar2);
        } catch (g e) {
            this.u = e;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).n = this.u;
            }
        }
    }

    @Override // u2.t1, u2.a
    public final boolean a(b2.p0 p0Var) {
        a aVar = this.k;
        return aVar.i().e.equals(p0Var.e) && aVar.a(p0Var);
    }

    @Override // u2.a
    public final e0 c(g0 g0Var, android.support.v4.media.session.a0 a0Var, long j10) {
        d dVar = new d(this.k.c(g0Var, a0Var, j10), this.n, this.v, this.w, 0);
        this.r.add(dVar);
        return dVar;
    }

    @Override // u2.l, u2.a
    public final void k() {
        g gVar = this.u;
        if (gVar != null) {
            throw gVar;
        }
        super.k();
    }

    @Override // u2.a
    public final void o(e0 e0Var) {
        ArrayList arrayList = this.r;
        t6.p(arrayList.remove(e0Var));
        this.k.o(((d) e0Var).a);
        if (!arrayList.isEmpty() || this.o) {
            return;
        }
        f fVar = this.t;
        fVar.getClass();
        D(fVar.e);
    }

    @Override // u2.l, u2.a
    public final void q() {
        super.q();
        this.u = null;
        this.t = null;
    }
}
