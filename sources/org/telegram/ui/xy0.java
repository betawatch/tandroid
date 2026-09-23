package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class xy0 implements org.telegram.ui.ActionBar.s0, ev0, org.telegram.ui.Components.n8 {
    public final /* synthetic */ ProfileActivity a;

    public /* synthetic */ xy0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // org.telegram.ui.ev0
    public void E0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.a;
        profileActivity.a.I0(true);
        e01 e01Var = profileActivity.O;
        if (e01Var != null && e01Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().I0(true);
        }
        profileActivity.d1.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.V4.f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.a7, profileActivity.z0)));
    }

    @Override // org.telegram.ui.ev0
    public void H(MessageObject messageObject) {
        org.telegram.ui.Components.gh0 gh0Var = this.a.m0;
        if (gh0Var == null || !gh0Var.a) {
            return;
        }
        gh0Var.O.d(0.0f, true);
        gh0Var.invalidate();
    }

    @Override // org.telegram.ui.Components.n8
    public void U0(int i10, int i11) {
        ProfileActivity profileActivity = this.a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.v2 == null && profileActivity.u2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.v2;
        undoView.k(a2, i11, user, Integer.valueOf(userFull != null ? userFull.ttl_period : profileActivity.u2.ttl_period), null, null);
    }

    @Override // org.telegram.ui.Components.n8
    public void dismiss() {
        this.a.T0.M(null, null);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void e() {
        org.telegram.ui.Components.bm0.d(new c5(this.a, 18));
    }

    @Override // org.telegram.ui.ev0
    public /* synthetic */ TextureView j0() {
        return null;
    }

    @Override // org.telegram.ui.Components.n8
    public void j1() {
        this.a.presentFragment(new q4());
        dismiss();
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void c() {
    }
}
