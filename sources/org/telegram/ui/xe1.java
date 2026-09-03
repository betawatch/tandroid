package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class xe1 implements org.telegram.ui.Components.mo {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ sf1 b;

    public xe1(sf1 sf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = sf1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.Components.mo
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override // org.telegram.ui.Components.mo
    public final void k() {
        sf1 sf1Var = this.b;
        sf1Var.finishPreviewFragment();
        MessagesController messagesController = sf1Var.getMessagesController();
        long j10 = sf1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j10, tL_forumTopic.id);
        sf1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.id, !isDialogMuted);
        if (org.telegram.ui.Components.qc.a(sf1Var)) {
            org.telegram.ui.Components.qc.z(sf1Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, sf1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.mo
    public final void o() {
        this.b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new h21(22, this, this.a), 500L);
    }

    @Override // org.telegram.ui.Components.mo
    public final void u() {
        int i10;
        sf1 sf1Var = this.b;
        i10 = ((org.telegram.ui.ActionBar.p2) sf1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb = new StringBuilder("sound_enabled_");
        long j10 = sf1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean z4 = notificationsSettings.getBoolean(org.telegram.messenger.y3.i(-j10, tL_forumTopic.id, sb), true);
        notificationsSettings.edit().putBoolean(org.telegram.messenger.y3.i(-j10, tL_forumTopic.id, new StringBuilder("sound_enabled_")), !z4).apply();
        sf1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.qc.a(sf1Var)) {
            org.telegram.ui.Components.qc.S(z4 ? 1 : 0, sf1Var, sf1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.mo
    public final void v(int i10) {
        sf1 sf1Var = this.b;
        long j10 = sf1Var.a;
        sf1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i10 != 0) {
            sf1Var.getNotificationsController().muteUntil(-j10, tL_forumTopic.id, i10);
            if (org.telegram.ui.Components.qc.a(sf1Var)) {
                org.telegram.ui.Components.qc.z(sf1Var, 5, i10, sf1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (sf1Var.getMessagesController().isDialogMuted(-j10, tL_forumTopic.id)) {
            sf1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.id, false);
        }
        if (org.telegram.ui.Components.qc.a(sf1Var)) {
            org.telegram.ui.Components.qc.z(sf1Var, 4, i10, sf1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.mo
    public final /* synthetic */ void j() {
    }
}
