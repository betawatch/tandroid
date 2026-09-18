package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class yc0 implements org.telegram.ui.Components.wt0 {
    public final /* synthetic */ jd0 a;

    public yc0(jd0 jd0Var) {
        this.a = jd0Var;
    }

    @Override // org.telegram.ui.Components.wt0
    public final void R() {
        jd0 jd0Var = this.a;
        zc0 zc0Var = jd0Var.K0;
        int c02 = zc0Var == null ? 0 : zc0Var.c0(8);
        jd0Var.L0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        xc0 xc0Var = jd0Var.T;
        boolean z10 = c02 > 0;
        if (xc0Var.i0 != z10) {
            xc0Var.i0 = z10;
            xc0Var.l();
            jd0Var.U.w0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.wt0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Components.wt0
    public final org.telegram.ui.Components.wl0 f() {
        return this.a.U;
    }

    @Override // org.telegram.ui.Components.wt0
    public final TLRPC.Chat g() {
        return null;
    }

    @Override // org.telegram.ui.Components.wt0
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z10, boolean z11, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.wt0
    public final boolean p() {
        return true;
    }

    @Override // org.telegram.ui.Components.wt0
    public final void E() {
    }
}
