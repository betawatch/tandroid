package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class sw0 implements org.telegram.ui.Components.mg {
    public final /* synthetic */ PopupNotificationActivity a;

    public sw0(PopupNotificationActivity popupNotificationActivity) {
        this.a = popupNotificationActivity;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ boolean C0() {
        return true;
    }

    @Override // org.telegram.ui.Components.mg
    public final void E1() {
        PopupNotificationActivity popupNotificationActivity = this.a;
        MessageObject messageObject = popupNotificationActivity.Q;
        if (messageObject != null) {
            MessagesController.getInstance(messageObject.currentAccount).sendTyping(popupNotificationActivity.Q.getDialogId(), 0L, 0, popupNotificationActivity.K);
        }
    }

    @Override // org.telegram.ui.Components.mg
    public final void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
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

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers J() {
        return null;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ int b1() {
        return 0;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ TL_stories.StoryItem d1() {
        return null;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ boolean f1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public final boolean i1() {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ boolean o1() {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ rn p0() {
        return null;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ TLRPC.Peer v() {
        return null;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ boolean w1() {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public final void A2() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void B(boolean z10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void D() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void G0() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void J0() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void T0() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void W() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void X(boolean z10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void a1(int i10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void d2() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void f2(int i10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void g() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void i2() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void j2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void l() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void m0() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void n1() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void o2() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void q1() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void r1() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void s0() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void s1() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void v1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void w2() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void x() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void y(float f7) {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void z1() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void E0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void K(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void l1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void t1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
