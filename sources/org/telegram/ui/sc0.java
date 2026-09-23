package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class sc0 implements org.telegram.ui.Components.kt0 {
    public final /* synthetic */ dd0 a;

    public sc0(dd0 dd0Var) {
        this.a = dd0Var;
    }

    @Override // org.telegram.ui.Components.kt0
    public final void R() {
        dd0 dd0Var = this.a;
        tc0 tc0Var = dd0Var.K0;
        int c02 = tc0Var == null ? 0 : tc0Var.c0(8);
        dd0Var.L0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        rc0 rc0Var = dd0Var.T;
        boolean z10 = c02 > 0;
        if (rc0Var.i0 != z10) {
            rc0Var.i0 = z10;
            rc0Var.l();
            dd0Var.U.v0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.kt0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Components.kt0
    public final org.telegram.ui.Components.ml0 f() {
        return this.a.U;
    }

    @Override // org.telegram.ui.Components.kt0
    public final TLRPC.Chat g() {
        return null;
    }

    @Override // org.telegram.ui.Components.kt0
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z10, boolean z11, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.kt0
    public final boolean p() {
        return true;
    }

    @Override // org.telegram.ui.Components.kt0
    public final void E() {
    }
}
