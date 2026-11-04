package ug;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import gi.c5;
import org.telegram.messenger.az;
import org.telegram.ui.Components.ba;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p0 extends org.telegram.ui.Cells.t0 {
    public final ba u2;
    public final TextPaint v2;
    public final /* synthetic */ r0 w2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(r0 r0Var, Context context, s0 s0Var) {
        super(context, s0Var, false);
        this.w2 = r0Var;
        this.u2 = new ba(r0Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.v2 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, az.W0) - 2));
        textPaint.setColor(-1);
    }

    @Override // org.telegram.ui.Cells.t0
    public final Paint O(String str) {
        if ("paintChatActionText".equals(str) || "paintChatActionText2".equals(str)) {
            return this.v2;
        }
        if ("paintChatActionBackground".equals(str)) {
            c5 c5Var = this.w2.h;
            c5Var.w0 = true;
            boolean z10 = c5Var.C0;
            ba baVar = this.u2;
            if (baVar.r != z10) {
                baVar.r = z10;
                if (baVar.i == 10) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.6f);
                    org.telegram.messenger.g0.n2(colorMatrix, baVar.r ? 0.97f : 0.92f);
                    org.telegram.messenger.g0.h(colorMatrix, baVar.r ? 0.12f : -0.06f);
                    baVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    baVar.g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            Paint c2 = baVar.c(1.0f);
            if (c2 != null) {
                return c2;
            }
        }
        return super.O(str);
    }
}
