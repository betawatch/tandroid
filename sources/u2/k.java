package u2;

import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.kk;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Wallet.e8;
import org.telegram.ui.fa;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class k implements m0, n2.l {
    public final Object a;
    public a5.a b;
    public n2.k c;
    public final /* synthetic */ m d;

    public k(m mVar, Object obj) {
        this.d = mVar;
        this.b = mVar.b(null);
        this.c = new n2.k(mVar.d.c, 0, null);
        this.a = obj;
    }

    @Override // n2.l
    public final void a(int i10, h0 h0Var, int i11) {
        if (l(i10, h0Var)) {
            this.c.c(i11);
        }
    }

    @Override // n2.l
    public final void b(int i10, h0 h0Var, Exception exc) {
        if (l(i10, h0Var)) {
            this.c.d(exc);
        }
    }

    @Override // n2.l
    public final void c(int i10, h0 h0Var, oa.d dVar) {
        if (l(i10, h0Var)) {
            this.c.a(dVar);
        }
    }

    @Override // u2.m0
    public final void d(int i10, h0 h0Var, d0 d0Var) {
        if (l(i10, h0Var)) {
            a5.a aVar = this.b;
            d0 m10 = m(d0Var, h0Var);
            h0 h0Var2 = (h0) aVar.c;
            h0Var2.getClass();
            aVar.l(new ry(aVar, h0Var2, m10, 12));
        }
    }

    @Override // u2.m0
    public final void e(int i10, h0 h0Var, d0 d0Var) {
        if (l(i10, h0Var)) {
            a5.a aVar = this.b;
            d0 m10 = m(d0Var, h0Var);
            aVar.getClass();
            aVar.l(new e8(14, aVar, m10));
        }
    }

    @Override // u2.m0
    public final void f(int i10, h0 h0Var, v vVar, d0 d0Var) {
        if (l(i10, h0Var)) {
            a5.a aVar = this.b;
            d0 m10 = m(d0Var, h0Var);
            aVar.getClass();
            aVar.l(new j0(aVar, vVar, m10, 0));
        }
    }

    @Override // u2.m0
    public final void g(int i10, h0 h0Var, v vVar, d0 d0Var, IOException iOException, boolean z10) {
        if (l(i10, h0Var)) {
            a5.a aVar = this.b;
            d0 m10 = m(d0Var, h0Var);
            aVar.getClass();
            aVar.l(new kk(aVar, vVar, m10, iOException, z10));
        }
    }

    @Override // n2.l
    public final void h(int i10, h0 h0Var) {
        if (l(i10, h0Var)) {
            this.c.e();
        }
    }

    @Override // u2.m0
    public final void i(int i10, h0 h0Var, v vVar, d0 d0Var, int i11) {
        if (l(i10, h0Var)) {
            a5.a aVar = this.b;
            d0 m10 = m(d0Var, h0Var);
            aVar.getClass();
            aVar.l(new fa(aVar, vVar, m10, i11, 9));
        }
    }

    @Override // n2.l
    public final void j(int i10, h0 h0Var) {
        if (l(i10, h0Var)) {
            this.c.b();
        }
    }

    @Override // u2.m0
    public final void k(int i10, h0 h0Var, v vVar, d0 d0Var) {
        if (l(i10, h0Var)) {
            a5.a aVar = this.b;
            d0 m10 = m(d0Var, h0Var);
            aVar.getClass();
            aVar.l(new j0(aVar, vVar, m10, 1));
        }
    }

    public final boolean l(int i10, h0 h0Var) {
        h0 h0Var2;
        Object obj = this.a;
        m mVar = this.d;
        if (h0Var != null) {
            h0Var2 = mVar.u(obj, h0Var);
            if (h0Var2 == null) {
                return false;
            }
        } else {
            h0Var2 = null;
        }
        int w9 = mVar.w(i10, obj);
        a5.a aVar = this.b;
        if (aVar.b != w9 || !Objects.equals((h0) aVar.c, h0Var2)) {
            this.b = new a5.a((CopyOnWriteArrayList) mVar.c.d, w9, h0Var2, 21);
        }
        n2.k kVar = this.c;
        if (kVar.a == w9 && Objects.equals(kVar.b, h0Var2)) {
            return true;
        }
        this.c = new n2.k(mVar.d.c, w9, h0Var2);
        return true;
    }

    public final d0 m(d0 d0Var, h0 h0Var) {
        long j10 = d0Var.f;
        m mVar = this.d;
        Object obj = this.a;
        long v = mVar.v(obj, j10);
        long j11 = d0Var.g;
        long v10 = mVar.v(obj, j11);
        return (v == j10 && v10 == j11) ? d0Var : new d0(d0Var.a, d0Var.b, d0Var.c, d0Var.d, d0Var.e, v, v10);
    }
}
