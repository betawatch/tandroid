// default package

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ota {
    public final pta a;
    public kta d;
    public int f;
    public byte g;
    public float j;
    public float k;
    public final ArrayList b = new ArrayList();
    public int c = 0;
    public boolean e = false;
    public final float[] h = new float[16];
    public float[] i = new float[16];
    public boolean l = false;

    public ota(pta ptaVar) {
        this.a = ptaVar;
    }

    public final void a(int i) {
        this.b.add(new nta(3, 0.0f, 0.0f, i, -1, 0.0f, null, null));
    }

    public final void b() {
        kta ktaVar;
        boolean z = this.e;
        pta ptaVar = this.a;
        if (!z) {
            int i = this.c;
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                nta ntaVar = (nta) arrayList.get(this.c);
                this.c++;
                int i2 = ntaVar.a;
                int i3 = ntaVar.e;
                float f = ntaVar.b;
                byte b = ntaVar.d;
                int F = ik8.F(i2);
                if (F == 0) {
                    a39 a39Var = ntaVar.h;
                    if (a39Var != null) {
                        a39Var.run();
                    }
                    b();
                    return;
                }
                if (F == 1) {
                    ptaVar.d = (ntaVar.c * 0.01f) + ptaVar.d;
                    ptaVar.e = (f * 0.01f) + ptaVar.e;
                    this.f = 1;
                    this.g = (byte) 1;
                    return;
                }
                if (F == 2) {
                    this.f = b;
                    this.g = b;
                    return;
                }
                if (F == 3) {
                    System.arraycopy(ptaVar.c, 0, this.h, 0, 16);
                    float f2 = ntaVar.f;
                    float[] fArr = new float[16];
                    Matrix.setIdentityM(fArr, 0);
                    if (f2 != 0.0f) {
                        Matrix.rotateM(fArr, 0, -f2, 0.0f, 0.0f, 1.0f);
                    }
                    if (i3 == 0) {
                        Matrix.rotateM(fArr, 0, 90.0f, 0.0f, 1.0f, 0.0f);
                    } else if (i3 == 1) {
                        Matrix.rotateM(fArr, 0, -90.0f, 0.0f, 1.0f, 0.0f);
                    } else if (i3 == 2) {
                        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
                    } else if (i3 == 3) {
                        Matrix.rotateM(fArr, 0, -90.0f, 1.0f, 0.0f, 0.0f);
                    } else if (i3 == 4) {
                        Matrix.rotateM(fArr, 0, 180.0f, 0.0f, 1.0f, 0.0f);
                    }
                    this.i = fArr;
                    this.g = b;
                    this.f = b;
                    this.j = ptaVar.d;
                    this.k = ptaVar.e;
                    return;
                }
                byte b2 = 5;
                if (F != 4) {
                    if (F == 5) {
                        ptaVar.f = f > 0.0f;
                        b();
                        return;
                    }
                    return;
                }
                this.l = true;
                tta ttaVar = ntaVar.g;
                int i4 = pta.K;
                ValueAnimator valueAnimator = ptaVar.H;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    ptaVar.H = null;
                }
                RectF rectF = new RectF();
                rectF.left = ttaVar.getX() - ptaVar.getX();
                rectF.top = ttaVar.getY() - ptaVar.getY();
                rectF.right = rectF.left + ttaVar.getWidth();
                rectF.bottom = rectF.top + ttaVar.getHeight();
                hl.B2(ttaVar);
                int childCount = ptaVar.getChildCount();
                ptaVar.addView(ttaVar, tre.e(64, 64, 17));
                ptaVar.w.add(Integer.valueOf(i3));
                ptaVar.x.put(Integer.valueOf(childCount), Integer.valueOf(i3));
                ptaVar.y.put(Integer.valueOf(childCount), rectF);
                ptaVar.G = childCount;
                ptaVar.F = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ptaVar.H = ofFloat;
                ofFloat.addUpdateListener(new ija(ptaVar, b2));
                ptaVar.H.addListener(new po9(ptaVar, (byte) 18));
                ptaVar.H.setDuration(b << 4);
                ptaVar.H.setInterpolator(k43.h);
                ptaVar.H.start();
                return;
            }
        }
        ptaVar.I = null;
        if (this.e || (ktaVar = this.d) == null) {
            return;
        }
        ktaVar.run();
    }

    public final void c(float f, float f2) {
        this.b.add(new nta(2, f, f2, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z) {
        this.b.add(new nta(6, z ? 1.0f : -1.0f, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(tta ttaVar, int i, float f) {
        this.b.add(new nta(5, 0.0f, 0.0f, 32, i, f, ttaVar, null));
    }
}
