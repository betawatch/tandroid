package zh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.s6;
import org.telegram.ui.hc1;
import org.telegram.ui.mn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class g0 implements og {
    public final /* synthetic */ TL_stars.TL_starGiftUnique a;
    public final /* synthetic */ i0 b;

    public g0(i0 i0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.b = i0Var;
        this.a = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers B() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ int N0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TL_stories.StoryItem P0() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean R0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final boolean T0() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final void V0(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean Y0() {
        return false;
    }

    public final void a(CharSequence charSequence) {
        int i10;
        int i11;
        u6 u6Var;
        u6 u6Var2;
        i0 i0Var = this.b;
        s6 s6Var = i0Var.w;
        z4 z4Var = i0Var.b;
        i10 = ((org.telegram.ui.ActionBar.k3) i0Var).currentAccount;
        z4Var.a(this.a, UserConfig.getInstance(i10).getClientUserId(), i0Var.n.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        i0Var.F = codePointCount;
        int i12 = i0Var.E;
        if (i12 <= 0 || (i11 = i12 - codePointCount) > 15) {
            s6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new hc1(this, 25));
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
            int i13 = y6.p7;
            u6Var2 = ((org.telegram.ui.ActionBar.k3) i0Var).resourcesProvider;
            f7.Z(s6Var, i13, u6Var2);
        } else {
            int i14 = y6.y6;
            u6Var = ((org.telegram.ui.ActionBar.k3) i0Var).resourcesProvider;
            f7.Z(s6Var, i14, u6Var);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ int g() {
        return 0;
    }

    @Override // org.telegram.ui.Components.og
    public final void g1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean h1() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ mn i0() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TLRPC.Peer k() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean p0() {
        return true;
    }

    @Override // org.telegram.ui.Components.og
    public final void L1(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void M0(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void O1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void R(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void t(float f7) {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void w(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void H() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void H0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void J1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void N1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void T1() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void U() {
    }

    @Override // org.telegram.ui.Components.og
    public final void X0() {
    }

    @Override // org.telegram.ui.Components.og
    public final void Y1() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void a1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void b() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void b1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void c1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void c2() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void e() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void j1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void l0() {
    }

    @Override // org.telegram.ui.Components.og
    public final void o() {
    }

    @Override // org.telegram.ui.Components.og
    public final void o1() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void x0() {
    }

    @Override // org.telegram.ui.Components.og
    public final void z() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Components.og
    public final void G(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void v0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.og
    public final void e1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void A(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void P1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
