package x2;

import a8.wa;
import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Components.gr;
import org.telegram.ui.am;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class j implements j0, q2.k {
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

    @Override // x2.j0
    public final void A(int i7, f0 f0Var, t tVar, b0 b0Var) {
        if (a(i7, f0Var)) {
            wa waVar = this.b;
            b0 c10 = c(b0Var, f0Var);
            waVar.getClass();
            waVar.i(new h0(waVar, tVar, c10, 1));
        }
    }

    @Override // x2.j0
    public final void E(int i7, f0 f0Var, b0 b0Var) {
        if (a(i7, f0Var)) {
            wa waVar = this.b;
            b0 c10 = c(b0Var, f0Var);
            f0 f0Var2 = (f0) waVar.c;
            f0Var2.getClass();
            waVar.i(new gr(waVar, f0Var2, c10, 16));
        }
    }

    @Override // x2.j0
    public final void G(int i7, f0 f0Var, t tVar, b0 b0Var) {
        if (a(i7, f0Var)) {
            wa waVar = this.b;
            b0 c10 = c(b0Var, f0Var);
            waVar.getClass();
            waVar.i(new h0(waVar, tVar, c10, 0));
        }
    }

    @Override // x2.j0
    public final void I(int i7, f0 f0Var, t tVar, b0 b0Var, int i10) {
        if (a(i7, f0Var)) {
            wa waVar = this.b;
            b0 c10 = c(b0Var, f0Var);
            waVar.getClass();
            waVar.i(new bg.f0(waVar, tVar, c10, i10, 11));
        }
    }

    @Override // q2.k
    public final void K(int i7, f0 f0Var, Exception exc) {
        if (a(i7, f0Var)) {
            this.c.d(exc);
        }
    }

    @Override // q2.k
    public final void N(int i7, f0 f0Var, int i10) {
        if (a(i7, f0Var)) {
            this.c.c(i10);
        }
    }

    public final boolean a(int i7, f0 f0Var) {
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
        int w10 = lVar.w(i7, obj);
        wa waVar = this.b;
        if (waVar.b != w10 || !Objects.equals((f0) waVar.c, f0Var2)) {
            this.b = new wa((CopyOnWriteArrayList) lVar.c.d, w10, f0Var2);
        }
        q2.j jVar = this.c;
        if (jVar.a == w10 && Objects.equals(jVar.b, f0Var2)) {
            return true;
        }
        this.c = new q2.j(lVar.d.c, w10, f0Var2);
        return true;
    }

    @Override // q2.k
    public final void b(int i7, f0 f0Var, qb.a aVar) {
        if (a(i7, f0Var)) {
            this.c.a(aVar);
        }
    }

    public final b0 c(b0 b0Var, f0 f0Var) {
        long j3 = b0Var.f;
        l lVar = this.d;
        Object obj = this.a;
        long v = lVar.v(obj, j3);
        long j10 = b0Var.g;
        long v10 = lVar.v(obj, j10);
        return (v == j3 && v10 == j10) ? b0Var : new b0(b0Var.a, b0Var.b, b0Var.c, b0Var.d, b0Var.e, v, v10);
    }

    @Override // x2.j0
    public final void d(int i7, f0 f0Var, b0 b0Var) {
        if (a(i7, f0Var)) {
            wa waVar = this.b;
            b0 c10 = c(b0Var, f0Var);
            waVar.getClass();
            waVar.i(new org.telegram.ui.web.a0(24, waVar, c10));
        }
    }

    @Override // x2.j0
    public final void r(int i7, f0 f0Var, t tVar, b0 b0Var, IOException iOException, boolean z9) {
        if (a(i7, f0Var)) {
            wa waVar = this.b;
            b0 c10 = c(b0Var, f0Var);
            waVar.getClass();
            waVar.i(new am(waVar, tVar, c10, iOException, z9));
        }
    }

    @Override // q2.k
    public final void w(int i7, f0 f0Var) {
        if (a(i7, f0Var)) {
            this.c.b();
        }
    }

    @Override // q2.k
    public final void z(int i7, f0 f0Var) {
        if (a(i7, f0Var)) {
            this.c.e();
        }
    }
}
