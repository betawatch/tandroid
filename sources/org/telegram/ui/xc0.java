package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class xc0 implements org.telegram.ui.Components.jt0 {
    public final /* synthetic */ id0 a;

    public xc0(id0 id0Var) {
        this.a = id0Var;
    }

    @Override // org.telegram.ui.Components.jt0
    public final void R() {
        id0 id0Var = this.a;
        yc0 yc0Var = id0Var.K0;
        int c02 = yc0Var == null ? 0 : yc0Var.c0(8);
        id0Var.L0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        wc0 wc0Var = id0Var.T;
        boolean z10 = c02 > 0;
        if (wc0Var.i0 != z10) {
            wc0Var.i0 = z10;
            wc0Var.l();
            id0Var.U.v0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.jt0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Components.jt0
    public final org.telegram.ui.Components.ll0 f() {
        return this.a.U;
    }

    @Override // org.telegram.ui.Components.jt0
    public final TLRPC.Chat g() {
        return null;
    }

    @Override // org.telegram.ui.Components.jt0
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z10, boolean z11, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.jt0
    public final boolean p() {
        return true;
    }

    @Override // org.telegram.ui.Components.jt0
    public final void D() {
    }
}
