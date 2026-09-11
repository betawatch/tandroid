package u2;

import java.util.ArrayList;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class h extends p1 {
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final ArrayList r;
    public final b2.j1 s;
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
        this.s = new b2.j1();
    }

    @Override // u2.p1
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
        f fVar = this.t;
        long j13 = this.m;
        ArrayList arrayList = this.r;
        if (fVar == null || arrayList.isEmpty() || this.o) {
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
                d dVar = (d) arrayList.get(i10);
                long j15 = this.v;
                long j16 = this.w;
                dVar.e = j15;
                dVar.f = j16;
            }
            j11 = j10;
        } else {
            j3 = this.v - j12;
            j11 = j13 != Long.MIN_VALUE ? this.w - j12 : Long.MIN_VALUE;
        }
        try {
            f fVar2 = new f(k1Var, j3, j11, this.q);
            this.t = fVar2;
            n(fVar2);
        } catch (g e7) {
            this.u = e7;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).h = this.u;
            }
        }
    }

    @Override // u2.p1, u2.a
    public final boolean a(b2.k0 k0Var) {
        a aVar = this.k;
        return aVar.i().e.equals(k0Var.e) && aVar.a(k0Var);
    }

    @Override // u2.a
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        d dVar2 = new d(this.k.c(f0Var, dVar, j3), this.n, this.v, this.w);
        this.r.add(dVar2);
        return dVar2;
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
    public final void o(d0 d0Var) {
        ArrayList arrayList = this.r;
        e2.d.g(arrayList.remove(d0Var));
        this.k.o(((d) d0Var).a);
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
