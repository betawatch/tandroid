package wh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.qg;
import org.telegram.ui.mv0;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class i0 implements qg {
    public final /* synthetic */ TL_stars.TL_starGiftUnique a;
    public final /* synthetic */ k0 b;

    public i0(k0 k0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.b = k0Var;
        this.a = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean D0() {
        return true;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers J() {
        return null;
    }

    public final void a(CharSequence charSequence) {
        int i10;
        int i11;
        k0 k0Var = this.b;
        o6 o6Var = k0Var.w;
        z4 z4Var = k0Var.b;
        i10 = ((org.telegram.ui.ActionBar.h3) k0Var).currentAccount;
        z4Var.a(this.a, UserConfig.getInstance(i10).getClientUserId(), k0Var.n.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        k0Var.F = codePointCount;
        int i12 = k0Var.E;
        if (i12 <= 0 || (i11 = i12 - codePointCount) > 15) {
            o6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new mv0(this, 27));
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
            o6Var.setTextColor(k0Var.getThemedColor(j6.p7));
        } else {
            o6Var.setTextColor(k0Var.getThemedColor(j6.y6));
        }
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
    public final void k1(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
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
    public final void u1(CharSequence charSequence) {
        a(charSequence);
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
    public final void D1() {
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
    public final /* synthetic */ void b2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void g2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void h() {
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
    public final void u2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void x() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void y1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void y2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void B(boolean z10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void Z(boolean z10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void a1(int i10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void d2(int i10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void h2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void y(float f7) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void F0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void T(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void I(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void i2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
