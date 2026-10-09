package xh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.r6;
import org.telegram.ui.pn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class j0 implements qg {
    public final /* synthetic */ TL_stars.TL_starGiftUnique a;
    public final /* synthetic */ l0 b;

    public j0(l0 l0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.b = l0Var;
        this.a = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.Components.qg
    public final void B1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean C1() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean I0() {
        return true;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers P() {
        return null;
    }

    public final void a(CharSequence charSequence) {
        int i10;
        int i11;
        l0 l0Var = this.b;
        r6 r6Var = l0Var.w;
        a5 a5Var = l0Var.b;
        i10 = ((org.telegram.ui.ActionBar.f3) l0Var).currentAccount;
        a5Var.a(this.a, UserConfig.getInstance(i10).getClientUserId(), l0Var.n.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        l0Var.F = codePointCount;
        int i12 = l0Var.E;
        if (i12 <= 0 || (i11 = i12 - codePointCount) > 15) {
            r6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new org.telegram.ui.Wallet.x4(this, 17));
            return;
        }
        if (i11 < -9999) {
            i11 = -9999;
        }
        r6Var.c(LocaleController.formatNumber(i11, ','), r6Var.getVisibility() == 0, true);
        if (r6Var.getVisibility() != 0) {
            r6Var.setVisibility(0);
            r6Var.setAlpha(0.0f);
            r6Var.setScaleX(0.5f);
            r6Var.setScaleY(0.5f);
        }
        r6Var.animate().setListener(null).cancel();
        r6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        if (i11 < 0) {
            r6Var.setTextColor(l0Var.getThemedColor(i6.p7));
        } else {
            r6Var.setTextColor(l0Var.getThemedColor(i6.y6));
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ int h1() {
        return 0;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ TL_stories.StoryItem j1() {
        return null;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean l1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public final boolean o1() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public final void r1(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ pn u0() {
        return null;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean u1() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ int v() {
        return 0;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ TLRPC.Peer x() {
        return null;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void C(boolean z10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void c0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void g1(int i10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void l2(int i10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void p2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void z(float f7) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void B2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void F2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void G1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void J() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void L1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void M0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void O0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void Z0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void a0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void h() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void j2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void l() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void o2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void q0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void t1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void u2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void w1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void x1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void y() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void y1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void z0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void K0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void V(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void z1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void K(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void q2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
