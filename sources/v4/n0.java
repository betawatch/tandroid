package v4;

import a8.va;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.qf;
import org.telegram.ui.md0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class n0 {
    public jh.g a;
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

    public static int b(f1 f1Var) {
        int i7 = f1Var.l;
        int i10 = i7 & 14;
        if (f1Var.h()) {
            return 4;
        }
        if ((i7 & 4) == 0) {
            int i11 = f1Var.d;
            int b10 = f1Var.b();
            if (i11 != -1 && b10 != -1 && i11 != b10) {
                return i10 | 2048;
            }
        }
        return i10;
    }

    public abstract boolean a(f1 f1Var, e2.r0 r0Var, e2.r0 r0Var2);

    public abstract boolean c(f1 f1Var, List list);

    public final void d(f1 f1Var) {
        jh.g gVar = this.a;
        if (gVar != null) {
            RecyclerView recyclerView = gVar.a;
            boolean z10 = true;
            f1Var.q(true);
            View view = f1Var.a;
            if (f1Var.j != null && f1Var.k == null) {
                f1Var.j = null;
            }
            f1Var.k = null;
            if ((f1Var.l & 16) != 0) {
                return;
            }
            x0 x0Var = recyclerView.b;
            recyclerView.z0();
            md0 md0Var = recyclerView.e;
            va vaVar = (va) md0Var.c;
            qf qfVar = (qf) md0Var.b;
            int indexOfChild = ((RecyclerView) qfVar.b).indexOfChild(view);
            if (indexOfChild == -1) {
                md0Var.K(view);
            } else if (vaVar.G(indexOfChild)) {
                vaVar.I(indexOfChild);
                md0Var.K(view);
                qfVar.x0(indexOfChild);
            } else {
                z10 = false;
            }
            if (z10) {
                f1 U = RecyclerView.U(view);
                x0Var.k(U);
                x0Var.h(U);
            }
            recyclerView.A0(!z10);
            if (z10 || !f1Var.l()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public final void e() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            cj0 cj0Var = (cj0) arrayList.get(i7);
            cj0Var.a.k(cj0Var.b, cj0Var.c, cj0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(f1 f1Var);

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

    public e2.r0 l(c1 c1Var, f1 f1Var, int i7, List list) {
        e2.r0 r0Var = new e2.r0();
        View view = f1Var.a;
        r0Var.a = view.getLeft();
        r0Var.b = view.getTop();
        view.getRight();
        view.getBottom();
        return r0Var;
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
