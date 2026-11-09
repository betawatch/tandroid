package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class x30 extends org.telegram.ui.Components.voip.r {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ org.telegram.ui.Components.pj0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x30(h40 h40Var, Context context) {
        super(context, true);
        this.n = h40Var;
    }

    @Override // org.telegram.ui.Components.voip.r, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        switch (this.h) {
            case 0:
                super.onAttachedToWindow();
                e40 e40Var = ((y30) this.n).M;
                if (e40Var.H1.getVisibility() == 0 && e40Var.G4) {
                    e40.J0(e40Var, this, true);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                h40 h40Var = (h40) this.n;
                if (h40Var.r && getParticipant() != null) {
                    h40Var.E(this, true);
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
                e40.J0(((y30) this.n).M, this, false);
                break;
            default:
                super.onDetachedFromWindow();
                ((h40) this.n).E(this, false);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x30(y30 y30Var, Context context) {
        super(context, false);
        this.n = y30Var;
    }
}
