package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j1 {
    public static final j1 b;
    public final g1 a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            b = f1.s;
        } else if (i10 >= 30) {
            b = e1.r;
        } else {
            b = g1.b;
        }
    }

    public j1(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            this.a = new f1(this, windowInsets);
            return;
        }
        if (i10 >= 30) {
            this.a = new e1(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.a = new d1(this, windowInsets);
        } else if (i10 >= 28) {
            this.a = new c1(this, windowInsets);
        } else {
            this.a = new b1(this, windowInsets);
        }
    }

    public static i0.c e(i0.c cVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, cVar.a - i10);
        int max2 = Math.max(0, cVar.b - i11);
        int max3 = Math.max(0, cVar.c - i12);
        int max4 = Math.max(0, cVar.d - i13);
        return (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) ? cVar : i0.c.b(max, max2, max3, max4);
    }

    public static j1 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        j1 j1Var = new j1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = h0.a;
            j1 a2 = a0.a(view);
            g1 g1Var = j1Var.a;
            g1Var.r(a2);
            g1Var.d(view.getRootView());
            g1Var.t(view.getWindowSystemUiVisibility());
        }
        return j1Var;
    }

    public final int a() {
        return this.a.k().d;
    }

    public final int b() {
        return this.a.k().a;
    }

    public final int c() {
        return this.a.k().c;
    }

    public final int d() {
        return this.a.k().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j1) {
            return Objects.equals(this.a, ((j1) obj).a);
        }
        return false;
    }

    public final j1 f(int i10, int i11, int i12, int i13) {
        int i14 = Build.VERSION.SDK_INT;
        z0 y0Var = i14 >= 34 ? new y0(this) : i14 >= 30 ? new x0(this) : i14 >= 29 ? new w0(this) : new v0(this);
        y0Var.g(i0.c.b(i10, i11, i12, i13));
        return y0Var.b();
    }

    public final WindowInsets g() {
        g1 g1Var = this.a;
        if (g1Var instanceof a1) {
            return ((a1) g1Var).c;
        }
        return null;
    }

    public final int hashCode() {
        g1 g1Var = this.a;
        if (g1Var == null) {
            return 0;
        }
        return g1Var.hashCode();
    }

    public j1() {
        this.a = new g1(this);
    }
}
