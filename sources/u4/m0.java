package u4;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b8.ig;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.pi0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class m0 {
    public g0 a;
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
        int i3 = d1Var.l;
        int i10 = i3 & 14;
        if (d1Var.h()) {
            return 4;
        }
        if ((i3 & 4) == 0) {
            int i11 = d1Var.d;
            int b10 = d1Var.b();
            if (i11 != -1 && b10 != -1 && i11 != b10) {
                return i10 | 2048;
            }
        }
        return i10;
    }

    public abstract boolean a(d1 d1Var, d2.t0 t0Var, d2.t0 t0Var2);

    public abstract boolean c(d1 d1Var, List list);

    public final void d(d1 d1Var) {
        g0 g0Var = this.a;
        if (g0Var != null) {
            RecyclerView recyclerView = g0Var.a;
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
            tf.e eVar = recyclerView.b;
            recyclerView.z0();
            p7.d dVar = recyclerView.e;
            ig igVar = (ig) dVar.d;
            nh nhVar = (nh) dVar.b;
            int indexOfChild = ((RecyclerView) nhVar.b).indexOfChild(view);
            if (indexOfChild == -1) {
                dVar.H(view);
            } else if (igVar.E(indexOfChild)) {
                igVar.G(indexOfChild);
                dVar.H(view);
                nhVar.I(indexOfChild);
            } else {
                z10 = false;
            }
            if (z10) {
                d1 U = RecyclerView.U(view);
                eVar.k(U);
                eVar.h(U);
            }
            recyclerView.A0(!z10);
            if (z10 || !d1Var.l()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public final void e() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            pi0 pi0Var = (pi0) arrayList.get(i3);
            pi0Var.a.d(pi0Var.b, pi0Var.c, pi0Var.d, false);
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

    public d2.t0 l(a1 a1Var, d1 d1Var, int i3, List list) {
        d2.t0 t0Var = new d2.t0();
        View view = d1Var.a;
        t0Var.a = view.getLeft();
        t0Var.b = view.getTop();
        view.getRight();
        view.getBottom();
        return t0Var;
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
