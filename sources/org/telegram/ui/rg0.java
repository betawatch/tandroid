package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class rg0 extends ah.o {
    public final /* synthetic */ int L;
    public boolean M;
    public final /* synthetic */ org.telegram.ui.Components.sa N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rg0(org.telegram.ui.Components.sa saVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, i6Var);
        this.L = i7;
        this.N = saVar;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.L) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                ug0 ug0Var = (ug0) this.N;
                ug0Var.h2 = org.telegram.messenger.g0.L(64.0f) + getMeasuredHeight();
                ug0Var.g2.G();
                boolean z11 = this.M;
                boolean z12 = ug0Var.d;
                if (z11 != z12) {
                    this.M = z12;
                    if (z12) {
                        org.telegram.ui.Components.ck0 ck0Var = ug0Var.o1;
                        pi.l lVar = new pi.l(ug0Var.getContext(), 2, 0.6f);
                        lVar.a = 1;
                        lVar.p = org.telegram.messenger.g0.L(36.0f);
                        ck0Var.getLayoutManager().w0(lVar);
                        break;
                    }
                }
                break;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                wg.d1 d1Var = (wg.d1) this.N;
                d1Var.l2 = org.telegram.messenger.g0.L(64.0f) + getMeasuredHeight();
                d1Var.k2.G();
                boolean z13 = this.M;
                boolean z14 = d1Var.d;
                if (z13 != z14) {
                    this.M = z14;
                    if (z14) {
                        org.telegram.ui.Components.ck0 ck0Var2 = d1Var.o1;
                        pi.l lVar2 = new pi.l(d1Var.getContext(), 2, 0.6f);
                        lVar2.a = 1;
                        lVar2.p = org.telegram.messenger.g0.L(36.0f);
                        ck0Var2.getLayoutManager().w0(lVar2);
                        break;
                    }
                }
                break;
        }
    }
}
