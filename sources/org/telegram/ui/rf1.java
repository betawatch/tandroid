package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class rf1 implements org.telegram.ui.Components.bp {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ lg1 b;

    public rf1(lg1 lg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = lg1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.Components.bp
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override // org.telegram.ui.Components.bp
    public final void n() {
        lg1 lg1Var = this.b;
        lg1Var.finishPreviewFragment();
        MessagesController messagesController = lg1Var.getMessagesController();
        long j10 = lg1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j10, tL_forumTopic.id);
        lg1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.id, !isDialogMuted);
        if (org.telegram.ui.Components.zc.a(lg1Var)) {
            org.telegram.ui.Components.zc.z(lg1Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, lg1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.bp
    public final void p() {
        this.b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new je1(1, this, this.a), 500L);
    }

    @Override // org.telegram.ui.Components.bp
    public final void s() {
        int i10;
        lg1 lg1Var = this.b;
        i10 = ((org.telegram.ui.ActionBar.m2) lg1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = lg1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.q.j(-j10, tL_forumTopic.id, sb2), true);
        notificationsSettings.edit().putBoolean(org.telegram.messenger.q.j(-j10, tL_forumTopic.id, new StringBuilder("sound_enabled_")), !z10).apply();
        lg1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.zc.a(lg1Var)) {
            org.telegram.ui.Components.zc.S(z10 ? 1 : 0, lg1Var, lg1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.bp
    public final void y(int i10) {
        lg1 lg1Var = this.b;
        long j10 = lg1Var.a;
        lg1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i10 != 0) {
            lg1Var.getNotificationsController().muteUntil(-j10, tL_forumTopic.id, i10);
            if (org.telegram.ui.Components.zc.a(lg1Var)) {
                org.telegram.ui.Components.zc.z(lg1Var, 5, i10, lg1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (lg1Var.getMessagesController().isDialogMuted(-j10, tL_forumTopic.id)) {
            lg1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.id, false);
        }
        if (org.telegram.ui.Components.zc.a(lg1Var)) {
            org.telegram.ui.Components.zc.z(lg1Var, 4, i10, lg1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.bp
    public final /* synthetic */ void m() {
    }
}
