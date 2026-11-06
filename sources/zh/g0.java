package zh;

import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.wf;
import org.telegram.ui.qm;
import org.telegram.ui.r81;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class g0 implements wf {
    public final /* synthetic */ TL_stars.TL_starGiftUnique a;
    public final /* synthetic */ i0 b;

    public g0(i0 i0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.b = i0Var;
        this.a = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.Components.wf
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers I() {
        return null;
    }

    @Override // org.telegram.ui.Components.wf
    public final /* synthetic */ int S0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.wf
    public final /* synthetic */ TL_stories.StoryItem T0() {
        return null;
    }

    @Override // org.telegram.ui.Components.wf
    public final /* synthetic */ boolean V0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.wf
    public final boolean X0() {
        return false;
    }

    @Override // org.telegram.ui.Components.wf
    public final void a1(CharSequence charSequence, boolean z9, boolean z10) {
        d(charSequence);
    }

    @Override // org.telegram.ui.Components.wf
    public final /* synthetic */ boolean c() {
        return false;
    }

    public final void d(CharSequence charSequence) {
        int i7;
        i0 i0Var = this.b;
        j6 j6Var = i0Var.s1;
        i0Var.i1.a(this.a, p10.i(i0Var.a).e(), i0Var.o1.getTextWithEntities(), hd.M0(2131749744, null), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        i0Var.w1 = codePointCount;
        int i10 = i0Var.v1;
        if (i10 <= 0 || (i7 = i10 - codePointCount) > 15) {
            j6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new r81(this, 25));
            return;
        }
        if (i7 < -9999) {
            i7 = -9999;
        }
        j6Var.c(hd.E(i7, ','), j6Var.getVisibility() == 0, true);
        if (j6Var.getVisibility() != 0) {
            j6Var.setVisibility(0);
            j6Var.setAlpha(0.0f);
            j6Var.setScaleX(0.5f);
            j6Var.setScaleY(0.5f);
        }
        j6Var.animate().setListener(null).cancel();
        j6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        if (i7 < 0) {
            r6.Z(j6Var, k6.p7, i0Var.I0);
        } else {
            r6.Z(j6Var, k6.y6, i0Var.I0);
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final /* synthetic */ boolean d1() {
        return false;
    }

    @Override // org.telegram.ui.Components.wf
    public final void k1(CharSequence charSequence) {
        d(charSequence);
    }

    @Override // org.telegram.ui.Components.wf
    public final /* synthetic */ int l() {
        return 0;
    }

    @Override // org.telegram.ui.Components.wf
    public final /* synthetic */ boolean l1() {
        return false;
    }

    @Override // org.telegram.ui.Components.wf
    public final /* synthetic */ qm o0() {
        return null;
    }

    @Override // org.telegram.ui.Components.wf
    public final /* synthetic */ TLRPC.Peer s() {
        return null;
    }

    @Override // org.telegram.ui.Components.wf
    public final /* synthetic */ boolean v0() {
        return true;
    }

    @Override // org.telegram.ui.Components.wf
    public final /* synthetic */ void B(boolean z9) {
    }

    @Override // org.telegram.ui.Components.wf
    public final void R0(int i7) {
    }

    @Override // org.telegram.ui.Components.wf
    public final void V1(int i7) {
    }

    @Override // org.telegram.ui.Components.wf
    public final void Y(boolean z9) {
    }

    @Override // org.telegram.ui.Components.wf
    public final void Y1(boolean z9) {
    }

    @Override // org.telegram.ui.Components.wf
    public final void w(float f10) {
    }

    @Override // org.telegram.ui.Components.wf
    public final /* synthetic */ void C0() {
    }

    @Override // org.telegram.ui.Components.wf
    public final void D() {
    }

    @Override // org.telegram.ui.Components.wf
    public final void E() {
    }

    @Override // org.telegram.ui.Components.wf
    public final /* synthetic */ void I0() {
    }

    @Override // org.telegram.ui.Components.wf
    public final /* synthetic */ void T1() {
    }

    @Override // org.telegram.ui.Components.wf
    public final /* synthetic */ void W() {
    }

    @Override // org.telegram.ui.Components.wf
    public final void X1() {
    }

    @Override // org.telegram.ui.Components.wf
    public final void a() {
    }

    @Override // org.telegram.ui.Components.wf
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.wf
    public final void c1() {
    }

    @Override // org.telegram.ui.Components.wf
    public final void d2() {
    }

    @Override // org.telegram.ui.Components.wf
    public final /* synthetic */ void e1() {
    }

    @Override // org.telegram.ui.Components.wf
    public final /* synthetic */ void f1() {
    }

    @Override // org.telegram.ui.Components.wf
    public final void h1() {
    }

    @Override // org.telegram.ui.Components.wf
    public final void h2() {
    }

    @Override // org.telegram.ui.Components.wf
    public final /* synthetic */ void j0() {
    }

    @Override // org.telegram.ui.Components.wf
    public final void l2() {
    }

    @Override // org.telegram.ui.Components.wf
    public final /* synthetic */ void m1() {
    }

    @Override // org.telegram.ui.Components.wf
    public final void r0() {
    }

    @Override // org.telegram.ui.Components.wf
    public final void t() {
    }

    @Override // org.telegram.ui.Components.wf
    public final void t1() {
    }

    @Override // org.telegram.ui.Components.wf
    public final /* synthetic */ void w0() {
    }

    @Override // org.telegram.ui.Components.wf
    public final void M(float f10, int i7) {
    }

    @Override // org.telegram.ui.Components.wf
    public final void i1(View view, CharSequence charSequence, boolean z9) {
    }

    @Override // org.telegram.ui.Components.wf
    public final void F(CharSequence charSequence, boolean z9, int i7, int i10, long j3) {
    }

    @Override // org.telegram.ui.Components.wf
    public final void Z1(int i7, int i10, int i11, long j3, long j10, boolean z9) {
    }
}
