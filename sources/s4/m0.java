package s4;

import a8.lg;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import li.h5;
import org.telegram.ui.Components.jl0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class m0 {
    public h5 a;
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

    public static int b(e1 e1Var) {
        int i10 = e1Var.l;
        int i11 = i10 & 14;
        if (e1Var.h()) {
            return 4;
        }
        if ((i10 & 4) == 0) {
            int i12 = e1Var.d;
            int b10 = e1Var.b();
            if (i12 != -1 && b10 != -1 && i12 != b10) {
                return i11 | 2048;
            }
        }
        return i11;
    }

    public abstract boolean a(e1 e1Var, b2.v0 v0Var, b2.v0 v0Var2);

    public abstract boolean c(e1 e1Var, List list);

    public final void d(e1 e1Var) {
        h5 h5Var = this.a;
        if (h5Var != null) {
            RecyclerView recyclerView = (RecyclerView) h5Var.a;
            boolean z10 = true;
            e1Var.q(true);
            View view = e1Var.a;
            if (e1Var.j != null && e1Var.k == null) {
                e1Var.j = null;
            }
            e1Var.k = null;
            if ((e1Var.l & 16) != 0) {
                return;
            }
            rf.e eVar = recyclerView.b;
            recyclerView.z0();
            d dVar = recyclerView.e;
            lg lgVar = (lg) dVar.c;
            jg.s0 s0Var = (jg.s0) dVar.b;
            int indexOfChild = ((RecyclerView) s0Var.b).indexOfChild(view);
            if (indexOfChild == -1) {
                dVar.t(view);
            } else if (lgVar.z(indexOfChild)) {
                lgVar.B(indexOfChild);
                dVar.t(view);
                s0Var.h0(indexOfChild);
            } else {
                z10 = false;
            }
            if (z10) {
                e1 U = RecyclerView.U(view);
                eVar.k(U);
                eVar.h(U);
            }
            recyclerView.A0(!z10);
            if (z10 || !e1Var.l()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public final void e() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            jl0 jl0Var = (jl0) arrayList.get(i10);
            jl0Var.a.c(jl0Var.b, jl0Var.c, jl0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(e1 e1Var);

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

    public b2.v0 l(b1 b1Var, e1 e1Var, int i10, List list) {
        b2.v0 v0Var = new b2.v0();
        View view = e1Var.a;
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
