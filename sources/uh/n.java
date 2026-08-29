package uh;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import f2.i1;
import f2.j0;
import f2.j1;
import f2.w0;
import f2.x0;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public class n extends j1 {
    public final LinearInterpolator i;
    public final DecelerateInterpolator j;
    public final float k;
    public int l;
    public int m;
    public final int n;
    public final float o;
    public int p;

    public n(Context context, int i10) {
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator(1.5f);
        this.l = 0;
        this.m = 0;
        this.o = 1.0f;
        this.k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.n = i10;
    }

    @Override // f2.j1
    public final PointF a(int i10) {
        w0 w0Var = this.c;
        if (w0Var instanceof j0) {
            return ((j0) w0Var).E0(i10);
        }
        return null;
    }

    @Override // f2.j1
    public final void d(int i10, int i11, i1 i1Var) {
        if (this.b.x.r() == 0) {
            h();
            return;
        }
        int i12 = this.l;
        int i13 = i12 - i10;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.l = i13;
        int i14 = this.m;
        int i15 = i14 - i11;
        int i16 = i14 * i15 > 0 ? i15 : 0;
        this.m = i16;
        if (i13 == 0 && i16 == 0) {
            PointF a2 = a(this.a);
            if (a2 == null || (a2.x == 0.0f && a2.y == 0.0f)) {
                i1Var.d = this.a;
                h();
            } else {
                j1.b(a2);
                this.l = (int) (a2.x * 10000.0f);
                this.m = (int) (a2.y * 10000.0f);
                i1Var.b((int) (this.l * 1.2f), (int) (this.m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.k)) * 1.2f), this.i);
            }
        }
    }

    @Override // f2.j1
    public final void f() {
        this.m = 0;
        this.l = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
    
        if (r0 < 0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    @Override // f2.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, i1 i1Var) {
        int i10;
        int ceil;
        w0 w0Var = this.c;
        if (w0Var != null && w0Var.e()) {
            x0 x0Var = (x0) view.getLayoutParams();
            int z10 = w0.z(view) - ((ViewGroup.MarginLayoutParams) x0Var).topMargin;
            int v = w0.v(view) + ((ViewGroup.MarginLayoutParams) x0Var).bottomMargin;
            int C = (w0Var.n - w0Var.C()) - w0Var.F();
            int i11 = v - z10;
            int i12 = this.n;
            int F = i12 == 2 ? w0Var.F() + this.p : i11 > C ? 0 : i12 == 0 ? (C - i11) / 2 : (w0Var.F() + this.p) - AndroidUtilities.dp(88.0f);
            int i13 = i11 + F;
            i10 = F - z10;
            if (i10 <= 0) {
                i10 = i13 - v;
            }
            ceil = (int) Math.ceil(((int) Math.ceil(Math.abs(i10) * this.k)) / 0.3356d);
            if (ceil <= 0) {
                i1Var.b(0, -i10, Math.max((int) (this.o * 400.0f), ceil), this.j);
                return;
            } else {
                i();
                return;
            }
        }
        i10 = 0;
        ceil = (int) Math.ceil(((int) Math.ceil(Math.abs(i10) * this.k)) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    public n(Context context, int i10, float f9) {
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator(1.5f);
        this.l = 0;
        this.m = 0;
        this.o = f9;
        this.k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f9;
        this.n = i10;
    }

    @Override // f2.j1
    public void e() {
    }

    public void i() {
    }
}
