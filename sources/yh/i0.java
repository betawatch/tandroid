package yh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.s6;
import org.telegram.ui.fi1;
import org.telegram.ui.un;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class i0 implements pg {
    public final /* synthetic */ TL_stars.TL_starGiftUnique a;
    public final /* synthetic */ k0 b;

    public i0(k0 k0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.b = k0Var;
        this.a = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ boolean C0() {
        return true;
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers K() {
        return null;
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ int Z0() {
        return 0;
    }

    public final void a(CharSequence charSequence) {
        int i10;
        int i11;
        k0 k0Var = this.b;
        s6 s6Var = k0Var.w;
        y4 y4Var = k0Var.b;
        i10 = ((org.telegram.ui.ActionBar.e3) k0Var).currentAccount;
        y4Var.a(this.a, UserConfig.getInstance(i10).getClientUserId(), k0Var.n.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        k0Var.F = codePointCount;
        int i12 = k0Var.E;
        if (i12 <= 0 || (i11 = i12 - codePointCount) > 15) {
            s6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new fi1(this, 20));
            return;
        }
        if (i11 < -9999) {
            i11 = -9999;
        }
        s6Var.c(LocaleController.formatNumber(i11, ','), s6Var.getVisibility() == 0, true);
        if (s6Var.getVisibility() != 0) {
            s6Var.setVisibility(0);
            s6Var.setAlpha(0.0f);
            s6Var.setScaleX(0.5f);
            s6Var.setScaleY(0.5f);
        }
        s6Var.animate().setListener(null).cancel();
        s6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        if (i11 < 0) {
            s6Var.setTextColor(k0Var.getThemedColor(g6.p7));
        } else {
            s6Var.setTextColor(k0Var.getThemedColor(g6.y6));
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ TL_stories.StoryItem b1() {
        return null;
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ boolean c1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.pg
    public final boolean f1() {
        return false;
    }

    @Override // org.telegram.ui.Components.pg
    public final void h1(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ boolean k1() {
        return false;
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ un p0() {
        return null;
    }

    @Override // org.telegram.ui.Components.pg
    public final void r1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ boolean s1() {
        return false;
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ int v() {
        return 0;
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ TLRPC.Peer y() {
        return null;
    }

    @Override // org.telegram.ui.Components.pg
    public final void A(float f7) {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void D(boolean z10) {
    }

    @Override // org.telegram.ui.Components.pg
    public final void Y0(int i10) {
    }

    @Override // org.telegram.ui.Components.pg
    public final void Y1(int i10) {
    }

    @Override // org.telegram.ui.Components.pg
    public final void a0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.pg
    public final void c2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void G0() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void H() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void I0() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void R0() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void W1() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void X() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void b2() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void h() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void h2() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void j1() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void m0() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void m1() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void n1() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void o1() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void q2() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void t0() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void u2() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void v1() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void z() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void z1() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void E0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.pg
    public final void U(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.pg
    public final void p1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.pg
    public final void J(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
    }

    @Override // org.telegram.ui.Components.pg
    public final void d2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
