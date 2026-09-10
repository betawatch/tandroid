package s4;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import m.e3;
import org.telegram.ui.Components.tk0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class m0 {
    public l2.g a;
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

    public static int b(c1 c1Var) {
        int i10 = c1Var.l;
        int i11 = i10 & 14;
        if (c1Var.h()) {
            return 4;
        }
        if ((i10 & 4) == 0) {
            int i12 = c1Var.d;
            int b10 = c1Var.b();
            if (i12 != -1 && b10 != -1 && i12 != b10) {
                return i11 | 2048;
            }
        }
        return i11;
    }

    public abstract boolean a(c1 c1Var, b2.q0 q0Var, b2.q0 q0Var2);

    public abstract boolean c(c1 c1Var, List list);

    public final void d(c1 c1Var) {
        l2.g gVar = this.a;
        if (gVar != null) {
            RecyclerView recyclerView = (RecyclerView) gVar.b;
            boolean z10 = true;
            c1Var.q(true);
            View view = c1Var.a;
            if (c1Var.j != null && c1Var.k == null) {
                c1Var.j = null;
            }
            c1Var.k = null;
            if ((c1Var.l & 16) != 0) {
                return;
            }
            of.e eVar = recyclerView.b;
            recyclerView.y0();
            e3 e3Var = recyclerView.e;
            e6.n nVar = (e6.n) e3Var.c;
            gh.h hVar = (gh.h) e3Var.b;
            int indexOfChild = hVar.a.indexOfChild(view);
            if (indexOfChild == -1) {
                e3Var.X(view);
            } else if (nVar.z(indexOfChild)) {
                nVar.C(indexOfChild);
                e3Var.X(view);
                hVar.a(indexOfChild);
            } else {
                z10 = false;
            }
            if (z10) {
                c1 U = RecyclerView.U(view);
                eVar.k(U);
                eVar.h(U);
            }
            recyclerView.z0(!z10);
            if (z10 || !c1Var.l()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public final void e() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            tk0 tk0Var = (tk0) arrayList.get(i10);
            tk0Var.a.c(tk0Var.b, tk0Var.c, tk0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(c1 c1Var);

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

    public b2.q0 l(z0 z0Var, c1 c1Var, int i10, List list) {
        b2.q0 q0Var = new b2.q0();
        View view = c1Var.a;
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
