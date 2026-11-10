package zh;

import android.view.View;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.vf;
import org.telegram.ui.sm;
import org.telegram.ui.u81;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class f0 implements vf {
    public final /* synthetic */ TL_stars.TL_starGiftUnique a;
    public final /* synthetic */ h0 b;

    public f0(h0 h0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.b = h0Var;
        this.a = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers I() {
        return null;
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ int S0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ TL_stories.StoryItem T0() {
        return null;
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ boolean V0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.vf
    public final boolean X0() {
        return false;
    }

    @Override // org.telegram.ui.Components.vf
    public final void a1(CharSequence charSequence, boolean z9, boolean z10) {
        d(charSequence);
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ boolean c() {
        return false;
    }

    public final void d(CharSequence charSequence) {
        int i7;
        h0 h0Var = this.b;
        i6 i6Var = h0Var.v1;
        h0Var.l1.a(this.a, p10.i(h0Var.a).e(), h0Var.r1.getTextWithEntities(), id.M0(2131749745, null), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        h0Var.z1 = codePointCount;
        int i10 = h0Var.y1;
        if (i10 <= 0 || (i7 = i10 - codePointCount) > 15) {
            i6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new u81(this, 25));
            return;
        }
        if (i7 < -9999) {
            i7 = -9999;
        }
        i6Var.c(id.E(i7, ','), i6Var.getVisibility() == 0, true);
        if (i6Var.getVisibility() != 0) {
            i6Var.setVisibility(0);
            i6Var.setAlpha(0.0f);
            i6Var.setScaleX(0.5f);
            i6Var.setScaleY(0.5f);
        }
        i6Var.animate().setListener(null).cancel();
        i6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        if (i7 < 0) {
            t6.Y(i6Var, m6.p7, h0Var.I0);
        } else {
            t6.Y(i6Var, m6.y6, h0Var.I0);
        }
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ boolean d1() {
        return false;
    }

    @Override // org.telegram.ui.Components.vf
    public final void k1(CharSequence charSequence) {
        d(charSequence);
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ int l() {
        return 0;
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ boolean l1() {
        return false;
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ sm o0() {
        return null;
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ TLRPC.Peer s() {
        return null;
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ boolean v0() {
        return true;
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void B(boolean z9) {
    }

    @Override // org.telegram.ui.Components.vf
    public final void R0(int i7) {
    }

    @Override // org.telegram.ui.Components.vf
    public final void V1(int i7) {
    }

    @Override // org.telegram.ui.Components.vf
    public final void Y(boolean z9) {
    }

    @Override // org.telegram.ui.Components.vf
    public final void Y1(boolean z9) {
    }

    @Override // org.telegram.ui.Components.vf
    public final void w(float f10) {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void C0() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void D() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void E() {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void I0() {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void T1() {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void W() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void X1() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void a() {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void c1() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void d2() {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void e1() {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void f1() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void h1() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void h2() {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void j0() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void l2() {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void m1() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void r0() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void t() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void t1() {
    }

    @Override // org.telegram.ui.Components.vf
    public final /* synthetic */ void w0() {
    }

    @Override // org.telegram.ui.Components.vf
    public final void M(float f10, int i7) {
    }

    @Override // org.telegram.ui.Components.vf
    public final void i1(View view, CharSequence charSequence, boolean z9) {
    }

    @Override // org.telegram.ui.Components.vf
    public final void F(CharSequence charSequence, boolean z9, int i7, int i10, long j3) {
    }

    @Override // org.telegram.ui.Components.vf
    public final void Z1(int i7, int i10, int i11, long j3, long j10, boolean z9) {
    }
}
