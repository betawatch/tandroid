package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class uv0 implements org.telegram.ui.Components.og {
    public final /* synthetic */ PopupNotificationActivity a;

    public uv0(PopupNotificationActivity popupNotificationActivity) {
        this.a = popupNotificationActivity;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean B0() {
        return true;
    }

    @Override // org.telegram.ui.Components.og
    public final void L(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
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

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers O() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ int Y0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TL_stories.StoryItem a1() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean b1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final boolean e1() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean j1() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ gn p0() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean r1() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ int u() {
        return 0;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TLRPC.Peer x() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final void y1() {
        PopupNotificationActivity popupNotificationActivity = this.a;
        MessageObject messageObject = popupNotificationActivity.Q;
        if (messageObject != null) {
            MessagesController.getInstance(messageObject.currentAccount).sendTyping(popupNotificationActivity.Q.getDialogId(), 0L, 0, popupNotificationActivity.K);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void C(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void F0() {
    }

    @Override // org.telegram.ui.Components.og
    public final void H() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void H0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void Q0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void T1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void V1(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void X0(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void Y() {
    }

    @Override // org.telegram.ui.Components.og
    public final void Y1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void Z1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void a0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void e2() {
    }

    @Override // org.telegram.ui.Components.og
    public final void h() {
    }

    @Override // org.telegram.ui.Components.og
    public final void i1() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void l1() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void m0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void m1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void m2() {
    }

    @Override // org.telegram.ui.Components.og
    public final void n1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void q1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.og
    public final void q2() {
    }

    @Override // org.telegram.ui.Components.og
    public final void t0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void u1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void y() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void z(float f7) {
    }

    @Override // org.telegram.ui.Components.og
    public final void D0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.og
    public final void U(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void g1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Components.og
    public final void o1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void a2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
