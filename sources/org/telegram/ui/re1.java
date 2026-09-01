package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class re1 implements org.telegram.ui.Components.mo {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ mf1 b;

    public re1(mf1 mf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = mf1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.Components.mo
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override // org.telegram.ui.Components.mo
    public final void k() {
        mf1 mf1Var = this.b;
        mf1Var.finishPreviewFragment();
        MessagesController messagesController = mf1Var.getMessagesController();
        long j10 = mf1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j10, tL_forumTopic.id);
        mf1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.id, !isDialogMuted);
        if (org.telegram.ui.Components.qc.a(mf1Var)) {
            org.telegram.ui.Components.qc.z(mf1Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, mf1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.mo
    public final void o() {
        this.b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new w01(23, this, this.a), 500L);
    }

    @Override // org.telegram.ui.Components.mo
    public final void u() {
        int i10;
        mf1 mf1Var = this.b;
        i10 = ((org.telegram.ui.ActionBar.p2) mf1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb = new StringBuilder("sound_enabled_");
        long j10 = mf1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean z4 = notificationsSettings.getBoolean(org.telegram.messenger.y3.i(-j10, tL_forumTopic.id, sb), true);
        notificationsSettings.edit().putBoolean(org.telegram.messenger.y3.i(-j10, tL_forumTopic.id, new StringBuilder("sound_enabled_")), !z4).apply();
        mf1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.qc.a(mf1Var)) {
            org.telegram.ui.Components.qc.S(z4 ? 1 : 0, mf1Var, mf1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.mo
    public final void v(int i10) {
        mf1 mf1Var = this.b;
        long j10 = mf1Var.a;
        mf1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i10 != 0) {
            mf1Var.getNotificationsController().muteUntil(-j10, tL_forumTopic.id, i10);
            if (org.telegram.ui.Components.qc.a(mf1Var)) {
                org.telegram.ui.Components.qc.z(mf1Var, 5, i10, mf1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (mf1Var.getMessagesController().isDialogMuted(-j10, tL_forumTopic.id)) {
            mf1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.id, false);
        }
        if (org.telegram.ui.Components.qc.a(mf1Var)) {
            org.telegram.ui.Components.qc.z(mf1Var, 4, i10, mf1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.mo
    public final /* synthetic */ void j() {
    }
}
