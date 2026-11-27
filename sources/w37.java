// default package

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class w37 extends dl1 {
    public final TextPaint A2;
    public final /* synthetic */ y37 B2;
    public final xl0 z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w37(y37 y37Var, Context context, a47 a47Var) {
        super(a47Var, context, false);
        this.B2 = y37Var;
        this.z2 = new xl0(y37Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.A2 = textPaint;
        textPaint.setTypeface(hl.o());
        textPaint.setTextSize(hl.L(Math.max(16, xea.S0) - 2));
        textPaint.setColor(-1);
    }

    @Override // dl1
    public final Paint Q(String str) {
        if ("paintChatActionText".equals(str) || "paintChatActionText2".equals(str)) {
            return this.A2;
        }
        if ("paintChatActionBackground".equals(str)) {
            vw7 vw7Var = this.B2.h;
            vw7Var.x0 = true;
            boolean z = vw7Var.D0;
            xl0 xl0Var = this.z2;
            if (xl0Var.r != z) {
                xl0Var.r = z;
                if (xl0Var.i == 10) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.6f);
                    hl.l2(colorMatrix, xl0Var.r ? 0.97f : 0.92f);
                    hl.h(colorMatrix, xl0Var.r ? 0.12f : -0.06f);
                    xl0Var.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    xl0Var.g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            Paint c = xl0Var.c(1.0f);
            if (c != null) {
                return c;
            }
        }
        return super.Q(str);
    }
}
