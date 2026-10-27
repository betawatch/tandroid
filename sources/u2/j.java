package u2;

import a8.ng;
import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.ok;
import org.telegram.ui.Components.qy;
import org.telegram.ui.bh1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class j implements k0, n2.k {
    public final Object a;
    public ng b;
    public n2.j c;
    public final /* synthetic */ l d;

    public j(l lVar, Object obj) {
        this.d = lVar;
        this.b = lVar.b(null);
        this.c = new n2.j(lVar.d.c, 0, null);
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

    @Override // u2.k0
    public final void c(int i10, g0 g0Var, c0 c0Var) {
        if (l(i10, g0Var)) {
            ng ngVar = this.b;
            c0 m10 = m(c0Var, g0Var);
            g0 g0Var2 = (g0) ngVar.c;
            g0Var2.getClass();
            ngVar.k(new qy(ngVar, g0Var2, m10, 12));
        }
    }

    @Override // u2.k0
    public final void d(int i10, g0 g0Var, c0 c0Var) {
        if (l(i10, g0Var)) {
            ng ngVar = this.b;
            c0 m10 = m(c0Var, g0Var);
            ngVar.getClass();
            ngVar.k(new bh1(17, ngVar, m10));
        }
    }

    @Override // u2.k0
    public final void e(int i10, g0 g0Var, u uVar, c0 c0Var) {
        if (l(i10, g0Var)) {
            ng ngVar = this.b;
            c0 m10 = m(c0Var, g0Var);
            ngVar.getClass();
            ngVar.k(new i0(ngVar, uVar, m10, 0));
        }
    }

    @Override // u2.k0
    public final void f(int i10, g0 g0Var, u uVar, c0 c0Var, IOException iOException, boolean z10) {
        if (l(i10, g0Var)) {
            ng ngVar = this.b;
            c0 m10 = m(c0Var, g0Var);
            ngVar.getClass();
            ngVar.k(new ok(ngVar, uVar, m10, iOException, z10));
        }
    }

    @Override // n2.k
    public final void g(int i10, g0 g0Var) {
        if (l(i10, g0Var)) {
            this.c.e();
        }
    }

    @Override // u2.k0
    public final void h(int i10, g0 g0Var, u uVar, c0 c0Var, int i11) {
        if (l(i10, g0Var)) {
            ng ngVar = this.b;
            c0 m10 = m(c0Var, g0Var);
            ngVar.getClass();
            ngVar.k(new ag.k0(ngVar, uVar, m10, i11, 10));
        }
    }

    @Override // n2.k
    public final void i(int i10, g0 g0Var) {
        if (l(i10, g0Var)) {
            this.c.b();
        }
    }

    @Override // u2.k0
    public final void j(int i10, g0 g0Var, u uVar, c0 c0Var) {
        if (l(i10, g0Var)) {
            ng ngVar = this.b;
            c0 m10 = m(c0Var, g0Var);
            ngVar.getClass();
            ngVar.k(new i0(ngVar, uVar, m10, 1));
        }
    }

    @Override // n2.k
    public final void k(int i10, g0 g0Var, pa.d dVar) {
        if (l(i10, g0Var)) {
            this.c.a(dVar);
        }
    }

    public final boolean l(int i10, g0 g0Var) {
        g0 g0Var2;
        Object obj = this.a;
        l lVar = this.d;
        if (g0Var != null) {
            g0Var2 = lVar.u(obj, g0Var);
            if (g0Var2 == null) {
                return false;
            }
        } else {
            g0Var2 = null;
        }
        int w10 = lVar.w(i10, obj);
        ng ngVar = this.b;
        if (ngVar.b != w10 || !Objects.equals((g0) ngVar.c, g0Var2)) {
            this.b = new ng((CopyOnWriteArrayList) lVar.c.d, w10, g0Var2);
        }
        n2.j jVar = this.c;
        if (jVar.a == w10 && Objects.equals(jVar.b, g0Var2)) {
            return true;
        }
        this.c = new n2.j(lVar.d.c, w10, g0Var2);
        return true;
    }

    public final c0 m(c0 c0Var, g0 g0Var) {
        long j10 = c0Var.f;
        l lVar = this.d;
        Object obj = this.a;
        long v = lVar.v(obj, j10);
        long j11 = c0Var.g;
        long v10 = lVar.v(obj, j11);
        return (v == j10 && v10 == j11) ? c0Var : new c0(c0Var.a, c0Var.b, c0Var.c, c0Var.d, c0Var.e, v, v10);
    }
}
