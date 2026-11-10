package v4;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.r2;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public class c0 extends z0 {
    public static final boolean q;
    public PointF k;
    public final DisplayMetrics l;
    public float n;
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator();
    public boolean m = false;
    public int o = 0;
    public int p = 0;

    static {
        boolean z9 = r2.a;
        q = true;
    }

    public c0(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    @Override // v4.z0
    public final void d(int i7, int i10, y0 y0Var) {
        PointF pointF;
        if (this.b.y.r() == 0) {
            h();
            return;
        }
        if (q && (pointF = this.k) != null && (pointF.x * i7 < 0.0f || pointF.y * i10 < 0.0f)) {
            throw new IllegalStateException("Scroll happened in the opposite direction of the target. Some calculations are wrong");
        }
        int i11 = this.o;
        int i12 = i11 - i7;
        if (i11 * i12 <= 0) {
            i12 = 0;
        }
        this.o = i12;
        int i13 = this.p;
        int i14 = i13 - i10;
        int i15 = i13 * i14 > 0 ? i14 : 0;
        this.p = i15;
        if (i12 == 0 && i15 == 0) {
            q(y0Var);
        }
    }

    @Override // v4.z0
    public final void f() {
        this.p = 0;
        this.o = 0;
        this.k = null;
    }

    @Override // v4.z0
    public void g(View view, y0 y0Var) {
        int j3 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j3 * j3)));
        if (m10 > 0) {
            y0Var.b(-j3, -k10, m10, this.j);
        }
    }

    public int i(int i7, int i10, int i11, int i12, int i13) {
        if (i13 == -1) {
            return i11 - i7;
        }
        if (i13 != 0) {
            if (i13 == 1) {
                return i12 - i10;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i14 = i11 - i7;
        if (i14 > 0) {
            return i14;
        }
        int i15 = i12 - i10;
        if (i15 < 0) {
            return i15;
        }
        return 0;
    }

    public final int j(int i7, View view) {
        n0 n0Var = this.c;
        if (n0Var == null || !n0Var.d()) {
            return 0;
        }
        o0 o0Var = (o0) view.getLayoutParams();
        return i(n0.x(view) - ((ViewGroup.MarginLayoutParams) o0Var).leftMargin, n0.y(view) + ((ViewGroup.MarginLayoutParams) o0Var).rightMargin, n0Var.D(), n0Var.m - n0Var.E(), i7);
    }

    public int k(int i7, View view) {
        n0 n0Var = this.c;
        if (n0Var == null || !n0Var.e()) {
            return 0;
        }
        o0 o0Var = (o0) view.getLayoutParams();
        return i(n0.z(view) - ((ViewGroup.MarginLayoutParams) o0Var).topMargin, n0.v(view) + ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin, n0Var.F(), n0Var.n - n0Var.C(), i7);
    }

    public float l(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int m(int i7) {
        return (int) Math.ceil(n(i7) / 0.3356d);
    }

    public int n(int i7) {
        float abs = Math.abs(i7);
        if (!this.m) {
            this.n = l(this.l);
            this.m = true;
        }
        return (int) Math.ceil(abs * this.n);
    }

    public final int o() {
        PointF pointF = this.k;
        if (pointF == null) {
            return 0;
        }
        float f10 = pointF.x;
        if (f10 == 0.0f) {
            return 0;
        }
        return f10 > 0.0f ? 1 : -1;
    }

    public int p() {
        PointF pointF = this.k;
        if (pointF == null) {
            return 0;
        }
        float f10 = pointF.y;
        if (f10 == 0.0f) {
            return 0;
        }
        return f10 > 0.0f ? 1 : -1;
    }

    public void q(y0 y0Var) {
        PointF a10 = a(this.a);
        if (a10 == null || (a10.x == 0.0f && a10.y == 0.0f)) {
            y0Var.d = this.a;
            h();
            return;
        }
        z0.b(a10);
        this.k = a10;
        this.o = (int) (a10.x * 10000.0f);
        this.p = (int) (a10.y * 10000.0f);
        y0Var.b((int) (this.o * 1.2f), (int) (this.p * 1.2f), (int) (n(10000) * 1.2f), this.i);
    }

    @Override // v4.z0
    public final void e() {
    }
}
