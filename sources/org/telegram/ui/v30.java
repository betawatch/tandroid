package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class v30 extends org.telegram.ui.Components.voip.r {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ org.telegram.ui.Components.oj0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v30(f40 f40Var, Context context) {
        super(context, true);
        this.n = f40Var;
    }

    @Override // org.telegram.ui.Components.voip.r, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        switch (this.h) {
            case 0:
                super.onAttachedToWindow();
                c40 c40Var = ((w30) this.n).M;
                if (c40Var.H1.getVisibility() == 0 && c40Var.G4) {
                    c40.J0(c40Var, this, true);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                f40 f40Var = (f40) this.n;
                if (f40Var.r && getParticipant() != null) {
                    f40Var.E(this, true);
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
                c40.J0(((w30) this.n).M, this, false);
                break;
            default:
                super.onDetachedFromWindow();
                ((f40) this.n).E(this, false);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v30(w30 w30Var, Context context) {
        super(context, false);
        this.n = w30Var;
    }
}
