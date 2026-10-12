package u2;

import android.util.Pair;
import v7.u6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class b0 extends t1 {
    public final boolean l;
    public final b2.o1 m;
    public final b2.m1 n;
    public z o;
    public y p;
    public boolean q;
    public boolean r;
    public boolean s;

    public b0(a aVar, boolean z10) {
        super(aVar);
        this.l = z10 && aVar.j();
        this.m = new b2.o1();
        this.n = new b2.m1();
        b2.p1 h = aVar.h();
        if (h == null) {
            this.o = new z(new a0(aVar.i()), b2.o1.q, z.h);
        } else {
            this.o = new z(h, null, null);
            this.s = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00cc  */
    @Override // u2.t1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(b2.p1 p1Var) {
        long j10;
        z zVar;
        y yVar;
        Object obj;
        g0 a2;
        z zVar2;
        if (this.r) {
            z zVar3 = this.o;
            this.o = new z(p1Var, zVar3.f, zVar3.g);
            y yVar2 = this.p;
            if (yVar2 != null) {
                E(yVar2.h);
            }
        } else if (p1Var.p()) {
            if (this.s) {
                z zVar4 = this.o;
                zVar2 = new z(p1Var, zVar4.f, zVar4.g);
            } else {
                zVar2 = new z(p1Var, b2.o1.q, z.h);
            }
            this.o = zVar2;
        } else {
            b2.o1 o1Var = this.m;
            p1Var.n(0, o1Var);
            long j11 = o1Var.l;
            Object obj2 = o1Var.a;
            y yVar3 = this.p;
            if (yVar3 != null) {
                long j12 = yVar3.b;
                z zVar5 = this.o;
                Object obj3 = yVar3.a.a;
                b2.m1 m1Var = this.n;
                zVar5.g(obj3, m1Var);
                long j13 = m1Var.e + j12;
                this.o.m(0, o1Var, 0L);
                if (j13 != o1Var.l) {
                    j10 = j13;
                    Pair i10 = p1Var.i(this.m, this.n, 0, j10);
                    Object obj4 = i10.first;
                    long longValue = ((Long) i10.second).longValue();
                    if (this.s) {
                        zVar = new z(p1Var, obj2, obj4);
                    } else {
                        z zVar6 = this.o;
                        zVar = new z(p1Var, zVar6.f, zVar6.g);
                    }
                    this.o = zVar;
                    yVar = this.p;
                    if (yVar != null && E(longValue)) {
                        g0 g0Var = yVar.a;
                        obj = g0Var.a;
                        if (this.o.g != null && obj.equals(z.h)) {
                            obj = this.o.g;
                        }
                        a2 = g0Var.a(obj);
                        this.s = true;
                        this.r = true;
                        n(this.o);
                        if (a2 != null) {
                            y yVar4 = this.p;
                            yVar4.getClass();
                            yVar4.a(a2);
                            return;
                        }
                        return;
                    }
                }
            }
            j10 = j11;
            Pair i102 = p1Var.i(this.m, this.n, 0, j10);
            Object obj42 = i102.first;
            long longValue2 = ((Long) i102.second).longValue();
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
                a2 = g0Var2.a(obj);
                this.s = true;
                this.r = true;
                n(this.o);
                if (a2 != null) {
                }
            }
        }
        a2 = null;
        this.s = true;
        this.r = true;
        n(this.o);
        if (a2 != null) {
        }
    }

    @Override // u2.t1
    public final void C() {
        if (this.l) {
            return;
        }
        this.q = true;
        B();
    }

    @Override // u2.a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final y c(g0 g0Var, androidx.biometric.e eVar, long j10) {
        y yVar = new y(g0Var, eVar, j10);
        u6.p(yVar.d == null);
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
        b2.m1 m1Var = this.n;
        zVar.f(b10, m1Var, false);
        long j11 = m1Var.d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        yVar.h = j10;
        return true;
    }

    @Override // u2.t1, u2.a
    public final boolean a(b2.p0 p0Var) {
        return this.k.a(p0Var);
    }

    @Override // u2.a
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

    @Override // u2.m, u2.a
    public final void q() {
        this.r = false;
        this.q = false;
        super.q();
    }

    @Override // u2.t1, u2.a
    public final void t(b2.p0 p0Var) {
        if (this.s) {
            z zVar = this.o;
            b2.p1 p1Var = zVar.e;
            this.o = new z(p1Var instanceof q1 ? new q1(((q1) p1Var).e, p0Var) : new q1(p1Var, p0Var), zVar.f, zVar.g);
        } else {
            this.o = new z(new a0(p0Var), b2.o1.q, z.h);
        }
        this.k.t(p0Var);
    }

    @Override // u2.t1
    public final g0 z(g0 g0Var) {
        Object obj = g0Var.a;
        Object obj2 = this.o.g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = z.h;
        }
        return g0Var.a(obj);
    }
}
