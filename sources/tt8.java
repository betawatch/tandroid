// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class tt8 extends Drawable {
    public final Drawable a;
    public final Drawable b;
    public final Paint c;
    public final RectF d;
    public int e;
    public long f;
    public float g;
    public boolean h;
    public boolean i;

    public tt8(Context context) {
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new RectF();
        this.e = 0;
        this.a = b00.d(context, R.drawable.outline_shield_plain_24);
        this.b = b00.d(context, R.drawable.outline_shield_check);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.L(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f = SystemClock.elapsedRealtime();
    }

    public final void a(Drawable drawable) {
        Rect bounds = getBounds();
        drawable.setBounds(oo1.A(2, bounds.centerX(), drawable), oo1.y(2, bounds.centerY(), drawable), oo1.w(2, bounds.centerX(), drawable), oo1.i(2, bounds.centerY(), drawable));
    }

    public final void b(boolean z, boolean z2, boolean z3) {
        this.i = z;
        this.h = z2;
        this.f = SystemClock.elapsedRealtime();
        if (!z3) {
            this.g = this.h ? 1.0f : 0.0f;
        }
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.f;
        this.f = elapsedRealtime;
        boolean z2 = this.i;
        Drawable drawable = this.a;
        if (!z2) {
            a(drawable);
            drawable.draw(canvas);
        } else if (!this.h || this.g != 1.0f) {
            a(drawable);
            drawable.draw(canvas);
            int i = (int) ((1.0f - this.g) * 255.0f);
            Paint paint = this.c;
            paint.setAlpha(i);
            this.e += (int) ((360 * j) / 1000.0f);
            int width = getBounds().width();
            int height = getBounds().height();
            int L = gl.L(4.0f);
            RectF rectF = this.d;
            rectF.set((width / 2) - L, (height / 2) - L, r0 + L + L, r4 + L + L);
            canvas2 = canvas;
            canvas2.drawArc(rectF, this.e - 90, 90.0f, false, paint);
            invalidateSelf();
            if (this.i && (this.h || this.g != 0.0f)) {
                int i2 = (int) (this.g * 255.0f);
                Drawable drawable2 = this.b;
                drawable2.setAlpha(i2);
                a(drawable2);
                drawable2.draw(canvas2);
            }
            z = this.h;
            float f = this.g;
            if (z) {
                if (f != 0.0f) {
                    float f2 = f - (j / 300.0f);
                    this.g = f2;
                    if (f2 < 0.0f) {
                        this.g = 0.0f;
                    }
                    invalidateSelf();
                    return;
                }
                return;
            }
            if (f != 1.0f) {
                float f3 = (j / 300.0f) + f;
                this.g = f3;
                if (f3 > 1.0f) {
                    this.g = 1.0f;
                }
                invalidateSelf();
                return;
            }
            return;
        }
        canvas2 = canvas;
        if (this.i) {
            int i22 = (int) (this.g * 255.0f);
            Drawable drawable22 = this.b;
            drawable22.setAlpha(i22);
            a(drawable22);
            drawable22.draw(canvas2);
        }
        z = this.h;
        float f4 = this.g;
        if (z) {
        }
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
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.b.setColorFilter(colorFilter);
        this.c.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }
}
