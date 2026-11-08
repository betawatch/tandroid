package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x80 implements org.telegram.ui.Components.t4, org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.ut0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h90 b;

    public /* synthetic */ x80(h90 h90Var, int i7) {
        this.a = i7;
        this.b = h90Var;
    }

    @Override // org.telegram.ui.Components.t4
    public void L(int i7, int i10, boolean z9) {
        this.b.a0(i7);
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        h90 h90Var = this.b;
        h90Var.S.a(h90Var.e);
        h90Var.finishFragment();
    }

    @Override // org.telegram.ui.Components.ut0
    public void m(int i7) {
        switch (this.a) {
            case 2:
                h90 h90Var = this.b;
                if (i7 >= h90Var.O.size()) {
                    h90Var.x.setText("");
                    break;
                } else {
                    h90Var.x.setText(org.telegram.messenger.id.s(h90Var.getConnectionsManager().getCurrentTime() + ((Integer) r1.get(i7)).intValue(), false));
                    break;
                }
            default:
                h90 h90Var2 = this.b;
                h90Var2.F.clearFocus();
                h90Var2.N = true;
                ArrayList arrayList = h90Var2.Q;
                if (i7 < arrayList.size()) {
                    h90Var2.F.setText(((Integer) arrayList.get(i7)).toString());
                } else {
                    h90Var2.F.setText("");
                }
                h90Var2.N = false;
                break;
        }
    }

    @Override // org.telegram.ui.Components.ut0
    public /* synthetic */ void n() {
        int i7 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
