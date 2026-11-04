package w2;

import b8.kg;
import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Components.hr;
import org.telegram.ui.na1;
import org.telegram.ui.ul;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j implements k0, p2.k {
    public final Object a;
    public kg b;
    public p2.j c;
    public final /* synthetic */ l d;

    public j(l lVar, Object obj) {
        this.d = lVar;
        this.b = lVar.b(null);
        this.c = new p2.j(lVar.d.c, 0, null);
        this.a = obj;
    }

    @Override // p2.k
    public final void A(int i3, g0 g0Var, Exception exc) {
        if (a(i3, g0Var)) {
            this.c.d(exc);
        }
    }

    @Override // w2.k0
    public final void D(int i3, g0 g0Var, c0 c0Var) {
        if (a(i3, g0Var)) {
            kg kgVar = this.b;
            c0 c2 = c(c0Var, g0Var);
            g0 g0Var2 = (g0) kgVar.c;
            g0Var2.getClass();
            kgVar.j(new hr(kgVar, g0Var2, c2, 13));
        }
    }

    @Override // p2.k
    public final void I(int i3, g0 g0Var) {
        if (a(i3, g0Var)) {
            this.c.b();
        }
    }

    @Override // w2.k0
    public final void K(int i3, g0 g0Var, u uVar, c0 c0Var, int i10) {
        if (a(i3, g0Var)) {
            kg kgVar = this.b;
            c0 c2 = c(c0Var, g0Var);
            kgVar.getClass();
            kgVar.j(new cg.e0(kgVar, uVar, c2, i10, 10));
        }
    }

    @Override // p2.k
    public final void M(int i3, g0 g0Var, int i10) {
        if (a(i3, g0Var)) {
            this.c.c(i10);
        }
    }

    public final boolean a(int i3, g0 g0Var) {
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
        int w10 = lVar.w(i3, obj);
        kg kgVar = this.b;
        if (kgVar.b != w10 || !Objects.equals((g0) kgVar.c, g0Var2)) {
            this.b = new kg((CopyOnWriteArrayList) lVar.c.d, w10, g0Var2);
        }
        p2.j jVar = this.c;
        if (jVar.a == w10 && Objects.equals(jVar.b, g0Var2)) {
            return true;
        }
        this.c = new p2.j(lVar.d.c, w10, g0Var2);
        return true;
    }

    @Override // p2.k
    public final void b(int i3, g0 g0Var) {
        if (a(i3, g0Var)) {
            this.c.e();
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

    @Override // w2.k0
    public final void d(int i3, g0 g0Var, c0 c0Var) {
        if (a(i3, g0Var)) {
            kg kgVar = this.b;
            c0 c2 = c(c0Var, g0Var);
            kgVar.getClass();
            kgVar.j(new na1(20, kgVar, c2));
        }
    }

    @Override // w2.k0
    public final void j(int i3, g0 g0Var, u uVar, c0 c0Var, IOException iOException, boolean z10) {
        if (a(i3, g0Var)) {
            kg kgVar = this.b;
            c0 c2 = c(c0Var, g0Var);
            kgVar.getClass();
            kgVar.j(new ul(kgVar, uVar, c2, iOException, z10));
        }
    }

    @Override // w2.k0
    public final void t(int i3, g0 g0Var, u uVar, c0 c0Var) {
        if (a(i3, g0Var)) {
            kg kgVar = this.b;
            c0 c2 = c(c0Var, g0Var);
            kgVar.getClass();
            kgVar.j(new i0(kgVar, uVar, c2, 0));
        }
    }

    @Override // p2.k
    public final void x(int i3, g0 g0Var, v7.s sVar) {
        if (a(i3, g0Var)) {
            this.c.a(sVar);
        }
    }

    @Override // w2.k0
    public final void z(int i3, g0 g0Var, u uVar, c0 c0Var) {
        if (a(i3, g0Var)) {
            kg kgVar = this.b;
            c0 c2 = c(c0Var, g0Var);
            kgVar.getClass();
            kgVar.j(new i0(kgVar, uVar, c2, 1));
        }
    }
}
