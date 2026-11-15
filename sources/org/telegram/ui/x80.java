package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class x80 implements org.telegram.ui.Components.r4, org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.vt0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i90 b;

    public /* synthetic */ x80(i90 i90Var, int i7) {
        this.a = i7;
        this.b = i90Var;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i7, int i10, boolean z10) {
        this.b.a0(i7);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        i90 i90Var = this.b;
        i90Var.T.a(i90Var.e);
        i90Var.finishFragment();
    }

    @Override // org.telegram.ui.Components.vt0
    public void l(int i7) {
        switch (this.a) {
            case 2:
                i90 i90Var = this.b;
                if (i7 >= i90Var.P.size()) {
                    i90Var.x.setText("");
                    break;
                } else {
                    i90Var.x.setText(org.telegram.messenger.hd.s(i90Var.getConnectionsManager().getCurrentTime() + ((Integer) r1.get(i7)).intValue(), false));
                    break;
                }
            default:
                i90 i90Var2 = this.b;
                i90Var2.G.clearFocus();
                i90Var2.O = true;
                ArrayList arrayList = i90Var2.R;
                if (i7 < arrayList.size()) {
                    i90Var2.G.setText(((Integer) arrayList.get(i7)).toString());
                } else {
                    i90Var2.G.setText("");
                }
                i90Var2.O = false;
                break;
        }
    }

    @Override // org.telegram.ui.Components.vt0
    public /* synthetic */ void p() {
        int i7 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
