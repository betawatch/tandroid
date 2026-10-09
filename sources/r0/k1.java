package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class k1 {
    public static final k1 b;
    public final h1 a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            b = g1.s;
        } else if (i10 >= 30) {
            b = f1.r;
        } else {
            b = h1.b;
        }
    }

    public k1(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            this.a = new g1(this, windowInsets);
            return;
        }
        if (i10 >= 30) {
            this.a = new f1(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.a = new e1(this, windowInsets);
        } else if (i10 >= 28) {
            this.a = new d1(this, windowInsets);
        } else {
            this.a = new c1(this, windowInsets);
        }
    }

    public static i0.b e(i0.b bVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, bVar.a - i10);
        int max2 = Math.max(0, bVar.b - i11);
        int max3 = Math.max(0, bVar.c - i12);
        int max4 = Math.max(0, bVar.d - i13);
        return (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) ? bVar : i0.b.b(max, max2, max3, max4);
    }

    public static k1 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        k1 k1Var = new k1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = i0.a;
            k1 a2 = b0.a(view);
            h1 h1Var = k1Var.a;
            h1Var.r(a2);
            h1Var.d(view.getRootView());
            h1Var.t(view.getWindowSystemUiVisibility());
        }
        return k1Var;
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
        if (obj instanceof k1) {
            return Objects.equals(this.a, ((k1) obj).a);
        }
        return false;
    }

    public final k1 f(int i10, int i11, int i12, int i13) {
        int i14 = Build.VERSION.SDK_INT;
        a1 z0Var = i14 >= 34 ? new z0(this) : i14 >= 30 ? new y0(this) : i14 >= 29 ? new x0(this) : new w0(this);
        z0Var.g(i0.b.b(i10, i11, i12, i13));
        return z0Var.b();
    }

    public final WindowInsets g() {
        h1 h1Var = this.a;
        if (h1Var instanceof b1) {
            return ((b1) h1Var).c;
        }
        return null;
    }

    public final int hashCode() {
        h1 h1Var = this.a;
        if (h1Var == null) {
            return 0;
        }
        return h1Var.hashCode();
    }

    public k1() {
        this.a = new h1(this);
    }
}
