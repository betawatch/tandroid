package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class u11 extends s4.r {
    public final /* synthetic */ int Q;
    public final /* synthetic */ g31 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u11(g31 g31Var, int i10) {
        super(40);
        this.Q = i10;
        this.R = g31Var;
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
