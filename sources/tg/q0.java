package tg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import fi.e5;
import org.telegram.messenger.iz;
import org.telegram.ui.Components.ca;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class q0 extends org.telegram.ui.Cells.t0 {
    public final ca t2;
    public final TextPaint u2;
    public final /* synthetic */ s0 v2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(s0 s0Var, Context context, t0 t0Var) {
        super(context, t0Var, false);
        this.v2 = s0Var;
        this.t2 = new ca(s0Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.u2 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, iz.W0) - 2));
        textPaint.setColor(-1);
    }

    @Override // org.telegram.ui.Cells.t0
    public final Paint N(String str) {
        if ("paintChatActionText".equals(str) || "paintChatActionText2".equals(str)) {
            return this.u2;
        }
        if ("paintChatActionBackground".equals(str)) {
            e5 e5Var = this.v2.h;
            e5Var.v0 = true;
            boolean z9 = e5Var.B0;
            ca caVar = this.t2;
            if (caVar.r != z9) {
                caVar.r = z9;
                if (caVar.i == 10) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.6f);
                    org.telegram.messenger.g0.n2(colorMatrix, caVar.r ? 0.97f : 0.92f);
                    org.telegram.messenger.g0.h(colorMatrix, caVar.r ? 0.12f : -0.06f);
                    caVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    caVar.g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            Paint c10 = caVar.c(1.0f);
            if (c10 != null) {
                return c10;
            }
        }
        return super.N(str);
    }
}
