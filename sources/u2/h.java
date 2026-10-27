package u2;

import a8.yb;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class h extends t1 {
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final ArrayList r;
    public final b2.o1 s;
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
        this.s = new b2.o1();
    }

    @Override // u2.t1
    public final void A(b2.p1 p1Var) {
        if (this.u != null) {
            return;
        }
        D(p1Var);
    }

    public final void D(b2.p1 p1Var) {
        long j10;
        long j11;
        long j12;
        b2.o1 o1Var = this.s;
        p1Var.n(0, o1Var);
        long j13 = o1Var.p;
        f fVar = this.t;
        long j14 = this.m;
        ArrayList arrayList = this.r;
        if (fVar == null || arrayList.isEmpty() || this.o) {
            boolean z10 = this.p;
            j10 = this.l;
            if (z10) {
                long j15 = o1Var.l;
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
            f fVar2 = new f(p1Var, j10, j12, this.q);
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
    public final e0 c(g0 g0Var, a8.h0 h0Var, long j10) {
        d dVar = new d(this.k.c(g0Var, h0Var, j10), this.n, this.v, this.w, 0);
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
        yb.p(arrayList.remove(e0Var));
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
