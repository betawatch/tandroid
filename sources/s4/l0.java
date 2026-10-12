package s4;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import ji.h5;
import org.telegram.ui.Components.kl0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class l0 {
    public l2.f a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public TimeInterpolator h;
    public TimeInterpolator i;
    public TimeInterpolator j;
    public TimeInterpolator k;
    public long l;

    public static int b(b1 b1Var) {
        int i10 = b1Var.l;
        int i11 = i10 & 14;
        if (b1Var.h()) {
            return 4;
        }
        if ((i10 & 4) == 0) {
            int i12 = b1Var.d;
            int b10 = b1Var.b();
            if (i12 != -1 && b10 != -1 && i12 != b10) {
                return i11 | 2048;
            }
        }
        return i11;
    }

    public abstract boolean a(b1 b1Var, b2.v0 v0Var, b2.v0 v0Var2);

    public abstract boolean c(b1 b1Var, List list);

    public final void d(b1 b1Var) {
        l2.f fVar = this.a;
        if (fVar != null) {
            RecyclerView recyclerView = (RecyclerView) fVar.b;
            boolean z10 = true;
            b1Var.q(true);
            View view = b1Var.a;
            if (b1Var.j != null && b1Var.k == null) {
                b1Var.j = null;
            }
            b1Var.k = null;
            if ((b1Var.l & 16) != 0) {
                return;
            }
            qf.e eVar = recyclerView.b;
            recyclerView.y0();
            li.k kVar = recyclerView.e;
            ad.d dVar = (ad.d) kVar.c;
            h5 h5Var = (h5) kVar.b;
            int indexOfChild = ((RecyclerView) h5Var.b).indexOfChild(view);
            if (indexOfChild == -1) {
                kVar.X(view);
            } else if (dVar.E(indexOfChild)) {
                dVar.G(indexOfChild);
                kVar.X(view);
                h5Var.a1(indexOfChild);
            } else {
                z10 = false;
            }
            if (z10) {
                b1 U = RecyclerView.U(view);
                eVar.k(U);
                eVar.h(U);
            }
            recyclerView.z0(!z10);
            if (z10 || !b1Var.l()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public final void e() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            kl0 kl0Var = (kl0) arrayList.get(i10);
            kl0Var.a.c(kl0Var.b, kl0Var.c, kl0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(b1 b1Var);

    public abstract void g();

    public long h() {
        return this.c;
    }

    public long i() {
        return Math.max(this.f, this.g);
    }

    public long j() {
        return this.e;
    }

    public abstract boolean k();

    public b2.v0 l(y0 y0Var, b1 b1Var, int i10, List list) {
        b2.v0 v0Var = new b2.v0();
        View view = b1Var.a;
        v0Var.a = view.getLeft();
        v0Var.b = view.getTop();
        view.getRight();
        view.getBottom();
        return v0Var;
    }

    public abstract void m();

    public final void n(long j10) {
        this.c = j10;
        this.e = j10;
        this.d = j10;
        this.f = j10;
        this.g = j10;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.i = timeInterpolator;
        this.j = timeInterpolator;
        this.k = timeInterpolator;
    }
}
