package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class sa0 implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ z10 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ TLRPC.ChatInvite d;
    public final /* synthetic */ LaunchActivity e;

    public sa0(LaunchActivity launchActivity, z10 z10Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.e = launchActivity;
        this.a = z10Var;
        this.b = zArr;
        this.c = bundle;
        this.d = chatInvite;
    }

    @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
    public final void onError() {
        LaunchActivity launchActivity = this.e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.z4.u0((org.telegram.ui.ActionBar.p2) l.d.i(1, launchActivity.a0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.a.run();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
    public final void onMessagesLoaded(boolean z4) {
        try {
            this.a.run();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        if (this.b[0]) {
            return;
        }
        xn xnVar = new xn(this.c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            xnVar.H5 = chatInvite;
        }
        ((ActionBarLayout) this.e.O()).P(xnVar);
    }
}
