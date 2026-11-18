package tg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import hi.b5;
import org.telegram.messenger.bz;
import org.telegram.ui.Components.ga;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class q0 extends org.telegram.ui.Cells.v0 {
    public final TextPaint A2;
    public final /* synthetic */ s0 B2;
    public final ga z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(s0 s0Var, Context context, t0 t0Var) {
        super(context, t0Var, false);
        this.B2 = s0Var;
        this.z2 = new ga(s0Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.A2 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, bz.W0) - 2));
        textPaint.setColor(-1);
    }

    @Override // org.telegram.ui.Cells.v0
    public final Paint P(String str) {
        if ("paintChatActionText".equals(str) || "paintChatActionText2".equals(str)) {
            return this.A2;
        }
        if ("paintChatActionBackground".equals(str)) {
            b5 b5Var = this.B2.h;
            b5Var.w0 = true;
            boolean z10 = b5Var.C0;
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
