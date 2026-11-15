package v4;

import android.os.Trace;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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

    public final e1 a(ViewGroup viewGroup, int i7) {
        try {
            int i10 = n0.g.a;
            Trace.beginSection("RV CreateView");
            e1 x10 = x(viewGroup, i7);
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

    public abstract void t(e1 e1Var, int i7);

    public void v(e1 e1Var, int i7, List list) {
        t(e1Var, i7);
    }

    public abstract e1 x(ViewGroup viewGroup, int i7);

    public void A(e1 e1Var) {
    }

    public void y(e1 e1Var) {
    }

    public void z(e1 e1Var) {
    }
}
