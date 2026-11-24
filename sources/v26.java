// default package

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class v26 extends o49 {
    public final LinearInterpolator i;
    public final DecelerateInterpolator j;
    public final float k;
    public int l;
    public int m;
    public final byte n;
    public final float o;
    public int p;

    /* JADX WARN: Multi-variable type inference failed */
    public v26(Context context, int i) {
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator(1.5f);
        this.l = 0;
        this.m = 0;
        this.o = 1.0f;
        this.k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.n = i;
    }

    @Override // o49
    public final PointF a(int i) {
        d49 d49Var = this.c;
        if (d49Var instanceof t26) {
            return ((t26) d49Var).D0(i);
        }
        return null;
    }

    @Override // o49
    public final void d(int i, int i2, n49 n49Var) {
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
                n49Var.d = this.a;
                h();
            } else {
                o49.b(a);
                this.l = (int) (a.x * 10000.0f);
                this.m = (int) (a.y * 10000.0f);
                n49Var.b((int) (this.l * 1.2f), (int) (this.m * 1.2f), (int) (((int) Math.ceil(10000.0f * this.k)) * 1.2f), this.i);
            }
        }
    }

    @Override // o49
    public final void f() {
        this.m = 0;
        this.l = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
    
        if (r0 >= 0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    @Override // o49
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, n49 n49Var) {
        int i;
        int ceil;
        d49 d49Var = this.c;
        if (d49Var != null && d49Var.e()) {
            e49 e49Var = (e49) view.getLayoutParams();
            int y = d49.y(view) - ((ViewGroup.MarginLayoutParams) e49Var).topMargin;
            int v = d49.v(view) + ((ViewGroup.MarginLayoutParams) e49Var).bottomMargin;
            int B = (d49Var.n - d49Var.B()) - d49Var.E();
            int i2 = v - y;
            byte b = this.n;
            int E = b == 2 ? d49Var.E() + this.p : i2 > B ? 0 : b == 0 ? (B - i2) / 2 : (d49Var.E() + this.p) - gl.L(88.0f);
            int i3 = i2 + E;
            i = E - y;
            if (i <= 0) {
                i = i3 - v;
            }
            ceil = (int) Math.ceil(((int) Math.ceil(Math.abs(i) * this.k)) / 0.3356d);
            if (ceil <= 0) {
                n49Var.b(0, -i, Math.max((int) (this.o * 400.0f), ceil), this.j);
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

    @Override // o49
    public void e() {
    }

    public void i() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v26(Context context, int i, float f) {
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator(1.5f);
        this.l = 0;
        this.m = 0;
        this.o = f;
        this.k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f;
        this.n = i;
    }
}
