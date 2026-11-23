package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z80 implements org.telegram.ui.Components.z4, org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.fu0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j90 b;

    public /* synthetic */ z80(j90 j90Var, int i7) {
        this.a = i7;
        this.b = j90Var;
    }

    @Override // org.telegram.ui.Components.z4
    public void I(int i7, int i10, boolean z10) {
        this.b.a0(i7);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        j90 j90Var = this.b;
        j90Var.T.a(j90Var.e);
        j90Var.finishFragment();
    }

    @Override // org.telegram.ui.Components.fu0
    public void n(int i7) {
        switch (this.a) {
            case 2:
                j90 j90Var = this.b;
                if (i7 >= j90Var.P.size()) {
                    j90Var.x.setText("");
                    break;
                } else {
                    j90Var.x.setText(org.telegram.messenger.gd.s(j90Var.getConnectionsManager().getCurrentTime() + ((Integer) r1.get(i7)).intValue(), false));
                    break;
                }
            default:
                j90 j90Var2 = this.b;
                j90Var2.G.clearFocus();
                j90Var2.O = true;
                ArrayList arrayList = j90Var2.R;
                if (i7 < arrayList.size()) {
                    j90Var2.G.setText(((Integer) arrayList.get(i7)).toString());
                } else {
                    j90Var2.G.setText("");
                }
                j90Var2.O = false;
                break;
        }
    }

    @Override // org.telegram.ui.Components.fu0
    public /* synthetic */ void o() {
        int i7 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
