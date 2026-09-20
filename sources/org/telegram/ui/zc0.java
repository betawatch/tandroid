package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class zc0 implements org.telegram.ui.Components.vt0 {
    public final /* synthetic */ kd0 a;

    public zc0(kd0 kd0Var) {
        this.a = kd0Var;
    }

    @Override // org.telegram.ui.Components.vt0
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

    @Override // org.telegram.ui.Components.vt0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Components.vt0
    public final org.telegram.ui.Components.vl0 f() {
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
