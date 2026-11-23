package tg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import hi.l5;
import org.telegram.messenger.bz;
import org.telegram.ui.Components.fa;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class v0 extends org.telegram.ui.Cells.v0 {
    public final TextPaint A2;
    public final /* synthetic */ x0 B2;
    public final fa z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(x0 x0Var, Context context, y0 y0Var) {
        super(context, y0Var, false);
        this.B2 = x0Var;
        this.z2 = new fa(x0Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.A2 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, bz.W0) - 2));
        textPaint.setColor(-1);
    }

    @Override // org.telegram.ui.Cells.v0
    public final Paint S(String str) {
        if ("paintChatActionText".equals(str) || "paintChatActionText2".equals(str)) {
            return this.A2;
        }
        if ("paintChatActionBackground".equals(str)) {
            l5 l5Var = this.B2.h;
            l5Var.x0 = true;
            boolean z10 = l5Var.D0;
            fa faVar = this.z2;
            if (faVar.r != z10) {
                faVar.r = z10;
                if (faVar.i == 10) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.6f);
                    org.telegram.messenger.g0.n2(colorMatrix, faVar.r ? 0.97f : 0.92f);
                    org.telegram.messenger.g0.h(colorMatrix, faVar.r ? 0.12f : -0.06f);
                    faVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    faVar.g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            Paint c10 = faVar.c(1.0f);
            if (c10 != null) {
                return c10;
            }
        }
        return super.S(str);
    }
}
