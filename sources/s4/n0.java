package s4;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.ol0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class n0 {
    public hh.g a;
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

    public static int b(d1 d1Var) {
        int i10 = d1Var.l;
        int i11 = i10 & 14;
        if (d1Var.h()) {
            return 4;
        }
        if ((i10 & 4) == 0) {
            int i12 = d1Var.d;
            int b10 = d1Var.b();
            if (i12 != -1 && b10 != -1 && i12 != b10) {
                return i11 | 2048;
            }
        }
        return i11;
    }

    public abstract boolean a(d1 d1Var, b2.q0 q0Var, b2.q0 q0Var2);

    public abstract boolean c(d1 d1Var, List list);

    public final void d(d1 d1Var) {
        hh.g gVar = this.a;
        if (gVar != null) {
            RecyclerView recyclerView = gVar.a;
            boolean z10 = true;
            d1Var.q(true);
            View view = d1Var.a;
            if (d1Var.j != null && d1Var.k == null) {
                d1Var.j = null;
            }
            d1Var.k = null;
            if ((d1Var.l & 16) != 0) {
                return;
            }
            pf.e eVar = recyclerView.b;
            recyclerView.y0();
            la.h hVar = recyclerView.e;
            e6.n nVar = (e6.n) hVar.c;
            k2.g0 g0Var = (k2.g0) hVar.b;
            int indexOfChild = ((RecyclerView) g0Var.b).indexOfChild(view);
            if (indexOfChild == -1) {
                hVar.Z(view);
            } else if (nVar.D(indexOfChild)) {
                nVar.F(indexOfChild);
                hVar.Z(view);
                g0Var.Z0(indexOfChild);
            } else {
                z10 = false;
            }
            if (z10) {
                d1 U = RecyclerView.U(view);
                eVar.k(U);
                eVar.h(U);
            }
            recyclerView.z0(!z10);
            if (z10 || !d1Var.l()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public final void e() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ol0 ol0Var = (ol0) arrayList.get(i10);
            ol0Var.a.c(ol0Var.b, ol0Var.c, ol0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(d1 d1Var);

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

    public b2.q0 l(a1 a1Var, d1 d1Var, int i10, List list) {
        b2.q0 q0Var = new b2.q0();
        View view = d1Var.a;
        q0Var.a = view.getLeft();
        q0Var.b = view.getTop();
        view.getRight();
        view.getBottom();
        return q0Var;
    }

    public abstract void m();

    public final void n(long j3) {
        this.c = j3;
        this.e = j3;
        this.d = j3;
        this.f = j3;
        this.g = j3;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.i = timeInterpolator;
        this.j = timeInterpolator;
        this.k = timeInterpolator;
    }
}
