package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ur0 implements org.telegram.ui.Components.uf {
    public final /* synthetic */ PopupNotificationActivity a;

    public ur0(PopupNotificationActivity popupNotificationActivity) {
        this.a = popupNotificationActivity;
    }

    @Override // org.telegram.ui.Components.uf
    public final void G(CharSequence charSequence, boolean z10, int i3, int i10, long j10) {
        PopupNotificationActivity popupNotificationActivity = this.a;
        if (popupNotificationActivity.R == null) {
            return;
        }
        int i11 = popupNotificationActivity.T;
        if (i11 >= 0 && i11 < popupNotificationActivity.b0.size()) {
            popupNotificationActivity.b0.remove(popupNotificationActivity.T);
        }
        org.telegram.messenger.hp.s1(popupNotificationActivity.R.I1).j3(org.telegram.messenger.zi.B0(popupNotificationActivity.R.k), popupNotificationActivity.R.f1(), Math.max(0, popupNotificationActivity.R.f1()), popupNotificationActivity.R.k.date, true, 0L, 0, true, 0);
        popupNotificationActivity.R = null;
        popupNotificationActivity.f();
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers M() {
        return null;
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ int O0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ TL_stories.StoryItem R0() {
        return null;
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ boolean T0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.uf
    public final boolean V0() {
        return false;
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ boolean a1() {
        return false;
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ mm i0() {
        return null;
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ boolean k1() {
        return false;
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // org.telegram.ui.Components.uf
    public final void s1() {
        PopupNotificationActivity popupNotificationActivity = this.a;
        org.telegram.messenger.zi ziVar = popupNotificationActivity.R;
        if (ziVar != null) {
            org.telegram.messenger.hp.s1(ziVar.I1).C4(0, popupNotificationActivity.L, org.telegram.messenger.zi.B0(popupNotificationActivity.R.k), 0L, null);
        }
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ TLRPC.Peer t() {
        return null;
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ boolean u0() {
        return true;
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void A(boolean z10) {
    }

    @Override // org.telegram.ui.Components.uf
    public final void M0(int i3) {
    }

    @Override // org.telegram.ui.Components.uf
    public final void T1(int i3) {
    }

    @Override // org.telegram.ui.Components.uf
    public final void c0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.uf
    public final void c2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.uf
    public final void j1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void x(float f10) {
    }

    @Override // org.telegram.ui.Components.uf
    public final void E() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void F() {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void F0() {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void I0() {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void O1() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void Z0() {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void a0() {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void b1() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void b2() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void e() {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void e1() {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void f() {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void g0() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void g1() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void g2() {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void m1() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void n2() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void q0() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void r2() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void u() {
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ void w0() {
    }

    @Override // org.telegram.ui.Components.uf
    public final void O(float f10, int i3) {
    }

    @Override // org.telegram.ui.Components.uf
    public final void Y0(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Components.uf
    public final void h1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.uf
    public final void d2(int i3, int i10, int i11, long j10, long j11, boolean z10) {
    }
}
