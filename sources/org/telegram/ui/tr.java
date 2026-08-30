package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class tr extends Drawable {
    public final org.telegram.ui.ActionBar.f6 a;
    public final Paint b = new Paint(1);
    public final Paint c;
    public final Drawable d;
    public final RectF e;
    public final org.telegram.ui.Components.j6 f;
    public final org.telegram.ui.Components.j6 g;
    public final Paint h;
    public final Path i;
    public final Drawable j;
    public int k;
    public boolean l;
    public final org.telegram.ui.Components.z5 m;

    public tr(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        Paint paint = new Paint(1);
        this.c = paint;
        this.e = new RectF();
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, false, false, false);
        this.f = j6Var;
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(false, false, false, false);
        this.g = j6Var2;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        Path path = new Path();
        this.i = path;
        this.m = new org.telegram.ui.Components.z5(new zi(this, 12), 320L, org.telegram.ui.Components.nr.h, 0);
        sr srVar = new sr(0, this);
        this.a = f6Var;
        this.d = context.getResources().getDrawable(i10).mutate();
        this.j = context.getResources().getDrawable(R.drawable.mini_casting_fill).mutate();
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        j6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        j6Var.r(-16777216);
        j6Var.t(AndroidUtilities.dp(7.0f));
        j6Var.setCallback(srVar);
        j6Var.b = 17;
        j6Var.G = AndroidUtilities.displaySize.x;
        j6Var2.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        j6Var2.r(-16777216);
        j6Var2.t(AndroidUtilities.dp(7.0f));
        j6Var2.setCallback(srVar);
        j6Var2.b = 17;
        j6Var2.G = AndroidUtilities.displaySize.x;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(0.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.33f));
        path.addRoundRect(rectF, AndroidUtilities.dp(2.66f), AndroidUtilities.dp(2.66f), Path.Direction.CW);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z4) {
        if (this.l == z4) {
            return;
        }
        this.l = z4;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        int i10;
        float f13;
        float e = this.m.e(this.l);
        float dp = AndroidUtilities.dp(5.0f);
        org.telegram.ui.Components.j6 j6Var = this.f;
        float d = j6Var.d() + (j6Var.g() * dp);
        float dp2 = AndroidUtilities.dp(5.0f);
        org.telegram.ui.Components.j6 j6Var2 = this.g;
        float d10 = j6Var2.d() + (j6Var2.g() * dp2);
        int saveCount = canvas.getSaveCount();
        Rect bounds = getBounds();
        if (d > 0.0f || d10 > 0.0f || e > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        } else {
            canvas2 = canvas;
        }
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), (bounds.width() + AndroidUtilities.dp(6.0f)) - AndroidUtilities.dp(12.0f), (bounds.height() + AndroidUtilities.dp(6.0f)) - AndroidUtilities.dp(12.0f));
        rect.offset(bounds.left, bounds.top);
        Drawable drawable = this.d;
        drawable.setBounds(rect);
        canvas2.save();
        canvas2.rotate(-0.0f, bounds.centerX(), bounds.centerY());
        drawable.draw(canvas2);
        canvas2.restore();
        Paint paint = this.b;
        paint.setColor(-1);
        float width = (bounds.width() * 0.98f) + bounds.left;
        float height = (bounds.height() * 0.18f) + bounds.top;
        float height2 = (bounds.height() * 0.78f) + bounds.top;
        float dp3 = AndroidUtilities.dp(10.0f);
        Paint paint2 = this.c;
        RectF rectF = this.e;
        if (d > 0.0f) {
            f10 = dp3;
            float f14 = f10 / 2.0f;
            f11 = height;
            f12 = height2;
            rectF.set(width - d, f11 - f14, width, f11 + f14);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint2);
        } else {
            f10 = dp3;
            f11 = height;
            f12 = height2;
        }
        int i11 = (d10 > 0.0f ? 1 : (d10 == 0.0f ? 0 : -1));
        if (i11 > 0) {
            float f15 = f10 / 2.0f;
            i10 = i11;
            rectF.set(width - d10, f12 - f15, width, f12 + f15);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint2);
        } else {
            i10 = i11;
        }
        float f16 = 1.0f - e;
        if (d * f16 > 0.0f) {
            paint.setAlpha((int) (j6Var.g() * 255.0f * f16));
            j6Var.w = (int) (j6Var.g() * 255.0f * f16);
            float f17 = f10 / 2.0f;
            rectF.set(width - d, f11 - f17, width, f11 + f17);
            rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint);
            rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            j6Var.m(rectF);
            j6Var.draw(canvas2);
        }
        if (e > 0.0f) {
            canvas2.save();
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.a);
            int i12 = this.k;
            Drawable drawable2 = this.j;
            if (i12 != v02) {
                this.k = v02;
                drawable2.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            f13 = 255.0f;
            drawable2.setBounds((bounds.right - drawable2.getIntrinsicWidth()) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(0.66f) + bounds.top, bounds.right - AndroidUtilities.dp(3.0f), drawable2.getIntrinsicHeight() + AndroidUtilities.dp(0.66f) + bounds.top);
            drawable2.setAlpha((int) (e * 255.0f));
            float lerp = AndroidUtilities.lerp(0.8f, 1.0f, e);
            canvas2.scale(lerp, lerp, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            if (e > 0.5f) {
                canvas2.save();
                canvas2.translate(drawable2.getBounds().left, drawable2.getBounds().top);
                canvas2.drawPath(this.i, this.h);
                canvas2.restore();
            }
            drawable2.draw(canvas2);
            canvas2.restore();
        } else {
            f13 = 255.0f;
        }
        if (i10 > 0) {
            paint.setAlpha((int) (j6Var2.g() * f13));
            j6Var2.w = (int) (j6Var2.g() * f13);
            float f18 = f10 / 2.0f;
            rectF.set(width - d10, f12 - f18, width, f12 + f18);
            rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint);
            rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            j6Var2.m(rectF);
            j6Var2.draw(canvas2);
        }
        canvas2.restoreToCount(saveCount);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(12.0f) + this.d.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(12.0f) + this.d.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.d.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.d.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }
}
