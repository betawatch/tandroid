package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class x30 extends org.telegram.ui.Components.voip.s {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ org.telegram.ui.Components.dk0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x30(h40 h40Var, Context context) {
        super(context, true);
        this.n = h40Var;
    }

    @Override // org.telegram.ui.Components.voip.s, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        switch (this.h) {
            case 0:
                super.onAttachedToWindow();
                e40 e40Var = ((y30) this.n).N;
                if (e40Var.L1.getVisibility() == 0 && e40Var.O4) {
                    e40.K0(e40Var, this, true);
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

    @Override // org.telegram.ui.Components.voip.s, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        switch (this.h) {
            case 0:
                super.onDetachedFromWindow();
                e40.K0(((y30) this.n).N, this, false);
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
