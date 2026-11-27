// default package

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class rb8 extends b89 {
    public final float k;
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator(1.5f);
    public int l = 0;
    public int m = 0;

    public rb8(Context context) {
        this.k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override // b89
    public final PointF a(int i) {
        q79 q79Var = this.c;
        if (q79Var instanceof x46) {
            return ((x46) q79Var).D0(i);
        }
        return null;
    }

    @Override // b89
    public final void d(int i, int i2, a89 a89Var) {
        if (this.b.y.r() == 0) {
            h();
            return;
        }
        int i3 = this.l;
        int i4 = i3 - i;
        if (i3 * i4 <= 0) {
            i4 = 0;
        }
        this.l = i4;
        int i5 = this.m;
        int i6 = i5 - i2;
        int i7 = i5 * i6 > 0 ? i6 : 0;
        this.m = i7;
        if (i4 == 0 && i7 == 0) {
            PointF a = a(this.a);
            if (a == null || (a.x == 0.0f && a.y == 0.0f)) {
                a89Var.d = this.a;
                h();
            } else {
                b89.b(a);
                this.l = (int) (a.x * 10000.0f);
                this.m = (int) (a.y * 10000.0f);
                a89Var.b((int) (this.l * 1.2f), (int) (this.m * 1.2f), (int) (((int) Math.ceil(10000.0f * this.k)) * 1.2f), this.i);
            }
        }
    }

    @Override // b89
    public final void f() {
        this.m = 0;
        this.l = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r4 >= 0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // b89
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, a89 a89Var) {
        int i;
        int ceil;
        q79 q79Var = this.c;
        if (q79Var != null && q79Var.d()) {
            r79 r79Var = (r79) view.getLayoutParams();
            int w = q79.w(view) - ((ViewGroup.MarginLayoutParams) r79Var).leftMargin;
            int x = q79.x(view) + ((ViewGroup.MarginLayoutParams) r79Var).rightMargin;
            int C = q79Var.C();
            int D = q79Var.m - q79Var.D();
            if (w <= C || x >= D) {
                int i2 = x - w;
                int i3 = (D - C) - i2;
                int i4 = i2 + i3;
                i = i3 - w;
                if (i <= 0) {
                    i = i4 - x;
                }
                ceil = (int) Math.ceil(((int) Math.ceil(Math.abs(i) * this.k)) / 0.3356d);
                if (Math.max(jn7.J2, ceil) <= 0) {
                    a89Var.b(-i, 0, Math.max(400, ceil), this.j);
                    return;
                }
                return;
            }
        }
        i = 0;
        ceil = (int) Math.ceil(((int) Math.ceil(Math.abs(i) * this.k)) / 0.3356d);
        if (Math.max(jn7.J2, ceil) <= 0) {
        }
    }

    @Override // b89
    public final void e() {
    }
}
