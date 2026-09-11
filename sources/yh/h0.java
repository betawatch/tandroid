package yh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.q6;
import org.telegram.ui.oj1;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class h0 implements og {
    public final /* synthetic */ TL_stars.TL_starGiftUnique a;
    public final /* synthetic */ j0 b;

    public h0(j0 j0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.b = j0Var;
        this.a = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers H() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ int W0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TL_stories.StoryItem Y0() {
        return null;
    }

    public final void a(CharSequence charSequence) {
        int i10;
        int i11;
        j0 j0Var = this.b;
        q6 q6Var = j0Var.w;
        y4 y4Var = j0Var.b;
        i10 = ((org.telegram.ui.ActionBar.f3) j0Var).currentAccount;
        y4Var.a(this.a, UserConfig.getInstance(i10).getClientUserId(), j0Var.n.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        j0Var.F = codePointCount;
        int i12 = j0Var.E;
        if (i12 <= 0 || (i11 = i12 - codePointCount) > 15) {
            q6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new oj1(this, 11));
            return;
        }
        if (i11 < -9999) {
            i11 = -9999;
        }
        q6Var.c(LocaleController.formatNumber(i11, ','), q6Var.getVisibility() == 0, true);
        if (q6Var.getVisibility() != 0) {
            q6Var.setVisibility(0);
            q6Var.setAlpha(0.0f);
            q6Var.setScaleX(0.5f);
            q6Var.setScaleY(0.5f);
        }
        q6Var.animate().setListener(null).cancel();
        q6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        if (i11 < 0) {
            q6Var.setTextColor(j0Var.getThemedColor(j6.p7));
        } else {
            q6Var.setTextColor(j0Var.getThemedColor(j6.y6));
        }
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean a1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final boolean d1() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final void f1(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean i1() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ sn o0() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // org.telegram.ui.Components.og
    public final void p1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TLRPC.Peer q() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean q1() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean z0() {
        return true;
    }

    @Override // org.telegram.ui.Components.og
    public final void C() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void D0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void G0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void P0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void U() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void V1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void a2() {
    }

    @Override // org.telegram.ui.Components.og
    public final void g2() {
    }

    @Override // org.telegram.ui.Components.og
    public final void h() {
    }

    @Override // org.telegram.ui.Components.og
    public final void h1() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void k1() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void l0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void l1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void m1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void n2() {
    }

    @Override // org.telegram.ui.Components.og
    public final void r0() {
    }

    @Override // org.telegram.ui.Components.og
    public final void r2() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void t1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void v() {
    }

    @Override // org.telegram.ui.Components.og
    public final void x1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void V0(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void W(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void X1(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void b2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void x(float f7) {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void z(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void B0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.og
    public final void J(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void n1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void G(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
    }

    @Override // org.telegram.ui.Components.og
    public final void c2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
