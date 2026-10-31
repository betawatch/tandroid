package u2;

import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.tm;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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

    @Override // u2.k0
    public final void B(int i10, g0 g0Var, u uVar, c0 c0Var, IOException iOException, boolean z10) {
        if (a(i10, g0Var)) {
            a5.a aVar = this.b;
            c0 c10 = c(c0Var, g0Var);
            aVar.getClass();
            aVar.k(new tm(aVar, uVar, c10, iOException, z10));
        }
    }

    @Override // n2.k
    public final void E(int i10, g0 g0Var) {
        if (a(i10, g0Var)) {
            this.c.e();
        }
    }

    @Override // u2.k0
    public final void G(int i10, g0 g0Var, u uVar, c0 c0Var, int i11) {
        if (a(i10, g0Var)) {
            a5.a aVar = this.b;
            c0 c10 = c(c0Var, g0Var);
            aVar.getClass();
            aVar.k(new mg.i0(aVar, uVar, c10, i11, 11));
        }
    }

    @Override // n2.k
    public final void J(int i10, g0 g0Var) {
        if (a(i10, g0Var)) {
            this.c.b();
        }
    }

    @Override // u2.k0
    public final void L(int i10, g0 g0Var, u uVar, c0 c0Var) {
        if (a(i10, g0Var)) {
            a5.a aVar = this.b;
            c0 c10 = c(c0Var, g0Var);
            aVar.getClass();
            aVar.k(new i0(aVar, uVar, c10, 1));
        }
    }

    public final boolean a(int i10, g0 g0Var) {
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
        int w9 = lVar.w(i10, obj);
        a5.a aVar = this.b;
        if (aVar.b != w9 || !Objects.equals((g0) aVar.c, g0Var2)) {
            this.b = new a5.a((CopyOnWriteArrayList) lVar.c.d, w9, g0Var2, 22);
        }
        n2.j jVar = this.c;
        if (jVar.a == w9 && Objects.equals(jVar.b, g0Var2)) {
            return true;
        }
        this.c = new n2.j(lVar.d.c, w9, g0Var2);
        return true;
    }

    @Override // n2.k
    public final void b(int i10, g0 g0Var, int i11) {
        if (a(i10, g0Var)) {
            this.c.c(i11);
        }
    }

    public final c0 c(c0 c0Var, g0 g0Var) {
        long j10 = c0Var.f;
        l lVar = this.d;
        Object obj = this.a;
        long v = lVar.v(obj, j10);
        long j11 = c0Var.g;
        long v10 = lVar.v(obj, j11);
        return (v == j10 && v10 == j11) ? c0Var : new c0(c0Var.a, c0Var.b, c0Var.c, c0Var.d, c0Var.e, v, v10);
    }

    @Override // n2.k
    public final void j(int i10, g0 g0Var, Exception exc) {
        if (a(i10, g0Var)) {
            this.c.d(exc);
        }
    }

    @Override // n2.k
    public final void l(int i10, g0 g0Var, oa.d dVar) {
        if (a(i10, g0Var)) {
            this.c.a(dVar);
        }
    }

    @Override // u2.k0
    public final void n(int i10, g0 g0Var, c0 c0Var) {
        if (a(i10, g0Var)) {
            a5.a aVar = this.b;
            c0 c10 = c(c0Var, g0Var);
            g0 g0Var2 = (g0) aVar.c;
            g0Var2.getClass();
            aVar.k(new q5.a(aVar, g0Var2, c10, 7));
        }
    }

    @Override // u2.k0
    public final void r(int i10, g0 g0Var, c0 c0Var) {
        if (a(i10, g0Var)) {
            a5.a aVar = this.b;
            c0 c10 = c(c0Var, g0Var);
            aVar.getClass();
            aVar.k(new org.telegram.ui.web.k0(22, aVar, c10));
        }
    }

    @Override // u2.k0
    public final void t(int i10, g0 g0Var, u uVar, c0 c0Var) {
        if (a(i10, g0Var)) {
            a5.a aVar = this.b;
            c0 c10 = c(c0Var, g0Var);
            aVar.getClass();
            aVar.k(new i0(aVar, uVar, c10, 0));
        }
    }
}
