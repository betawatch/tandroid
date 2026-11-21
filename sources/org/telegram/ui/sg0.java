package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class sg0 extends ah.o {
    public final /* synthetic */ int L;
    public boolean M;
    public final /* synthetic */ org.telegram.ui.Components.sa N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sg0(org.telegram.ui.Components.sa saVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.L = i7;
        this.N = saVar;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.L) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                vg0 vg0Var = (vg0) this.N;
                vg0Var.h2 = org.telegram.messenger.g0.L(64.0f) + getMeasuredHeight();
                vg0Var.g2.G();
                boolean z11 = this.M;
                boolean z12 = vg0Var.d;
                if (z11 != z12) {
                    this.M = z12;
                    if (z12) {
                        org.telegram.ui.Components.ek0 ek0Var = vg0Var.o1;
                        pi.l lVar = new pi.l(vg0Var.getContext(), 2, 0.6f);
                        lVar.a = 1;
                        lVar.p = org.telegram.messenger.g0.L(36.0f);
                        ek0Var.getLayoutManager().w0(lVar);
                        break;
                    }
                }
                break;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                wg.e1 e1Var = (wg.e1) this.N;
                e1Var.l2 = org.telegram.messenger.g0.L(64.0f) + getMeasuredHeight();
                e1Var.k2.G();
                boolean z13 = this.M;
                boolean z14 = e1Var.d;
                if (z13 != z14) {
                    this.M = z14;
                    if (z14) {
                        org.telegram.ui.Components.ek0 ek0Var2 = e1Var.o1;
                        pi.l lVar2 = new pi.l(e1Var.getContext(), 2, 0.6f);
                        lVar2.a = 1;
                        lVar2.p = org.telegram.messenger.g0.L(36.0f);
                        ek0Var2.getLayoutManager().w0(lVar2);
                        break;
                    }
                }
                break;
        }
    }
}
