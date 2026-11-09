package x2;

import a8.wa;
import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Components.hr;
import org.telegram.ui.am;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class j implements k0, q2.k {
    public final Object a;
    public wa b;
    public q2.j c;
    public final /* synthetic */ l d;

    public j(l lVar, Object obj) {
        this.d = lVar;
        this.b = lVar.b(null);
        this.c = new q2.j(lVar.d.c, 0, null);
        this.a = obj;
    }

    @Override // x2.k0
    public final void A(int i7, g0 g0Var, u uVar, c0 c0Var) {
        if (a(i7, g0Var)) {
            wa waVar = this.b;
            c0 c10 = c(c0Var, g0Var);
            waVar.getClass();
            waVar.i(new i0(waVar, uVar, c10, 1));
        }
    }

    @Override // x2.k0
    public final void E(int i7, g0 g0Var, c0 c0Var) {
        if (a(i7, g0Var)) {
            wa waVar = this.b;
            c0 c10 = c(c0Var, g0Var);
            g0 g0Var2 = (g0) waVar.c;
            g0Var2.getClass();
            waVar.i(new hr(waVar, g0Var2, c10, 16));
        }
    }

    @Override // x2.k0
    public final void G(int i7, g0 g0Var, u uVar, c0 c0Var) {
        if (a(i7, g0Var)) {
            wa waVar = this.b;
            c0 c10 = c(c0Var, g0Var);
            waVar.getClass();
            waVar.i(new i0(waVar, uVar, c10, 0));
        }
    }

    @Override // x2.k0
    public final void I(int i7, g0 g0Var, u uVar, c0 c0Var, int i10) {
        if (a(i7, g0Var)) {
            wa waVar = this.b;
            c0 c10 = c(c0Var, g0Var);
            waVar.getClass();
            waVar.i(new bg.f0(waVar, uVar, c10, i10, 11));
        }
    }

    @Override // q2.k
    public final void K(int i7, g0 g0Var, Exception exc) {
        if (a(i7, g0Var)) {
            this.c.d(exc);
        }
    }

    @Override // q2.k
    public final void N(int i7, g0 g0Var, int i10) {
        if (a(i7, g0Var)) {
            this.c.c(i10);
        }
    }

    public final boolean a(int i7, g0 g0Var) {
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
        int w10 = lVar.w(i7, obj);
        wa waVar = this.b;
        if (waVar.b != w10 || !Objects.equals((g0) waVar.c, g0Var2)) {
            this.b = new wa((CopyOnWriteArrayList) lVar.c.d, w10, g0Var2);
        }
        q2.j jVar = this.c;
        if (jVar.a == w10 && Objects.equals(jVar.b, g0Var2)) {
            return true;
        }
        this.c = new q2.j(lVar.d.c, w10, g0Var2);
        return true;
    }

    @Override // q2.k
    public final void b(int i7, g0 g0Var, qb.a aVar) {
        if (a(i7, g0Var)) {
            this.c.a(aVar);
        }
    }

    public final c0 c(c0 c0Var, g0 g0Var) {
        long j3 = c0Var.f;
        l lVar = this.d;
        Object obj = this.a;
        long v = lVar.v(obj, j3);
        long j10 = c0Var.g;
        long v10 = lVar.v(obj, j10);
        return (v == j3 && v10 == j10) ? c0Var : new c0(c0Var.a, c0Var.b, c0Var.c, c0Var.d, c0Var.e, v, v10);
    }

    @Override // x2.k0
    public final void d(int i7, g0 g0Var, c0 c0Var) {
        if (a(i7, g0Var)) {
            wa waVar = this.b;
            c0 c10 = c(c0Var, g0Var);
            waVar.getClass();
            waVar.i(new org.telegram.ui.web.a0(24, waVar, c10));
        }
    }

    @Override // x2.k0
    public final void r(int i7, g0 g0Var, u uVar, c0 c0Var, IOException iOException, boolean z9) {
        if (a(i7, g0Var)) {
            wa waVar = this.b;
            c0 c10 = c(c0Var, g0Var);
            waVar.getClass();
            waVar.i(new am(waVar, uVar, c10, iOException, z9));
        }
    }

    @Override // q2.k
    public final void w(int i7, g0 g0Var) {
        if (a(i7, g0Var)) {
            this.c.b();
        }
    }

    @Override // q2.k
    public final void z(int i7, g0 g0Var) {
        if (a(i7, g0Var)) {
            this.c.e();
        }
    }
}
