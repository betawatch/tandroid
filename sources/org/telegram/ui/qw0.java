package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class qw0 implements org.telegram.ui.Components.ng {
    public final /* synthetic */ PopupNotificationActivity a;

    public qw0(PopupNotificationActivity popupNotificationActivity) {
        this.a = popupNotificationActivity;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ boolean D0() {
        return true;
    }

    @Override // org.telegram.ui.Components.ng
    public final void F1() {
        PopupNotificationActivity popupNotificationActivity = this.a;
        MessageObject messageObject = popupNotificationActivity.Q;
        if (messageObject != null) {
            MessagesController.getInstance(messageObject.currentAccount).sendTyping(popupNotificationActivity.Q.getDialogId(), 0L, 0, popupNotificationActivity.K);
        }
    }

    @Override // org.telegram.ui.Components.ng
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

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers J() {
        return null;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ int c1() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ TL_stories.StoryItem e1() {
        return null;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ boolean g1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public final boolean j1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ boolean p1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ pn q0() {
        return null;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ TLRPC.Peer v() {
        return null;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ boolean x1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void A1() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void A2() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void B(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void D() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void H0() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void U0() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void W() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void X(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void b1(int i10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void d2() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void f2(int i10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void g() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void i2() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void j2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void l() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void n0() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void o1() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void o2() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void r1() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void s1() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void t0() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void t1() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void w1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void w2() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void x() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void y(float f7) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void F0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void K(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void m1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void u1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
