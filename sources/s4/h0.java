package s4;

import android.os.Trace;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class h0 {
    public final i0 a = new i0();
    public boolean b = false;

    public void B(j0 j0Var) {
        this.a.registerObserver(j0Var);
    }

    public final void C(boolean z10) {
        if (this.a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.b = z10;
    }

    public final c1 g(ViewGroup viewGroup, int i10) {
        try {
            int i11 = n0.g.a;
            Trace.beginSection("RV CreateView");
            c1 x10 = x(viewGroup, i10);
            if (x10.a.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            x10.f = i10;
            Trace.endSection();
            return x10;
        } catch (Throwable th2) {
            int i12 = n0.g.a;
            Trace.endSection();
            throw th2;
        }
    }

    public abstract int h();

    public long i(int i10) {
        return -1L;
    }

    public int j(int i10) {
        return 0;
    }

    public int k() {
        return h();
    }

    public void l() {
        this.a.b();
    }

    public void m(int i10) {
        this.a.d(i10, 1, null);
    }

    public final void n(int i10, Object obj) {
        this.a.d(i10, 1, obj);
    }

    public void o(int i10) {
        this.a.e(i10, 1);
    }

    public void p(int i10, int i11) {
        this.a.c(i10, i11);
    }

    public void q(int i10, int i11) {
        this.a.d(i10, i11, null);
    }

    public void r(int i10, int i11, Object obj) {
        this.a.d(i10, i11, obj);
    }

    public void s(int i10, int i11) {
        this.a.e(i10, i11);
    }

    public void t(int i10, int i11) {
        this.a.f(i10, i11);
    }

    public void u(int i10) {
        this.a.f(i10, 1);
    }

    public abstract void v(c1 c1Var, int i10);

    public void w(c1 c1Var, int i10, List list) {
        v(c1Var, i10);
    }

    public abstract c1 x(ViewGroup viewGroup, int i10);

    public void A(c1 c1Var) {
    }

    public void y(c1 c1Var) {
    }

    public void z(c1 c1Var) {
    }
}
