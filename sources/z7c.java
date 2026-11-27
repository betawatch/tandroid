// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.view.animation.DecelerateInterpolator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class z7c extends d2b {
    public final int a = yac.t0;
    public boolean b = false;
    public final float[] c = new float[3];
    public final float[] d = {0.0f, 150.0f, 300.0f};
    public final float[] e = {0.0f, 0.0f, 0.0f};
    public long f = 0;
    public boolean g = false;
    public final DecelerateInterpolator h = new DecelerateInterpolator();
    public boolean i;
    public final Paint j;

    public z7c(boolean z) {
        if (z) {
            this.j = new Paint(1);
        }
    }

    @Override // d2b
    public final void b(int i) {
        Paint paint = this.j;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    @Override // d2b
    public final void c(boolean z) {
        this.b = z;
    }

    @Override // d2b
    public final void d() {
        this.f = System.currentTimeMillis();
        this.g = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int L;
        int i;
        int i2 = getBounds().left;
        if (this.b) {
            L = hl.L(8.5f);
            i = getBounds().top;
        } else {
            L = hl.L(9.3f);
            i = getBounds().top;
        }
        int i3 = L + i;
        Paint paint = this.j;
        if (paint == null) {
            paint = aob.c2;
            paint.setAlpha(jn7.d4);
        }
        float L2 = hl.L(3.0f) + i2;
        float f = i3;
        float[] fArr = this.c;
        canvas.drawCircle(L2, f, fArr[0] * hl.p, paint);
        canvas.drawCircle(hl.L(9.0f) + i2, f, fArr[1] * hl.p, paint);
        canvas.drawCircle(hl.L(15.0f) + i2, f, fArr[2] * hl.p, paint);
        f();
    }

    @Override // d2b
    public final void e() {
        for (int i = 0; i < 3; i++) {
            this.e[i] = 0.0f;
            this.c[i] = 1.33f;
        }
        float[] fArr = this.d;
        fArr[0] = 0.0f;
        fArr[1] = 150.0f;
        fArr[2] = 300.0f;
        this.g = false;
    }

    public final void f() {
        if (this.g) {
            if (jn7.f(this.a).g() && !this.i) {
                hl.d3(new azb(this, (byte) 6), 100L);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.f;
            this.f = currentTimeMillis;
            if (j > 50) {
                j = 50;
            }
            for (int i = 0; i < 3; i++) {
                float[] fArr = this.e;
                float f = fArr[i] + j;
                fArr[i] = f;
                float[] fArr2 = this.d;
                float f2 = f - fArr2[i];
                float[] fArr3 = this.c;
                if (f2 > 0.0f) {
                    DecelerateInterpolator decelerateInterpolator = this.h;
                    if (f2 <= 320.0f) {
                        fArr3[i] = decelerateInterpolator.getInterpolation(f2 / 320.0f) + 1.33f;
                    } else if (f2 <= 640.0f) {
                        fArr3[i] = (1.0f - decelerateInterpolator.getInterpolation((f2 - 320.0f) / 320.0f)) + 1.33f;
                    } else if (f2 >= 800.0f) {
                        fArr[i] = 0.0f;
                        fArr2[i] = 0.0f;
                        fArr3[i] = 1.33f;
                    } else {
                        fArr3[i] = 1.33f;
                    }
                } else {
                    fArr3[i] = 1.33f;
                }
            }
            a();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return hl.L(18.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return hl.L(18.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.j;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }
}
