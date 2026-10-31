package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wa1 implements org.telegram.ui.Components.fo {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ pb1 b;

    public wa1(pb1 pb1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = pb1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.Components.fo
    public final void E(int i10) {
        pb1 pb1Var = this.b;
        long j10 = pb1Var.a;
        pb1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i10 != 0) {
            pb1Var.getNotificationsController().H(-j10, i10, tL_forumTopic.id);
            if (org.telegram.ui.Components.cc.a(pb1Var)) {
                org.telegram.ui.Components.cc.z(pb1Var, 5, i10, pb1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (pb1Var.getMessagesController().q2(-j10, tL_forumTopic.id, null)) {
            pb1Var.getNotificationsController().G(-j10, tL_forumTopic.id, false);
        }
        if (org.telegram.ui.Components.cc.a(pb1Var)) {
            org.telegram.ui.Components.cc.z(pb1Var, 4, i10, pb1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.fo
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override // org.telegram.ui.Components.fo
    public final void v() {
        pb1 pb1Var = this.b;
        pb1Var.finishPreviewFragment();
        org.telegram.messenger.vp messagesController = pb1Var.getMessagesController();
        long j10 = pb1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean q22 = messagesController.q2(-j10, tL_forumTopic.id, null);
        pb1Var.getNotificationsController().G(-j10, tL_forumTopic.id, !q22);
        if (org.telegram.ui.Components.cc.a(pb1Var)) {
            org.telegram.ui.Components.cc.z(pb1Var, !q22 ? 3 : 4, !q22 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, pb1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.fo
    public final void x() {
        this.b.finishPreviewFragment();
        org.telegram.messenger.i0.h3(new t11(12, this, this.a), 500L);
    }

    @Override // org.telegram.ui.Components.fo
    public final void y() {
        int i10;
        pb1 pb1Var = this.b;
        i10 = ((org.telegram.ui.ActionBar.k2) pb1Var).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(i10).e7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = pb1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        sb2.append(org.telegram.messenger.ot.v(-j10, tL_forumTopic.id, false));
        boolean z10 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z11 = !z10;
        sharedPreferences.edit().putBoolean("sound_enabled_" + org.telegram.messenger.ot.v(-j10, tL_forumTopic.id, false), z11).apply();
        pb1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.cc.a(pb1Var)) {
            org.telegram.ui.Components.cc.S(z10 ? 1 : 0, pb1Var, pb1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.fo
    public final /* synthetic */ void n() {
    }
}
