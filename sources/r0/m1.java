package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m1 {
    public static final m1 b;
    public final j1 a;

    static {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 34) {
            b = i1.s;
        } else if (i9 >= 30) {
            b = h1.r;
        } else {
            b = j1.b;
        }
    }

    public m1(WindowInsets windowInsets) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 34) {
            this.a = new i1(this, windowInsets);
            return;
        }
        if (i9 >= 30) {
            this.a = new h1(this, windowInsets);
            return;
        }
        if (i9 >= 29) {
            this.a = new g1(this, windowInsets);
        } else if (i9 >= 28) {
            this.a = new f1(this, windowInsets);
        } else {
            this.a = new e1(this, windowInsets);
        }
    }

    public static i0.b e(i0.b bVar, int i9, int i10, int i11, int i12) {
        int max = Math.max(0, bVar.a - i9);
        int max2 = Math.max(0, bVar.b - i10);
        int max3 = Math.max(0, bVar.c - i11);
        int max4 = Math.max(0, bVar.d - i12);
        return (max == i9 && max2 == i10 && max3 == i11 && max4 == i12) ? bVar : i0.b.b(max, max2, max3, max4);
    }

    public static m1 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        m1 m1Var = new m1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            m1 f10 = j0.f(view);
            j1 j1Var = m1Var.a;
            j1Var.r(f10);
            j1Var.d(view.getRootView());
            j1Var.t(view.getWindowSystemUiVisibility());
        }
        return m1Var;
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
        if (obj instanceof m1) {
            return Objects.equals(this.a, ((m1) obj).a);
        }
        return false;
    }

    public final m1 f(int i9, int i10, int i11, int i12) {
        int i13 = Build.VERSION.SDK_INT;
        c1 b1Var = i13 >= 34 ? new b1(this) : i13 >= 30 ? new a1(this) : i13 >= 29 ? new z0(this) : new y0(this);
        b1Var.g(i0.b.b(i9, i10, i11, i12));
        return b1Var.b();
    }

    public final WindowInsets g() {
        j1 j1Var = this.a;
        if (j1Var instanceof d1) {
            return ((d1) j1Var).c;
        }
        return null;
    }

    public final int hashCode() {
        j1 j1Var = this.a;
        if (j1Var == null) {
            return 0;
        }
        return j1Var.hashCode();
    }

    public m1() {
        this.a = new j1(this);
    }
}
