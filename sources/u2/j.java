package u2;

import bi.t2;
import di.s7;
import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.ua0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class j implements k0, n2.k {
    public final Object a;
    public a5.a b;
    public n2.j c;
    public final /* synthetic */ l d;

    public j(l lVar, Object obj) {
        this.d = lVar;
        this.b = lVar.b(null);
        this.c = new n2.j(lVar.d.c, 0, null);
        this.a = obj;
    }

    @Override // n2.k
    public final void a(int i10, f0 f0Var, int i11) {
        if (l(i10, f0Var)) {
            this.c.c(i11);
        }
    }

    @Override // n2.k
    public final void b(int i10, f0 f0Var, Exception exc) {
        if (l(i10, f0Var)) {
            this.c.d(exc);
        }
    }

    @Override // u2.k0
    public final void c(int i10, f0 f0Var, b0 b0Var) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.b;
            b0 m10 = m(b0Var, f0Var);
            f0 f0Var2 = (f0) aVar.c;
            f0Var2.getClass();
            aVar.i(new s7(aVar, f0Var2, m10, 3));
        }
    }

    @Override // u2.k0
    public final void d(int i10, f0 f0Var, b0 b0Var) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.b;
            b0 m10 = m(b0Var, f0Var);
            aVar.getClass();
            aVar.i(new t2(11, aVar, m10));
        }
    }

    @Override // u2.k0
    public final void e(int i10, f0 f0Var, t tVar, b0 b0Var) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.b;
            b0 m10 = m(b0Var, f0Var);
            aVar.getClass();
            aVar.i(new h0(aVar, tVar, m10, 0));
        }
    }

    @Override // u2.k0
    public final void f(int i10, f0 f0Var, t tVar, b0 b0Var, IOException iOException, boolean z10) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.b;
            b0 m10 = m(b0Var, f0Var);
            aVar.getClass();
            aVar.i(new i0(aVar, tVar, m10, iOException, z10));
        }
    }

    @Override // n2.k
    public final void g(int i10, f0 f0Var) {
        if (l(i10, f0Var)) {
            this.c.e();
        }
    }

    @Override // u2.k0
    public final void h(int i10, f0 f0Var, t tVar, b0 b0Var, int i11) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.b;
            b0 m10 = m(b0Var, f0Var);
            aVar.getClass();
            aVar.i(new ua0(aVar, tVar, m10, i11, 1));
        }
    }

    @Override // n2.k
    public final void i(int i10, f0 f0Var) {
        if (l(i10, f0Var)) {
            this.c.b();
        }
    }

    @Override // u2.k0
    public final void j(int i10, f0 f0Var, t tVar, b0 b0Var) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.b;
            b0 m10 = m(b0Var, f0Var);
            aVar.getClass();
            aVar.i(new h0(aVar, tVar, m10, 1));
        }
    }

    @Override // n2.k
    public final void k(int i10, f0 f0Var) {
        if (l(i10, f0Var)) {
            this.c.a();
        }
    }

    public final boolean l(int i10, f0 f0Var) {
        f0 f0Var2;
        Object obj = this.a;
        l lVar = this.d;
        if (f0Var != null) {
            f0Var2 = lVar.u(obj, f0Var);
            if (f0Var2 == null) {
                return false;
            }
        } else {
            f0Var2 = null;
        }
        int w10 = lVar.w(i10, obj);
        a5.a aVar = this.b;
        if (aVar.b != w10 || !Objects.equals((f0) aVar.c, f0Var2)) {
            this.b = new a5.a((CopyOnWriteArrayList) lVar.c.d, w10, f0Var2, 20);
        }
        n2.j jVar = this.c;
        if (jVar.a == w10 && Objects.equals(jVar.b, f0Var2)) {
            return true;
        }
        this.c = new n2.j(lVar.d.c, w10, f0Var2);
        return true;
    }

    public final b0 m(b0 b0Var, f0 f0Var) {
        long j3 = b0Var.f;
        l lVar = this.d;
        Object obj = this.a;
        long v = lVar.v(obj, j3);
        long j10 = b0Var.g;
        long v9 = lVar.v(obj, j10);
        return (v == j3 && v9 == j10) ? b0Var : new b0(b0Var.a, b0Var.b, b0Var.c, b0Var.d, b0Var.e, v, v9);
    }
}
