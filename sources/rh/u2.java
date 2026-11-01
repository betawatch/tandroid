package rh;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Components.gr;
import org.telegram.ui.ms0;
import org.telegram.ui.ox0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class u2 {
    public final v2 a;
    public ox0 d;
    public int f;
    public int g;
    public float j;
    public float k;
    public final ArrayList b = new ArrayList();
    public int c = 0;
    public boolean e = false;
    public final float[] h = new float[16];
    public float[] i = new float[16];
    public boolean l = false;

    public u2(v2 v2Var) {
        this.a = v2Var;
    }

    public final void a(int i10) {
        this.b.add(new t2(3, 0.0f, 0.0f, i10, -1, 0.0f, null, null));
    }

    public final void b() {
        ox0 ox0Var;
        boolean z10 = this.e;
        v2 v2Var = this.a;
        if (!z10) {
            int i10 = this.c;
            ArrayList arrayList = this.b;
            if (i10 < arrayList.size()) {
                t2 t2Var = (t2) arrayList.get(this.c);
                this.c++;
                int i11 = t2Var.a;
                int i12 = t2Var.e;
                float f7 = t2Var.b;
                int i13 = t2Var.d;
                int c10 = m1.j.c(i11);
                if (c10 == 0) {
                    Runnable runnable = t2Var.h;
                    if (runnable != null) {
                        runnable.run();
                    }
                    b();
                    return;
                }
                if (c10 == 1) {
                    v2Var.d = (t2Var.c * 0.01f) + v2Var.d;
                    v2Var.e = (f7 * 0.01f) + v2Var.e;
                    this.f = 1;
                    this.g = 1;
                    return;
                }
                if (c10 == 2) {
                    this.f = i13;
                    this.g = i13;
                    return;
                }
                int i14 = 3;
                if (c10 == 3) {
                    System.arraycopy(v2Var.c, 0, this.h, 0, 16);
                    float f10 = t2Var.f;
                    float[] fArr = new float[16];
                    Matrix.setIdentityM(fArr, 0);
                    if (f10 != 0.0f) {
                        Matrix.rotateM(fArr, 0, -f10, 0.0f, 0.0f, 1.0f);
                    }
                    if (i12 == 0) {
                        Matrix.rotateM(fArr, 0, 90.0f, 0.0f, 1.0f, 0.0f);
                    } else if (i12 == 1) {
                        Matrix.rotateM(fArr, 0, -90.0f, 0.0f, 1.0f, 0.0f);
                    } else if (i12 == 2) {
                        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
                    } else if (i12 == 3) {
                        Matrix.rotateM(fArr, 0, -90.0f, 1.0f, 0.0f, 0.0f);
                    } else if (i12 == 4) {
                        Matrix.rotateM(fArr, 0, 180.0f, 0.0f, 1.0f, 0.0f);
                    }
                    this.i = fArr;
                    this.g = i13;
                    this.f = i13;
                    this.j = v2Var.d;
                    this.k = v2Var.e;
                    return;
                }
                if (c10 != 4) {
                    if (c10 != 5) {
                        return;
                    }
                    v2Var.f = f7 > 0.0f;
                    b();
                    return;
                }
                this.l = true;
                View view = t2Var.g;
                ValueAnimator valueAnimator = v2Var.G;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    v2Var.G = null;
                }
                RectF rectF = new RectF();
                rectF.left = view.getX() - v2Var.getX();
                rectF.top = view.getY() - v2Var.getY();
                rectF.right = rectF.left + view.getWidth();
                rectF.bottom = rectF.top + view.getHeight();
                org.telegram.messenger.i0.E2(view);
                int childCount = v2Var.getChildCount();
                v2Var.addView(view, w7.b6.e(64, 64, 17));
                v2Var.w.add(Integer.valueOf(i12));
                v2Var.x.put(Integer.valueOf(childCount), Integer.valueOf(i12));
                v2Var.y.put(Integer.valueOf(childCount), rectF);
                v2Var.F = childCount;
                v2Var.E = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                v2Var.G = ofFloat;
                ofFloat.addUpdateListener(new qh.e0(v2Var, i14));
                v2Var.G.addListener(new ms0(v2Var, 26));
                v2Var.G.setDuration(i13 * 16);
                v2Var.G.setInterpolator(gr.h);
                v2Var.G.start();
                return;
            }
        }
        v2Var.H = null;
        if (this.e || (ox0Var = this.d) == null) {
            return;
        }
        ox0Var.run();
    }

    public final void c(float f7, float f10) {
        this.b.add(new t2(2, f7, f10, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        this.b.add(new t2(6, z10 ? 1.0f : -1.0f, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(z2 z2Var, int i10, float f7) {
        this.b.add(new t2(5, 0.0f, 0.0f, 32, i10, f7, z2Var, null));
    }
}
