package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class va0 implements org.telegram.ui.Components.x4, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.cv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fb0 b;

    public /* synthetic */ va0(fb0 fb0Var, int i10) {
        this.a = i10;
        this.b = fb0Var;
    }

    @Override // org.telegram.ui.Components.x4
    public void I(int i10, int i11, boolean z10) {
        this.b.V(i10);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        fb0 fb0Var = this.b;
        fb0Var.P.a(fb0Var.e);
        fb0Var.finishFragment();
    }

    @Override // org.telegram.ui.Components.cv0
    public void j(int i10) {
        switch (this.a) {
            case 2:
                fb0 fb0Var = this.b;
                if (i10 >= fb0Var.L.size()) {
                    fb0Var.w.setText("");
                    break;
                } else {
                    fb0Var.w.setText(LocaleController.formatDateAudio(fb0Var.getConnectionsManager().getCurrentTime() + ((Integer) r1.get(i10)).intValue(), false));
                    break;
                }
            default:
                fb0 fb0Var2 = this.b;
                fb0Var2.B.clearFocus();
                fb0Var2.K = true;
                ArrayList arrayList = fb0Var2.N;
                if (i10 < arrayList.size()) {
                    fb0Var2.B.setText(((Integer) arrayList.get(i10)).toString());
                } else {
                    fb0Var2.B.setText("");
                }
                fb0Var2.K = false;
                break;
        }
    }

    @Override // org.telegram.ui.Components.cv0
    public /* synthetic */ void m() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
