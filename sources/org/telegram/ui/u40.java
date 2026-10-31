package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u40 extends org.telegram.ui.Components.voip.k {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ org.telegram.ui.Components.sk0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u40(e50 e50Var, Context context) {
        super(context, true);
        this.n = e50Var;
    }

    @Override // org.telegram.ui.Components.voip.k, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        switch (this.h) {
            case 0:
                super.onAttachedToWindow();
                b50 b50Var = ((v40) this.n).M;
                if (b50Var.H1.getVisibility() == 0 && b50Var.G4) {
                    b50.J0(b50Var, this, true);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                e50 e50Var = (e50) this.n;
                if (e50Var.r && getParticipant() != null) {
                    e50Var.E(this, true);
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
                b50.J0(((v40) this.n).M, this, false);
                break;
            default:
                super.onDetachedFromWindow();
                ((e50) this.n).E(this, false);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u40(v40 v40Var, Context context) {
        super(context, false);
        this.n = v40Var;
    }
}
