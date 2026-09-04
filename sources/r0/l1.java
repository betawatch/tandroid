package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class l1 {
    public static final l1 b;
    public final i1 a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            b = h1.s;
        } else if (i10 >= 30) {
            b = g1.r;
        } else {
            b = i1.b;
        }
    }

    public l1(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            this.a = new h1(this, windowInsets);
            return;
        }
        if (i10 >= 30) {
            this.a = new g1(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.a = new f1(this, windowInsets);
        } else if (i10 >= 28) {
            this.a = new e1(this, windowInsets);
        } else {
            this.a = new d1(this, windowInsets);
        }
    }

    public static i0.c e(i0.c cVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, cVar.a - i10);
        int max2 = Math.max(0, cVar.b - i11);
        int max3 = Math.max(0, cVar.c - i12);
        int max4 = Math.max(0, cVar.d - i13);
        return (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) ? cVar : i0.c.b(max, max2, max3, max4);
    }

    public static l1 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        l1 l1Var = new l1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            l1 f7 = i0.f(view);
            i1 i1Var = l1Var.a;
            i1Var.r(f7);
            i1Var.d(view.getRootView());
            i1Var.t(view.getWindowSystemUiVisibility());
        }
        return l1Var;
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
        if (obj instanceof l1) {
            return Objects.equals(this.a, ((l1) obj).a);
        }
        return false;
    }

    public final l1 f(int i10, int i11, int i12, int i13) {
        int i14 = Build.VERSION.SDK_INT;
        b1 a1Var = i14 >= 34 ? new a1(this) : i14 >= 30 ? new z0(this) : i14 >= 29 ? new y0(this) : new x0(this);
        a1Var.g(i0.c.b(i10, i11, i12, i13));
        return a1Var.b();
    }

    public final WindowInsets g() {
        i1 i1Var = this.a;
        if (i1Var instanceof c1) {
            return ((c1) i1Var).c;
        }
        return null;
    }

    public final int hashCode() {
        i1 i1Var = this.a;
        if (i1Var == null) {
            return 0;
        }
        return i1Var.hashCode();
    }

    public l1() {
        this.a = new i1(this);
    }
}
