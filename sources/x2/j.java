package x2;

import a8.xa;
import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Components.km;
import org.telegram.ui.Wallet.k8;
import org.telegram.ui.yl;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class j implements j0, q2.l {
    public final Object a;
    public xa b;
    public q2.k c;
    public final /* synthetic */ l d;

    public j(l lVar, Object obj) {
        this.d = lVar;
        this.b = lVar.b(null);
        this.c = new q2.k(lVar.d.c, 0, null);
        this.a = obj;
    }

    @Override // x2.j0
    public final void A(int i7, f0 f0Var, t tVar, b0 b0Var) {
        if (a(i7, f0Var)) {
            xa xaVar = this.b;
            b0 b10 = b(b0Var, f0Var);
            xaVar.getClass();
            xaVar.g(new h0(xaVar, tVar, b10, 1));
        }
    }

    @Override // x2.j0
    public final void C(int i7, f0 f0Var, b0 b0Var) {
        if (a(i7, f0Var)) {
            xa xaVar = this.b;
            b0 b10 = b(b0Var, f0Var);
            f0 f0Var2 = (f0) xaVar.c;
            f0Var2.getClass();
            xaVar.g(new km(xaVar, f0Var2, b10, 17));
        }
    }

    @Override // x2.j0
    public final void G(int i7, f0 f0Var, t tVar, b0 b0Var) {
        if (a(i7, f0Var)) {
            xa xaVar = this.b;
            b0 b10 = b(b0Var, f0Var);
            xaVar.getClass();
            xaVar.g(new h0(xaVar, tVar, b10, 0));
        }
    }

    @Override // x2.j0
    public final void I(int i7, f0 f0Var, t tVar, b0 b0Var, int i10) {
        if (a(i7, f0Var)) {
            xa xaVar = this.b;
            b0 b10 = b(b0Var, f0Var);
            xaVar.getClass();
            xaVar.g(new bg.f0(xaVar, tVar, b10, i10, 11));
        }
    }

    @Override // q2.l
    public final void K(int i7, f0 f0Var, Exception exc) {
        if (a(i7, f0Var)) {
            this.c.d(exc);
        }
    }

    @Override // q2.l
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
        xa xaVar = this.b;
        if (xaVar.b != w10 || !Objects.equals((f0) xaVar.c, f0Var2)) {
            this.b = new xa((CopyOnWriteArrayList) lVar.c.d, w10, f0Var2);
        }
        q2.k kVar = this.c;
        if (kVar.a == w10 && Objects.equals(kVar.b, f0Var2)) {
            return true;
        }
        this.c = new q2.k(lVar.d.c, w10, f0Var2);
        return true;
    }

    public final b0 b(b0 b0Var, f0 f0Var) {
        long j3 = b0Var.f;
        l lVar = this.d;
        Object obj = this.a;
        long v = lVar.v(obj, j3);
        long j10 = b0Var.g;
        long v10 = lVar.v(obj, j10);
        return (v == j3 && v10 == j10) ? b0Var : new b0(b0Var.a, b0Var.b, b0Var.c, b0Var.d, b0Var.e, v, v10);
    }

    @Override // x2.j0
    public final void k(int i7, f0 f0Var, b0 b0Var) {
        if (a(i7, f0Var)) {
            xa xaVar = this.b;
            b0 b10 = b(b0Var, f0Var);
            xaVar.getClass();
            xaVar.g(new k8(29, xaVar, b10));
        }
    }

    @Override // q2.l
    public final void p(int i7, f0 f0Var, nb.a aVar) {
        if (a(i7, f0Var)) {
            this.c.a(aVar);
        }
    }

    @Override // x2.j0
    public final void r(int i7, f0 f0Var, t tVar, b0 b0Var, IOException iOException, boolean z10) {
        if (a(i7, f0Var)) {
            xa xaVar = this.b;
            b0 b10 = b(b0Var, f0Var);
            xaVar.getClass();
            xaVar.g(new yl(xaVar, tVar, b10, iOException, z10));
        }
    }

    @Override // q2.l
    public final void w(int i7, f0 f0Var) {
        if (a(i7, f0Var)) {
            this.c.b();
        }
    }

    @Override // q2.l
    public final void z(int i7, f0 f0Var) {
        if (a(i7, f0Var)) {
            this.c.e();
        }
    }
}
