package ph;

import android.view.View;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.sf;
import org.telegram.ui.kn;
import org.telegram.ui.ns0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i0 implements sf {
    public final /* synthetic */ TL_stars.TL_starGiftUnique a;
    public final /* synthetic */ k0 b;

    public i0(k0 k0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.b = k0Var;
        this.a = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers F() {
        return null;
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ int H0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ TL_stories.StoryItem P0() {
        return null;
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ boolean R0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.sf
    public final boolean T0() {
        return false;
    }

    @Override // org.telegram.ui.Components.sf
    public final void V0(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ boolean Y0() {
        return false;
    }

    public final void a(CharSequence charSequence) {
        int i10;
        k0 k0Var = this.b;
        f6 f6Var = k0Var.s1;
        k0Var.i1.a(this.a, d20.i(k0Var.a).e(), k0Var.o1.getTextWithEntities(), cd.L0(2131749754, null), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        k0Var.w1 = codePointCount;
        int i11 = k0Var.v1;
        if (i11 <= 0 || (i10 = i11 - codePointCount) > 15) {
            f6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new ns0(this, 25));
            return;
        }
        if (i10 < -9999) {
            i10 = -9999;
        }
        f6Var.c(cd.E(i10, ','), f6Var.getVisibility() == 0, true);
        if (f6Var.getVisibility() != 0) {
            f6Var.setVisibility(0);
            f6Var.setAlpha(0.0f);
            f6Var.setScaleX(0.5f);
            f6Var.setScaleY(0.5f);
        }
        f6Var.animate().setListener(null).cancel();
        f6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        if (i10 < 0) {
            a7.Z(f6Var, t6.p7, k0Var.I0);
        } else {
            a7.Z(f6Var, t6.y6, k0Var.I0);
        }
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ kn b0() {
        return null;
    }

    @Override // org.telegram.ui.Components.sf
    public final void g1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ boolean h1() {
        return false;
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ boolean k0() {
        return true;
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ int r() {
        return 0;
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ TLRPC.Peer u() {
        return null;
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void B(boolean z10) {
    }

    @Override // org.telegram.ui.Components.sf
    public final void G0(int i10) {
    }

    @Override // org.telegram.ui.Components.sf
    public final void Q1(int i10) {
    }

    @Override // org.telegram.ui.Components.sf
    public final void U1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.sf
    public final void V(boolean z10) {
    }

    @Override // org.telegram.ui.Components.sf
    public final void y(float f7) {
    }

    @Override // org.telegram.ui.Components.sf
    public final void C() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void D() {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void N() {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void O1() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void T1() {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void X() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void X0() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void Y1() {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void a1() {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void b1() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void d1() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void d2() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void e() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void h2() {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void i1() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void j0() {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void n0() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void o1() {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void q0() {
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void w() {
    }

    @Override // org.telegram.ui.Components.sf
    public final void I(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.sf
    public final void e1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.sf
    public final void E(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
    }

    @Override // org.telegram.ui.Components.sf
    public final void V1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
