package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.q6;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class t1 {
    public final q6 a;
    public final q6 b;
    public final g6 c;
    public int d;
    public boolean e;
    public int f;
    public final Drawable g;
    public final /* synthetic */ org.telegram.ui.l0 h;

    public t1(org.telegram.ui.l0 l0Var) {
        this.h = l0Var;
        q6 q6Var = new q6(true, true, true);
        this.a = q6Var;
        q6 q6Var2 = new q6(true, true, true);
        this.b = q6Var2;
        this.c = new g6(l0Var, 0L, 300L, hs.h);
        this.e = false;
        q6Var.K = true;
        q6Var.w(AndroidUtilities.dp(18.33f));
        q6Var.A = 0.6f;
        q6Var.x(AndroidUtilities.bold());
        q6Var.q(false);
        q6Var.setCallback(l0Var);
        q6Var.M = 9999999;
        q6Var2.K = true;
        q6Var2.w(AndroidUtilities.dp(14.0f));
        q6Var2.q(false);
        q6Var2.setCallback(l0Var);
        q6Var2.M = 9999999;
        this.g = l0Var.getContext().getResources().getDrawable(R.drawable.warning_sign).mutate();
    }

    public final void a(Canvas canvas, float f7, float f10, float f11) {
        org.telegram.ui.l0 l0Var = this.h;
        RectF rectF = l0Var.a;
        rectF.set(0.0f, 0.0f, f7, f10);
        canvas.saveLayerAlpha(rectF, (int) (f11 * 255.0f), 31);
        q6 q6Var = this.a;
        float i10 = q6Var.i();
        q6 q6Var2 = this.b;
        float i11 = q6Var2.i();
        TextPaint textPaint = q6Var2.a;
        float f12 = i11 * i10;
        canvas.save();
        float f13 = 0.82f * f10;
        canvas.translate(0.0f, com.google.android.gms.internal.vision.e2.y(1.0f, l0Var.G, f13, -AndroidUtilities.dp(1.0f)));
        canvas.translate(0.0f, (-AndroidUtilities.dp(4.0f)) * f12);
        float lerp = AndroidUtilities.lerp(1.0f, 0.86f, f12) * l0Var.G;
        canvas.scale(lerp, lerp, 0.0f, 0.0f);
        q6Var.o(0.0f, 0.0f, f7, f10);
        q6Var.draw(canvas);
        canvas.restore();
        float e7 = this.c.e(this.e);
        canvas.save();
        canvas.translate(0.0f, com.google.android.gms.internal.vision.e2.b(1.0f, f12, AndroidUtilities.dp(4.0f), (AndroidUtilities.dp(14.0f) * f12) + ((1.0f - l0Var.G) * f13 * f12) + (-AndroidUtilities.dp(1.0f))));
        float lerp2 = AndroidUtilities.lerp(1.15f, 0.9f, f12) * l0Var.G;
        canvas.scale(lerp2, lerp2, 0.0f, 0.0f);
        q6Var2.u(i0.a.d(e7, this.d, i6.x0(null, i6.q7, false)));
        if (e7 > 0.0f) {
            int i12 = this.f;
            int color = textPaint.getColor();
            Drawable drawable = this.g;
            if (i12 != color) {
                int color2 = textPaint.getColor();
                this.f = color2;
                drawable.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.SRC_IN));
            }
            drawable.setAlpha((int) (e7 * 255.0f));
            drawable.setBounds(0, ((int) (f10 - AndroidUtilities.dp(16.0f))) / 2, AndroidUtilities.dp(16.0f), ((int) (AndroidUtilities.dp(16.0f) + f10)) / 2);
            drawable.draw(canvas);
        }
        q6Var2.o(AndroidUtilities.dp(20.0f) * e7, 0.0f, f7, f10);
        q6Var2.draw(canvas);
        canvas.restore();
        rectF.set(f7 - AndroidUtilities.dp(12.0f), 0.0f, f7, f10);
        l0Var.r0.b(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
