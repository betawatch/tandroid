package v4;

import a8.ua;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.ni0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.ky0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public abstract class l0 {
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

    public static int b(d1 d1Var) {
        int i7 = d1Var.l;
        int i10 = i7 & 14;
        if (d1Var.h()) {
            return 4;
        }
        if ((i7 & 4) == 0) {
            int i11 = d1Var.d;
            int b10 = d1Var.b();
            if (i11 != -1 && b10 != -1 && i11 != b10) {
                return i10 | 2048;
            }
        }
        return i10;
    }

    public abstract boolean a(d1 d1Var, e2.r0 r0Var, e2.r0 r0Var2);

    public abstract boolean c(d1 d1Var, List list);

    public final void d(d1 d1Var) {
        jh.g gVar = this.a;
        if (gVar != null) {
            RecyclerView recyclerView = gVar.a;
            boolean z9 = true;
            d1Var.q(true);
            View view = d1Var.a;
            if (d1Var.j != null && d1Var.k == null) {
                d1Var.j = null;
            }
            d1Var.k = null;
            if ((d1Var.l & 16) != 0) {
                return;
            }
            v0 v0Var = recyclerView.b;
            recyclerView.z0();
            ky0 ky0Var = recyclerView.e;
            ua uaVar = (ua) ky0Var.c;
            vy vyVar = (vy) ky0Var.b;
            int indexOfChild = ((RecyclerView) vyVar.b).indexOfChild(view);
            if (indexOfChild == -1) {
                ky0Var.M(view);
            } else if (uaVar.E(indexOfChild)) {
                uaVar.G(indexOfChild);
                ky0Var.M(view);
                vyVar.Q(indexOfChild);
            } else {
                z9 = false;
            }
            if (z9) {
                d1 U = RecyclerView.U(view);
                v0Var.k(U);
                v0Var.h(U);
            }
            recyclerView.A0(!z9);
            if (z9 || !d1Var.l()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public final void e() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ni0 ni0Var = (ni0) arrayList.get(i7);
            ni0Var.a.d(ni0Var.b, ni0Var.c, ni0Var.d, false);
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

    public e2.r0 l(a1 a1Var, d1 d1Var, int i7, List list) {
        e2.r0 r0Var = new e2.r0();
        View view = d1Var.a;
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
