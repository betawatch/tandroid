package x2;

import a8.ia;
import android.util.Pair;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class a0 extends r1 {
    public final boolean l;
    public final e2.k1 m;
    public final e2.i1 n;
    public y o;
    public x p;
    public boolean q;
    public boolean r;
    public boolean s;

    public a0(a aVar, boolean z9) {
        super(aVar);
        this.l = z9 && aVar.j();
        this.m = new e2.k1();
        this.n = new e2.i1();
        e2.l1 h = aVar.h();
        if (h == null) {
            this.o = new y(new z(aVar.i()), e2.k1.q, y.h);
        } else {
            this.o = new y(h, null, null);
            this.s = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00cc  */
    @Override // x2.r1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(e2.l1 l1Var) {
        long j3;
        y yVar;
        x xVar;
        Object obj;
        f0 a10;
        y yVar2;
        if (this.r) {
            y yVar3 = this.o;
            this.o = new y(l1Var, yVar3.f, yVar3.g);
            x xVar2 = this.p;
            if (xVar2 != null) {
                E(xVar2.h);
            }
        } else if (l1Var.p()) {
            if (this.s) {
                y yVar4 = this.o;
                yVar2 = new y(l1Var, yVar4.f, yVar4.g);
            } else {
                yVar2 = new y(l1Var, e2.k1.q, y.h);
            }
            this.o = yVar2;
        } else {
            e2.k1 k1Var = this.m;
            l1Var.n(0, k1Var);
            long j10 = k1Var.l;
            Object obj2 = k1Var.a;
            x xVar3 = this.p;
            if (xVar3 != null) {
                long j11 = xVar3.b;
                y yVar5 = this.o;
                Object obj3 = xVar3.a.a;
                e2.i1 i1Var = this.n;
                yVar5.g(obj3, i1Var);
                long j12 = i1Var.e + j11;
                this.o.m(0, k1Var, 0L);
                if (j12 != k1Var.l) {
                    j3 = j12;
                    Pair i7 = l1Var.i(this.m, this.n, 0, j3);
                    Object obj4 = i7.first;
                    long longValue = ((Long) i7.second).longValue();
                    if (this.s) {
                        yVar = new y(l1Var, obj2, obj4);
                    } else {
                        y yVar6 = this.o;
                        yVar = new y(l1Var, yVar6.f, yVar6.g);
                    }
                    this.o = yVar;
                    xVar = this.p;
                    if (xVar != null && E(longValue)) {
                        f0 f0Var = xVar.a;
                        obj = f0Var.a;
                        if (this.o.g != null && obj.equals(y.h)) {
                            obj = this.o.g;
                        }
                        a10 = f0Var.a(obj);
                        this.s = true;
                        this.r = true;
                        n(this.o);
                        if (a10 != null) {
                            x xVar4 = this.p;
                            xVar4.getClass();
                            xVar4.f(a10);
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
            this.o = yVar;
            xVar = this.p;
            if (xVar != null) {
                f0 f0Var2 = xVar.a;
                obj = f0Var2.a;
                if (this.o.g != null) {
                    obj = this.o.g;
                }
                a10 = f0Var2.a(obj);
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

    @Override // x2.r1
    public final void C() {
        if (this.l) {
            return;
        }
        this.q = true;
        B();
    }

    @Override // x2.a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final x c(f0 f0Var, h6.m mVar, long j3) {
        x xVar = new x(f0Var, mVar, j3);
        ia.p(xVar.d == null);
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
        xVar.f(f0Var.a(obj));
        return xVar;
    }

    public final boolean E(long j3) {
        x xVar = this.p;
        int b10 = this.o.b(xVar.a.a);
        if (b10 == -1) {
            return false;
        }
        y yVar = this.o;
        e2.i1 i1Var = this.n;
        yVar.f(b10, i1Var, false);
        long j10 = i1Var.d;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            j3 = Math.max(0L, j10 - 1);
        }
        xVar.h = j3;
        return true;
    }

    @Override // x2.r1, x2.a
    public final boolean a(e2.l0 l0Var) {
        return this.k.a(l0Var);
    }

    @Override // x2.a
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

    @Override // x2.l, x2.a
    public final void q() {
        this.r = false;
        this.q = false;
        super.q();
    }

    @Override // x2.r1, x2.a
    public final void t(e2.l0 l0Var) {
        if (this.s) {
            y yVar = this.o;
            e2.l1 l1Var = yVar.e;
            this.o = new y(l1Var instanceof o1 ? new o1(((o1) l1Var).e, l0Var) : new o1(l1Var, l0Var), yVar.f, yVar.g);
        } else {
            this.o = new y(new z(l0Var), e2.k1.q, y.h);
        }
        this.k.t(l0Var);
    }

    @Override // x2.r1
    public final f0 z(f0 f0Var) {
        Object obj = f0Var.a;
        Object obj2 = this.o.g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = y.h;
        }
        return f0Var.a(obj);
    }
}
