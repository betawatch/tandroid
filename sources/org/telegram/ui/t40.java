package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class t40 extends org.telegram.ui.Components.voip.k {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ org.telegram.ui.Components.tk0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t40(d50 d50Var, Context context) {
        super(context, true);
        this.n = d50Var;
    }

    @Override // org.telegram.ui.Components.voip.k, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        switch (this.h) {
            case 0:
                super.onAttachedToWindow();
                a50 a50Var = ((u40) this.n).M;
                if (a50Var.H1.getVisibility() == 0 && a50Var.G4) {
                    a50.J0(a50Var, this, true);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                d50 d50Var = (d50) this.n;
                if (d50Var.r && getParticipant() != null) {
                    d50Var.E(this, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.k, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        switch (this.h) {
            case 0:
                super.onDetachedFromWindow();
                a50.J0(((u40) this.n).M, this, false);
                break;
            default:
                super.onDetachedFromWindow();
                ((d50) this.n).E(this, false);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t40(u40 u40Var, Context context) {
        super(context, false);
        this.n = u40Var;
    }
}
