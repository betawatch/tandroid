package sg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import fi.q5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.pa;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class y0 extends org.telegram.ui.Cells.v0 {
    public final pa t2;
    public final TextPaint u2;
    public final /* synthetic */ a1 v2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(a1 a1Var, Context context, e1 e1Var) {
        super(context, e1Var, false);
        this.v2 = a1Var;
        this.t2 = new pa(a1Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.u2 = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint.setColor(-1);
    }

    @Override // org.telegram.ui.Cells.v0
    public final Paint H(String str) {
        if ("paintChatActionText".equals(str) || "paintChatActionText2".equals(str)) {
            return this.u2;
        }
        if ("paintChatActionBackground".equals(str)) {
            q5 q5Var = this.v2.h;
            q5Var.v0 = true;
            boolean z10 = q5Var.B0;
            pa paVar = this.t2;
            if (paVar.r != z10) {
                paVar.r = z10;
                if (paVar.i == 10) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.6f);
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, paVar.r ? 0.97f : 0.92f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, paVar.r ? 0.12f : -0.06f);
                    paVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    paVar.g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            Paint c10 = paVar.c(1.0f);
            if (c10 != null) {
                return c10;
            }
        }
        return super.H(str);
    }
}
