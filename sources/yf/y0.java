package yf;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import kh.s5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.fa;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y0 extends org.telegram.ui.Cells.w0 {
    public final fa g2;
    public final TextPaint h2;
    public final /* synthetic */ a1 i2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(a1 a1Var, Context context, com.google.firebase.messaging.m mVar) {
        super(context, mVar, false);
        this.i2 = a1Var;
        this.g2 = new fa(a1Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.h2 = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint.setColor(-1);
    }

    @Override // org.telegram.ui.Cells.w0
    public final Paint G(String str) {
        if ("paintChatActionText".equals(str) || "paintChatActionText2".equals(str)) {
            return this.h2;
        }
        if ("paintChatActionBackground".equals(str)) {
            s5 s5Var = this.i2.h;
            s5Var.r0 = true;
            boolean z10 = s5Var.x0;
            fa faVar = this.g2;
            if (faVar.r != z10) {
                faVar.r = z10;
                if (faVar.i == 10) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.6f);
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, faVar.r ? 0.97f : 0.92f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, faVar.r ? 0.12f : -0.06f);
                    faVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    faVar.g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            Paint c10 = faVar.c(1.0f);
            if (c10 != null) {
                return c10;
            }
        }
        return super.G(str);
    }
}
