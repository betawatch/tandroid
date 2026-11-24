// default package

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class yab implements vv2 {
    public final /* synthetic */ dbb a;

    public yab(dbb dbbVar) {
        this.a = dbbVar;
    }

    @Override // vv2
    public final boolean A(TLRPC.Document document) {
        if (this.a.E) {
            return false;
        }
        return y6c.h(y6c.t0).p();
    }

    @Override // vv2
    public final String C(boolean z) {
        return null;
    }

    @Override // vv2
    public final void D(TLRPC.Document document) {
        bbb bbbVar;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(k27.U(document));
        valueOf.setSpan(new gm(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (!gl.g(valueOf) || (bbbVar = this.a.c) == null) {
            return;
        }
        u21.b0(bbbVar.getParentFragment()).i(k96.M0(2131751172, null)).j();
    }

    @Override // vv2
    public final boolean E() {
        return false;
    }

    @Override // vv2
    public final cs5 F(ViewGroup viewGroup) {
        return null;
    }

    @Override // vv2
    public final boolean K() {
        return false;
    }

    @Override // vv2
    public final boolean O(TLRPC.Document document) {
        return false;
    }

    @Override // vv2
    public final Boolean R(TLRPC.Document document) {
        TLRPC.User f;
        if (this.a.F || !y6c.h(y6c.t0).p() || (f = y6c.h(y6c.t0).f()) == null) {
            return null;
        }
        Long i = l7c.i(f);
        return Boolean.valueOf(document != null && (i == null || i.longValue() != document.id));
    }

    @Override // vv2
    public final boolean S() {
        return true;
    }

    @Override // vv2
    public final long a() {
        return 0L;
    }

    @Override // vv2
    public final boolean b() {
        return false;
    }

    @Override // vv2
    public final boolean c() {
        bbb bbbVar = this.a.c;
        if (bbbVar == null) {
            return false;
        }
        d parentFragment = bbbVar.getParentFragment();
        if (parentFragment instanceof mu1) {
            return ((mu1) parentFragment).N7();
        }
        return false;
    }

    @Override // vv2
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // vv2
    public final boolean e(TLRPC.Document document) {
        return false;
    }

    @Override // vv2
    public final boolean f() {
        return false;
    }

    @Override // vv2
    public final TLRPC.PollAnswer g() {
        return null;
    }

    @Override // vv2
    public final boolean h() {
        return true;
    }

    @Override // vv2
    public final boolean i() {
        return false;
    }

    @Override // vv2
    public final boolean j(int i) {
        bbb bbbVar = this.a.c;
        if (bbbVar == null) {
            return false;
        }
        d parentFragment = bbbVar.getParentFragment();
        if (!(parentFragment instanceof mu1)) {
            return false;
        }
        mu1 mu1Var = (mu1) parentFragment;
        if (!mu1Var.H4()) {
            return false;
        }
        if (y6c.h(y6c.t0).p()) {
            return true;
        }
        return mu1Var.h() != null && l7c.C(mu1Var.h());
    }

    @Override // vv2
    public final boolean n() {
        return false;
    }

    @Override // vv2
    public final void r(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        dbb dbbVar = this.a;
        wjb wjbVar = dbbVar.b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f = y6c.h(y6c.t0).f();
        Object tL_emojiStatusEmpty = f == null ? new TLRPC.TL_emojiStatusEmpty() : f.emoji_status;
        na7.q1(dbbVar.a).m5(emojiStatus, null);
        a5b a5bVar = new a5b((Object) this, tL_emojiStatusEmpty, (byte) 4);
        bbb bbbVar = dbbVar.c;
        d parentFragment = bbbVar == null ? null : bbbVar.getParentFragment();
        if (parentFragment != null) {
            if (document != null) {
                u21.b0(parentFragment).r(document, k96.M0(2131745353, null), k96.M0(2131743646, null), a5bVar).j();
                return;
            }
            e21 e21Var = new e21(dbbVar.getContext(), wjbVar);
            e21Var.b.setText(k96.M0(2131746094, null));
            e21Var.a.setImageResource(R.drawable.msg_settings_premium);
            k21 k21Var = new k21(wjbVar, dbbVar.getContext(), true);
            k21Var.b = a5bVar;
            e21Var.setButton(k21Var);
            m21.g(parentFragment, e21Var, 1500).j();
        }
    }

    @Override // vv2
    public final boolean t() {
        return true;
    }

    @Override // vv2
    public final k27 w() {
        return null;
    }

    @Override // vv2
    public final boolean x() {
        return false;
    }

    @Override // vv2
    public final void y(TLRPC.Document document) {
        dbb dbbVar = this.a;
        bbb bbbVar = dbbVar.c;
        if (bbbVar != null) {
            d parentFragment = bbbVar.getParentFragment();
            if (parentFragment instanceof mu1) {
                ((mu1) parentFragment).lb(document);
                dbbVar.c.setFieldText("");
            }
        }
    }

    @Override // vv2
    public final boolean z() {
        return false;
    }

    @Override // vv2
    public final void L() {
    }

    @Override // vv2
    public final void M() {
    }

    @Override // vv2
    public final void p() {
    }

    @Override // vv2
    public final void q() {
    }

    @Override // vv2
    public final void B(TLRPC.Document document) {
    }

    @Override // vv2
    public final void H(s3a s3aVar) {
    }

    @Override // vv2
    public final void P(String str) {
    }

    @Override // vv2
    public final void l(String str) {
    }

    @Override // vv2
    public final void m(TLRPC.Document document) {
    }

    @Override // vv2
    public final void o(TLRPC.Document document) {
    }

    @Override // vv2
    public final void v(String str) {
    }

    @Override // vv2
    public final void I(Object obj, Object obj2) {
    }

    @Override // vv2
    public final void N(TLRPC.InputStickerSet inputStickerSet, boolean z) {
    }

    @Override // vv2
    public final void s(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // vv2
    public final void Q(CharSequence charSequence, String str, pz1 pz1Var) {
    }

    @Override // vv2
    public final void u(Object obj, Object obj2, boolean z, int i, int i2) {
    }

    @Override // vv2
    public final void k(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
    }
}
