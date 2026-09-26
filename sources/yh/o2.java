package yh;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class o2 {
    public final p2 a;
    public j1 d;
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

    public o2(p2 p2Var) {
        this.a = p2Var;
    }

    public final void a(int i10) {
        this.b.add(new n2(3, 0.0f, 0.0f, i10, -1, 0.0f, null, null));
    }

    public final void b() {
        j1 j1Var;
        boolean z10 = this.e;
        p2 p2Var = this.a;
        if (!z10) {
            int i10 = this.c;
            ArrayList arrayList = this.b;
            if (i10 < arrayList.size()) {
                n2 n2Var = (n2) arrayList.get(this.c);
                this.c++;
                int i11 = n2Var.a;
                int i12 = n2Var.e;
                float f7 = n2Var.b;
                int i13 = n2Var.d;
                int c10 = m1.j.c(i11);
                if (c10 == 0) {
                    Runnable runnable = n2Var.h;
                    if (runnable != null) {
                        runnable.run();
                    }
                    b();
                    return;
                }
                if (c10 == 1) {
                    p2Var.d = (n2Var.c * 0.01f) + p2Var.d;
                    p2Var.e = (f7 * 0.01f) + p2Var.e;
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
                    System.arraycopy(p2Var.c, 0, this.h, 0, 16);
                    float f10 = n2Var.f;
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
                    this.j = p2Var.d;
                    this.k = p2Var.e;
                    return;
                }
                if (c10 != 4) {
                    if (c10 != 5) {
                        return;
                    }
                    p2Var.f = f7 > 0.0f;
                    b();
                    return;
                }
                this.l = true;
                View view = n2Var.g;
                ValueAnimator valueAnimator = p2Var.G;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    p2Var.G = null;
                }
                RectF rectF = new RectF();
                rectF.left = view.getX() - p2Var.getX();
                rectF.top = view.getY() - p2Var.getY();
                rectF.right = rectF.left + view.getWidth();
                rectF.bottom = rectF.top + view.getHeight();
                AndroidUtilities.removeFromParent(view);
                int childCount = p2Var.getChildCount();
                p2Var.addView(view, w7.y5.e(64, 64, 17));
                p2Var.v.add(Integer.valueOf(i12));
                p2Var.w.put(Integer.valueOf(childCount), Integer.valueOf(i12));
                p2Var.x.put(Integer.valueOf(childCount), rectF);
                p2Var.F = childCount;
                p2Var.E = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                p2Var.G = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(p2Var, 22));
                p2Var.G.addListener(new pg.d0(p2Var, 10));
                p2Var.G.setDuration(i13 * 16);
                p2Var.G.setInterpolator(rr.h);
                p2Var.G.start();
                return;
            }
        }
        p2Var.H = null;
        if (this.e || (j1Var = this.d) == null) {
            return;
        }
        j1Var.run();
    }

    public final void c(float f7, float f10) {
        this.b.add(new n2(2, f7, f10, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        this.b.add(new n2(6, z10 ? 1.0f : -1.0f, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(v2 v2Var, int i10, float f7) {
        this.b.add(new n2(5, 0.0f, 0.0f, 32, i10, f7, v2Var, null));
    }
}
