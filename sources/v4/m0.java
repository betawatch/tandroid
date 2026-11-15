package v4;

import a8.va;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.ld0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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

    public static int b(e1 e1Var) {
        int i7 = e1Var.l;
        int i10 = i7 & 14;
        if (e1Var.h()) {
            return 4;
        }
        if ((i7 & 4) == 0) {
            int i11 = e1Var.d;
            int b10 = e1Var.b();
            if (i11 != -1 && b10 != -1 && i11 != b10) {
                return i10 | 2048;
            }
        }
        return i10;
    }

    public abstract boolean a(e1 e1Var, e2.r0 r0Var, e2.r0 r0Var2);

    public abstract boolean c(e1 e1Var, List list);

    public final void d(e1 e1Var) {
        g0 g0Var = this.a;
        if (g0Var != null) {
            RecyclerView recyclerView = g0Var.a;
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
            w0 w0Var = recyclerView.b;
            recyclerView.z0();
            ld0 ld0Var = recyclerView.e;
            va vaVar = (va) ld0Var.c;
            ff ffVar = (ff) ld0Var.b;
            int indexOfChild = ((RecyclerView) ffVar.b).indexOfChild(view);
            if (indexOfChild == -1) {
                ld0Var.K(view);
            } else if (vaVar.v(indexOfChild)) {
                vaVar.x(indexOfChild);
                ld0Var.K(view);
                ffVar.C0(indexOfChild);
            } else {
                z10 = false;
            }
            if (z10) {
                e1 U = RecyclerView.U(view);
                w0Var.k(U);
                w0Var.h(U);
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
        for (int i7 = 0; i7 < size; i7++) {
            ri0 ri0Var = (ri0) arrayList.get(i7);
            ri0Var.a.d(ri0Var.b, ri0Var.c, ri0Var.d, false);
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

    public e2.r0 l(b1 b1Var, e1 e1Var, int i7, List list) {
        e2.r0 r0Var = new e2.r0();
        View view = e1Var.a;
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
