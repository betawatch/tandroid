package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class qg0 extends ah.o {
    public final /* synthetic */ int K;
    public boolean L;
    public final /* synthetic */ org.telegram.ui.Components.ma M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qg0(org.telegram.ui.Components.ma maVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.K = i7;
        this.M = maVar;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.K) {
            case 0:
                super.onLayout(z9, i7, i10, i11, i12);
                tg0 tg0Var = (tg0) this.M;
                tg0Var.g2 = org.telegram.messenger.g0.L(64.0f) + getMeasuredHeight();
                tg0Var.f2.G();
                boolean z10 = this.L;
                boolean z11 = tg0Var.d;
                if (z10 != z11) {
                    this.L = z11;
                    if (z11) {
                        org.telegram.ui.Components.pj0 pj0Var = tg0Var.n1;
                        mi.m mVar = new mi.m(tg0Var.getContext(), 2, 0.6f);
                        mVar.a = 1;
                        mVar.p = org.telegram.messenger.g0.L(36.0f);
                        pj0Var.getLayoutManager().w0(mVar);
                        break;
                    }
                }
                break;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                wg.f1 f1Var = (wg.f1) this.M;
                f1Var.l2 = org.telegram.messenger.g0.L(64.0f) + getMeasuredHeight();
                f1Var.k2.G();
                boolean z12 = this.L;
                boolean z13 = f1Var.d;
                if (z12 != z13) {
                    this.L = z13;
                    if (z13) {
                        org.telegram.ui.Components.pj0 pj0Var2 = f1Var.n1;
                        mi.m mVar2 = new mi.m(f1Var.getContext(), 2, 0.6f);
                        mVar2.a = 1;
                        mVar2.p = org.telegram.messenger.g0.L(36.0f);
                        pj0Var2.getLayoutManager().w0(mVar2);
                        break;
                    }
                }
                break;
        }
    }
}
