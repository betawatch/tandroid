package x2;

import a8.ia;
import android.util.Pair;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class b0 extends s1 {
    public final boolean l;
    public final e2.k1 m;
    public final e2.i1 n;
    public z o;
    public y p;
    public boolean q;
    public boolean r;
    public boolean s;

    public b0(a aVar, boolean z9) {
        super(aVar);
        this.l = z9 && aVar.j();
        this.m = new e2.k1();
        this.n = new e2.i1();
        e2.l1 h = aVar.h();
        if (h == null) {
            this.o = new z(new a0(aVar.i()), e2.k1.q, z.h);
        } else {
            this.o = new z(h, null, null);
            this.s = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00cc  */
    @Override // x2.s1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(e2.l1 l1Var) {
        long j3;
        z zVar;
        y yVar;
        Object obj;
        g0 a10;
        z zVar2;
        if (this.r) {
            z zVar3 = this.o;
            this.o = new z(l1Var, zVar3.f, zVar3.g);
            y yVar2 = this.p;
            if (yVar2 != null) {
                E(yVar2.h);
            }
        } else if (l1Var.p()) {
            if (this.s) {
                z zVar4 = this.o;
                zVar2 = new z(l1Var, zVar4.f, zVar4.g);
            } else {
                zVar2 = new z(l1Var, e2.k1.q, z.h);
            }
            this.o = zVar2;
        } else {
            e2.k1 k1Var = this.m;
            l1Var.n(0, k1Var);
            long j10 = k1Var.l;
            Object obj2 = k1Var.a;
            y yVar3 = this.p;
            if (yVar3 != null) {
                long j11 = yVar3.b;
                z zVar5 = this.o;
                Object obj3 = yVar3.a.a;
                e2.i1 i1Var = this.n;
                zVar5.g(obj3, i1Var);
                long j12 = i1Var.e + j11;
                this.o.m(0, k1Var, 0L);
                if (j12 != k1Var.l) {
                    j3 = j12;
                    Pair i7 = l1Var.i(this.m, this.n, 0, j3);
                    Object obj4 = i7.first;
                    long longValue = ((Long) i7.second).longValue();
                    if (this.s) {
                        zVar = new z(l1Var, obj2, obj4);
                    } else {
                        z zVar6 = this.o;
                        zVar = new z(l1Var, zVar6.f, zVar6.g);
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
                            yVar4.f(a10);
                            return;
                        }
                        return;
                    }
                }
            }
            j3 = j10;
            Pair i72 = l1Var.i(this.m, this.n, 0, j3);
            Object obj42 = i72.first;
            long longValue2 = ((Long) i72.second).longValue();
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

    @Override // x2.s1
    public final void C() {
        if (this.l) {
            return;
        }
        this.q = true;
        B();
    }

    @Override // x2.a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final y c(g0 g0Var, h6.m mVar, long j3) {
        y yVar = new y(g0Var, mVar, j3);
        ia.p(yVar.d == null);
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
        yVar.f(g0Var.a(obj));
        return yVar;
    }

    public final boolean E(long j3) {
        y yVar = this.p;
        int b10 = this.o.b(yVar.a.a);
        if (b10 == -1) {
            return false;
        }
        z zVar = this.o;
        e2.i1 i1Var = this.n;
        zVar.f(b10, i1Var, false);
        long j10 = i1Var.d;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            j3 = Math.max(0L, j10 - 1);
        }
        yVar.h = j3;
        return true;
    }

    @Override // x2.s1, x2.a
    public final boolean a(e2.l0 l0Var) {
        return this.k.a(l0Var);
    }

    @Override // x2.a
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

    @Override // x2.l, x2.a
    public final void q() {
        this.r = false;
        this.q = false;
        super.q();
    }

    @Override // x2.s1, x2.a
    public final void t(e2.l0 l0Var) {
        if (this.s) {
            z zVar = this.o;
            e2.l1 l1Var = zVar.e;
            this.o = new z(l1Var instanceof p1 ? new p1(((p1) l1Var).e, l0Var) : new p1(l1Var, l0Var), zVar.f, zVar.g);
        } else {
            this.o = new z(new a0(l0Var), e2.k1.q, z.h);
        }
        this.k.t(l0Var);
    }

    @Override // x2.s1
    public final g0 z(g0 g0Var) {
        Object obj = g0Var.a;
        Object obj2 = this.o.g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = z.h;
        }
        return g0Var.a(obj);
    }
}
