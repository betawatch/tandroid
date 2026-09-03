package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class z50 extends Drawable {
    public long b;
    public int d;
    public final View e;
    public final Paint a = new Paint(1);
    public float c = 1.0f;

    public z50(View view) {
        this.e = view;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int dp;
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        View view = this.e;
        if (view instanceof org.telegram.ui.ActionBar.l5) {
            dp = AndroidUtilities.dp(1.0f) + centerY;
            centerX -= AndroidUtilities.dp(3.0f);
        } else {
            dp = AndroidUtilities.dp(2.0f) + centerY;
        }
        Paint paint = this.a;
        paint.setColor(-1147527);
        paint.setAlpha((int) (this.c * 255.0f));
        canvas.drawCircle(centerX, dp, AndroidUtilities.dp(4.0f), paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.b;
        if (j10 > 17) {
            j10 = 17;
        }
        this.b = elapsedRealtime;
        int i10 = this.d;
        if (i10 == 0) {
            float f10 = (j10 / 2000.0f) + this.c;
            this.c = f10;
            if (f10 >= 1.0f) {
                this.c = 1.0f;
                this.d = 1;
            }
        } else if (i10 == 1) {
            float f11 = this.c - (j10 / 2000.0f);
            this.c = f11;
            if (f11 < 0.5f) {
                this.c = 0.5f;
                this.d = 0;
            }
        }
        view.invalidate();
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
