// default package

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xv4 extends v6c {
    public final ix2 c0;
    public TL_stories.PrepaidGiveaway d0;

    public xv4(Context context) {
        super(context, 0, 0, false);
        this.c0 = new ix2(context);
    }

    public TL_stories.PrepaidGiveaway getPrepaidGiveaway() {
        return this.d0;
    }

    @Override // v6c, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.T) {
            canvas.drawLine(k96.a0 ? 0.0f : gl.L(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(70.0f) : 0), getMeasuredHeight() - 1, bkb.j0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.d0 = prepaidGiveaway;
        boolean z = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        ix2 ix2Var = this.c0;
        pb0 pb0Var = this.F;
        if (z) {
            pb0Var.f(26);
            String valueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            ix2Var.c = valueOf;
            ix2Var.e = ix2Var.b.measureText(valueOf);
            ix2Var.invalidateSelf();
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            pb0Var.f(16);
            int i = ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months;
            if (i == 12) {
                pb0Var.h(-31392, -2796986);
            } else if (i == 6) {
                pb0Var.h(-10703110, -12481584);
            } else {
                pb0Var.h(-6631068, -11945404);
            }
            String valueOf2 = String.valueOf(on0.h() * prepaidGiveaway.quantity);
            ix2Var.c = valueOf2;
            ix2Var.e = ix2Var.b.measureText(valueOf2);
            ix2Var.invalidateSelf();
        }
        this.b.i(ix2Var);
    }
}
