package xh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.n6;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class h0 implements mg {
    public final /* synthetic */ TL_stars.TL_starGiftUnique a;
    public final /* synthetic */ j0 b;

    public h0(j0 j0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.b = j0Var;
        this.a = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ boolean C0() {
        return true;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers J() {
        return null;
    }

    public final void a(CharSequence charSequence) {
        int i10;
        int i11;
        j0 j0Var = this.b;
        n6 n6Var = j0Var.w;
        z4 z4Var = j0Var.b;
        i10 = ((org.telegram.ui.ActionBar.f3) j0Var).currentAccount;
        z4Var.a(this.a, UserConfig.getInstance(i10).getClientUserId(), j0Var.n.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        j0Var.F = codePointCount;
        int i12 = j0Var.E;
        if (i12 <= 0 || (i11 = i12 - codePointCount) > 15) {
            n6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new qg.n0(this, 8));
            return;
        }
        if (i11 < -9999) {
            i11 = -9999;
        }
        n6Var.c(LocaleController.formatNumber(i11, ','), n6Var.getVisibility() == 0, true);
        if (n6Var.getVisibility() != 0) {
            n6Var.setVisibility(0);
            n6Var.setAlpha(0.0f);
            n6Var.setScaleX(0.5f);
            n6Var.setScaleY(0.5f);
        }
        n6Var.animate().setListener(null).cancel();
        n6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        if (i11 < 0) {
            n6Var.setTextColor(j0Var.getThemedColor(i6.p7));
        } else {
            n6Var.setTextColor(j0Var.getThemedColor(i6.y6));
        }
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
    public final void l1(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
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
    public final void v1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ boolean w1() {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public final void A2() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void D() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void E1() {
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
    public final /* synthetic */ void d2() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void g() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void i2() {
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
    public final void w2() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void x() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void z1() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void B(boolean z10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void X(boolean z10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void a1(int i10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void f2(int i10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void j2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void y(float f7) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void E0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void K(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void t1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
