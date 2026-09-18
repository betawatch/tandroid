package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class zc0 implements org.telegram.ui.Components.lt0 {
    public final /* synthetic */ kd0 a;

    public zc0(kd0 kd0Var) {
        this.a = kd0Var;
    }

    @Override // org.telegram.ui.Components.lt0
    public final void R() {
        kd0 kd0Var = this.a;
        ad0 ad0Var = kd0Var.K0;
        int c02 = ad0Var == null ? 0 : ad0Var.c0(8);
        kd0Var.L0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        yc0 yc0Var = kd0Var.T;
        boolean z10 = c02 > 0;
        if (yc0Var.i0 != z10) {
            yc0Var.i0 = z10;
            yc0Var.l();
            kd0Var.U.w0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.lt0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Components.lt0
    public final org.telegram.ui.Components.ml0 f() {
        return this.a.U;
    }

    @Override // org.telegram.ui.Components.lt0
    public final TLRPC.Chat g() {
        return null;
    }

    @Override // org.telegram.ui.Components.lt0
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z10, boolean z11, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.lt0
    public final boolean p() {
        return true;
    }

    @Override // org.telegram.ui.Components.lt0
    public final void E() {
    }
}
