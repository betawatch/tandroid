package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vz0 extends u4.s {
    public final /* synthetic */ int Q;
    public final /* synthetic */ g11 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vz0(g11 g11Var, int i3) {
        super(40);
        this.Q = i3;
        this.R = g11Var;
    }

    @Override // u4.b0, u4.o0
    public final void v0(RecyclerView recyclerView, u4.a1 a1Var, int i3) {
        switch (this.Q) {
            case 0:
                try {
                    gi.j1 j1Var = new gi.j1(3, recyclerView.getContext(), this);
                    j1Var.a = i3;
                    w0(j1Var);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            default:
                try {
                    gi.j1 j1Var2 = new gi.j1(5, recyclerView.getContext(), this);
                    j1Var2.a = i3;
                    w0(j1Var2);
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }
}
