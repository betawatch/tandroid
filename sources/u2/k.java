package u2;

import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.pk;
import org.telegram.ui.Components.nz;
import org.telegram.ui.ia;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class k implements k0, n2.k {
    public final Object a;
    public a5.a b;
    public n2.j c;
    public final /* synthetic */ m d;

    public k(m mVar, Object obj) {
        this.d = mVar;
        this.b = mVar.b(null);
        this.c = new n2.j(mVar.d.c, 0, null);
        this.a = obj;
    }

    @Override // n2.k
    public final void a(int i10, g0 g0Var, int i11) {
        if (l(i10, g0Var)) {
            this.c.c(i11);
        }
    }

    @Override // n2.k
    public final void b(int i10, g0 g0Var, Exception exc) {
        if (l(i10, g0Var)) {
            this.c.d(exc);
        }
    }

    @Override // n2.k
    public final void c(int i10, g0 g0Var, oa.d dVar) {
        if (l(i10, g0Var)) {
            this.c.a(dVar);
        }
    }

    @Override // u2.k0
    public final void d(int i10, g0 g0Var, c0 c0Var) {
        if (l(i10, g0Var)) {
            a5.a aVar = this.b;
            c0 m10 = m(c0Var, g0Var);
            g0 g0Var2 = (g0) aVar.c;
            g0Var2.getClass();
            aVar.l(new nz(aVar, g0Var2, m10, 11));
        }
    }

    @Override // u2.k0
    public final void e(int i10, g0 g0Var, c0 c0Var) {
        if (l(i10, g0Var)) {
            a5.a aVar = this.b;
            c0 m10 = m(c0Var, g0Var);
            aVar.getClass();
            aVar.l(new org.telegram.ui.web.o0(10, aVar, m10));
        }
    }

    @Override // u2.k0
    public final void f(int i10, g0 g0Var, u uVar, c0 c0Var) {
        if (l(i10, g0Var)) {
            a5.a aVar = this.b;
            c0 m10 = m(c0Var, g0Var);
            aVar.getClass();
            aVar.l(new i0(aVar, uVar, m10, 0));
        }
    }

    @Override // u2.k0
    public final void g(int i10, g0 g0Var, u uVar, c0 c0Var, IOException iOException, boolean z10) {
        if (l(i10, g0Var)) {
            a5.a aVar = this.b;
            c0 m10 = m(c0Var, g0Var);
            aVar.getClass();
            aVar.l(new pk(aVar, uVar, m10, iOException, z10));
        }
    }

    @Override // n2.k
    public final void h(int i10, g0 g0Var) {
        if (l(i10, g0Var)) {
            this.c.e();
        }
    }

    @Override // u2.k0
    public final void i(int i10, g0 g0Var, u uVar, c0 c0Var, int i11) {
        if (l(i10, g0Var)) {
            a5.a aVar = this.b;
            c0 m10 = m(c0Var, g0Var);
            aVar.getClass();
            aVar.l(new ia(aVar, uVar, m10, i11, 9));
        }
    }

    @Override // n2.k
    public final void j(int i10, g0 g0Var) {
        if (l(i10, g0Var)) {
            this.c.b();
        }
    }

    @Override // u2.k0
    public final void k(int i10, g0 g0Var, u uVar, c0 c0Var) {
        if (l(i10, g0Var)) {
            a5.a aVar = this.b;
            c0 m10 = m(c0Var, g0Var);
            aVar.getClass();
            aVar.l(new i0(aVar, uVar, m10, 1));
        }
    }

    public final boolean l(int i10, g0 g0Var) {
        g0 g0Var2;
        Object obj = this.a;
        m mVar = this.d;
        if (g0Var != null) {
            g0Var2 = mVar.u(obj, g0Var);
            if (g0Var2 == null) {
                return false;
            }
        } else {
            g0Var2 = null;
        }
        int w9 = mVar.w(i10, obj);
        a5.a aVar = this.b;
        if (aVar.b != w9 || !Objects.equals((g0) aVar.c, g0Var2)) {
            this.b = new a5.a((CopyOnWriteArrayList) mVar.c.d, w9, g0Var2, 21);
        }
        n2.j jVar = this.c;
        if (jVar.a == w9 && Objects.equals(jVar.b, g0Var2)) {
            return true;
        }
        this.c = new n2.j(mVar.d.c, w9, g0Var2);
        return true;
    }

    public final c0 m(c0 c0Var, g0 g0Var) {
        long j10 = c0Var.f;
        m mVar = this.d;
        Object obj = this.a;
        long v = mVar.v(obj, j10);
        long j11 = c0Var.g;
        long v10 = mVar.v(obj, j11);
        return (v == j10 && v10 == j11) ? c0Var : new c0(c0Var.a, c0Var.b, c0Var.c, c0Var.d, c0Var.e, v, v10);
    }
}
