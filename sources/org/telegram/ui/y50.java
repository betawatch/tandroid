package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class y50 extends Drawable {
    public final Paint a;
    public final Paint b;
    public long c;
    public float d;
    public int e;
    public boolean f;
    public View g;

    public y50() {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        this.d = 1.0f;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
    }

    public final void a(ImageView imageView) {
        this.g = imageView;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(10.0f), this.a);
        int i10 = this.f ? -1147527 : -1;
        Paint paint = this.b;
        paint.setColor(i10);
        paint.setAlpha((int) (this.d * 255.0f));
        canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(5.0f), paint);
        if (this.f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.c;
            if (j10 > 17) {
                j10 = 17;
            }
            this.c = elapsedRealtime;
            int i11 = this.e;
            if (i11 == 0) {
                float f10 = (j10 / 2000.0f) + this.d;
                this.d = f10;
                if (f10 >= 1.0f) {
                    this.d = 1.0f;
                    this.e = 1;
                }
            } else if (i11 == 1) {
                float f11 = this.d - (j10 / 2000.0f);
                this.d = f11;
                if (f11 < 0.5f) {
                    this.d = 0.5f;
                    this.e = 0;
                }
            }
            this.g.invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
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
