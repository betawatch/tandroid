package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class l1 {
    public static final l1 b;
    public final i1 a;

    static {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            b = h1.s;
        } else if (i7 >= 30) {
            b = g1.r;
        } else {
            b = i1.b;
        }
    }

    public l1(WindowInsets windowInsets) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            this.a = new h1(this, windowInsets);
            return;
        }
        if (i7 >= 30) {
            this.a = new g1(this, windowInsets);
            return;
        }
        if (i7 >= 29) {
            this.a = new e1(this, windowInsets);
        } else if (i7 >= 28) {
            this.a = new d1(this, windowInsets);
        } else {
            this.a = new c1(this, windowInsets);
        }
    }

    public static i0.b e(i0.b bVar, int i7, int i10, int i11, int i12) {
        int max = Math.max(0, bVar.a - i7);
        int max2 = Math.max(0, bVar.b - i10);
        int max3 = Math.max(0, bVar.c - i11);
        int max4 = Math.max(0, bVar.d - i12);
        return (max == i7 && max2 == i10 && max3 == i11 && max4 == i12) ? bVar : i0.b.b(max, max2, max3, max4);
    }

    public static l1 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        l1 l1Var = new l1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = i0.a;
            l1 a10 = b0.a(view);
            i1 i1Var = l1Var.a;
            i1Var.r(a10);
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

    public final l1 f(int i7, int i10, int i11, int i12) {
        int i13 = Build.VERSION.SDK_INT;
        a1 z0Var = i13 >= 34 ? new z0(this) : i13 >= 30 ? new y0(this) : i13 >= 29 ? new x0(this) : new w0(this);
        z0Var.g(i0.b.b(i7, i10, i11, i12));
        return z0Var.b();
    }

    public final WindowInsets g() {
        i1 i1Var = this.a;
        if (i1Var instanceof b1) {
            return ((b1) i1Var).c;
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
