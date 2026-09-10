package u2;

import android.util.Pair;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class b0 extends r1 {
    public final boolean l;
    public final b2.j1 m;
    public final b2.h1 n;
    public z o;
    public y p;
    public boolean q;
    public boolean r;
    public boolean s;

    public b0(a aVar, boolean z10) {
        super(aVar);
        this.l = z10 && aVar.j();
        this.m = new b2.j1();
        this.n = new b2.h1();
        b2.k1 h = aVar.h();
        if (h == null) {
            this.o = new z(new a0(aVar.i()), b2.j1.q, z.h);
        } else {
            this.o = new z(h, null, null);
            this.s = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00cc  */
    @Override // u2.r1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(b2.k1 k1Var) {
        long j3;
        z zVar;
        y yVar;
        Object obj;
        g0 a2;
        z zVar2;
        if (this.r) {
            z zVar3 = this.o;
            this.o = new z(k1Var, zVar3.f, zVar3.g);
            y yVar2 = this.p;
            if (yVar2 != null) {
                E(yVar2.h);
            }
        } else if (k1Var.p()) {
            if (this.s) {
                z zVar4 = this.o;
                zVar2 = new z(k1Var, zVar4.f, zVar4.g);
            } else {
                zVar2 = new z(k1Var, b2.j1.q, z.h);
            }
            this.o = zVar2;
        } else {
            b2.j1 j1Var = this.m;
            k1Var.n(0, j1Var);
            long j10 = j1Var.l;
            Object obj2 = j1Var.a;
            y yVar3 = this.p;
            if (yVar3 != null) {
                long j11 = yVar3.b;
                z zVar5 = this.o;
                Object obj3 = yVar3.a.a;
                b2.h1 h1Var = this.n;
                zVar5.g(obj3, h1Var);
                long j12 = h1Var.e + j11;
                this.o.m(0, j1Var, 0L);
                if (j12 != j1Var.l) {
                    j3 = j12;
                    Pair i10 = k1Var.i(this.m, this.n, 0, j3);
                    Object obj4 = i10.first;
                    long longValue = ((Long) i10.second).longValue();
                    if (this.s) {
                        zVar = new z(k1Var, obj2, obj4);
                    } else {
                        z zVar6 = this.o;
                        zVar = new z(k1Var, zVar6.f, zVar6.g);
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
            j3 = j10;
            Pair i102 = k1Var.i(this.m, this.n, 0, j3);
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

    @Override // u2.r1
    public final void C() {
        if (this.l) {
            return;
        }
        this.q = true;
        B();
    }

    @Override // u2.a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final y c(g0 g0Var, y2.d dVar, long j3) {
        y yVar = new y(g0Var, dVar, j3);
        e2.d.g(yVar.d == null);
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

    public final boolean E(long j3) {
        y yVar = this.p;
        int b10 = this.o.b(yVar.a.a);
        if (b10 == -1) {
            return false;
        }
        z zVar = this.o;
        b2.h1 h1Var = this.n;
        zVar.f(b10, h1Var, false);
        long j10 = h1Var.d;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            j3 = Math.max(0L, j10 - 1);
        }
        yVar.h = j3;
        return true;
    }

    @Override // u2.r1, u2.a
    public final boolean a(b2.k0 k0Var) {
        return this.k.a(k0Var);
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

    @Override // u2.r1, u2.a
    public final void t(b2.k0 k0Var) {
        if (this.s) {
            z zVar = this.o;
            this.o = new z(new i2.j1(this.o.e, k0Var), zVar.f, zVar.g);
        } else {
            this.o = new z(new a0(k0Var), b2.j1.q, z.h);
        }
        this.k.t(k0Var);
    }

    @Override // u2.r1
    public final g0 z(g0 g0Var) {
        Object obj = g0Var.a;
        Object obj2 = this.o.g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = z.h;
        }
        return g0Var.a(obj);
    }
}
