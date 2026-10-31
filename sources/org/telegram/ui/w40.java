package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w40 extends Drawable {
    public final Paint a;
    public final Paint b;
    public long c;
    public float d;
    public int e;
    public boolean f;
    public View g;

    public w40() {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        this.d = 1.0f;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.5f));
    }

    public final void a(ImageView imageView) {
        this.g = imageView;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        canvas.drawCircle(centerX, centerY, org.telegram.messenger.i0.L(10.0f), this.a);
        int i10 = this.f ? -1147527 : -1;
        Paint paint = this.b;
        paint.setColor(i10);
        paint.setAlpha((int) (this.d * 255.0f));
        canvas.drawCircle(centerX, centerY, org.telegram.messenger.i0.L(5.0f), paint);
        if (this.f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.c;
            if (j10 > 17) {
                j10 = 17;
            }
            this.c = elapsedRealtime;
            int i11 = this.e;
            if (i11 == 0) {
                float f7 = (j10 / 2000.0f) + this.d;
                this.d = f7;
                if (f7 >= 1.0f) {
                    this.d = 1.0f;
                    this.e = 1;
                }
            } else if (i11 == 1) {
                float f10 = this.d - (j10 / 2000.0f);
                this.d = f10;
                if (f10 < 0.5f) {
                    this.d = 0.5f;
                    this.e = 0;
                }
            }
            this.g.invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
