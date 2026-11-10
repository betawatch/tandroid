package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class zw0 extends Drawable implements org.telegram.ui.ActionBar.l5 {
    public final org.telegram.ui.Components.h6 a;
    public final Paint b;
    public int c;
    public float d;
    public float e;
    public final org.telegram.ui.Cells.j0 f;
    public org.telegram.ui.Cells.t0 h;

    public zw0(String str) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.d = 1.0f;
        this.e = 1.0f;
        this.f = new org.telegram.ui.Cells.j0(this);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(false, false, false);
        this.a = h6Var;
        h6Var.setCallback(new wq(1, this));
        h6Var.t(str, true, true);
        h6Var.w(org.telegram.messenger.g0.L(11.0f));
        h6Var.b = 17;
        paint.setColor(520093696);
    }

    public final void a(int i7) {
        Paint paint = this.b;
        if (paint.getColor() != i7) {
            paint.setColor(i7);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f10 = this.d * this.e;
        if (f10 <= 0.0f) {
            return;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getBounds());
        canvas.save();
        float a10 = this.f.a(0.1f);
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        Paint paint = this.b;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f10));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), paint);
        paint.setAlpha(alpha);
        int i7 = this.c;
        org.telegram.ui.Components.h6 h6Var = this.a;
        h6Var.u(i7);
        h6Var.B = (int) (f10 * 255.0f);
        h6Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        h6Var.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return (int) (this.d * 255.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(17.33f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) (this.a.d + org.telegram.messenger.g0.L(11.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.d = i7 / 255.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
