package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class rc0 implements org.telegram.ui.Components.jt0 {
    public final /* synthetic */ cd0 a;

    public rc0(cd0 cd0Var) {
        this.a = cd0Var;
    }

    @Override // org.telegram.ui.Components.jt0
    public final void R() {
        cd0 cd0Var = this.a;
        sc0 sc0Var = cd0Var.H0;
        int c02 = sc0Var == null ? 0 : sc0Var.c0(8);
        cd0Var.I0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        qc0 qc0Var = cd0Var.Q;
        boolean z4 = c02 > 0;
        if (qc0Var.f0 != z4) {
            qc0Var.f0 = z4;
            qc0Var.l();
            cd0Var.R.v0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.jt0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Components.jt0
    public final org.telegram.ui.Components.rl0 f() {
        return this.a.R;
    }

    @Override // org.telegram.ui.Components.jt0
    public final TLRPC.Chat g() {
        return null;
    }

    @Override // org.telegram.ui.Components.jt0
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z4, boolean z10, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.jt0
    public final boolean q() {
        return true;
    }

    @Override // org.telegram.ui.Components.jt0
    public final void E() {
    }
}
