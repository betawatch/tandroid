package pg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import bi.b7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.ma;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class y0 extends org.telegram.ui.Cells.w0 {
    public final ma k2;
    public final TextPaint l2;
    public final /* synthetic */ a1 m2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(a1 a1Var, Context context, com.google.firebase.messaging.n nVar) {
        super(context, nVar, false);
        this.m2 = a1Var;
        this.k2 = new ma(a1Var.d, this, 10, false);
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
            b7 b7Var = this.m2.h;
            b7Var.v0 = true;
            boolean z10 = b7Var.B0;
            ma maVar = this.k2;
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
