package s4;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.qj0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class l0 {
    public n2.u a;
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

    public abstract boolean a(c1 c1Var, ac.g gVar, ac.g gVar2);

    public abstract boolean c(c1 c1Var, List list);

    public final void d(c1 c1Var) {
        n2.u uVar = this.a;
        if (uVar != null) {
            RecyclerView recyclerView = (RecyclerView) uVar.b;
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
            hf.e eVar = recyclerView.b;
            recyclerView.z0();
            q5.d dVar = recyclerView.e;
            c3.g0 g0Var = (c3.g0) dVar.c;
            m2.t tVar = (m2.t) dVar.b;
            int indexOfChild = ((RecyclerView) tVar.b).indexOfChild(view);
            if (indexOfChild == -1) {
                dVar.y(view);
            } else if (g0Var.F(indexOfChild)) {
                g0Var.H(indexOfChild);
                dVar.y(view);
                tVar.J(indexOfChild);
            } else {
                z10 = false;
            }
            if (z10) {
                c1 U = RecyclerView.U(view);
                eVar.k(U);
                eVar.h(U);
            }
            recyclerView.A0(!z10);
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
            qj0 qj0Var = (qj0) arrayList.get(i10);
            qj0Var.a.d(qj0Var.b, qj0Var.c, qj0Var.d, false);
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

    public ac.g l(z0 z0Var, c1 c1Var, int i10, List list) {
        ac.g gVar = new ac.g();
        View view = c1Var.a;
        gVar.a = view.getLeft();
        gVar.b = view.getTop();
        view.getRight();
        view.getBottom();
        return gVar;
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
