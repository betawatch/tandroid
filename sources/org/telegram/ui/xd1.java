package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class xd1 implements org.telegram.ui.Components.yo {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ re1 b;

    public xd1(re1 re1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = re1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.Components.yo
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override // org.telegram.ui.Components.yo
    public final void n() {
        re1 re1Var = this.b;
        re1Var.finishPreviewFragment();
        MessagesController messagesController = re1Var.getMessagesController();
        long j10 = re1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j10, tL_forumTopic.id);
        re1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.id, !isDialogMuted);
        if (org.telegram.ui.Components.xc.a(re1Var)) {
            org.telegram.ui.Components.xc.z(re1Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, re1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.yo
    public final void o() {
        this.b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new k71(12, this, this.a), 500L);
    }

    @Override // org.telegram.ui.Components.yo
    public final void t() {
        int i10;
        re1 re1Var = this.b;
        i10 = ((org.telegram.ui.ActionBar.n2) re1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = re1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.g0.i(-j10, tL_forumTopic.id, sb2), true);
        notificationsSettings.edit().putBoolean(org.telegram.messenger.g0.i(-j10, tL_forumTopic.id, new StringBuilder("sound_enabled_")), !z10).apply();
        re1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.xc.a(re1Var)) {
            org.telegram.ui.Components.xc.S(z10 ? 1 : 0, re1Var, re1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.yo
    public final void x(int i10) {
        re1 re1Var = this.b;
        long j10 = re1Var.a;
        re1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i10 != 0) {
            re1Var.getNotificationsController().muteUntil(-j10, tL_forumTopic.id, i10);
            if (org.telegram.ui.Components.xc.a(re1Var)) {
                org.telegram.ui.Components.xc.z(re1Var, 5, i10, re1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (re1Var.getMessagesController().isDialogMuted(-j10, tL_forumTopic.id)) {
            re1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.id, false);
        }
        if (org.telegram.ui.Components.xc.a(re1Var)) {
            org.telegram.ui.Components.xc.z(re1Var, 4, i10, re1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.yo
    public final /* synthetic */ void m() {
    }
}
