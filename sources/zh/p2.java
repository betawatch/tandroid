package zh;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.oj1;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class p2 {
    public final q2 a;
    public k1 d;
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

    public p2(q2 q2Var) {
        this.a = q2Var;
    }

    public final void a(int i10) {
        this.b.add(new o2(3, 0.0f, 0.0f, i10, -1, 0.0f, null, null));
    }

    public final void b() {
        k1 k1Var;
        boolean z10 = this.e;
        q2 q2Var = this.a;
        if (!z10) {
            int i10 = this.c;
            ArrayList arrayList = this.b;
            if (i10 < arrayList.size()) {
                o2 o2Var = (o2) arrayList.get(this.c);
                this.c++;
                int i11 = o2Var.a;
                int i12 = o2Var.e;
                float f7 = o2Var.b;
                int i13 = o2Var.d;
                int c10 = m1.j.c(i11);
                if (c10 == 0) {
                    Runnable runnable = o2Var.h;
                    if (runnable != null) {
                        runnable.run();
                    }
                    b();
                    return;
                }
                if (c10 == 1) {
                    q2Var.d = (o2Var.c * 0.01f) + q2Var.d;
                    q2Var.e = (f7 * 0.01f) + q2Var.e;
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
                    System.arraycopy(q2Var.c, 0, this.h, 0, 16);
                    float f10 = o2Var.f;
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
                    this.j = q2Var.d;
                    this.k = q2Var.e;
                    return;
                }
                if (c10 != 4) {
                    if (c10 != 5) {
                        return;
                    }
                    q2Var.f = f7 > 0.0f;
                    b();
                    return;
                }
                this.l = true;
                View view = o2Var.g;
                ValueAnimator valueAnimator = q2Var.G;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    q2Var.G = null;
                }
                RectF rectF = new RectF();
                rectF.left = view.getX() - q2Var.getX();
                rectF.top = view.getY() - q2Var.getY();
                rectF.right = rectF.left + view.getWidth();
                rectF.bottom = rectF.top + view.getHeight();
                AndroidUtilities.removeFromParent(view);
                int childCount = q2Var.getChildCount();
                q2Var.addView(view, w7.x5.e(64, 64, 17));
                q2Var.v.add(Integer.valueOf(i12));
                q2Var.w.put(Integer.valueOf(childCount), Integer.valueOf(i12));
                q2Var.x.put(Integer.valueOf(childCount), rectF);
                q2Var.F = childCount;
                q2Var.E = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                q2Var.G = ofFloat;
                ofFloat.addUpdateListener(new ki.a(q2Var, 23));
                q2Var.G.addListener(new oj1(q2Var, 12));
                q2Var.G.setDuration(i13 * 16);
                q2Var.G.setInterpolator(pr.h);
                q2Var.G.start();
                return;
            }
        }
        q2Var.H = null;
        if (this.e || (k1Var = this.d) == null) {
            return;
        }
        k1Var.run();
    }

    public final void c(float f7, float f10) {
        this.b.add(new o2(2, f7, f10, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        this.b.add(new o2(6, z10 ? 1.0f : -1.0f, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(v2 v2Var, int i10, float f7) {
        this.b.add(new o2(5, 0.0f, 0.0f, 32, i10, f7, v2Var, null));
    }
}
