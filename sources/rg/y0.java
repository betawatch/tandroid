package rg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import ei.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.na;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class y0 extends org.telegram.ui.Cells.w0 {
    public final na t2;
    public final TextPaint u2;
    public final /* synthetic */ a1 v2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(a1 a1Var, Context context, com.google.firebase.messaging.l lVar) {
        super(context, lVar, false);
        this.v2 = a1Var;
        this.t2 = new na(a1Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.u2 = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint.setColor(-1);
    }

    @Override // org.telegram.ui.Cells.w0
    public final Paint I(String str) {
        if ("paintChatActionText".equals(str) || "paintChatActionText2".equals(str)) {
            return this.u2;
        }
        if ("paintChatActionBackground".equals(str)) {
            r5 r5Var = this.v2.h;
            r5Var.v0 = true;
            boolean z10 = r5Var.B0;
            na naVar = this.t2;
            if (naVar.r != z10) {
                naVar.r = z10;
                if (naVar.i == 10) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.6f);
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, naVar.r ? 0.97f : 0.92f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, naVar.r ? 0.12f : -0.06f);
                    naVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    naVar.g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            Paint c10 = naVar.c(1.0f);
            if (c10 != null) {
                return c10;
            }
        }
        return super.I(str);
    }
}
