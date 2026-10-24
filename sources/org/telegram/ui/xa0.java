package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class xa0 implements org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.rw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gb0 b;

    public /* synthetic */ xa0(gb0 gb0Var, int i10) {
        this.a = i10;
        this.b = gb0Var;
    }

    @Override // org.telegram.ui.Components.d5
    public void C(int i10, int i11, boolean z10) {
        this.b.V(i10);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        gb0 gb0Var = this.b;
        gb0Var.T.a(gb0Var.e);
        gb0Var.finishFragment();
    }

    @Override // org.telegram.ui.Components.rw0
    public void i(int i10) {
        switch (this.a) {
            case 2:
                gb0 gb0Var = this.b;
                if (i10 >= gb0Var.P.size()) {
                    gb0Var.w.setText("");
                    break;
                } else {
                    gb0Var.w.setText(LocaleController.formatDateAudio(gb0Var.getConnectionsManager().getCurrentTime() + ((Integer) r1.get(i10)).intValue(), false));
                    break;
                }
            default:
                gb0 gb0Var2 = this.b;
                gb0Var2.F.clearFocus();
                gb0Var2.O = true;
                ArrayList arrayList = gb0Var2.R;
                if (i10 < arrayList.size()) {
                    gb0Var2.F.setText(((Integer) arrayList.get(i10)).toString());
                } else {
                    gb0Var2.F.setText("");
                }
                gb0Var2.O = false;
                break;
        }
    }

    @Override // org.telegram.ui.Components.rw0
    public /* synthetic */ void m() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
