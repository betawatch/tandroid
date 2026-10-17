package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sa0 implements org.telegram.ui.Components.e5, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.mw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cb0 b;

    public /* synthetic */ sa0(cb0 cb0Var, int i10) {
        this.a = i10;
        this.b = cb0Var;
    }

    @Override // org.telegram.ui.Components.e5
    public void C(int i10, int i11, boolean z10) {
        this.b.V(i10);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        cb0 cb0Var = this.b;
        cb0Var.T.a(cb0Var.e);
        cb0Var.finishFragment();
    }

    @Override // org.telegram.ui.Components.mw0
    public void h(int i10) {
        switch (this.a) {
            case 2:
                cb0 cb0Var = this.b;
                if (i10 >= cb0Var.P.size()) {
                    cb0Var.w.setText("");
                    break;
                } else {
                    cb0Var.w.setText(LocaleController.formatDateAudio(cb0Var.getConnectionsManager().getCurrentTime() + ((Integer) r1.get(i10)).intValue(), false));
                    break;
                }
            default:
                cb0 cb0Var2 = this.b;
                cb0Var2.F.clearFocus();
                cb0Var2.O = true;
                ArrayList arrayList = cb0Var2.R;
                if (i10 < arrayList.size()) {
                    cb0Var2.F.setText(((Integer) arrayList.get(i10)).toString());
                } else {
                    cb0Var2.F.setText("");
                }
                cb0Var2.O = false;
                break;
        }
    }

    @Override // org.telegram.ui.Components.mw0
    public /* synthetic */ void m() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
