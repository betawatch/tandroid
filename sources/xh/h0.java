package xh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.o6;
import org.telegram.ui.pn;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class h0 implements ng {
    public final /* synthetic */ TL_stars.TL_starGiftUnique a;
    public final /* synthetic */ j0 b;

    public h0(j0 j0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.b = j0Var;
        this.a = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ boolean D0() {
        return true;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers J() {
        return null;
    }

    public final void a(CharSequence charSequence) {
        int i10;
        int i11;
        j0 j0Var = this.b;
        o6 o6Var = j0Var.w;
        a5 a5Var = j0Var.b;
        i10 = ((org.telegram.ui.ActionBar.f3) j0Var).currentAccount;
        a5Var.a(this.a, UserConfig.getInstance(i10).getClientUserId(), j0Var.n.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        j0Var.F = codePointCount;
        int i12 = j0Var.E;
        if (i12 <= 0 || (i11 = i12 - codePointCount) > 15) {
            o6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new pg.d0(this, 9));
            return;
        }
        if (i11 < -9999) {
            i11 = -9999;
        }
        o6Var.c(LocaleController.formatNumber(i11, ','), o6Var.getVisibility() == 0, true);
        if (o6Var.getVisibility() != 0) {
            o6Var.setVisibility(0);
            o6Var.setAlpha(0.0f);
            o6Var.setScaleX(0.5f);
            o6Var.setScaleY(0.5f);
        }
        o6Var.animate().setListener(null).cancel();
        o6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        if (i11 < 0) {
            o6Var.setTextColor(j0Var.getThemedColor(j6.p7));
        } else {
            o6Var.setTextColor(j0Var.getThemedColor(j6.y6));
        }
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
    public final void m1(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
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
    public final void w1(CharSequence charSequence) {
        a(charSequence);
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
    public final void D() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void F1() {
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
    public final /* synthetic */ void d2() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void g() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void i2() {
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
    public final void w2() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void x() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void B(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void X(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void b1(int i10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void f2(int i10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void j2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void y(float f7) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void F0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void K(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void u1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
