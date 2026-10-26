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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class z0 extends org.telegram.ui.Cells.v0 {
    public final pa t2;
    public final TextPaint u2;
    public final /* synthetic */ b1 v2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(b1 b1Var, Context context, f1 f1Var) {
        super(context, f1Var, false);
        this.v2 = b1Var;
        this.t2 = new pa(b1Var.d, this, 10, false);
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
