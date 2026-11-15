package pi;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.g0;
import v4.a1;
import v4.b0;
import v4.o0;
import v4.p0;
import v4.z0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public class l extends a1 {
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

    @Override // v4.a1
    public final PointF a(int i7) {
        o0 o0Var = this.c;
        if (o0Var instanceof b0) {
            return ((b0) o0Var).E0(i7);
        }
        return null;
    }

    @Override // v4.a1
    public final void d(int i7, int i10, z0 z0Var) {
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
                z0Var.d = this.a;
                h();
            } else {
                a1.b(a10);
                this.l = (int) (a10.x * 10000.0f);
                this.m = (int) (a10.y * 10000.0f);
                z0Var.b((int) (this.l * 1.2f), (int) (this.m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.k)) * 1.2f), this.i);
            }
        }
    }

    @Override // v4.a1
    public final void f() {
        this.m = 0;
        this.l = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
    
        if (r0 < 0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
    @Override // v4.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, z0 z0Var) {
        int i7;
        int ceil;
        o0 o0Var = this.c;
        if (o0Var != null && o0Var.e()) {
            p0 p0Var = (p0) view.getLayoutParams();
            int z10 = o0.z(view) - ((ViewGroup.MarginLayoutParams) p0Var).topMargin;
            int v = o0.v(view) + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin;
            int C = (o0Var.n - o0Var.C()) - o0Var.F();
            int i10 = v - z10;
            int i11 = this.n;
            int F = i11 == 2 ? o0Var.F() + this.p : i10 > C ? 0 : i11 == 0 ? (C - i10) / 2 : (o0Var.F() + this.p) - g0.L(88.0f);
            int i12 = i10 + F;
            i7 = F - z10;
            if (i7 <= 0) {
                i7 = i12 - v;
            }
            ceil = (int) Math.ceil(((int) Math.ceil(Math.abs(i7) * this.k)) / 0.3356d);
            if (ceil <= 0) {
                z0Var.b(0, -i7, Math.max((int) (this.o * 400.0f), ceil), this.j);
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

    @Override // v4.a1
    public void e() {
    }

    public void i() {
    }
}
