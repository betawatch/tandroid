package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class wc0 implements org.telegram.ui.Components.nu0 {
    public final /* synthetic */ hd0 a;

    public wc0(hd0 hd0Var) {
        this.a = hd0Var;
    }

    @Override // org.telegram.ui.Components.nu0
    public final void R() {
        hd0 hd0Var = this.a;
        xc0 xc0Var = hd0Var.K0;
        int c02 = xc0Var == null ? 0 : xc0Var.c0(8);
        hd0Var.L0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        vc0 vc0Var = hd0Var.T;
        boolean z10 = c02 > 0;
        if (vc0Var.i0 != z10) {
            vc0Var.i0 = z10;
            vc0Var.l();
            hd0Var.U.v0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.nu0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Components.nu0
    public final org.telegram.ui.Components.qm0 f() {
        return this.a.U;
    }

    @Override // org.telegram.ui.Components.nu0
    public final TLRPC.Chat g() {
        return null;
    }

    @Override // org.telegram.ui.Components.nu0
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z10, boolean z11, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.nu0
    public final boolean q() {
        return true;
    }

    @Override // org.telegram.ui.Components.nu0
    public final void E() {
    }
}
