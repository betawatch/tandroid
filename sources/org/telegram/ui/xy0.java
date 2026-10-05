package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class xy0 implements org.telegram.ui.ActionBar.s0, gv0, org.telegram.ui.Components.n8 {
    public final /* synthetic */ ProfileActivity a;

    public /* synthetic */ xy0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // org.telegram.ui.gv0
    public void G0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.a;
        profileActivity.a.J0(true);
        e01 e01Var = profileActivity.O;
        if (e01Var != null && e01Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().J0(true);
        }
        profileActivity.d1.setBackgroundColor(i0.a.d(0.1f, profileActivity.P3(profileActivity.V4.f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.a7, profileActivity.z0)));
    }

    @Override // org.telegram.ui.gv0
    public void I(MessageObject messageObject) {
        org.telegram.ui.Components.sh0 sh0Var = this.a.m0;
        if (sh0Var == null || !sh0Var.a) {
            return;
        }
        sh0Var.O.d(0.0f, true);
        sh0Var.invalidate();
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
        org.telegram.ui.Components.sm0.d(new c5(this.a, 18));
    }

    @Override // org.telegram.ui.gv0
    public /* synthetic */ TextureView k0() {
        return null;
    }

    @Override // org.telegram.ui.Components.n8
    public void l1() {
        this.a.presentFragment(new q4());
        dismiss();
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void c() {
    }
}
