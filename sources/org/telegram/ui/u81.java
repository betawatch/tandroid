package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u81 implements org.telegram.ui.Components.wn {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ m91 b;

    public u81(m91 m91Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = m91Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.Components.wn
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override // org.telegram.ui.Components.wn
    public final void q() {
        m91 m91Var = this.b;
        m91Var.finishPreviewFragment();
        org.telegram.messenger.hp messagesController = m91Var.getMessagesController();
        long j10 = m91Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean r22 = messagesController.r2(-j10, tL_forumTopic.id, null);
        m91Var.getNotificationsController().G(-j10, tL_forumTopic.id, !r22);
        if (org.telegram.ui.Components.fc.a(m91Var)) {
            org.telegram.ui.Components.fc.z(m91Var, !r22 ? 3 : 4, !r22 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, m91Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.wn
    public final void t() {
        this.b.finishPreviewFragment();
        org.telegram.messenger.g0.i3(new qv0(24, this, this.a), 500L);
    }

    @Override // org.telegram.ui.Components.wn
    public final void v() {
        int i3;
        m91 m91Var = this.b;
        i3 = ((org.telegram.ui.ActionBar.d2) m91Var).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(i3).d7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = m91Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        sb2.append(org.telegram.messenger.us.v(-j10, tL_forumTopic.id, false));
        boolean z10 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z11 = !z10;
        sharedPreferences.edit().putBoolean("sound_enabled_" + org.telegram.messenger.us.v(-j10, tL_forumTopic.id, false), z11).apply();
        m91Var.finishPreviewFragment();
        if (org.telegram.ui.Components.fc.a(m91Var)) {
            org.telegram.ui.Components.fc.S(z10 ? 1 : 0, m91Var, m91Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.wn
    public final void z(int i3) {
        m91 m91Var = this.b;
        long j10 = m91Var.a;
        m91Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i3 != 0) {
            m91Var.getNotificationsController().H(-j10, i3, tL_forumTopic.id);
            if (org.telegram.ui.Components.fc.a(m91Var)) {
                org.telegram.ui.Components.fc.z(m91Var, 5, i3, m91Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (m91Var.getMessagesController().r2(-j10, tL_forumTopic.id, null)) {
            m91Var.getNotificationsController().G(-j10, tL_forumTopic.id, false);
        }
        if (org.telegram.ui.Components.fc.a(m91Var)) {
            org.telegram.ui.Components.fc.z(m91Var, 4, i3, m91Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.wn
    public final /* synthetic */ void p() {
    }
}
