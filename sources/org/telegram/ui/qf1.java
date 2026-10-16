package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class qf1 implements org.telegram.ui.Components.bp {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ kg1 b;

    public qf1(kg1 kg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = kg1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.Components.bp
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override // org.telegram.ui.Components.bp
    public final void o() {
        kg1 kg1Var = this.b;
        kg1Var.finishPreviewFragment();
        MessagesController messagesController = kg1Var.getMessagesController();
        long j10 = kg1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j10, tL_forumTopic.id);
        kg1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.id, !isDialogMuted);
        if (org.telegram.ui.Components.zc.a(kg1Var)) {
            org.telegram.ui.Components.zc.z(kg1Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, kg1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.bp
    public final void p() {
        this.b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new i11(26, this, this.a), 500L);
    }

    @Override // org.telegram.ui.Components.bp
    public final void t() {
        int i10;
        kg1 kg1Var = this.b;
        i10 = ((org.telegram.ui.ActionBar.m2) kg1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = kg1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.g0.i(-j10, tL_forumTopic.id, sb2), true);
        notificationsSettings.edit().putBoolean(org.telegram.messenger.g0.i(-j10, tL_forumTopic.id, new StringBuilder("sound_enabled_")), !z10).apply();
        kg1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.zc.a(kg1Var)) {
            org.telegram.ui.Components.zc.S(z10 ? 1 : 0, kg1Var, kg1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.bp
    public final void y(int i10) {
        kg1 kg1Var = this.b;
        long j10 = kg1Var.a;
        kg1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i10 != 0) {
            kg1Var.getNotificationsController().muteUntil(-j10, tL_forumTopic.id, i10);
            if (org.telegram.ui.Components.zc.a(kg1Var)) {
                org.telegram.ui.Components.zc.z(kg1Var, 5, i10, kg1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (kg1Var.getMessagesController().isDialogMuted(-j10, tL_forumTopic.id)) {
            kg1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.id, false);
        }
        if (org.telegram.ui.Components.zc.a(kg1Var)) {
            org.telegram.ui.Components.zc.z(kg1Var, 4, i10, kg1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.bp
    public final /* synthetic */ void m() {
    }
}
