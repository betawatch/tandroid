package yh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.q6;
import org.telegram.ui.gn;
import org.telegram.ui.tf1;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class g0 implements og {
    public final /* synthetic */ TL_stars.TL_starGiftUnique a;
    public final /* synthetic */ i0 b;

    public g0(i0 i0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.b = i0Var;
        this.a = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean B0() {
        return true;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers O() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ int Y0() {
        return 0;
    }

    public final void a(CharSequence charSequence) {
        int i10;
        int i11;
        i0 i0Var = this.b;
        q6 q6Var = i0Var.w;
        y4 y4Var = i0Var.b;
        i10 = ((org.telegram.ui.ActionBar.f3) i0Var).currentAccount;
        y4Var.a(this.a, UserConfig.getInstance(i10).getClientUserId(), i0Var.n.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        i0Var.F = codePointCount;
        int i12 = i0Var.E;
        if (i12 <= 0 || (i11 = i12 - codePointCount) > 15) {
            q6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new tf1(this, 22));
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
            q6Var.setTextColor(i0Var.getThemedColor(h6.p7));
        } else {
            q6Var.setTextColor(i0Var.getThemedColor(h6.y6));
        }
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
    public final void g1(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
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
    public final void q1(CharSequence charSequence) {
        a(charSequence);
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
    public final void y1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void z(float f7) {
    }

    @Override // org.telegram.ui.Components.og
    public final void D0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.og
    public final void U(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void o1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void L(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void a2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
