// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ps8 implements mz4, kl0, wy4 {
    public final os8 a;
    public final Paint b = new Paint(1);
    public final Paint c = new Paint();
    public RadialGradient d;
    public int e;
    public float f;
    public final /* synthetic */ qs8 h;

    public ps8(qs8 qs8Var, os8 os8Var) {
        this.h = qs8Var;
        this.a = os8Var;
    }

    @Override // wy4
    public final int a() {
        return j().a();
    }

    @Override // kl0
    public final jl0 b() {
        return new jl0(this, this, this);
    }

    @Override // wy4
    public final void d(float f, float f2, int i, Canvas canvas, RectF rectF) {
        float f3;
        int i2;
        Canvas canvas2;
        RectF rectF2;
        qs8 qs8Var = this.h;
        os8 os8Var = this.a;
        float f4 = os8Var != null ? qs8Var.l : 0.0f;
        if (f4 < 1.0f) {
            iy4 iy4Var = qs8Var.b;
            if (iy4Var == null) {
                iy4Var = null;
            }
            iy4Var.d(f, f2, i, canvas, rectF);
            i2 = i;
            canvas2 = canvas;
            rectF2 = rectF;
            float f5 = 1.0f - qs8Var.k;
            if (f5 > 0.0f) {
                canvas2.save();
                float f6 = 1.0f / i2;
                canvas2.scale(f6, f6);
                f3 = f;
                canvas2.translate(-f3, -f2);
                i(canvas2, rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, f5, i2 << 1);
                canvas2.restore();
            } else {
                f3 = f;
            }
        } else {
            f3 = f;
            i2 = i;
            canvas2 = canvas;
            rectF2 = rectF;
        }
        if (f4 > 0.0f) {
            if (f4 < 1.0f) {
                canvas2.saveLayerAlpha(null, (int) (f4 * 255.0f));
            }
            (ik8.A(os8Var) ? os8Var : null).d(f3, f2, i2, canvas2, rectF2);
            if (f4 < 1.0f) {
                canvas.restore();
            }
        }
    }

    @Override // mz4
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        os8 os8Var = this.a;
        qs8 qs8Var = this.h;
        float f5 = os8Var != null ? qs8Var.l : 0.0f;
        if (f5 < 1.0f) {
            if (qs8Var.b == null || !canvas.isHardwareAccelerated()) {
                float f6 = qs8Var.k;
                if (f6 > 0.0f) {
                    int p1 = aob.p1(f6 * 0.5f, -16777216);
                    Paint paint = this.c;
                    paint.setColor(p1);
                    canvas.drawRect(f, f2, f3, f4, paint);
                }
            } else {
                qs8Var.b.e(f, f2, f3, f4, canvas);
            }
            float f7 = 1.0f - qs8Var.k;
            if (f7 > 0.0f) {
                i(canvas, f, f2, f3, f4, f7, 0.0f);
            }
        }
        if (f5 > 0.0f) {
            if (f5 < 1.0f) {
                canvas.saveLayerAlpha(f, f2, f3, f4, (int) (f5 * 255.0f));
            }
            this.a.e(f, f2, f3, f4, canvas);
            if (f5 < 1.0f) {
                canvas.restore();
            }
        }
    }

    @Override // wy4
    public final int f() {
        return j().f();
    }

    @Override // wy4
    public final int g() {
        return j().g();
    }

    @Override // wy4
    public final boolean h() {
        iy4 iy4Var = this.h.b;
        if (iy4Var == null) {
            iy4Var = null;
        }
        os8 os8Var = this.a;
        os8 os8Var2 = ik8.A(os8Var) ? os8Var : null;
        if (iy4Var == null || iy4Var.f() <= 1) {
            return false;
        }
        return os8Var == null || (os8Var2 != null && os8Var2.h());
    }

    public final void i(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6) {
        qs8 qs8Var = this.h;
        boolean z = qs8Var.j;
        Paint paint = this.b;
        if (!z) {
            paint.setShader(null);
            paint.setColor(aob.p1(f5, qs8Var.i));
            canvas.drawRect(f - f6, f2 - f6, f3 + f6, f4 + f6, paint);
            return;
        }
        float f7 = f3 - f;
        float max = Math.max(1.0f, 0.65f * f7);
        if (this.d == null || this.e != qs8Var.i || this.f != max) {
            this.e = qs8Var.i;
            this.f = max;
            this.d = new RadialGradient(0.0f, 0.0f, max, aob.p1(0.8f, qs8Var.i), qs8Var.i, Shader.TileMode.CLAMP);
        }
        canvas.save();
        canvas.translate((f + f3) / 2.0f, (f2 + f4) / 2.0f);
        paint.setShader(this.d);
        paint.setColor(-16777216);
        paint.setAlpha((int) (255.0f * f5));
        canvas.drawRect(((f - f3) / 2.0f) - f6, ((f2 - f4) / 2.0f) - f6, (f7 / 2.0f) + f6, bp1.z(f4, f2, 2.0f, f6), paint);
        canvas.restore();
    }

    public final wy4 j() {
        iy4 iy4Var = this.h.b;
        if (iy4Var == null) {
            iy4Var = null;
        }
        os8 os8Var = this.a;
        os8 os8Var2 = ik8.A(os8Var) ? os8Var : null;
        return (os8Var2 == null || iy4Var.f() < os8Var2.f()) ? iy4Var : os8Var2;
    }

    @Override // kl0
    public final void c(jl0 jl0Var) {
    }
}
