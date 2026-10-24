package u2;

import android.util.Pair;
import v7.u6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class c0 extends v1 {
    public final boolean l;
    public final b2.n1 m;
    public final b2.l1 n;
    public a0 o;
    public z p;
    public boolean q;
    public boolean r;
    public boolean s;

    public c0(a aVar, boolean z10) {
        super(aVar);
        this.l = z10 && aVar.j();
        this.m = new b2.n1();
        this.n = new b2.l1();
        b2.o1 h = aVar.h();
        if (h == null) {
            this.o = new a0(new b0(aVar.i()), b2.n1.q, a0.h);
        } else {
            this.o = new a0(h, null, null);
            this.s = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00cc  */
    @Override // u2.v1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(b2.o1 o1Var) {
        long j10;
        a0 a0Var;
        z zVar;
        Object obj;
        h0 a2;
        a0 a0Var2;
        if (this.r) {
            a0 a0Var3 = this.o;
            this.o = new a0(o1Var, a0Var3.f, a0Var3.g);
            z zVar2 = this.p;
            if (zVar2 != null) {
                E(zVar2.h);
            }
        } else if (o1Var.p()) {
            if (this.s) {
                a0 a0Var4 = this.o;
                a0Var2 = new a0(o1Var, a0Var4.f, a0Var4.g);
            } else {
                a0Var2 = new a0(o1Var, b2.n1.q, a0.h);
            }
            this.o = a0Var2;
        } else {
            b2.n1 n1Var = this.m;
            o1Var.n(0, n1Var);
            long j11 = n1Var.l;
            Object obj2 = n1Var.a;
            z zVar3 = this.p;
            if (zVar3 != null) {
                long j12 = zVar3.b;
                a0 a0Var5 = this.o;
                Object obj3 = zVar3.a.a;
                b2.l1 l1Var = this.n;
                a0Var5.g(obj3, l1Var);
                long j13 = l1Var.e + j12;
                this.o.m(0, n1Var, 0L);
                if (j13 != n1Var.l) {
                    j10 = j13;
                    Pair i10 = o1Var.i(this.m, this.n, 0, j10);
                    Object obj4 = i10.first;
                    long longValue = ((Long) i10.second).longValue();
                    if (this.s) {
                        a0Var = new a0(o1Var, obj2, obj4);
                    } else {
                        a0 a0Var6 = this.o;
                        a0Var = new a0(o1Var, a0Var6.f, a0Var6.g);
                    }
                    this.o = a0Var;
                    zVar = this.p;
                    if (zVar != null && E(longValue)) {
                        h0 h0Var = zVar.a;
                        obj = h0Var.a;
                        if (this.o.g != null && obj.equals(a0.h)) {
                            obj = this.o.g;
                        }
                        a2 = h0Var.a(obj);
                        this.s = true;
                        this.r = true;
                        n(this.o);
                        if (a2 != null) {
                            z zVar4 = this.p;
                            zVar4.getClass();
                            zVar4.e(a2);
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
            this.o = a0Var;
            zVar = this.p;
            if (zVar != null) {
                h0 h0Var2 = zVar.a;
                obj = h0Var2.a;
                if (this.o.g != null) {
                    obj = this.o.g;
                }
                a2 = h0Var2.a(obj);
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

    @Override // u2.v1
    public final void C() {
        if (this.l) {
            return;
        }
        this.q = true;
        B();
    }

    @Override // u2.a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final z c(h0 h0Var, androidx.biometric.e eVar, long j10) {
        z zVar = new z(h0Var, eVar, j10);
        u6.p(zVar.d == null);
        zVar.d = this.k;
        if (!this.r) {
            this.p = zVar;
            if (!this.q) {
                this.q = true;
                B();
            }
            return zVar;
        }
        Object obj = h0Var.a;
        if (this.o.g != null && obj.equals(a0.h)) {
            obj = this.o.g;
        }
        zVar.e(h0Var.a(obj));
        return zVar;
    }

    public final boolean E(long j10) {
        z zVar = this.p;
        int b10 = this.o.b(zVar.a.a);
        if (b10 == -1) {
            return false;
        }
        a0 a0Var = this.o;
        b2.l1 l1Var = this.n;
        a0Var.f(b10, l1Var, false);
        long j11 = l1Var.d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        zVar.h = j10;
        return true;
    }

    @Override // u2.v1, u2.a
    public final boolean a(b2.o0 o0Var) {
        return this.k.a(o0Var);
    }

    @Override // u2.a
    public final void o(f0 f0Var) {
        z zVar = (z) f0Var;
        if (zVar.e != null) {
            a aVar = zVar.d;
            aVar.getClass();
            aVar.o(zVar.e);
        }
        if (f0Var == this.p) {
            this.p = null;
        }
    }

    @Override // u2.m, u2.a
    public final void q() {
        this.r = false;
        this.q = false;
        super.q();
    }

    @Override // u2.v1, u2.a
    public final void t(b2.o0 o0Var) {
        if (this.s) {
            a0 a0Var = this.o;
            b2.o1 o1Var = a0Var.e;
            this.o = new a0(o1Var instanceof s1 ? new s1(((s1) o1Var).e, o0Var) : new s1(o1Var, o0Var), a0Var.f, a0Var.g);
        } else {
            this.o = new a0(new b0(o0Var), b2.n1.q, a0.h);
        }
        this.k.t(o0Var);
    }

    @Override // u2.v1
    public final h0 z(h0 h0Var) {
        Object obj = h0Var.a;
        Object obj2 = this.o.g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = a0.h;
        }
        return h0Var.a(obj);
    }
}
