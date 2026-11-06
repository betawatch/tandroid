package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class y30 extends Drawable {
    public long b;
    public int d;
    public final View e;
    public final Paint a = new Paint(1);
    public float c = 1.0f;

    public y30(View view) {
        this.e = view;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int L;
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        View view = this.e;
        if (view instanceof org.telegram.ui.ActionBar.k5) {
            L = org.telegram.messenger.g0.L(1.0f) + centerY;
            centerX -= org.telegram.messenger.g0.L(3.0f);
        } else {
            L = org.telegram.messenger.g0.L(2.0f) + centerY;
        }
        Paint paint = this.a;
        paint.setColor(-1147527);
        paint.setAlpha((int) (this.c * 255.0f));
        canvas.drawCircle(centerX, L, org.telegram.messenger.g0.L(4.0f), paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.b;
        if (j3 > 17) {
            j3 = 17;
        }
        this.b = elapsedRealtime;
        int i7 = this.d;
        if (i7 == 0) {
            float f10 = (j3 / 2000.0f) + this.c;
            this.c = f10;
            if (f10 >= 1.0f) {
                this.c = 1.0f;
                this.d = 1;
            }
        } else if (i7 == 1) {
            float f11 = this.c - (j3 / 2000.0f);
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
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
