package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ra0 implements org.telegram.ui.Components.x4, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.av0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bb0 b;

    public /* synthetic */ ra0(bb0 bb0Var, int i9) {
        this.a = i9;
        this.b = bb0Var;
    }

    @Override // org.telegram.ui.Components.x4
    public void B(int i9, int i10, boolean z10) {
        this.b.U(i9);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        bb0 bb0Var = this.b;
        bb0Var.P.a(bb0Var.e);
        bb0Var.finishFragment();
    }

    @Override // org.telegram.ui.Components.av0
    public void h(int i9) {
        switch (this.a) {
            case 2:
                bb0 bb0Var = this.b;
                if (i9 >= bb0Var.L.size()) {
                    bb0Var.w.setText("");
                    break;
                } else {
                    bb0Var.w.setText(LocaleController.formatDateAudio(bb0Var.getConnectionsManager().getCurrentTime() + ((Integer) r1.get(i9)).intValue(), false));
                    break;
                }
            default:
                bb0 bb0Var2 = this.b;
                bb0Var2.B.clearFocus();
                bb0Var2.K = true;
                ArrayList arrayList = bb0Var2.N;
                if (i9 < arrayList.size()) {
                    bb0Var2.B.setText(((Integer) arrayList.get(i9)).toString());
                } else {
                    bb0Var2.B.setText("");
                }
                bb0Var2.K = false;
                break;
        }
    }

    @Override // org.telegram.ui.Components.av0
    public /* synthetic */ void m() {
        int i9 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
