package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.google.android.gms.internal.cast.a6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.p6;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class s1 {
    public final p6 a;
    public final p6 b;
    public final f6 c;
    public int d;
    public boolean e;
    public int f;
    public final Drawable g;
    public final /* synthetic */ org.telegram.ui.n0 h;

    public s1(org.telegram.ui.n0 n0Var) {
        this.h = n0Var;
        p6 p6Var = new p6(true, true, true);
        this.a = p6Var;
        p6 p6Var2 = new p6(true, true, true);
        this.b = p6Var2;
        this.c = new f6(n0Var, 0L, 300L, bs.h);
        this.e = false;
        p6Var.K = true;
        p6Var.w(AndroidUtilities.dp(18.33f));
        p6Var.A = 0.6f;
        p6Var.x(AndroidUtilities.bold());
        p6Var.q(false);
        p6Var.setCallback(n0Var);
        p6Var.M = 9999999;
        p6Var2.K = true;
        p6Var2.w(AndroidUtilities.dp(14.0f));
        p6Var2.q(false);
        p6Var2.setCallback(n0Var);
        p6Var2.M = 9999999;
        this.g = n0Var.getContext().getResources().getDrawable(R.drawable.warning_sign).mutate();
    }

    public final void a(Canvas canvas, float f7, float f10, float f11) {
        org.telegram.ui.n0 n0Var = this.h;
        RectF rectF = n0Var.a;
        rectF.set(0.0f, 0.0f, f7, f10);
        canvas.saveLayerAlpha(rectF, (int) (f11 * 255.0f), 31);
        p6 p6Var = this.a;
        float i10 = p6Var.i();
        p6 p6Var2 = this.b;
        float i11 = p6Var2.i();
        TextPaint textPaint = p6Var2.a;
        float f12 = i11 * i10;
        canvas.save();
        float f13 = 0.82f * f10;
        canvas.translate(0.0f, a6.x(1.0f, n0Var.G, f13, -AndroidUtilities.dp(1.0f)));
        canvas.translate(0.0f, (-AndroidUtilities.dp(4.0f)) * f12);
        float lerp = AndroidUtilities.lerp(1.0f, 0.86f, f12) * n0Var.G;
        canvas.scale(lerp, lerp, 0.0f, 0.0f);
        p6Var.o(0.0f, 0.0f, f7, f10);
        p6Var.draw(canvas);
        canvas.restore();
        float e = this.c.e(this.e);
        canvas.save();
        canvas.translate(0.0f, a6.D(1.0f, f12, AndroidUtilities.dp(4.0f), (AndroidUtilities.dp(14.0f) * f12) + ((1.0f - n0Var.G) * f13 * f12) + (-AndroidUtilities.dp(1.0f))));
        float lerp2 = AndroidUtilities.lerp(1.15f, 0.9f, f12) * n0Var.G;
        canvas.scale(lerp2, lerp2, 0.0f, 0.0f);
        p6Var2.u(i0.b.f(e, this.d, h6.x0(null, h6.q7, false)));
        if (e > 0.0f) {
            int i12 = this.f;
            int color = textPaint.getColor();
            Drawable drawable = this.g;
            if (i12 != color) {
                int color2 = textPaint.getColor();
                this.f = color2;
                drawable.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.SRC_IN));
            }
            drawable.setAlpha((int) (e * 255.0f));
            drawable.setBounds(0, ((int) (f10 - AndroidUtilities.dp(16.0f))) / 2, AndroidUtilities.dp(16.0f), ((int) (AndroidUtilities.dp(16.0f) + f10)) / 2);
            drawable.draw(canvas);
        }
        p6Var2.o(AndroidUtilities.dp(20.0f) * e, 0.0f, f7, f10);
        p6Var2.draw(canvas);
        canvas.restore();
        rectF.set(f7 - AndroidUtilities.dp(12.0f), 0.0f, f7, f10);
        n0Var.r0.b(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
