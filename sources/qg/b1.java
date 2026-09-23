package qg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import ci.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.na;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class b1 extends org.telegram.ui.Cells.w0 {
    public final na l2;
    public final TextPaint m2;
    public final /* synthetic */ d1 n2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(d1 d1Var, Context context, com.google.firebase.messaging.n nVar) {
        super(context, nVar, false);
        this.n2 = d1Var;
        this.l2 = new na(d1Var.d, this, 10, false);
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
            b6 b6Var = this.n2.h;
            b6Var.v0 = true;
            boolean z10 = b6Var.B0;
            na naVar = this.l2;
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
