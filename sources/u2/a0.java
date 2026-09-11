package u2;

import android.util.Pair;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class a0 extends p1 {
    public final boolean l;
    public final b2.j1 m;
    public final b2.h1 n;
    public y o;
    public x p;
    public boolean q;
    public boolean r;
    public boolean s;

    public a0(a aVar, boolean z10) {
        super(aVar);
        this.l = z10 && aVar.j();
        this.m = new b2.j1();
        this.n = new b2.h1();
        b2.k1 h = aVar.h();
        if (h == null) {
            this.o = new y(new z(aVar.i()), b2.j1.q, y.h);
        } else {
            this.o = new y(h, null, null);
            this.s = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00cc  */
    @Override // u2.p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(b2.k1 k1Var) {
        long j3;
        y yVar;
        x xVar;
        Object obj;
        f0 a2;
        y yVar2;
        if (this.r) {
            y yVar3 = this.o;
            this.o = new y(k1Var, yVar3.f, yVar3.g);
            x xVar2 = this.p;
            if (xVar2 != null) {
                E(xVar2.h);
            }
        } else if (k1Var.p()) {
            if (this.s) {
                y yVar4 = this.o;
                yVar2 = new y(k1Var, yVar4.f, yVar4.g);
            } else {
                yVar2 = new y(k1Var, b2.j1.q, y.h);
            }
            this.o = yVar2;
        } else {
            b2.j1 j1Var = this.m;
            k1Var.n(0, j1Var);
            long j10 = j1Var.l;
            Object obj2 = j1Var.a;
            x xVar3 = this.p;
            if (xVar3 != null) {
                long j11 = xVar3.b;
                y yVar5 = this.o;
                Object obj3 = xVar3.a.a;
                b2.h1 h1Var = this.n;
                yVar5.g(obj3, h1Var);
                long j12 = h1Var.e + j11;
                this.o.m(0, j1Var, 0L);
                if (j12 != j1Var.l) {
                    j3 = j12;
                    Pair i10 = k1Var.i(this.m, this.n, 0, j3);
                    Object obj4 = i10.first;
                    long longValue = ((Long) i10.second).longValue();
                    if (this.s) {
                        yVar = new y(k1Var, obj2, obj4);
                    } else {
                        y yVar6 = this.o;
                        yVar = new y(k1Var, yVar6.f, yVar6.g);
                    }
                    this.o = yVar;
                    xVar = this.p;
                    if (xVar != null && E(longValue)) {
                        f0 f0Var = xVar.a;
                        obj = f0Var.a;
                        if (this.o.g != null && obj.equals(y.h)) {
                            obj = this.o.g;
                        }
                        a2 = f0Var.a(obj);
                        this.s = true;
                        this.r = true;
                        n(this.o);
                        if (a2 != null) {
                            x xVar4 = this.p;
                            xVar4.getClass();
                            xVar4.e(a2);
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
            this.o = yVar;
            xVar = this.p;
            if (xVar != null) {
                f0 f0Var2 = xVar.a;
                obj = f0Var2.a;
                if (this.o.g != null) {
                    obj = this.o.g;
                }
                a2 = f0Var2.a(obj);
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

    @Override // u2.p1
    public final void C() {
        if (this.l) {
            return;
        }
        this.q = true;
        B();
    }

    @Override // u2.a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final x c(f0 f0Var, y2.d dVar, long j3) {
        x xVar = new x(f0Var, dVar, j3);
        e2.d.g(xVar.d == null);
        xVar.d = this.k;
        if (!this.r) {
            this.p = xVar;
            if (!this.q) {
                this.q = true;
                B();
            }
            return xVar;
        }
        Object obj = f0Var.a;
        if (this.o.g != null && obj.equals(y.h)) {
            obj = this.o.g;
        }
        xVar.e(f0Var.a(obj));
        return xVar;
    }

    public final boolean E(long j3) {
        x xVar = this.p;
        int b10 = this.o.b(xVar.a.a);
        if (b10 == -1) {
            return false;
        }
        y yVar = this.o;
        b2.h1 h1Var = this.n;
        yVar.f(b10, h1Var, false);
        long j10 = h1Var.d;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            j3 = Math.max(0L, j10 - 1);
        }
        xVar.h = j3;
        return true;
    }

    @Override // u2.p1, u2.a
    public final boolean a(b2.k0 k0Var) {
        return this.k.a(k0Var);
    }

    @Override // u2.a
    public final void o(d0 d0Var) {
        x xVar = (x) d0Var;
        if (xVar.e != null) {
            a aVar = xVar.d;
            aVar.getClass();
            aVar.o(xVar.e);
        }
        if (d0Var == this.p) {
            this.p = null;
        }
    }

    @Override // u2.l, u2.a
    public final void q() {
        this.r = false;
        this.q = false;
        super.q();
    }

    @Override // u2.p1, u2.a
    public final void t(b2.k0 k0Var) {
        if (this.s) {
            y yVar = this.o;
            this.o = new y(new i2.k1(this.o.e, k0Var), yVar.f, yVar.g);
        } else {
            this.o = new y(new z(k0Var), b2.j1.q, y.h);
        }
        this.k.t(k0Var);
    }

    @Override // u2.p1
    public final f0 z(f0 f0Var) {
        Object obj = f0Var.a;
        Object obj2 = this.o.g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = y.h;
        }
        return f0Var.a(obj);
    }
}
