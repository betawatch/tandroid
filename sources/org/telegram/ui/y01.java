package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class y01 extends Drawable implements org.telegram.ui.ActionBar.k5 {
    public final org.telegram.ui.Components.j6 a;
    public final Paint b;
    public int c;
    public float d;
    public float e;
    public final org.telegram.ui.Cells.l0 f;
    public org.telegram.ui.Cells.v0 h;

    public y01(String str) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.d = 1.0f;
        this.e = 1.0f;
        this.f = new org.telegram.ui.Cells.l0(this);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, false, false, false);
        this.a = j6Var;
        j6Var.setCallback(new tr(1, this));
        j6Var.q(str, true, true);
        j6Var.t(AndroidUtilities.dp(11.0f));
        j6Var.b = 17;
        paint.setColor(520093696);
    }

    public final void a(int i10) {
        Paint paint = this.b;
        if (paint.getColor() != i10) {
            paint.setColor(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f10 = this.d * this.e;
        if (f10 <= 0.0f) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        canvas.save();
        float a2 = this.f.a(0.1f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        Paint paint = this.b;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f10));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint);
        paint.setAlpha(alpha);
        int i10 = this.c;
        org.telegram.ui.Components.j6 j6Var = this.a;
        j6Var.r(i10);
        j6Var.w = (int) (f10 * 255.0f);
        j6Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        j6Var.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return (int) (this.d * 255.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(17.33f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) (this.a.d + AndroidUtilities.dp(11.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.d = i10 / 255.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
