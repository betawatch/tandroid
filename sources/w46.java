// default package

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class w46 extends q69 {
    public final LinearInterpolator i;
    public final DecelerateInterpolator j;
    public final float k;
    public int l;
    public int m;
    public final byte n;
    public final float o;
    public int p;

    /* JADX WARN: Multi-variable type inference failed */
    public w46(Context context, int i) {
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator(1.5f);
        this.l = 0;
        this.m = 0;
        this.o = 1.0f;
        this.k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.n = i;
    }

    @Override // q69
    public final PointF a(int i) {
        f69 f69Var = this.c;
        if (f69Var instanceof u46) {
            return ((u46) f69Var).D0(i);
        }
        return null;
    }

    @Override // q69
    public final void d(int i, int i2, p69 p69Var) {
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
                p69Var.d = this.a;
                h();
            } else {
                q69.b(a);
                this.l = (int) (a.x * 10000.0f);
                this.m = (int) (a.y * 10000.0f);
                p69Var.b((int) (this.l * 1.2f), (int) (this.m * 1.2f), (int) (((int) Math.ceil(10000.0f * this.k)) * 1.2f), this.i);
            }
        }
    }

    @Override // q69
    public final void f() {
        this.m = 0;
        this.l = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
    
        if (r0 >= 0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    @Override // q69
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, p69 p69Var) {
        int i;
        int ceil;
        f69 f69Var = this.c;
        if (f69Var != null && f69Var.e()) {
            g69 g69Var = (g69) view.getLayoutParams();
            int y = f69.y(view) - ((ViewGroup.MarginLayoutParams) g69Var).topMargin;
            int v = f69.v(view) + ((ViewGroup.MarginLayoutParams) g69Var).bottomMargin;
            int B = (f69Var.n - f69Var.B()) - f69Var.E();
            int i2 = v - y;
            byte b = this.n;
            int E = b == 2 ? f69Var.E() + this.p : i2 > B ? 0 : b == 0 ? (B - i2) / 2 : (f69Var.E() + this.p) - gm.L(88.0f);
            int i3 = i2 + E;
            i = E - y;
            if (i <= 0) {
                i = i3 - v;
            }
            ceil = (int) Math.ceil(((int) Math.ceil(Math.abs(i) * this.k)) / 0.3356d);
            if (ceil <= 0) {
                p69Var.b(0, -i, Math.max((int) (this.o * 400.0f), ceil), this.j);
                return;
            } else {
                i();
                return;
            }
        }
        i = 0;
        ceil = (int) Math.ceil(((int) Math.ceil(Math.abs(i) * this.k)) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    @Override // q69
    public void e() {
    }

    public void i() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w46(Context context, int i, float f) {
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator(1.5f);
        this.l = 0;
        this.m = 0;
        this.o = f;
        this.k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f;
        this.n = i;
    }
}
