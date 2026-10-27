package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ss0 extends s4.a1 {
    public final float k;
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator(1.5f);
    public int l = 0;
    public int m = 0;

    public ss0(Context context) {
        this.k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override // s4.a1
    public final PointF a(int i10) {
        s4.p0 p0Var = this.c;
        if (p0Var instanceof s4.c0) {
            return ((s4.c0) p0Var).E0(i10);
        }
        return null;
    }

    @Override // s4.a1
    public final void d(int i10, int i11, s4.z0 z0Var) {
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
                z0Var.d = this.a;
                h();
            } else {
                s4.a1.b(a2);
                this.l = (int) (a2.x * 10000.0f);
                this.m = (int) (a2.y * 10000.0f);
                z0Var.b((int) (this.l * 1.2f), (int) (this.m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.k)) * 1.2f), this.i);
            }
        }
    }

    @Override // s4.a1
    public final void f() {
        this.m = 0;
        this.l = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        if (r4 < 0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // s4.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, s4.z0 z0Var) {
        int i10;
        int max;
        s4.p0 p0Var = this.c;
        if (p0Var != null && p0Var.d()) {
            s4.q0 q0Var = (s4.q0) view.getLayoutParams();
            int x9 = s4.p0.x(view) - ((ViewGroup.MarginLayoutParams) q0Var).leftMargin;
            int y3 = s4.p0.y(view) + ((ViewGroup.MarginLayoutParams) q0Var).rightMargin;
            int D = p0Var.D();
            int E = p0Var.m - p0Var.E();
            if (x9 <= D || y3 >= E) {
                int i11 = y3 - x9;
                int i12 = (E - D) - i11;
                int i13 = i11 + i12;
                i10 = i12 - x9;
                if (i10 <= 0) {
                    i10 = i13 - y3;
                }
                max = Math.max(180, (int) Math.ceil(((int) Math.ceil(Math.abs(i10) * this.k)) / 0.3356d));
                if (max <= 0) {
                    z0Var.b(-i10, 0, Math.max(400, max), this.j);
                    return;
                }
                return;
            }
        }
        i10 = 0;
        max = Math.max(180, (int) Math.ceil(((int) Math.ceil(Math.abs(i10) * this.k)) / 0.3356d));
        if (max <= 0) {
        }
    }

    @Override // s4.a1
    public final void e() {
    }
}
