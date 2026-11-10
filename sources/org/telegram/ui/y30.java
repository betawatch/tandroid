package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class y30 extends org.telegram.ui.Components.voip.r {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ org.telegram.ui.Components.oj0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y30(i40 i40Var, Context context) {
        super(context, true);
        this.n = i40Var;
    }

    @Override // org.telegram.ui.Components.voip.r, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        switch (this.h) {
            case 0:
                super.onAttachedToWindow();
                f40 f40Var = ((z30) this.n).M;
                if (f40Var.K1.getVisibility() == 0 && f40Var.J4) {
                    f40.J0(f40Var, this, true);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                i40 i40Var = (i40) this.n;
                if (i40Var.r && getParticipant() != null) {
                    i40Var.E(this, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.r, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        switch (this.h) {
            case 0:
                super.onDetachedFromWindow();
                f40.J0(((z30) this.n).M, this, false);
                break;
            default:
                super.onDetachedFromWindow();
                ((i40) this.n).E(this, false);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y30(z30 z30Var, Context context) {
        super(context, false);
        this.n = z30Var;
    }
}
