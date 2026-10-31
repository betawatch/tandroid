package rg;

import android.content.Context;
import android.graphics.Canvas;
import mg.k0;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.r8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c extends pa {
    public final a b0;
    public TL_stories.PrepaidGiveaway c0;

    public c(Context context) {
        super(context, 0, 0, false);
        this.b0 = new a(context);
    }

    public TL_stories.PrepaidGiveaway getPrepaidGiveaway() {
        return this.c0;
    }

    @Override // org.telegram.ui.Cells.pa, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.S) {
            canvas.drawLine(cd.X ? 0.0f : i0.L(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (cd.X ? i0.L(70.0f) : 0), getMeasuredHeight() - 1, t6.k0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.c0 = prepaidGiveaway;
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        r8 r8Var = this.E;
        if (z10) {
            r8Var.g(26);
            String valueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            a aVar = this.b0;
            aVar.f = valueOf;
            aVar.e = aVar.a.measureText(valueOf);
            aVar.invalidateSelf();
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            r8Var.g(16);
            int i10 = ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months;
            if (i10 == 12) {
                r8Var.i(-31392, -2796986);
            } else if (i10 == 6) {
                r8Var.i(-10703110, -12481584);
            } else {
                r8Var.i(-6631068, -11945404);
            }
            String valueOf2 = String.valueOf(k0.g() * prepaidGiveaway.quantity);
            a aVar2 = this.b0;
            aVar2.f = valueOf2;
            aVar2.e = aVar2.a.measureText(valueOf2);
            aVar2.invalidateSelf();
        }
        this.b.i(this.b0);
    }
}
