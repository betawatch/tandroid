package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class rc0 implements org.telegram.ui.Components.vt0 {
    public final /* synthetic */ cd0 a;

    public rc0(cd0 cd0Var) {
        this.a = cd0Var;
    }

    @Override // org.telegram.ui.Components.vt0
    public final void R() {
        cd0 cd0Var = this.a;
        sc0 sc0Var = cd0Var.K0;
        int c02 = sc0Var == null ? 0 : sc0Var.c0(8);
        cd0Var.L0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        qc0 qc0Var = cd0Var.T;
        boolean z10 = c02 > 0;
        if (qc0Var.i0 != z10) {
            qc0Var.i0 = z10;
            qc0Var.l();
            cd0Var.U.v0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.vt0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Components.vt0
    public final org.telegram.ui.Components.wl0 f() {
        return this.a.U;
    }

    @Override // org.telegram.ui.Components.vt0
    public final TLRPC.Chat g() {
        return null;
    }

    @Override // org.telegram.ui.Components.vt0
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z10, boolean z11, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.vt0
    public final boolean p() {
        return true;
    }

    @Override // org.telegram.ui.Components.vt0
    public final void E() {
    }
}
