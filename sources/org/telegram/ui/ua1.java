package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ua1 implements org.telegram.ui.Components.fo {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ nb1 b;

    public ua1(nb1 nb1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = nb1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.Components.fo
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override // org.telegram.ui.Components.fo
    public final void s() {
        nb1 nb1Var = this.b;
        nb1Var.finishPreviewFragment();
        org.telegram.messenger.wp messagesController = nb1Var.getMessagesController();
        long j10 = nb1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean q22 = messagesController.q2(-j10, tL_forumTopic.id, null);
        nb1Var.getNotificationsController().G(-j10, tL_forumTopic.id, !q22);
        if (org.telegram.ui.Components.cc.a(nb1Var)) {
            org.telegram.ui.Components.cc.z(nb1Var, !q22 ? 3 : 4, !q22 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, nb1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.fo
    public final void v() {
        this.b.finishPreviewFragment();
        org.telegram.messenger.i0.h3(new y01(13, this, this.a), 500L);
    }

    @Override // org.telegram.ui.Components.fo
    public final void x() {
        int i10;
        nb1 nb1Var = this.b;
        i10 = ((org.telegram.ui.ActionBar.k2) nb1Var).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.wp.r1(i10).e7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = nb1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        sb2.append(org.telegram.messenger.pt.v(-j10, tL_forumTopic.id, false));
        boolean z10 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z11 = !z10;
        sharedPreferences.edit().putBoolean("sound_enabled_" + org.telegram.messenger.pt.v(-j10, tL_forumTopic.id, false), z11).apply();
        nb1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.cc.a(nb1Var)) {
            org.telegram.ui.Components.cc.S(z10 ? 1 : 0, nb1Var, nb1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.fo
    public final void y(int i10) {
        nb1 nb1Var = this.b;
        long j10 = nb1Var.a;
        nb1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i10 != 0) {
            nb1Var.getNotificationsController().H(-j10, i10, tL_forumTopic.id);
            if (org.telegram.ui.Components.cc.a(nb1Var)) {
                org.telegram.ui.Components.cc.z(nb1Var, 5, i10, nb1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (nb1Var.getMessagesController().q2(-j10, tL_forumTopic.id, null)) {
            nb1Var.getNotificationsController().G(-j10, tL_forumTopic.id, false);
        }
        if (org.telegram.ui.Components.cc.a(nb1Var)) {
            org.telegram.ui.Components.cc.z(nb1Var, 4, i10, nb1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.fo
    public final /* synthetic */ void n() {
    }
}
