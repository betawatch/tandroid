package u2;

import android.util.Pair;
import v7.u6;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class a0 extends s1 {
    public final boolean l;
    public final b2.n1 m;
    public final b2.l1 n;
    public y o;
    public x p;
    public boolean q;
    public boolean r;
    public boolean s;

    public a0(a aVar, boolean z10) {
        super(aVar);
        this.l = z10 && aVar.j();
        this.m = new b2.n1();
        this.n = new b2.l1();
        b2.o1 h = aVar.h();
        if (h == null) {
            this.o = new y(new z(aVar.i()), b2.n1.q, y.h);
        } else {
            this.o = new y(h, null, null);
            this.s = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00cc  */
    @Override // u2.s1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(b2.o1 o1Var) {
        long j10;
        y yVar;
        x xVar;
        Object obj;
        f0 a2;
        y yVar2;
        if (this.r) {
            y yVar3 = this.o;
            this.o = new y(o1Var, yVar3.f, yVar3.g);
            x xVar2 = this.p;
            if (xVar2 != null) {
                E(xVar2.h);
            }
        } else if (o1Var.p()) {
            if (this.s) {
                y yVar4 = this.o;
                yVar2 = new y(o1Var, yVar4.f, yVar4.g);
            } else {
                yVar2 = new y(o1Var, b2.n1.q, y.h);
            }
            this.o = yVar2;
        } else {
            b2.n1 n1Var = this.m;
            o1Var.n(0, n1Var);
            long j11 = n1Var.l;
            Object obj2 = n1Var.a;
            x xVar3 = this.p;
            if (xVar3 != null) {
                long j12 = xVar3.b;
                y yVar5 = this.o;
                Object obj3 = xVar3.a.a;
                b2.l1 l1Var = this.n;
                yVar5.g(obj3, l1Var);
                long j13 = l1Var.e + j12;
                this.o.m(0, n1Var, 0L);
                if (j13 != n1Var.l) {
                    j10 = j13;
                    Pair i10 = o1Var.i(this.m, this.n, 0, j10);
                    Object obj4 = i10.first;
                    long longValue = ((Long) i10.second).longValue();
                    if (this.s) {
                        yVar = new y(o1Var, obj2, obj4);
                    } else {
                        y yVar6 = this.o;
                        yVar = new y(o1Var, yVar6.f, yVar6.g);
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
                            xVar4.a(a2);
                            return;
                        }
                        return;
                    }
                }
            }
            j10 = j11;
            Pair i102 = o1Var.i(this.m, this.n, 0, j10);
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

    @Override // u2.s1
    public final void C() {
        if (this.l) {
            return;
        }
        this.q = true;
        B();
    }

    @Override // u2.a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final x c(f0 f0Var, androidx.biometric.e eVar, long j10) {
        x xVar = new x(f0Var, eVar, j10);
        u6.p(xVar.d == null);
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
        xVar.a(f0Var.a(obj));
        return xVar;
    }

    public final boolean E(long j10) {
        x xVar = this.p;
        int b10 = this.o.b(xVar.a.a);
        if (b10 == -1) {
            return false;
        }
        y yVar = this.o;
        b2.l1 l1Var = this.n;
        yVar.f(b10, l1Var, false);
        long j11 = l1Var.d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        xVar.h = j10;
        return true;
    }

    @Override // u2.s1, u2.a
    public final boolean a(b2.o0 o0Var) {
        return this.k.a(o0Var);
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

    @Override // u2.s1, u2.a
    public final void t(b2.o0 o0Var) {
        if (this.s) {
            y yVar = this.o;
            b2.o1 o1Var = yVar.e;
            this.o = new y(o1Var instanceof p1 ? new p1(((p1) o1Var).e, o0Var) : new p1(o1Var, o0Var), yVar.f, yVar.g);
        } else {
            this.o = new y(new z(o0Var), b2.n1.q, y.h);
        }
        this.k.t(o0Var);
    }

    @Override // u2.s1
    public final f0 z(f0 f0Var) {
        Object obj = f0Var.a;
        Object obj2 = this.o.g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = y.h;
        }
        return f0Var.a(obj);
    }
}
