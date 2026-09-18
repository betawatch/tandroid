package qg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import ci.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.la;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class b1 extends org.telegram.ui.Cells.w0 {
    public final la l2;
    public final TextPaint m2;
    public final /* synthetic */ d1 n2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(d1 d1Var, Context context, com.google.firebase.messaging.n nVar) {
        super(context, nVar, false);
        this.n2 = d1Var;
        this.l2 = new la(d1Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.m2 = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint.setColor(-1);
    }

    @Override // org.telegram.ui.Cells.w0
    public final Paint H(String str) {
        if ("paintChatActionText".equals(str) || "paintChatActionText2".equals(str)) {
            return this.m2;
        }
        if ("paintChatActionBackground".equals(str)) {
            c6 c6Var = this.n2.h;
            c6Var.v0 = true;
            boolean z10 = c6Var.B0;
            la laVar = this.l2;
            if (laVar.r != z10) {
                laVar.r = z10;
                if (laVar.i == 10) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.6f);
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, laVar.r ? 0.97f : 0.92f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, laVar.r ? 0.12f : -0.06f);
                    laVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    laVar.g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            Paint c10 = laVar.c(1.0f);
            if (c10 != null) {
                return c10;
            }
        }
        return super.H(str);
    }
}
