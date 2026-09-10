package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class sw0 implements org.telegram.ui.Components.qg {
    public final /* synthetic */ PopupNotificationActivity a;

    public sw0(PopupNotificationActivity popupNotificationActivity) {
        this.a = popupNotificationActivity;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean D0() {
        return true;
    }

    @Override // org.telegram.ui.Components.qg
    public final void D1() {
        PopupNotificationActivity popupNotificationActivity = this.a;
        MessageObject messageObject = popupNotificationActivity.Q;
        if (messageObject != null) {
            MessagesController.getInstance(messageObject.currentAccount).sendTyping(popupNotificationActivity.Q.getDialogId(), 0L, 0, popupNotificationActivity.K);
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final void I(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        PopupNotificationActivity popupNotificationActivity = this.a;
        if (popupNotificationActivity.Q == null) {
            return;
        }
        int i12 = popupNotificationActivity.S;
        if (i12 >= 0 && i12 < popupNotificationActivity.a0.size()) {
            popupNotificationActivity.a0.remove(popupNotificationActivity.S);
        }
        MessagesController.getInstance(popupNotificationActivity.Q.currentAccount).markDialogAsRead(popupNotificationActivity.Q.getDialogId(), popupNotificationActivity.Q.getId(), Math.max(0, popupNotificationActivity.Q.getId()), popupNotificationActivity.Q.messageOwner.date, true, 0L, 0, true, 0);
        popupNotificationActivity.Q = null;
        popupNotificationActivity.f();
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers J() {
        return null;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ int b1() {
        return 0;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ TL_stories.StoryItem d1() {
        return null;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean e1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public final boolean h1() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean n1() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ tn p0() {
        return null;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ int u() {
        return 0;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean v1() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ TLRPC.Peer w() {
        return null;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void B(boolean z10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void G() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void H0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void J0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void T0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void W() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void Z(boolean z10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void a1(int i10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void b2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void d2(int i10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void g2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void h() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void h2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void m0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void m1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void m2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void p1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void q1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void r1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void t0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void u1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void u2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void x() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void y(float f7) {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void y1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void y2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void F0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void T(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void k1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void i2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
