package s4;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.BuildVars;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class d0 extends y0 {
    public static final boolean q = BuildVars.DEBUG_VERSION;
    public PointF k;
    public final DisplayMetrics l;
    public float n;
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator();
    public boolean m = false;
    public int o = 0;
    public int p = 0;

    public d0(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    @Override // s4.y0
    public final void d(int i10, int i11, x0 x0Var) {
        PointF pointF;
        if (this.b.x.r() == 0) {
            h();
            return;
        }
        if (q && (pointF = this.k) != null && (pointF.x * i10 < 0.0f || pointF.y * i11 < 0.0f)) {
            throw new IllegalStateException("Scroll happened in the opposite direction of the target. Some calculations are wrong");
        }
        int i12 = this.o;
        int i13 = i12 - i10;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.o = i13;
        int i14 = this.p;
        int i15 = i14 - i11;
        int i16 = i14 * i15 > 0 ? i15 : 0;
        this.p = i16;
        if (i13 == 0 && i16 == 0) {
            q(x0Var);
        }
    }

    @Override // s4.y0
    public final void f() {
        this.p = 0;
        this.o = 0;
        this.k = null;
    }

    @Override // s4.y0
    public void g(View view, x0 x0Var) {
        int j3 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j3 * j3)));
        if (m10 > 0) {
            x0Var.b(-j3, -k10, m10, this.j);
        }
    }

    public int i(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 != 0) {
            if (i14 == 1) {
                return i13 - i11;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i15 = i12 - i10;
        if (i15 > 0) {
            return i15;
        }
        int i16 = i13 - i11;
        if (i16 < 0) {
            return i16;
        }
        return 0;
    }

    public final int j(int i10, View view) {
        o0 o0Var = this.c;
        if (o0Var == null || !o0Var.d()) {
            return 0;
        }
        p0 p0Var = (p0) view.getLayoutParams();
        return i(o0.x(view) - ((ViewGroup.MarginLayoutParams) p0Var).leftMargin, o0.y(view) + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin, o0Var.D(), o0Var.m - o0Var.E(), i10);
    }

    public int k(int i10, View view) {
        o0 o0Var = this.c;
        if (o0Var == null || !o0Var.e()) {
            return 0;
        }
        p0 p0Var = (p0) view.getLayoutParams();
        return i(o0.z(view) - ((ViewGroup.MarginLayoutParams) p0Var).topMargin, o0.v(view) + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin, o0Var.F(), o0Var.n - o0Var.C(), i10);
    }

    public float l(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int m(int i10) {
        return (int) Math.ceil(n(i10) / 0.3356d);
    }

    public int n(int i10) {
        float abs = Math.abs(i10);
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
        float f7 = pointF.x;
        if (f7 == 0.0f) {
            return 0;
        }
        return f7 > 0.0f ? 1 : -1;
    }

    public int p() {
        PointF pointF = this.k;
        if (pointF == null) {
            return 0;
        }
        float f7 = pointF.y;
        if (f7 == 0.0f) {
            return 0;
        }
        return f7 > 0.0f ? 1 : -1;
    }

    public void q(x0 x0Var) {
        PointF a2 = a(this.a);
        if (a2 == null || (a2.x == 0.0f && a2.y == 0.0f)) {
            x0Var.d = this.a;
            h();
            return;
        }
        y0.b(a2);
        this.k = a2;
        this.o = (int) (a2.x * 10000.0f);
        this.p = (int) (a2.y * 10000.0f);
        x0Var.b((int) (this.o * 1.2f), (int) (this.p * 1.2f), (int) (n(10000) * 1.2f), this.i);
    }

    @Override // s4.y0
    public final void e() {
    }
}
