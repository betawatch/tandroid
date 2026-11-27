// default package

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class wx3 implements pw2 {
    public final /* synthetic */ ly3 a;

    public wx3(ly3 ly3Var) {
        this.a = ly3Var;
    }

    @Override // pw2
    public final boolean A() {
        return false;
    }

    @Override // pw2
    public final boolean C(TLRPC.Document document) {
        return yac.h(yac.t0).p() && r47.H2(document);
    }

    @Override // pw2
    public final String E(boolean z) {
        return null;
    }

    @Override // pw2
    public final void G(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(r47.U(document));
        valueOf.setSpan(new hm(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (hl.g(valueOf)) {
            ly3 ly3Var = this.a;
            new d31((FrameLayout) ly3Var.b, ly3Var.J0).i(ob6.M0(2131751149, null)).j();
        }
    }

    @Override // pw2
    public final boolean H() {
        return false;
    }

    @Override // pw2
    public final fu5 J(ViewGroup viewGroup) {
        return null;
    }

    @Override // pw2
    public final boolean M() {
        return false;
    }

    @Override // pw2
    public final boolean Q(TLRPC.Document document) {
        return false;
    }

    @Override // pw2
    public final Boolean S(TLRPC.Document document) {
        TLRPC.User f;
        if (!yac.h(yac.t0).p() || !r47.H2(document) || (f = yac.h(yac.t0).f()) == null) {
            return null;
        }
        Long i = lbc.i(f);
        return Boolean.valueOf(document != null && (i == null || i.longValue() != document.id));
    }

    @Override // pw2
    public final boolean T() {
        return true;
    }

    @Override // pw2
    public final long a() {
        return 0L;
    }

    @Override // pw2
    public final boolean b() {
        return false;
    }

    @Override // pw2
    public final boolean c() {
        e eVar = this.a.m1;
        if (eVar instanceof zu1) {
            return ((zu1) eVar).X7();
        }
        return false;
    }

    @Override // pw2
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // pw2
    public final boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // pw2
    public final boolean f() {
        return false;
    }

    @Override // pw2
    public final TLRPC.PollAnswer g() {
        return null;
    }

    @Override // pw2
    public final boolean h() {
        return true;
    }

    @Override // pw2
    public final boolean i() {
        return false;
    }

    @Override // pw2
    public final boolean j(int i) {
        e eVar = this.a.m1;
        if (!(eVar instanceof zu1) || !((zu1) eVar).N4()) {
            return false;
        }
        if (yac.h(yac.t0).p()) {
            return true;
        }
        return ((zu1) eVar).h() != null && lbc.D(((zu1) eVar).h());
    }

    @Override // pw2
    public final boolean n() {
        return false;
    }

    @Override // pw2
    public final void s(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f = yac.h(yac.t0).f();
        Object tL_emojiStatusEmpty = f == null ? new TLRPC.TL_emojiStatusEmpty() : f.emoji_status;
        ly3 ly3Var = this.a;
        uc7.s1(ly3Var.a).v5(emojiStatus, null);
        vx3 vx3Var = new vx3(this, tL_emojiStatusEmpty, (byte) 0);
        if (document != null) {
            new d31((FrameLayout) ly3Var.b, ly3Var.J0).r(document, ob6.M0(2131745273, null), ob6.M0(2131743540, null), vx3Var).j();
            return;
        }
        n21 n21Var = new n21(ly3Var.getContext(), ly3Var.J0);
        n21Var.b.setText(ob6.M0(2131746014, null));
        n21Var.a.setImageResource(R.drawable.msg_settings_premium);
        t21 t21Var = new t21(ly3Var.J0, ly3Var.getContext(), true);
        t21Var.b = vx3Var;
        n21Var.setButton(t21Var);
        v21.f((FrameLayout) ly3Var.b, n21Var, 1500).j();
    }

    @Override // pw2
    public final boolean u() {
        return true;
    }

    @Override // pw2
    public final r47 x() {
        return null;
    }

    @Override // pw2
    public final boolean y() {
        return false;
    }

    @Override // pw2
    public final void z(TLRPC.Document document) {
        ly3 ly3Var = this.a;
        e eVar = ly3Var.m1;
        if (eVar instanceof zu1) {
            ((zu1) eVar).yb(document);
        }
        ly3Var.H0();
        ly3Var.dismiss();
    }

    @Override // pw2
    public final void N() {
    }

    @Override // pw2
    public final void O() {
    }

    @Override // pw2
    public final void p() {
    }

    @Override // pw2
    public final void r() {
    }

    @Override // pw2
    public final void D(TLRPC.Document document) {
    }

    @Override // pw2
    public final void K(k7a k7aVar) {
    }

    @Override // pw2
    public final void R(String str) {
    }

    @Override // pw2
    public final void l(String str) {
    }

    @Override // pw2
    public final void m(TLRPC.Document document) {
    }

    @Override // pw2
    public final void o(TLRPC.Document document) {
    }

    @Override // pw2
    public final void w(String str) {
    }

    @Override // pw2
    public final void L(Object obj, Object obj2) {
    }

    @Override // pw2
    public final void P(TLRPC.InputStickerSet inputStickerSet, boolean z) {
    }

    @Override // pw2
    public final void t(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // pw2
    public final void F(CharSequence charSequence, String str, rx1 rx1Var) {
    }

    @Override // pw2
    public final void v(Object obj, Object obj2, boolean z, int i, int i2) {
    }

    @Override // pw2
    public final void k(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
    }
}
