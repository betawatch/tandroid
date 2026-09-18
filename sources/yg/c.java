package yg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.ab;
import org.telegram.ui.Components.f9;
import tg.t;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class c extends ab {
    public final a a0;
    public TL_stories.PrepaidGiveaway b0;

    public c(Context context) {
        super(context, 0, 0, false);
        this.a0 = new a(context);
    }

    @Override // org.telegram.ui.Cells.ab
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public TL_stories.PrepaidGiveaway getPrepaidGiveaway() {
        return this.b0;
    }

    @Override // org.telegram.ui.Cells.ab, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.S) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(70.0f) : 0), getMeasuredHeight() - 1, j6.k0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.b0 = prepaidGiveaway;
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        f9 f9Var = this.E;
        if (z10) {
            f9Var.g(26);
            String valueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            a aVar = this.a0;
            aVar.f = valueOf;
            aVar.e = aVar.a.measureText(valueOf);
            aVar.invalidateSelf();
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            f9Var.g(16);
            int i10 = ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months;
            if (i10 == 12) {
                f9Var.i(-31392, -2796986);
            } else if (i10 == 6) {
                f9Var.i(-10703110, -12481584);
            } else {
                f9Var.i(-6631068, -11945404);
            }
            String valueOf2 = String.valueOf(t.g() * prepaidGiveaway.quantity);
            a aVar2 = this.a0;
            aVar2.f = valueOf2;
            aVar2.e = aVar2.a.measureText(valueOf2);
            aVar2.invalidateSelf();
        }
        this.b.i(this.a0);
    }
}
