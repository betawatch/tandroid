package zf;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import lh.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.da;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class y0 extends org.telegram.ui.Cells.v0 {
    public final da g2;
    public final TextPaint h2;
    public final /* synthetic */ a1 i2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(a1 a1Var, Context context, com.google.firebase.messaging.m mVar) {
        super(context, mVar, false);
        this.i2 = a1Var;
        this.g2 = new da(a1Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.h2 = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint.setColor(-1);
    }

    @Override // org.telegram.ui.Cells.v0
    public final Paint H(String str) {
        if ("paintChatActionText".equals(str) || "paintChatActionText2".equals(str)) {
            return this.h2;
        }
        if ("paintChatActionBackground".equals(str)) {
            r5 r5Var = this.i2.h;
            r5Var.r0 = true;
            boolean z10 = r5Var.x0;
            da daVar = this.g2;
            if (daVar.r != z10) {
                daVar.r = z10;
                if (daVar.i == 10) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.6f);
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, daVar.r ? 0.97f : 0.92f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, daVar.r ? 0.12f : -0.06f);
                    daVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    daVar.g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            Paint c10 = daVar.c(1.0f);
            if (c10 != null) {
                return c10;
            }
        }
        return super.H(str);
    }
}
