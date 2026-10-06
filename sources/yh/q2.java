package yh;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class q2 {
    public final r2 a;
    public z0 d;
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

    public q2(r2 r2Var) {
        this.a = r2Var;
    }

    public final void a(int i10) {
        this.b.add(new p2(3, 0.0f, 0.0f, i10, -1, 0.0f, null, null));
    }

    public final void b() {
        z0 z0Var;
        boolean z10 = this.e;
        r2 r2Var = this.a;
        if (!z10) {
            int i10 = this.c;
            ArrayList arrayList = this.b;
            if (i10 < arrayList.size()) {
                p2 p2Var = (p2) arrayList.get(this.c);
                this.c++;
                int i11 = p2Var.a;
                int i12 = p2Var.e;
                float f7 = p2Var.b;
                int i13 = p2Var.d;
                int c10 = m1.j.c(i11);
                if (c10 == 0) {
                    Runnable runnable = p2Var.h;
                    if (runnable != null) {
                        runnable.run();
                    }
                    b();
                    return;
                }
                if (c10 == 1) {
                    r2Var.d = (p2Var.c * 0.01f) + r2Var.d;
                    r2Var.e = (f7 * 0.01f) + r2Var.e;
                    this.f = 1;
                    this.g = 1;
                    return;
                }
                if (c10 == 2) {
                    this.f = i13;
                    this.g = i13;
                    return;
                }
                if (c10 == 3) {
                    System.arraycopy(r2Var.c, 0, this.h, 0, 16);
                    float f10 = p2Var.f;
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
                    this.j = r2Var.d;
                    this.k = r2Var.e;
                    return;
                }
                if (c10 != 4) {
                    if (c10 != 5) {
                        return;
                    }
                    r2Var.f = f7 > 0.0f;
                    b();
                    return;
                }
                this.l = true;
                View view = p2Var.g;
                ValueAnimator valueAnimator = r2Var.G;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    r2Var.G = null;
                }
                RectF rectF = new RectF();
                rectF.left = view.getX() - r2Var.getX();
                rectF.top = view.getY() - r2Var.getY();
                rectF.right = rectF.left + view.getWidth();
                rectF.bottom = rectF.top + view.getHeight();
                AndroidUtilities.removeFromParent(view);
                int childCount = r2Var.getChildCount();
                r2Var.addView(view, w7.z5.e(64, 64, 17));
                r2Var.v.add(Integer.valueOf(i12));
                r2Var.w.put(Integer.valueOf(childCount), Integer.valueOf(i12));
                r2Var.x.put(Integer.valueOf(childCount), rectF);
                r2Var.F = childCount;
                r2Var.E = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                r2Var.G = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(r2Var, 22));
                r2Var.G.addListener(new pg.d0(r2Var, 10));
                r2Var.G.setDuration(i13 * 16);
                r2Var.G.setInterpolator(tr.h);
                r2Var.G.start();
                return;
            }
        }
        r2Var.H = null;
        if (this.e || (z0Var = this.d) == null) {
            return;
        }
        z0Var.run();
    }

    public final void c(float f7, float f10) {
        this.b.add(new p2(2, f7, f10, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        this.b.add(new p2(6, z10 ? 1.0f : -1.0f, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(w2 w2Var, int i10, float f7) {
        this.b.add(new p2(5, 0.0f, 0.0f, 32, i10, f7, w2Var, null));
    }
}
