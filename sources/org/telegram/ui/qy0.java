package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class qy0 implements org.telegram.ui.ActionBar.t0, av0, org.telegram.ui.Components.q8 {
    public final /* synthetic */ ProfileActivity a;

    public /* synthetic */ qy0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // org.telegram.ui.av0
    public void B0(MessageObject messageObject) {
        ProfileActivity profileActivity = this.a;
        profileActivity.a.I0(true);
        xz0 xz0Var = profileActivity.N;
        if (xz0Var != null && xz0Var.getCurrentListView() != null) {
            profileActivity.N.getCurrentListView().I0(true);
        }
        profileActivity.d1.setBackgroundColor(i0.a.f(0.1f, profileActivity.Y3(profileActivity.b5.f), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.a7, profileActivity.z0)));
    }

    @Override // org.telegram.ui.av0
    public void E(MessageObject messageObject) {
        org.telegram.ui.Components.fi0 fi0Var = this.a.m0;
        if (fi0Var == null || !fi0Var.a) {
            return;
        }
        fi0Var.O.d(0.0f, true);
        fi0Var.invalidate();
    }

    @Override // org.telegram.ui.Components.q8
    public void T0(int i10, int i11) {
        int i12 = ProfileActivity.R6;
        ProfileActivity profileActivity = this.a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().setDialogHistoryTTL(a2, i10);
        if (profileActivity.v2 == null && profileActivity.u2 == null) {
            return;
        }
        UndoView undoView = profileActivity.L;
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.v2;
        undoView.k(a2, i11, user, Integer.valueOf(userFull != null ? userFull.ttl_period : profileActivity.u2.ttl_period), null, null);
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void b() {
        int i10 = ProfileActivity.R6;
        org.telegram.ui.Components.in0.d(new e5(this.a, 18));
    }

    @Override // org.telegram.ui.Components.q8
    public void dismiss() {
        this.a.T0.U(null, null);
    }

    @Override // org.telegram.ui.Components.q8
    public void e1() {
        this.a.presentFragment(new t4());
        dismiss();
    }

    @Override // org.telegram.ui.av0
    public /* synthetic */ TextureView f0() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void a() {
    }
}
