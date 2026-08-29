package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ua0 implements org.telegram.ui.Components.b5, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.kv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ eb0 b;

    public /* synthetic */ ua0(eb0 eb0Var, int i10) {
        this.a = i10;
        this.b = eb0Var;
    }

    @Override // org.telegram.ui.Components.b5
    public void I(int i10, int i11, boolean z10) {
        this.b.V(i10);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        eb0 eb0Var = this.b;
        eb0Var.P.a(eb0Var.e);
        eb0Var.finishFragment();
    }

    @Override // org.telegram.ui.Components.kv0
    public void h(int i10) {
        switch (this.a) {
            case 2:
                eb0 eb0Var = this.b;
                if (i10 >= eb0Var.L.size()) {
                    eb0Var.w.setText("");
                    break;
                } else {
                    eb0Var.w.setText(LocaleController.formatDateAudio(eb0Var.getConnectionsManager().getCurrentTime() + ((Integer) r1.get(i10)).intValue(), false));
                    break;
                }
            default:
                eb0 eb0Var2 = this.b;
                eb0Var2.B.clearFocus();
                eb0Var2.K = true;
                ArrayList arrayList = eb0Var2.N;
                if (i10 < arrayList.size()) {
                    eb0Var2.B.setText(((Integer) arrayList.get(i10)).toString());
                } else {
                    eb0Var2.B.setText("");
                }
                eb0Var2.K = false;
                break;
        }
    }

    @Override // org.telegram.ui.Components.kv0
    public /* synthetic */ void m() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
