package tg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import hi.a5;
import org.telegram.messenger.cz;
import org.telegram.ui.Components.ga;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class r0 extends org.telegram.ui.Cells.v0 {
    public final TextPaint A2;
    public final /* synthetic */ t0 B2;
    public final ga z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(t0 t0Var, Context context, u0 u0Var) {
        super(context, u0Var, false);
        this.B2 = t0Var;
        this.z2 = new ga(t0Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.A2 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, cz.W0) - 2));
        textPaint.setColor(-1);
    }

    @Override // org.telegram.ui.Cells.v0
    public final Paint P(String str) {
        if ("paintChatActionText".equals(str) || "paintChatActionText2".equals(str)) {
            return this.A2;
        }
        if ("paintChatActionBackground".equals(str)) {
            a5 a5Var = this.B2.h;
            a5Var.w0 = true;
            boolean z10 = a5Var.C0;
            ga gaVar = this.z2;
            if (gaVar.r != z10) {
                gaVar.r = z10;
                if (gaVar.i == 10) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.6f);
                    org.telegram.messenger.g0.n2(colorMatrix, gaVar.r ? 0.97f : 0.92f);
                    org.telegram.messenger.g0.h(colorMatrix, gaVar.r ? 0.12f : -0.06f);
                    gaVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    gaVar.g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            Paint c10 = gaVar.c(1.0f);
            if (c10 != null) {
                return c10;
            }
        }
        return super.P(str);
    }
}
