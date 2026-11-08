package v4;

import android.os.Trace;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class g0 {
    public final h0 a = new h0();
    public boolean b = false;

    public void B(i0 i0Var) {
        this.a.registerObserver(i0Var);
    }

    public final void C(boolean z9) {
        if (this.a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.b = z9;
    }

    public final d1 a(ViewGroup viewGroup, int i7) {
        try {
            int i10 = n0.g.a;
            Trace.beginSection("RV CreateView");
            d1 x10 = x(viewGroup, i7);
            if (x10.a.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            x10.f = i7;
            Trace.endSection();
            return x10;
        } catch (Throwable th2) {
            int i11 = n0.g.a;
            Trace.endSection();
            throw th2;
        }
    }

    public abstract int b();

    public long c(int i7) {
        return -1L;
    }

    public int d(int i7) {
        return 0;
    }

    public int e() {
        return b();
    }

    public void f() {
        this.a.b();
    }

    public void g(int i7) {
        this.a.d(i7, 1, null);
    }

    public final void h(int i7, Object obj) {
        this.a.d(i7, 1, obj);
    }

    public void i(int i7) {
        this.a.e(i7, 1);
    }

    public void j(int i7, int i10) {
        this.a.c(i7, i10);
    }

    public void k(int i7, int i10) {
        this.a.d(i7, i10, null);
    }

    public void n(int i7, int i10, Object obj) {
        this.a.d(i7, i10, obj);
    }

    public void o(int i7, int i10) {
        this.a.e(i7, i10);
    }

    public void p(int i7, int i10) {
        this.a.f(i7, i10);
    }

    public void s(int i7) {
        this.a.f(i7, 1);
    }

    public abstract void t(d1 d1Var, int i7);

    public void v(d1 d1Var, int i7, List list) {
        t(d1Var, i7);
    }

    public abstract d1 x(ViewGroup viewGroup, int i7);

    public void A(d1 d1Var) {
    }

    public void y(d1 d1Var) {
    }

    public void z(d1 d1Var) {
    }
}
