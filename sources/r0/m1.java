package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class m1 {
    public static final m1 b;
    public final j1 a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            b = i1.s;
        } else if (i10 >= 30) {
            b = h1.r;
        } else {
            b = j1.b;
        }
    }

    public m1(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            this.a = new i1(this, windowInsets);
            return;
        }
        if (i10 >= 30) {
            this.a = new h1(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.a = new g1(this, windowInsets);
        } else if (i10 >= 28) {
            this.a = new f1(this, windowInsets);
        } else {
            this.a = new e1(this, windowInsets);
        }
    }

    public static i0.b e(i0.b bVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, bVar.a - i10);
        int max2 = Math.max(0, bVar.b - i11);
        int max3 = Math.max(0, bVar.c - i12);
        int max4 = Math.max(0, bVar.d - i13);
        return (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) ? bVar : i0.b.b(max, max2, max3, max4);
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

    public final m1 f(int i10, int i11, int i12, int i13) {
        int i14 = Build.VERSION.SDK_INT;
        c1 b1Var = i14 >= 34 ? new b1(this) : i14 >= 30 ? new a1(this) : i14 >= 29 ? new z0(this) : new y0(this);
        b1Var.g(i0.b.b(i10, i11, i12, i13));
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
