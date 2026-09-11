package rg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import di.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.na;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class a1 extends org.telegram.ui.Cells.w0 {
    public final na k2;
    public final TextPaint l2;
    public final /* synthetic */ c1 m2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(c1 c1Var, Context context, com.google.firebase.messaging.n nVar) {
        super(context, nVar, false);
        this.m2 = c1Var;
        this.k2 = new na(c1Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.l2 = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint.setColor(-1);
    }

    @Override // org.telegram.ui.Cells.w0
    public final Paint H(String str) {
        if ("paintChatActionText".equals(str) || "paintChatActionText2".equals(str)) {
            return this.l2;
        }
        if ("paintChatActionBackground".equals(str)) {
            c6 c6Var = this.m2.h;
            c6Var.v0 = true;
            boolean z10 = c6Var.B0;
            na naVar = this.k2;
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
        return super.H(str);
    }
}
