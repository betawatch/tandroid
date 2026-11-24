// default package

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zx4 extends w8c {
    public final sy2 c0;
    public TL_stories.PrepaidGiveaway d0;

    public zx4(Context context) {
        super(context, 0, 0, false);
        this.c0 = new sy2(context);
    }

    public TL_stories.PrepaidGiveaway getPrepaidGiveaway() {
        return this.d0;
    }

    @Override // w8c, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.T) {
            canvas.drawLine(jb6.a0 ? 0.0f : gm.L(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(70.0f) : 0), getMeasuredHeight() - 1, cmb.j0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.d0 = prepaidGiveaway;
        boolean z = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        sy2 sy2Var = this.c0;
        pc0 pc0Var = this.F;
        if (z) {
            pc0Var.f(26);
            String valueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            sy2Var.c = valueOf;
            sy2Var.e = sy2Var.b.measureText(valueOf);
            sy2Var.invalidateSelf();
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            pc0Var.f(16);
            int i = ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months;
            if (i == 12) {
                pc0Var.h(-31392, -2796986);
            } else if (i == 6) {
                pc0Var.h(-10703110, -12481584);
            } else {
                pc0Var.h(-6631068, -11945404);
            }
            String valueOf2 = String.valueOf(oo0.h() * prepaidGiveaway.quantity);
            sy2Var.c = valueOf2;
            sy2Var.e = sy2Var.b.measureText(valueOf2);
            sy2Var.invalidateSelf();
        }
        this.b.i(sy2Var);
    }
}
