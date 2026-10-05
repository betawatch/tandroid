package qg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import ci.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.oa;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class y0 extends org.telegram.ui.Cells.w0 {
    public final oa l2;
    public final TextPaint m2;
    public final /* synthetic */ a1 n2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(a1 a1Var, Context context, com.google.firebase.messaging.n nVar) {
        super(context, nVar, false);
        this.n2 = a1Var;
        this.l2 = new oa(a1Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.m2 = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint.setColor(-1);
    }

    @Override // org.telegram.ui.Cells.w0
    public final Paint F(String str) {
        if ("paintChatActionText".equals(str) || "paintChatActionText2".equals(str)) {
            return this.m2;
        }
        if ("paintChatActionBackground".equals(str)) {
            b6 b6Var = this.n2.h;
            b6Var.v0 = true;
            boolean z10 = b6Var.B0;
            oa oaVar = this.l2;
            if (oaVar.r != z10) {
                oaVar.r = z10;
                if (oaVar.i == 10) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.6f);
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, oaVar.r ? 0.97f : 0.92f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, oaVar.r ? 0.12f : -0.06f);
                    oaVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    oaVar.g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            Paint c10 = oaVar.c(1.0f);
            if (c10 != null) {
                return c10;
            }
        }
        return super.F(str);
    }
}
