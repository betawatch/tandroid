// default package

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class veb implements pw2 {
    public final /* synthetic */ zeb a;

    public veb(zeb zebVar) {
        this.a = zebVar;
    }

    @Override // pw2
    public final boolean A() {
        return false;
    }

    @Override // pw2
    public final boolean C(TLRPC.Document document) {
        if (this.a.E) {
            return false;
        }
        return yac.h(yac.t0).p();
    }

    @Override // pw2
    public final String E(boolean z) {
        return null;
    }

    @Override // pw2
    public final void G(TLRPC.Document document) {
        xeb xebVar;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(r47.U(document));
        valueOf.setSpan(new hm(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (!hl.g(valueOf) || (xebVar = this.a.c) == null) {
            return;
        }
        d31.b0(xebVar.getParentFragment()).i(ob6.M0(2131751149, null)).j();
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
        if (this.a.F || !yac.h(yac.t0).p() || (f = yac.h(yac.t0).f()) == null) {
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
        xeb xebVar = this.a.c;
        if (xebVar == null) {
            return false;
        }
        e parentFragment = xebVar.getParentFragment();
        if (parentFragment instanceof zu1) {
            return ((zu1) parentFragment).X7();
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
        xeb xebVar = this.a.c;
        if (xebVar == null) {
            return false;
        }
        e parentFragment = xebVar.getParentFragment();
        if (!(parentFragment instanceof zu1)) {
            return false;
        }
        zu1 zu1Var = (zu1) parentFragment;
        if (!zu1Var.N4()) {
            return false;
        }
        if (yac.h(yac.t0).p()) {
            return true;
        }
        return zu1Var.h() != null && lbc.D(zu1Var.h());
    }

    @Override // pw2
    public final boolean n() {
        return false;
    }

    @Override // pw2
    public final void s(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        zeb zebVar = this.a;
        vnb vnbVar = zebVar.b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f = yac.h(yac.t0).f();
        Object tL_emojiStatusEmpty = f == null ? new TLRPC.TL_emojiStatusEmpty() : f.emoji_status;
        uc7.s1(zebVar.a).v5(emojiStatus, null);
        bcb bcbVar = new bcb((Object) this, tL_emojiStatusEmpty, (byte) 1);
        xeb xebVar = zebVar.c;
        e parentFragment = xebVar == null ? null : xebVar.getParentFragment();
        if (parentFragment != null) {
            if (document != null) {
                d31.b0(parentFragment).r(document, ob6.M0(2131745273, null), ob6.M0(2131743540, null), bcbVar).j();
                return;
            }
            n21 n21Var = new n21(zebVar.getContext(), vnbVar);
            n21Var.b.setText(ob6.M0(2131746014, null));
            n21Var.a.setImageResource(R.drawable.msg_settings_premium);
            t21 t21Var = new t21(vnbVar, zebVar.getContext(), true);
            t21Var.b = bcbVar;
            n21Var.setButton(t21Var);
            v21.g(parentFragment, n21Var, 1500).j();
        }
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
        zeb zebVar = this.a;
        xeb xebVar = zebVar.c;
        if (xebVar != null) {
            e parentFragment = xebVar.getParentFragment();
            if (parentFragment instanceof zu1) {
                ((zu1) parentFragment).yb(document);
                zebVar.c.setFieldText("");
            }
        }
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
