package w2;

import android.util.Pair;
import b8.zb;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b0 extends t1 {
    public final boolean l;
    public final d2.m1 m;
    public final d2.k1 n;
    public z o;
    public y p;
    public boolean q;
    public boolean r;
    public boolean s;

    public b0(a aVar, boolean z10) {
        super(aVar);
        this.l = z10 && aVar.j();
        this.m = new d2.m1();
        this.n = new d2.k1();
        d2.n1 h = aVar.h();
        if (h == null) {
            this.o = new z(new a0(aVar.i()), d2.m1.q, z.h);
        } else {
            this.o = new z(h, null, null);
            this.s = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00cc  */
    @Override // w2.t1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(d2.n1 n1Var) {
        long j10;
        z zVar;
        y yVar;
        Object obj;
        g0 a10;
        z zVar2;
        if (this.r) {
            z zVar3 = this.o;
            this.o = new z(n1Var, zVar3.f, zVar3.g);
            y yVar2 = this.p;
            if (yVar2 != null) {
                E(yVar2.h);
            }
        } else if (n1Var.p()) {
            if (this.s) {
                z zVar4 = this.o;
                zVar2 = new z(n1Var, zVar4.f, zVar4.g);
            } else {
                zVar2 = new z(n1Var, d2.m1.q, z.h);
            }
            this.o = zVar2;
        } else {
            d2.m1 m1Var = this.m;
            n1Var.n(0, m1Var);
            long j11 = m1Var.l;
            Object obj2 = m1Var.a;
            y yVar3 = this.p;
            if (yVar3 != null) {
                long j12 = yVar3.b;
                z zVar5 = this.o;
                Object obj3 = yVar3.a.a;
                d2.k1 k1Var = this.n;
                zVar5.g(obj3, k1Var);
                long j13 = k1Var.e + j12;
                this.o.m(0, m1Var, 0L);
                if (j13 != m1Var.l) {
                    j10 = j13;
                    Pair i3 = n1Var.i(this.m, this.n, 0, j10);
                    Object obj4 = i3.first;
                    long longValue = ((Long) i3.second).longValue();
                    if (this.s) {
                        zVar = new z(n1Var, obj2, obj4);
                    } else {
                        z zVar6 = this.o;
                        zVar = new z(n1Var, zVar6.f, zVar6.g);
                    }
                    this.o = zVar;
                    yVar = this.p;
                    if (yVar != null && E(longValue)) {
                        g0 g0Var = yVar.a;
                        obj = g0Var.a;
                        if (this.o.g != null && obj.equals(z.h)) {
                            obj = this.o.g;
                        }
                        a10 = g0Var.a(obj);
                        this.s = true;
                        this.r = true;
                        n(this.o);
                        if (a10 != null) {
                            y yVar4 = this.p;
                            yVar4.getClass();
                            yVar4.a(a10);
                            return;
                        }
                        return;
                    }
                }
            }
            j10 = j11;
            Pair i32 = n1Var.i(this.m, this.n, 0, j10);
            Object obj42 = i32.first;
            long longValue2 = ((Long) i32.second).longValue();
            if (this.s) {
            }
            this.o = zVar;
            yVar = this.p;
            if (yVar != null) {
                g0 g0Var2 = yVar.a;
                obj = g0Var2.a;
                if (this.o.g != null) {
                    obj = this.o.g;
                }
                a10 = g0Var2.a(obj);
                this.s = true;
                this.r = true;
                n(this.o);
                if (a10 != null) {
                }
            }
        }
        a10 = null;
        this.s = true;
        this.r = true;
        n(this.o);
        if (a10 != null) {
        }
    }

    @Override // w2.t1
    public final void C() {
        if (this.l) {
            return;
        }
        this.q = true;
        B();
    }

    @Override // w2.a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final y c(g0 g0Var, android.support.v4.media.session.a0 a0Var, long j10) {
        y yVar = new y(g0Var, a0Var, j10);
        zb.p(yVar.d == null);
        yVar.d = this.k;
        if (!this.r) {
            this.p = yVar;
            if (!this.q) {
                this.q = true;
                B();
            }
            return yVar;
        }
        Object obj = g0Var.a;
        if (this.o.g != null && obj.equals(z.h)) {
            obj = this.o.g;
        }
        yVar.a(g0Var.a(obj));
        return yVar;
    }

    public final boolean E(long j10) {
        y yVar = this.p;
        int b10 = this.o.b(yVar.a.a);
        if (b10 == -1) {
            return false;
        }
        z zVar = this.o;
        d2.k1 k1Var = this.n;
        zVar.f(b10, k1Var, false);
        long j11 = k1Var.d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        yVar.h = j10;
        return true;
    }

    @Override // w2.t1, w2.a
    public final boolean a(d2.n0 n0Var) {
        return this.k.a(n0Var);
    }

    @Override // w2.a
    public final void o(e0 e0Var) {
        y yVar = (y) e0Var;
        if (yVar.e != null) {
            a aVar = yVar.d;
            aVar.getClass();
            aVar.o(yVar.e);
        }
        if (e0Var == this.p) {
            this.p = null;
        }
    }

    @Override // w2.l, w2.a
    public final void q() {
        this.r = false;
        this.q = false;
        super.q();
    }

    @Override // w2.t1, w2.a
    public final void t(d2.n0 n0Var) {
        if (this.s) {
            z zVar = this.o;
            d2.n1 n1Var = zVar.e;
            this.o = new z(n1Var instanceof q1 ? new q1(((q1) n1Var).e, n0Var) : new q1(n1Var, n0Var), zVar.f, zVar.g);
        } else {
            this.o = new z(new a0(n0Var), d2.m1.q, z.h);
        }
        this.k.t(n0Var);
    }

    @Override // w2.t1
    public final g0 z(g0 g0Var) {
        Object obj = g0Var.a;
        Object obj2 = this.o.g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = z.h;
        }
        return g0Var.a(obj);
    }
}
