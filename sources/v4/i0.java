package v4;

import android.os.Trace;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public abstract class i0 {
    public final j0 a = new j0();
    public boolean b = false;

    public void B(k0 k0Var) {
        this.a.registerObserver(k0Var);
    }

    public final void C(boolean z10) {
        if (this.a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.b = z10;
    }

    public final f1 a(ViewGroup viewGroup, int i7) {
        try {
            int i10 = n0.g.a;
            Trace.beginSection("RV CreateView");
            f1 x10 = x(viewGroup, i7);
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

    public abstract void t(f1 f1Var, int i7);

    public void v(f1 f1Var, int i7, List list) {
        t(f1Var, i7);
    }

    public abstract f1 x(ViewGroup viewGroup, int i7);

    public void A(f1 f1Var) {
    }

    public void y(f1 f1Var) {
    }

    public void z(f1 f1Var) {
    }
}
