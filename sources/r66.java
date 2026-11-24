// default package

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class r66 extends Drawable {
    public static final float[][] h = {new float[]{7.0f, 9.5f, 10.25f}, new float[]{12.0f, 17.0f, 10.25f}, new float[]{7.0f, 13.0f, 13.75f}, new float[]{15.5f, 17.0f, 13.75f}};
    public final Paint a;
    public final Paint b;
    public final RectF c;
    public float d;
    public boolean e;
    public ValueAnimator f;
    public int g;

    public r66(boolean z) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.c = new RectF();
        this.g = kk7.d4;
        this.e = z;
        this.d = z ? 1.0f : 0.0f;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z, boolean z2) {
        if (this.e == z) {
            if (this.f != null) {
                return;
            }
            if (this.d == (z ? 1.0f : 0.0f)) {
                return;
            }
        }
        this.e = z;
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f = null;
        }
        if (!z2) {
            this.d = z ? 1.0f : 0.0f;
            invalidateSelf();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d, z ? 1.0f : 0.0f);
        this.f = ofFloat;
        ofFloat.setDuration(z ? 420L : 340L);
        this.f.setInterpolator(s33.h);
        this.f.addUpdateListener(new ni4(this, (byte) 17));
        this.f.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c6  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float f;
        Paint paint;
        Rect bounds = getBounds();
        float min = Math.min(bounds.width(), bounds.height()) / 24.0f;
        float L = gl.L(1.33f);
        Paint paint2 = this.a;
        paint2.setStrokeWidth(L);
        paint2.setAlpha(this.g);
        Paint paint3 = this.b;
        paint3.setStrokeWidth(1.5f * L);
        Canvas canvas3 = canvas;
        int saveLayerAlpha = canvas3.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, kk7.d4);
        float f2 = 12.0f * min;
        canvas3.translate(bounds.centerX() - f2, bounds.centerY() - f2);
        boolean z = this.e;
        float f3 = this.d;
        if (!z) {
            f3 = 1.0f - f3;
        }
        float sin = 1.0f - ((((float) Math.sin(f3 * 3.141592653589793d)) * 0.1f) * ((f3 >= 1.0f || f3 <= 0.0f) ? 0.0f : 1.0f));
        canvas3.save();
        canvas3.scale(sin, sin, f2, f2);
        float f4 = 3.5f * min;
        RectF rectF = this.c;
        rectF.set(f4, 5.5f * min, 20.5f * min, 18.5f * min);
        canvas3.drawRoundRect(rectF, f4, f4, paint2);
        int i = 0;
        while (i < 4) {
            float[] fArr = h[i];
            if (this.e) {
                float f5 = this.d;
                if (f5 < 1.0f) {
                    f = Math.max(0.0f, Math.min(1.0f, (f5 - (i * 0.12f)) / 0.5f));
                    if (f > 0.0f) {
                        paint = paint2;
                    } else {
                        float f6 = fArr[0];
                        float A = tb4.A(fArr[1], f6, f, f6);
                        float f7 = fArr[2] * min;
                        paint = paint2;
                        canvas3.drawLine(f6 * min, f7, A * min, f7, paint);
                    }
                    i++;
                    canvas3 = canvas;
                    paint2 = paint;
                }
            }
            f = 1.0f;
            if (f > 0.0f) {
            }
            i++;
            canvas3 = canvas;
            paint2 = paint;
        }
        Paint paint4 = paint2;
        canvas.restore();
        float f8 = 1.0f - this.d;
        if (f8 > 0.0f) {
            float f9 = min * 3.75f;
            float w = b00.w(min, 16.5f, f8, f9);
            float f10 = L * 0.8f;
            canvas.drawLine(f9 + f10, f9 - f10, w + f10, w - f10, paint3);
            canvas.drawLine(f9, f9, w, w, paint4);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
        }
        canvas2.restoreToCount(saveLayerAlpha);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return gl.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return gl.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.g = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
