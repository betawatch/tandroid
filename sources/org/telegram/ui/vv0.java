package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class vv0 implements org.telegram.ui.Components.eg {
    public final /* synthetic */ PopupNotificationActivity a;

    public vv0(PopupNotificationActivity popupNotificationActivity) {
        this.a = popupNotificationActivity;
    }

    @Override // org.telegram.ui.Components.eg
    public final void D(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
        PopupNotificationActivity popupNotificationActivity = this.a;
        if (popupNotificationActivity.N == null) {
            return;
        }
        int i12 = popupNotificationActivity.P;
        if (i12 >= 0 && i12 < popupNotificationActivity.X.size()) {
            popupNotificationActivity.X.remove(popupNotificationActivity.P);
        }
        MessagesController.getInstance(popupNotificationActivity.N.currentAccount).markDialogAsRead(popupNotificationActivity.N.getDialogId(), popupNotificationActivity.N.getId(), Math.max(0, popupNotificationActivity.N.getId()), popupNotificationActivity.N.messageOwner.date, true, 0L, 0, true, 0);
        popupNotificationActivity.N = null;
        popupNotificationActivity.f();
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers G() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean G0() {
        return true;
    }

    @Override // org.telegram.ui.Components.eg
    public final void H1() {
        PopupNotificationActivity popupNotificationActivity = this.a;
        MessageObject messageObject = popupNotificationActivity.N;
        if (messageObject != null) {
            MessagesController.getInstance(messageObject.currentAccount).sendTyping(popupNotificationActivity.N.getDialogId(), 0L, 0, popupNotificationActivity.H);
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ int c1() {
        return 0;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TL_stories.StoryItem e1() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean g1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean k1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ int l() {
        return 0;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TLRPC.Peer p() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean q1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ nn r0() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean z1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final void C() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void C1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void E2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void N0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void V0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void Y() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void b0(boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void b1(int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void f() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void h2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void j2(int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void m2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void n2(boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void o0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void p1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void r() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void r2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void s1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void t1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void u1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void w0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void x(float f10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void y1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void z(boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void z2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void H(float f10, int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void I0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void n1(CharSequence charSequence, boolean z4, boolean z10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void v1(View view, CharSequence charSequence, boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void o2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
    }
}
