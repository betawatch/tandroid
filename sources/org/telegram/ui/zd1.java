package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class zd1 implements org.telegram.ui.Components.yo {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ te1 b;

    public zd1(te1 te1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = te1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.Components.yo
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override // org.telegram.ui.Components.yo
    public final void n() {
        te1 te1Var = this.b;
        te1Var.finishPreviewFragment();
        MessagesController messagesController = te1Var.getMessagesController();
        long j10 = te1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j10, tL_forumTopic.id);
        te1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.id, !isDialogMuted);
        if (org.telegram.ui.Components.xc.a(te1Var)) {
            org.telegram.ui.Components.xc.z(te1Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, te1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.yo
    public final void p() {
        this.b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new m71(12, this, this.a), 500L);
    }

    @Override // org.telegram.ui.Components.yo
    public final void t() {
        int i10;
        te1 te1Var = this.b;
        i10 = ((org.telegram.ui.ActionBar.n2) te1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = te1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.g0.i(-j10, tL_forumTopic.id, sb2), true);
        notificationsSettings.edit().putBoolean(org.telegram.messenger.g0.i(-j10, tL_forumTopic.id, new StringBuilder("sound_enabled_")), !z10).apply();
        te1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.xc.a(te1Var)) {
            org.telegram.ui.Components.xc.S(z10 ? 1 : 0, te1Var, te1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.yo
    public final void y(int i10) {
        te1 te1Var = this.b;
        long j10 = te1Var.a;
        te1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i10 != 0) {
            te1Var.getNotificationsController().muteUntil(-j10, tL_forumTopic.id, i10);
            if (org.telegram.ui.Components.xc.a(te1Var)) {
                org.telegram.ui.Components.xc.z(te1Var, 5, i10, te1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (te1Var.getMessagesController().isDialogMuted(-j10, tL_forumTopic.id)) {
            te1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.id, false);
        }
        if (org.telegram.ui.Components.xc.a(te1Var)) {
            org.telegram.ui.Components.xc.z(te1Var, 4, i10, te1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.yo
    public final /* synthetic */ void m() {
    }
}
