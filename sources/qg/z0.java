package qg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import ci.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.ma;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class z0 extends org.telegram.ui.Cells.w0 {
    public final ma l2;
    public final TextPaint m2;
    public final /* synthetic */ b1 n2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(b1 b1Var, Context context, com.google.firebase.messaging.n nVar) {
        super(context, nVar, false);
        this.n2 = b1Var;
        this.l2 = new ma(b1Var.d, this, 10, false);
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
            ma maVar = this.l2;
            if (maVar.r != z10) {
                maVar.r = z10;
                if (maVar.i == 10) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.6f);
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, maVar.r ? 0.97f : 0.92f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, maVar.r ? 0.12f : -0.06f);
                    maVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    maVar.g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            Paint c10 = maVar.c(1.0f);
            if (c10 != null) {
                return c10;
            }
        }
        return super.H(str);
    }
}
