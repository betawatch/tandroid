// default package

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class p17 extends uk1 {
    public final TextPaint A2;
    public final /* synthetic */ r17 B2;
    public final wl0 z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p17(r17 r17Var, Context context, t17 t17Var) {
        super(t17Var, context, false);
        this.B2 = r17Var;
        this.z2 = new wl0(r17Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.A2 = textPaint;
        textPaint.setTypeface(gl.o());
        textPaint.setTextSize(gl.L(Math.max(16, gba.S0) - 2));
        textPaint.setColor(-1);
    }

    @Override // uk1
    public final Paint R(String str) {
        if ("paintChatActionText".equals(str) || "paintChatActionText2".equals(str)) {
            return this.A2;
        }
        if ("paintChatActionBackground".equals(str)) {
            ot7 ot7Var = this.B2.h;
            ot7Var.x0 = true;
            boolean z = ot7Var.D0;
            wl0 wl0Var = this.z2;
            if (wl0Var.r != z) {
                wl0Var.r = z;
                if (wl0Var.i == 10) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.6f);
                    gl.l2(colorMatrix, wl0Var.r ? 0.97f : 0.92f);
                    gl.h(colorMatrix, wl0Var.r ? 0.12f : -0.06f);
                    wl0Var.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    wl0Var.g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            Paint c = wl0Var.c(1.0f);
            if (c != null) {
                return c;
            }
        }
        return super.R(str);
    }
}
