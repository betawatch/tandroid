package rh;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import f2.a1;
import f2.l1;
import f2.m0;
import f2.m1;
import f2.z0;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public class n extends m1 {
    public final LinearInterpolator i;
    public final DecelerateInterpolator j;
    public final float k;
    public int l;
    public int m;
    public final int n;
    public final float o;
    public int p;

    public n(Context context, int i9) {
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator(1.5f);
        this.l = 0;
        this.m = 0;
        this.o = 1.0f;
        this.k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.n = i9;
    }

    @Override // f2.m1
    public final PointF a(int i9) {
        z0 z0Var = this.c;
        if (z0Var instanceof m0) {
            return ((m0) z0Var).E0(i9);
        }
        return null;
    }

    @Override // f2.m1
    public final void d(int i9, int i10, l1 l1Var) {
        if (this.b.x.r() == 0) {
            h();
            return;
        }
        int i11 = this.l;
        int i12 = i11 - i9;
        if (i11 * i12 <= 0) {
            i12 = 0;
        }
        this.l = i12;
        int i13 = this.m;
        int i14 = i13 - i10;
        int i15 = i13 * i14 > 0 ? i14 : 0;
        this.m = i15;
        if (i12 == 0 && i15 == 0) {
            PointF a2 = a(this.a);
            if (a2 == null || (a2.x == 0.0f && a2.y == 0.0f)) {
                l1Var.d = this.a;
                h();
            } else {
                m1.b(a2);
                this.l = (int) (a2.x * 10000.0f);
                this.m = (int) (a2.y * 10000.0f);
                l1Var.b((int) (this.l * 1.2f), (int) (this.m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.k)) * 1.2f), this.i);
            }
        }
    }

    @Override // f2.m1
    public final void f() {
        this.m = 0;
        this.l = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
    
        if (r0 < 0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    @Override // f2.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, l1 l1Var) {
        int i9;
        int ceil;
        z0 z0Var = this.c;
        if (z0Var != null && z0Var.e()) {
            a1 a1Var = (a1) view.getLayoutParams();
            int z10 = z0.z(view) - ((ViewGroup.MarginLayoutParams) a1Var).topMargin;
            int v = z0.v(view) + ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin;
            int C = (z0Var.n - z0Var.C()) - z0Var.F();
            int i10 = v - z10;
            int i11 = this.n;
            int F = i11 == 2 ? z0Var.F() + this.p : i10 > C ? 0 : i11 == 0 ? (C - i10) / 2 : (z0Var.F() + this.p) - AndroidUtilities.dp(88.0f);
            int i12 = i10 + F;
            i9 = F - z10;
            if (i9 <= 0) {
                i9 = i12 - v;
            }
            ceil = (int) Math.ceil(((int) Math.ceil(Math.abs(i9) * this.k)) / 0.3356d);
            if (ceil <= 0) {
                l1Var.b(0, -i9, Math.max((int) (this.o * 400.0f), ceil), this.j);
                return;
            } else {
                i();
                return;
            }
        }
        i9 = 0;
        ceil = (int) Math.ceil(((int) Math.ceil(Math.abs(i9) * this.k)) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    public n(Context context, int i9, float f10) {
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator(1.5f);
        this.l = 0;
        this.m = 0;
        this.o = f10;
        this.k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f10;
        this.n = i9;
    }

    @Override // f2.m1
    public void e() {
    }

    public void i() {
    }
}
