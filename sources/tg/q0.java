package tg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import hi.b5;
import org.telegram.messenger.bz;
import org.telegram.ui.Components.ga;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class q0 extends org.telegram.ui.Cells.u0 {
    public final ga C2;
    public final TextPaint D2;
    public final /* synthetic */ s0 E2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(s0 s0Var, Context context, t0 t0Var) {
        super(context, t0Var, false);
        this.E2 = s0Var;
        this.C2 = new ga(s0Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.D2 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, bz.W0) - 2));
        textPaint.setColor(-1);
    }

    @Override // org.telegram.ui.Cells.u0
    public final Paint R(String str) {
        if ("paintChatActionText".equals(str) || "paintChatActionText2".equals(str)) {
            return this.D2;
        }
        if ("paintChatActionBackground".equals(str)) {
            b5 b5Var = this.E2.h;
            b5Var.w0 = true;
            boolean z10 = b5Var.C0;
            ga gaVar = this.C2;
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
        return super.R(str);
    }
}
