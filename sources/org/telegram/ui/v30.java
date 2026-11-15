package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class v30 extends org.telegram.ui.Components.voip.r {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ org.telegram.ui.Components.tj0 n;

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
                c40 c40Var = ((w30) this.n).N;
                if (c40Var.L1.getVisibility() == 0 && c40Var.O4) {
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
                c40.J0(((w30) this.n).N, this, false);
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
