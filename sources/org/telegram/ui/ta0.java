package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ta0 implements org.telegram.ui.Components.e5, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.yw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ db0 b;

    public /* synthetic */ ta0(db0 db0Var, int i10) {
        this.a = i10;
        this.b = db0Var;
    }

    @Override // org.telegram.ui.Components.e5
    public void G(int i10, int i11, boolean z10) {
        this.b.W(i10);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        db0 db0Var = this.b;
        db0Var.S.a(db0Var.e);
        db0Var.finishFragment();
    }

    @Override // org.telegram.ui.Components.yw0
    public void j(int i10) {
        switch (this.a) {
            case 2:
                db0 db0Var = this.b;
                if (i10 >= db0Var.O.size()) {
                    db0Var.w.setText("");
                    break;
                } else {
                    db0Var.w.setText(LocaleController.formatDateAudio(db0Var.getConnectionsManager().getCurrentTime() + ((Integer) r1.get(i10)).intValue(), false));
                    break;
                }
            default:
                db0 db0Var2 = this.b;
                db0Var2.F.clearFocus();
                db0Var2.N = true;
                ArrayList arrayList = db0Var2.Q;
                if (i10 < arrayList.size()) {
                    db0Var2.F.setText(((Integer) arrayList.get(i10)).toString());
                } else {
                    db0Var2.F.setText("");
                }
                db0Var2.N = false;
                break;
        }
    }

    @Override // org.telegram.ui.Components.yw0
    public /* synthetic */ void m() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
