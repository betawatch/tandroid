// default package

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wzc {
    public static final wzc b;
    public final tzc a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = szc.s;
        } else if (i >= 30) {
            b = rzc.r;
        } else {
            b = tzc.b;
        }
    }

    public wzc(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.a = new szc(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new rzc(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new qzc(this, windowInsets);
        } else if (i >= 28) {
            this.a = new pzc(this, windowInsets);
        } else {
            this.a = new ozc(this, windowInsets);
        }
    }

    public static iq5 e(iq5 iq5Var, int i, int i2, int i3, int i4) {
        int max = Math.max(0, iq5Var.a - i);
        int max2 = Math.max(0, iq5Var.b - i2);
        int max3 = Math.max(0, iq5Var.c - i3);
        int max4 = Math.max(0, iq5Var.d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? iq5Var : iq5.b(max, max2, max3, max4);
    }

    public static wzc h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        wzc wzcVar = new wzc(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = kfc.a;
            wzc a = dfc.a(view);
            tzc tzcVar = wzcVar.a;
            tzcVar.r(a);
            tzcVar.d(view.getRootView());
            tzcVar.t(view.getWindowSystemUiVisibility());
        }
        return wzcVar;
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
        if (obj instanceof wzc) {
            return Objects.equals(this.a, ((wzc) obj).a);
        }
        return false;
    }

    public final wzc f(int i, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        mzc lzcVar = i5 >= 34 ? new lzc(this) : i5 >= 30 ? new kzc(this) : i5 >= 29 ? new jzc(this) : new izc(this);
        lzcVar.g(iq5.b(i, i2, i3, i4));
        return lzcVar.b();
    }

    public final WindowInsets g() {
        tzc tzcVar = this.a;
        if (tzcVar instanceof nzc) {
            return ((nzc) tzcVar).c;
        }
        return null;
    }

    public final int hashCode() {
        tzc tzcVar = this.a;
        if (tzcVar == null) {
            return 0;
        }
        return tzcVar.hashCode();
    }

    public wzc() {
        this.a = new tzc(this);
    }
}
