package u2;

import java.util.ArrayList;
import v7.u6;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class i extends v1 {
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final ArrayList r;
    public final b2.n1 s;
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
        this.s = new b2.n1();
    }

    @Override // u2.v1
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
        g gVar = this.t;
        long j14 = this.m;
        ArrayList arrayList = this.r;
        if (gVar == null || arrayList.isEmpty() || this.o) {
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
                e eVar = (e) arrayList.get(i10);
                long j16 = this.v;
                long j17 = this.w;
                eVar.f = j16;
                eVar.h = j17;
            }
            j12 = j11;
        } else {
            j10 = this.v - j13;
            j12 = j14 != Long.MIN_VALUE ? this.w - j13 : Long.MIN_VALUE;
        }
        try {
            g gVar2 = new g(o1Var, j10, j12, this.q);
            this.t = gVar2;
            n(gVar2);
        } catch (h e) {
            this.u = e;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((e) arrayList.get(i11)).n = this.u;
            }
        }
    }

    @Override // u2.v1, u2.a
    public final boolean a(b2.o0 o0Var) {
        a aVar = this.k;
        return aVar.i().e.equals(o0Var.e) && aVar.a(o0Var);
    }

    @Override // u2.a
    public final f0 c(h0 h0Var, androidx.biometric.e eVar, long j10) {
        e eVar2 = new e(this.k.c(h0Var, eVar, j10), this.n, this.v, this.w, 0);
        this.r.add(eVar2);
        return eVar2;
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
    public final void o(f0 f0Var) {
        ArrayList arrayList = this.r;
        u6.p(arrayList.remove(f0Var));
        this.k.o(((e) f0Var).a);
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
