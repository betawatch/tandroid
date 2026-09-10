package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class u1 {
    public final n6 a;
    public final n6 b;
    public final d6 c;
    public int d;
    public boolean e;
    public int f;
    public final Drawable g;
    public final /* synthetic */ org.telegram.ui.l0 h;

    public u1(org.telegram.ui.l0 l0Var) {
        this.h = l0Var;
        n6 n6Var = new n6(true, true, true, false);
        this.a = n6Var;
        n6 n6Var2 = new n6(true, true, true, false);
        this.b = n6Var2;
        this.c = new d6(l0Var, 0L, 300L, wr.h);
        this.e = false;
        n6Var.E = true;
        n6Var.t(AndroidUtilities.dp(18.33f));
        n6Var.v = 0.6f;
        n6Var.u(AndroidUtilities.bold());
        n6Var.n(false);
        n6Var.setCallback(l0Var);
        n6Var.G = 9999999;
        n6Var2.E = true;
        n6Var2.t(AndroidUtilities.dp(14.0f));
        n6Var2.n(false);
        n6Var2.setCallback(l0Var);
        n6Var2.G = 9999999;
        this.g = l0Var.getContext().getResources().getDrawable(R.drawable.warning_sign).mutate();
    }

    public final void a(Canvas canvas, float f7, float f10, float f11) {
        org.telegram.ui.l0 l0Var = this.h;
        RectF rectF = l0Var.a;
        rectF.set(0.0f, 0.0f, f7, f10);
        canvas.saveLayerAlpha(rectF, (int) (f11 * 255.0f), 31);
        n6 n6Var = this.a;
        float g10 = n6Var.g();
        n6 n6Var2 = this.b;
        float g11 = n6Var2.g();
        TextPaint textPaint = n6Var2.a;
        float f12 = g11 * g10;
        canvas.save();
        float f13 = 0.82f * f10;
        canvas.translate(0.0f, com.google.android.gms.internal.vision.e2.z(1.0f, l0Var.G, f13, -AndroidUtilities.dp(1.0f)));
        canvas.translate(0.0f, (-AndroidUtilities.dp(4.0f)) * f12);
        float lerp = AndroidUtilities.lerp(1.0f, 0.86f, f12) * l0Var.G;
        canvas.scale(lerp, lerp, 0.0f, 0.0f);
        n6Var.l(0.0f, 0.0f, f7, f10);
        n6Var.draw(canvas);
        canvas.restore();
        float e = this.c.e(this.e);
        canvas.save();
        canvas.translate(0.0f, com.google.android.gms.internal.vision.e2.a(1.0f, f12, AndroidUtilities.dp(4.0f), (AndroidUtilities.dp(14.0f) * f12) + ((1.0f - l0Var.G) * f13 * f12) + (-AndroidUtilities.dp(1.0f))));
        float lerp2 = AndroidUtilities.lerp(1.15f, 0.9f, f12) * l0Var.G;
        canvas.scale(lerp2, lerp2, 0.0f, 0.0f);
        n6Var2.r(i0.a.d(e, this.d, j6.w0(null, j6.q7, false)));
        if (e > 0.0f) {
            int i10 = this.f;
            int color = textPaint.getColor();
            Drawable drawable = this.g;
            if (i10 != color) {
                int color2 = textPaint.getColor();
                this.f = color2;
                drawable.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.SRC_IN));
            }
            drawable.setAlpha((int) (e * 255.0f));
            drawable.setBounds(0, ((int) (f10 - AndroidUtilities.dp(16.0f))) / 2, AndroidUtilities.dp(16.0f), ((int) (AndroidUtilities.dp(16.0f) + f10)) / 2);
            drawable.draw(canvas);
        }
        n6Var2.l(AndroidUtilities.dp(20.0f) * e, 0.0f, f7, f10);
        n6Var2.draw(canvas);
        canvas.restore();
        rectF.set(f7 - AndroidUtilities.dp(12.0f), 0.0f, f7, f10);
        l0Var.r0.b(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
