package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w11 extends s4.r {
    public final /* synthetic */ int Q;
    public final /* synthetic */ i31 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w11(i31 i31Var, int i10) {
        super(40);
        this.Q = i10;
        this.R = i31Var;
    }

    @Override // s4.a0, s4.n0
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        switch (this.Q) {
            case 0:
                try {
                    org.telegram.ui.Components.qw qwVar = new org.telegram.ui.Components.qw(this, recyclerView.getContext(), 2);
                    qwVar.a = i10;
                    w0(qwVar);
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            default:
                try {
                    org.telegram.ui.Components.qw qwVar2 = new org.telegram.ui.Components.qw(this, recyclerView.getContext(), 4);
                    qwVar2.a = i10;
                    w0(qwVar2);
                    break;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return;
                }
        }
    }
}
