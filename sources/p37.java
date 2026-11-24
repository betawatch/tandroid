// default package

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class p37 extends cm1 {
    public final TextPaint A2;
    public final /* synthetic */ r37 B2;
    public final wm0 z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p37(r37 r37Var, Context context, t37 t37Var) {
        super(t37Var, context, false);
        this.B2 = r37Var;
        this.z2 = new wm0(r37Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.A2 = textPaint;
        textPaint.setTypeface(gm.o());
        textPaint.setTextSize(gm.L(Math.max(16, gda.S0) - 2));
        textPaint.setColor(-1);
    }

    @Override // cm1
    public final Paint O(String str) {
        if ("paintChatActionText".equals(str) || "paintChatActionText2".equals(str)) {
            return this.A2;
        }
        if ("paintChatActionBackground".equals(str)) {
            pv7 pv7Var = this.B2.h;
            pv7Var.x0 = true;
            boolean z = pv7Var.D0;
            wm0 wm0Var = this.z2;
            if (wm0Var.r != z) {
                wm0Var.r = z;
                if (wm0Var.i == 10) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.6f);
                    gm.l2(colorMatrix, wm0Var.r ? 0.97f : 0.92f);
                    gm.h(colorMatrix, wm0Var.r ? 0.12f : -0.06f);
                    wm0Var.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    wm0Var.g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            Paint c = wm0Var.c(1.0f);
            if (c != null) {
                return c;
            }
        }
        return super.O(str);
    }
}
