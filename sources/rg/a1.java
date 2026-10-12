package rg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import di.a6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.pa;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class a1 extends org.telegram.ui.Cells.x0 {
    public final pa t2;
    public final TextPaint u2;
    public final /* synthetic */ c1 v2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(c1 c1Var, Context context, com.google.firebase.messaging.m mVar) {
        super(context, mVar, false);
        this.v2 = c1Var;
        this.t2 = new pa(c1Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.u2 = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint.setColor(-1);
    }

    @Override // org.telegram.ui.Cells.x0
    public final Paint I(String str) {
        if ("paintChatActionText".equals(str) || "paintChatActionText2".equals(str)) {
            return this.u2;
        }
        if ("paintChatActionBackground".equals(str)) {
            a6 a6Var = this.v2.h;
            a6Var.v0 = true;
            boolean z10 = a6Var.B0;
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
        return super.I(str);
    }
}
