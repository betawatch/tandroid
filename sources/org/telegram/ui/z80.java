package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z80 implements org.telegram.ui.Components.t4, org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.wt0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j90 b;

    public /* synthetic */ z80(j90 j90Var, int i7) {
        this.a = i7;
        this.b = j90Var;
    }

    @Override // org.telegram.ui.Components.t4
    public void L(int i7, int i10, boolean z9) {
        this.b.a0(i7);
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        j90 j90Var = this.b;
        j90Var.S.a(j90Var.e);
        j90Var.finishFragment();
    }

    @Override // org.telegram.ui.Components.wt0
    public void m(int i7) {
        switch (this.a) {
            case 2:
                j90 j90Var = this.b;
                if (i7 >= j90Var.O.size()) {
                    j90Var.x.setText("");
                    break;
                } else {
                    j90Var.x.setText(org.telegram.messenger.id.s(j90Var.getConnectionsManager().getCurrentTime() + ((Integer) r1.get(i7)).intValue(), false));
                    break;
                }
            default:
                j90 j90Var2 = this.b;
                j90Var2.F.clearFocus();
                j90Var2.N = true;
                ArrayList arrayList = j90Var2.Q;
                if (i7 < arrayList.size()) {
                    j90Var2.F.setText(((Integer) arrayList.get(i7)).toString());
                } else {
                    j90Var2.F.setText("");
                }
                j90Var2.N = false;
                break;
        }
    }

    @Override // org.telegram.ui.Components.wt0
    public /* synthetic */ void n() {
        int i7 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
