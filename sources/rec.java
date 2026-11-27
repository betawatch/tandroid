// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class rec extends Drawable {
    public static final int[] r = {10, 7, 26, 16, 10, 25};
    public final Paint a;
    public final TextPaint b;
    public final Path c;
    public boolean d;
    public final boolean e;
    public Path f;
    public int g;
    public float h;
    public float i;
    public boolean j;
    public boolean k;
    public boolean l;
    public long m;
    public qec n;
    public long o;
    public String p;
    public float q;

    public rec(boolean z) {
        Paint paint = new Paint(1);
        this.a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        Path path = new Path();
        this.c = path;
        this.q = 1.0f;
        this.e = z;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(hl.L(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        int i = 0;
        while (true) {
            Path path2 = this.c;
            if (i >= 3) {
                path2.close();
                return;
            }
            int[] iArr = r;
            int i2 = i << 1;
            if (i == 0) {
                path2.moveTo(hl.L(iArr[i2]), hl.L(iArr[i2 + 1]));
            } else {
                path2.lineTo(hl.L(iArr[i2]), hl.L(iArr[i2 + 1]));
            }
            i++;
        }
    }

    public final void a() {
        qec qecVar = this.n;
        if (qecVar != null) {
            qecVar.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final void b(boolean z) {
        boolean z2 = this.d;
        if (z2 == z && this.h >= 1.0f && this.k) {
            return;
        }
        if (z2 != z) {
            this.o = 0L;
            this.p = null;
        }
        this.d = z;
        this.j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    public final void c(boolean z) {
        if (this.k != z) {
            this.k = z;
            this.p = null;
            this.o = 0L;
            this.h = 0.0f;
        }
    }

    public final void d(boolean z) {
        this.l = z;
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int width = ((bounds.width() - hl.L(32.0f)) / 2) + bounds.left;
        int height = ((bounds.height() - hl.L(32.0f)) / 2) + bounds.top;
        int f = this.d ? uh9.f(16.0f, bounds.width() / 4, width) : uh9.w(16.0f, bounds.width() / 4, width);
        canvas.save();
        if (this.e) {
            Path path = this.f;
            if (path == null) {
                path = new Path();
                this.f = path;
            }
            int i = bounds.left + (bounds.top << 8) + (bounds.bottom << 16) + (bounds.right << 24);
            if (this.g != i) {
                path.reset();
                RectF rectF = hl.P;
                rectF.set(bounds);
                this.f.addOval(rectF, Path.Direction.CCW);
                this.g = i;
            }
            canvas.clipPath(this.f);
        } else {
            canvas.clipRect(bounds.left, bounds.top, bounds.right, bounds.bottom);
        }
        boolean z = this.k;
        TextPaint textPaint = this.b;
        Paint paint = this.a;
        if (z) {
            float f2 = this.h;
            if (f2 <= 0.7f) {
                paint.setAlpha((int) (Math.min(1.0f, f2 / 0.3f) * 80.0f));
                textPaint.setAlpha((int) (Math.min(1.0f, this.h / 0.3f) * 255.0f));
            } else {
                paint.setAlpha((int) ((1.0f - ((f2 - 0.7f) / 0.3f)) * 80.0f));
                textPaint.setAlpha((int) ((1.0f - ((this.h - 0.7f) / 0.3f)) * 255.0f));
            }
        } else {
            paint.setAlpha((int) (this.i * 80.0f));
            textPaint.setAlpha((int) (this.i * 255.0f));
        }
        canvas.drawCircle(((Math.max(bounds.width(), bounds.height()) / 4) * (this.d ? -1 : 1)) + f, hl.L(16.0f) + height, Math.max(bounds.width(), bounds.height()) / 2, paint);
        canvas.restore();
        String str = this.p;
        if (str != null) {
            canvas.drawText(str, (hl.L(32.0f) * (this.d ? -1 : 1)) + f, hl.L(15.0f) + hl.L(32.0f) + height, textPaint);
        }
        canvas.save();
        float f3 = this.q;
        float f4 = f;
        float f5 = height;
        canvas.scale(f3, f3, f4, (hl.L(32.0f) / 2.0f) + f5);
        if (this.d) {
            canvas.rotate(180.0f, f4, (hl.L(32.0f) / 2) + height);
        }
        canvas.translate(f4, f5);
        float f6 = this.h;
        Path path2 = this.c;
        if (f6 <= 0.6f) {
            int min = f6 < 0.4f ? Math.min(jn7.d4, (int) ((f6 * 255.0f) / 0.2f)) : (int) ((1.0f - ((f6 - 0.4f) / 0.2f)) * 255.0f);
            if (!this.k) {
                min = (int) (min * this.i);
            }
            paint.setAlpha(min);
            canvas.drawPath(path2, paint);
        }
        canvas.translate(hl.L(18.0f), 0.0f);
        float f7 = this.h;
        if (f7 >= 0.2f && f7 <= 0.8f) {
            float f8 = f7 - 0.2f;
            int min2 = f8 < 0.4f ? Math.min(jn7.d4, (int) ((f8 * 255.0f) / 0.2f)) : (int) ((1.0f - ((f8 - 0.4f) / 0.2f)) * 255.0f);
            if (!this.k) {
                min2 = (int) (min2 * this.i);
            }
            paint.setAlpha(min2);
            canvas.drawPath(path2, paint);
        }
        canvas.translate(hl.L(18.0f), 0.0f);
        float f9 = this.h;
        if (f9 >= 0.4f && f9 <= 1.0f) {
            float f10 = f9 - 0.4f;
            int min3 = f10 < 0.4f ? Math.min(jn7.d4, (int) ((f10 * 255.0f) / 0.2f)) : (int) ((1.0f - ((f10 - 0.4f) / 0.2f)) * 255.0f);
            if (!this.k) {
                min3 = (int) (min3 * this.i);
            }
            paint.setAlpha(min3);
            canvas.drawPath(path2, paint);
        }
        canvas.restore();
        if (this.j) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.m;
            if (j > 17) {
                j = 17;
            }
            this.m = currentTimeMillis;
            float f11 = this.h;
            if (f11 < 1.0f) {
                float f12 = (j / 800.0f) + f11;
                this.h = f12;
                if (this.k) {
                    if (f12 >= 1.0f) {
                        this.h = 0.0f;
                        this.j = false;
                        this.o = 0L;
                        this.p = null;
                    }
                } else if (f12 >= 1.0f) {
                    if (this.l) {
                        this.h = 0.0f;
                    } else {
                        this.h = 1.0f;
                    }
                }
                a();
            }
            if (this.k) {
                return;
            }
            boolean z2 = this.l;
            float f13 = this.i;
            if (z2) {
                if (f13 != 1.0f) {
                    this.i = f13 + 0.10666667f;
                    a();
                }
            } else if (f13 != 0.0f) {
                this.i = f13 - 0.10666667f;
                a();
            }
            float f14 = this.i;
            if (f14 < 0.0f) {
                this.i = 0.0f;
            } else if (f14 > 1.0f) {
                this.i = 1.0f;
            }
        }
    }

    public final void e(long j) {
        this.o = j;
        if (j >= 1000) {
            this.p = ob6.G((int) (j / 1000), "Seconds", new Object[0]);
        } else {
            this.p = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return hl.L(32.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return hl.L(32.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return hl.L(32.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return hl.L(32.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
