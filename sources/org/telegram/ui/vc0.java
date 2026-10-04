package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class vc0 implements org.telegram.ui.Components.bu0 {
    public final /* synthetic */ gd0 a;

    public vc0(gd0 gd0Var) {
        this.a = gd0Var;
    }

    @Override // org.telegram.ui.Components.bu0
    public final void P() {
        gd0 gd0Var = this.a;
        wc0 wc0Var = gd0Var.K0;
        int c02 = wc0Var == null ? 0 : wc0Var.c0(8);
        gd0Var.L0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        uc0 uc0Var = gd0Var.T;
        boolean z10 = c02 > 0;
        if (uc0Var.i0 != z10) {
            uc0Var.i0 = z10;
            uc0Var.l();
            gd0Var.U.w0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.bu0
    public final boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Components.bu0
    public final org.telegram.ui.Components.zl0 f() {
        return this.a.U;
    }

    @Override // org.telegram.ui.Components.bu0
    public final TLRPC.Chat g() {
        return null;
    }

    @Override // org.telegram.ui.Components.bu0
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z10, boolean z11, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bu0
    public final boolean p() {
        return true;
    }

    @Override // org.telegram.ui.Components.bu0
    public final void C() {
    }
}
