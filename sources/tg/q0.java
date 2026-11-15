package tg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import hi.c5;
import org.telegram.messenger.gz;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class q0 extends org.telegram.ui.Cells.t0 {
    public final y9 u2;
    public final TextPaint v2;
    public final /* synthetic */ s0 w2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(s0 s0Var, Context context, t0 t0Var) {
        super(context, t0Var, false);
        this.w2 = s0Var;
        this.u2 = new y9(s0Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.v2 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, gz.W0) - 2));
        textPaint.setColor(-1);
    }

    @Override // org.telegram.ui.Cells.t0
    public final Paint R(String str) {
        if ("paintChatActionText".equals(str) || "paintChatActionText2".equals(str)) {
            return this.v2;
        }
        if ("paintChatActionBackground".equals(str)) {
            c5 c5Var = this.w2.h;
            c5Var.w0 = true;
            boolean z10 = c5Var.C0;
            y9 y9Var = this.u2;
            if (y9Var.r != z10) {
                y9Var.r = z10;
                if (y9Var.i == 10) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.6f);
                    org.telegram.messenger.g0.n2(colorMatrix, y9Var.r ? 0.97f : 0.92f);
                    org.telegram.messenger.g0.h(colorMatrix, y9Var.r ? 0.12f : -0.06f);
                    y9Var.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    y9Var.g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            Paint c10 = y9Var.c(1.0f);
            if (c10 != null) {
                return c10;
            }
        }
        return super.R(str);
    }
}
