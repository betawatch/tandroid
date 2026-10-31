package s4;

import android.os.Trace;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class g0 {
    public final h0 a = new h0();
    public boolean b = false;

    public void B(i0 i0Var) {
        this.a.registerObserver(i0Var);
    }

    public final void C(boolean z10) {
        if (this.a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.b = z10;
    }

    public final c1 a(ViewGroup viewGroup, int i10) {
        try {
            int i11 = n0.g.a;
            Trace.beginSection("RV CreateView");
            c1 w9 = w(viewGroup, i10);
            if (w9.a.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            w9.f = i10;
            Trace.endSection();
            return w9;
        } catch (Throwable th2) {
            int i12 = n0.g.a;
            Trace.endSection();
            throw th2;
        }
    }

    public abstract int b();

    public long c(int i10) {
        return -1L;
    }

    public int d(int i10) {
        return 0;
    }

    public int e() {
        return b();
    }

    public void f() {
        this.a.b();
    }

    public void g(int i10) {
        this.a.d(i10, 1, null);
    }

    public final void h(int i10, Object obj) {
        this.a.d(i10, 1, obj);
    }

    public void i(int i10) {
        this.a.e(i10, 1);
    }

    public void j(int i10, int i11) {
        this.a.c(i10, i11);
    }

    public void k(int i10, int i11) {
        this.a.d(i10, i11, null);
    }

    public void n(int i10, int i11, Object obj) {
        this.a.d(i10, i11, obj);
    }

    public void o(int i10, int i11) {
        this.a.e(i10, i11);
    }

    public void p(int i10, int i11) {
        this.a.f(i10, i11);
    }

    public void s(int i10) {
        this.a.f(i10, 1);
    }

    public abstract void t(c1 c1Var, int i10);

    public void v(c1 c1Var, int i10, List list) {
        t(c1Var, i10);
    }

    public abstract c1 w(ViewGroup viewGroup, int i10);

    public void A(c1 c1Var) {
    }

    public void y(c1 c1Var) {
    }

    public void z(c1 c1Var) {
    }
}
