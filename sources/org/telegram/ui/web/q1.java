package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.y5;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class q1 {
    public final i6 a;
    public final i6 b;
    public final y5 c;
    public int d;
    public boolean e;
    public int f;
    public final Drawable g;
    public final /* synthetic */ org.telegram.ui.o0 h;

    public q1(org.telegram.ui.o0 o0Var) {
        this.h = o0Var;
        i6 i6Var = new i6(true, true, true, false);
        this.a = i6Var;
        i6 i6Var2 = new i6(true, true, true, false);
        this.b = i6Var2;
        this.c = new y5(o0Var, 0L, 300L, er.h);
        this.e = false;
        i6Var.E = true;
        i6Var.t(AndroidUtilities.dp(18.33f));
        i6Var.v = 0.6f;
        i6Var.u(AndroidUtilities.bold());
        i6Var.n(false);
        i6Var.setCallback(o0Var);
        i6Var.G = 9999999;
        i6Var2.E = true;
        i6Var2.t(AndroidUtilities.dp(14.0f));
        i6Var2.n(false);
        i6Var2.setCallback(o0Var);
        i6Var2.G = 9999999;
        this.g = o0Var.getContext().getResources().getDrawable(R.drawable.warning_sign).mutate();
    }

    public final void a(Canvas canvas, float f10, float f11, float f12) {
        org.telegram.ui.o0 o0Var = this.h;
        RectF rectF = o0Var.a;
        rectF.set(0.0f, 0.0f, f10, f11);
        canvas.saveLayerAlpha(rectF, (int) (f12 * 255.0f), 31);
        i6 i6Var = this.a;
        float g10 = i6Var.g();
        i6 i6Var2 = this.b;
        float g11 = i6Var2.g();
        TextPaint textPaint = i6Var2.a;
        float f13 = g11 * g10;
        canvas.save();
        float f14 = 0.82f * f11;
        canvas.translate(0.0f, com.google.android.recaptcha.internal.a.z(1.0f, o0Var.C, f14, -AndroidUtilities.dp(1.0f)));
        canvas.translate(0.0f, (-AndroidUtilities.dp(4.0f)) * f13);
        float lerp = AndroidUtilities.lerp(1.0f, 0.86f, f13) * o0Var.C;
        canvas.scale(lerp, lerp, 0.0f, 0.0f);
        i6Var.l(0.0f, 0.0f, f10, f11);
        i6Var.draw(canvas);
        canvas.restore();
        float e9 = this.c.e(this.e);
        canvas.save();
        canvas.translate(0.0f, pa.b(1.0f, f13, AndroidUtilities.dp(4.0f), (AndroidUtilities.dp(14.0f) * f13) + ((1.0f - o0Var.C) * f14 * f13) + (-AndroidUtilities.dp(1.0f))));
        float lerp2 = AndroidUtilities.lerp(1.15f, 0.9f, f13) * o0Var.C;
        canvas.scale(lerp2, lerp2, 0.0f, 0.0f);
        i6Var2.r(i0.b.d(e9, this.d, g6.w0(null, g6.q7, false)));
        if (e9 > 0.0f) {
            int i10 = this.f;
            int color = textPaint.getColor();
            Drawable drawable = this.g;
            if (i10 != color) {
                int color2 = textPaint.getColor();
                this.f = color2;
                drawable.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.SRC_IN));
            }
            drawable.setAlpha((int) (e9 * 255.0f));
            drawable.setBounds(0, ((int) (f11 - AndroidUtilities.dp(16.0f))) / 2, AndroidUtilities.dp(16.0f), ((int) (AndroidUtilities.dp(16.0f) + f11)) / 2);
            drawable.draw(canvas);
        }
        i6Var2.l(AndroidUtilities.dp(20.0f) * e9, 0.0f, f10, f11);
        i6Var2.draw(canvas);
        canvas.restore();
        rectF.set(f10 - AndroidUtilities.dp(12.0f), 0.0f, f10, f11);
        o0Var.n0.b(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
