package pi;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.g0;
import v4.a1;
import v4.b1;
import v4.c0;
import v4.p0;
import v4.q0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public class l extends b1 {
    public final LinearInterpolator i;
    public final DecelerateInterpolator j;
    public final float k;
    public int l;
    public int m;
    public final int n;
    public final float o;
    public int p;

    public l(Context context, int i7) {
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator(1.5f);
        this.l = 0;
        this.m = 0;
        this.o = 1.0f;
        this.k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.n = i7;
    }

    @Override // v4.b1
    public final PointF a(int i7) {
        p0 p0Var = this.c;
        if (p0Var instanceof c0) {
            return ((c0) p0Var).E0(i7);
        }
        return null;
    }

    @Override // v4.b1
    public final void d(int i7, int i10, a1 a1Var) {
        if (this.b.y.r() == 0) {
            h();
            return;
        }
        int i11 = this.l;
        int i12 = i11 - i7;
        if (i11 * i12 <= 0) {
            i12 = 0;
        }
        this.l = i12;
        int i13 = this.m;
        int i14 = i13 - i10;
        int i15 = i13 * i14 > 0 ? i14 : 0;
        this.m = i15;
        if (i12 == 0 && i15 == 0) {
            PointF a10 = a(this.a);
            if (a10 == null || (a10.x == 0.0f && a10.y == 0.0f)) {
                a1Var.d = this.a;
                h();
            } else {
                b1.b(a10);
                this.l = (int) (a10.x * 10000.0f);
                this.m = (int) (a10.y * 10000.0f);
                a1Var.b((int) (this.l * 1.2f), (int) (this.m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.k)) * 1.2f), this.i);
            }
        }
    }

    @Override // v4.b1
    public final void f() {
        this.m = 0;
        this.l = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
    
        if (r0 < 0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
    @Override // v4.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, a1 a1Var) {
        int i7;
        int ceil;
        p0 p0Var = this.c;
        if (p0Var != null && p0Var.e()) {
            q0 q0Var = (q0) view.getLayoutParams();
            int z10 = p0.z(view) - ((ViewGroup.MarginLayoutParams) q0Var).topMargin;
            int v = p0.v(view) + ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin;
            int C = (p0Var.n - p0Var.C()) - p0Var.F();
            int i10 = v - z10;
            int i11 = this.n;
            int F = i11 == 2 ? p0Var.F() + this.p : i10 > C ? 0 : i11 == 0 ? (C - i10) / 2 : (p0Var.F() + this.p) - g0.L(88.0f);
            int i12 = i10 + F;
            i7 = F - z10;
            if (i7 <= 0) {
                i7 = i12 - v;
            }
            ceil = (int) Math.ceil(((int) Math.ceil(Math.abs(i7) * this.k)) / 0.3356d);
            if (ceil <= 0) {
                a1Var.b(0, -i7, Math.max((int) (this.o * 400.0f), ceil), this.j);
                return;
            } else {
                i();
                return;
            }
        }
        i7 = 0;
        ceil = (int) Math.ceil(((int) Math.ceil(Math.abs(i7) * this.k)) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    public l(Context context, int i7, float f10) {
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator(1.5f);
        this.l = 0;
        this.m = 0;
        this.o = f10;
        this.k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f10;
        this.n = i7;
    }

    @Override // v4.b1
    public void e() {
    }

    public void i() {
    }
}
