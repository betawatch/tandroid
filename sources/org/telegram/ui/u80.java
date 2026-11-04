package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u80 implements org.telegram.ui.Components.r4, org.telegram.ui.ActionBar.p1, org.telegram.ui.Components.tt0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e90 b;

    public /* synthetic */ u80(e90 e90Var, int i3) {
        this.a = i3;
        this.b = e90Var;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i3, int i10, boolean z10) {
        this.b.a0(i3);
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        e90 e90Var = this.b;
        e90Var.T.a(e90Var.e);
        e90Var.finishFragment();
    }

    @Override // org.telegram.ui.Components.tt0
    public void l(int i3) {
        switch (this.a) {
            case 2:
                e90 e90Var = this.b;
                if (i3 >= e90Var.P.size()) {
                    e90Var.x.setText("");
                    break;
                } else {
                    e90Var.x.setText(org.telegram.messenger.bd.s(e90Var.getConnectionsManager().getCurrentTime() + ((Integer) r1.get(i3)).intValue(), false));
                    break;
                }
            default:
                e90 e90Var2 = this.b;
                e90Var2.G.clearFocus();
                e90Var2.O = true;
                ArrayList arrayList = e90Var2.R;
                if (i3 < arrayList.size()) {
                    e90Var2.G.setText(((Integer) arrayList.get(i3)).toString());
                } else {
                    e90Var2.G.setText("");
                }
                e90Var2.O = false;
                break;
        }
    }

    @Override // org.telegram.ui.Components.tt0
    public /* synthetic */ void p() {
        int i3 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
