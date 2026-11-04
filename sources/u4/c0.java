package u4;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.r2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        boolean z10 = r2.a;
        q = true;
    }

    public c0(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    @Override // u4.z0
    public final void d(int i3, int i10, y0 y0Var) {
        PointF pointF;
        if (this.b.y.r() == 0) {
            h();
            return;
        }
        if (q && (pointF = this.k) != null && (pointF.x * i3 < 0.0f || pointF.y * i10 < 0.0f)) {
            throw new IllegalStateException("Scroll happened in the opposite direction of the target. Some calculations are wrong");
        }
        int i11 = this.o;
        int i12 = i11 - i3;
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

    @Override // u4.z0
    public final void f() {
        this.p = 0;
        this.o = 0;
        this.k = null;
    }

    @Override // u4.z0
    public void g(View view, y0 y0Var) {
        int j10 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j10 * j10)));
        if (m10 > 0) {
            y0Var.b(-j10, -k10, m10, this.j);
        }
    }

    public int i(int i3, int i10, int i11, int i12, int i13) {
        if (i13 == -1) {
            return i11 - i3;
        }
        if (i13 != 0) {
            if (i13 == 1) {
                return i12 - i10;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i14 = i11 - i3;
        if (i14 > 0) {
            return i14;
        }
        int i15 = i12 - i10;
        if (i15 < 0) {
            return i15;
        }
        return 0;
    }

    public final int j(int i3, View view) {
        o0 o0Var = this.c;
        if (o0Var == null || !o0Var.d()) {
            return 0;
        }
        p0 p0Var = (p0) view.getLayoutParams();
        return i(o0.x(view) - ((ViewGroup.MarginLayoutParams) p0Var).leftMargin, o0.y(view) + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin, o0Var.D(), o0Var.m - o0Var.E(), i3);
    }

    public int k(int i3, View view) {
        o0 o0Var = this.c;
        if (o0Var == null || !o0Var.e()) {
            return 0;
        }
        p0 p0Var = (p0) view.getLayoutParams();
        return i(o0.z(view) - ((ViewGroup.MarginLayoutParams) p0Var).topMargin, o0.v(view) + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin, o0Var.F(), o0Var.n - o0Var.C(), i3);
    }

    public float l(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int m(int i3) {
        return (int) Math.ceil(n(i3) / 0.3356d);
    }

    public int n(int i3) {
        float abs = Math.abs(i3);
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

    @Override // u4.z0
    public final void e() {
    }
}
