// default package

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.RippleDrawable;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class z04 implements fx2 {
    public final /* synthetic */ e34 a;

    public z04(e34 e34Var) {
        this.a = e34Var;
    }

    @Override // fx2
    public final void A(TLRPC.Document document) {
        d dVar = this.a.Z1;
        if (dVar instanceof yv1) {
            ((yv1) dVar).xb(document);
        }
    }

    @Override // fx2
    public final boolean B() {
        return true;
    }

    @Override // fx2
    public final boolean C(TLRPC.Document document) {
        return true;
    }

    @Override // fx2
    public final void D(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = hs6.c0(document, "").document;
        ConnectionsManager.getInstance(this.a.d1).sendRequest(tL_stickers_removeStickerFromSet, new tg(this, (byte) 23));
    }

    @Override // fx2
    public final String E(boolean z) {
        e34 e34Var = this.a;
        if (z) {
            y59 adapter = e34Var.i0.getAdapter();
            j24 j24Var = e34Var.k0;
            if (adapter == j24Var) {
                return j24Var.x;
            }
            return null;
        }
        y59 adapter2 = e34Var.Q.getAdapter();
        e24 e24Var = e34Var.T;
        if (adapter2 == e24Var) {
            return e24Var.w;
        }
        return null;
    }

    @Override // fx2
    public final void G(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(k47.U(document));
        valueOf.setSpan(new gn(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (gm.g(valueOf)) {
            e34 e34Var = this.a;
            d dVar = e34Var.Z1;
            (dVar != null ? c41.b0(dVar) : new c41(e34Var.r, e34Var.a2)).i(jb6.M0(2131751121, null)).j();
        }
    }

    @Override // fx2
    public final boolean H() {
        return false;
    }

    @Override // fx2
    public final bu5 I(ViewGroup viewGroup) {
        return null;
    }

    @Override // fx2
    public final void K(Object obj, Object obj2) {
        e34 e34Var = this.a;
        g04 g04Var = e34Var.i0;
        if (g04Var.getAdapter() == e34Var.o0 || g04Var.getAdapter() == e34Var.k0) {
            e34Var.u1.e(obj, obj2);
        }
    }

    @Override // fx2
    public final boolean L() {
        return false;
    }

    @Override // fx2
    public final void O() {
        this.a.X();
    }

    @Override // fx2
    public final void P(TLRPC.InputStickerSet inputStickerSet, boolean z) {
        if (inputStickerSet == null) {
            return;
        }
        this.a.u1.d(null, inputStickerSet, false);
    }

    @Override // fx2
    public final boolean Q(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        ArrayList arrayList = gw3.i;
        StringBuilder sb = new StringBuilder("animated_");
        sb.append(document.id);
        return arrayList.contains(sb.toString());
    }

    @Override // fx2
    public final Boolean S(TLRPC.Document document) {
        TLRPC.User f;
        if (!z8c.h(z8c.t0).p() || (f = z8c.h(z8c.t0).f()) == null) {
            return null;
        }
        Long i = m9c.i(f);
        return Boolean.valueOf(document != null && (i == null || i.longValue() != document.id));
    }

    @Override // fx2
    public final boolean T() {
        return true;
    }

    @Override // fx2
    public final long a() {
        return this.a.u1.a();
    }

    @Override // fx2
    public final boolean b() {
        return this.a.u1.b();
    }

    @Override // fx2
    public final boolean c() {
        return this.a.u1.c();
    }

    @Override // fx2
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override // fx2
    public final boolean e(TLRPC.Document document) {
        return this.a.u1.k();
    }

    @Override // fx2
    public final boolean f() {
        return false;
    }

    @Override // fx2
    public final TLRPC.PollAnswer g() {
        return null;
    }

    @Override // fx2
    public final boolean h() {
        e34 e34Var = this.a;
        return (e34Var.Z1 == null && e34Var.v0) ? false : true;
    }

    @Override // fx2
    public final boolean i() {
        return false;
    }

    @Override // fx2
    public final boolean j(int i) {
        d dVar = this.a.Z1;
        if (i != 2) {
            return true;
        }
        if (!(dVar instanceof yv1) || !((yv1) dVar).N4()) {
            return false;
        }
        if (z8c.h(z8c.t0).p()) {
            return true;
        }
        return ((yv1) dVar).h() != null && m9c.D(((yv1) dVar).h());
    }

    @Override // fx2
    public final void k(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
        this.a.u1.x(null, document, str, obj, null, z, i);
    }

    @Override // fx2
    public final void m(TLRPC.Document document) {
        TLRPC.InputStickerSet inputStickerSet;
        int i = 0;
        while (true) {
            if (i >= document.attributes.size()) {
                inputStickerSet = null;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null) {
                break;
            } else {
                i++;
            }
        }
        e34 e34Var = this.a;
        x2b.G0(e34Var.Z1, hs6.d0(e34Var.d1).n0(inputStickerSet, true), document);
    }

    @Override // fx2
    public final boolean n() {
        return false;
    }

    @Override // fx2
    public final void o(TLRPC.Document document) {
        if (document != null) {
            String str = "animated_" + document.id;
            HashMap hashMap = gw3.h;
            hashMap.remove(str);
            ArrayList arrayList = gw3.i;
            arrayList.remove(str);
            if (hashMap.isEmpty() || arrayList.isEmpty()) {
                gw3.a(gw3.o[0]);
            }
            o14 o14Var = this.a.S;
            if (o14Var != null) {
                o14Var.F(false);
            }
        }
    }

    @Override // fx2
    public final void q() {
        r14 r14Var = this.a.Q;
        if (r14Var == null || r14Var.m3 == null) {
            return;
        }
        while (r14Var.m3.size() > 0) {
            q14 q14Var = (q14) r14Var.m3.valueAt(0);
            r14Var.m3.removeAt(0);
            if (q14Var != null) {
                if (q14Var.d.getBackground() instanceof RippleDrawable) {
                    q14Var.d.getBackground().setState(new int[0]);
                }
                q14Var.d.setPressed(false);
            }
        }
    }

    @Override // fx2
    public final void r(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        e34 e34Var = this.a;
        FrameLayout frameLayout = e34Var.r;
        d dVar = e34Var.Z1;
        ylb ylbVar = e34Var.a2;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f = z8c.h(z8c.t0).f();
        Object tL_emojiStatusEmpty = f == null ? new TLRPC.TL_emojiStatusEmpty() : f.emoji_status;
        oc7.r1(e34Var.d1).p5(emojiStatus, null);
        pv3 pv3Var = new pv3(this, tL_emojiStatusEmpty, (byte) 5);
        if (document != null) {
            (dVar != null ? c41.b0(dVar) : new c41(frameLayout, ylbVar)).r(document, jb6.M0(2131745279, null), jb6.M0(2131743572, null), pv3Var).j();
            return;
        }
        m31 m31Var = new m31(e34Var.getContext(), ylbVar);
        m31Var.b.setText(jb6.M0(2131746020, null));
        ImageView imageView = m31Var.a;
        imageView.setImageResource(R.drawable.msg_settings_premium);
        imageView.setScaleX(0.8f);
        imageView.setScaleY(0.8f);
        anb.s(imageView, cmb.y9, ylbVar, PorterDuff.Mode.MULTIPLY);
        s31 s31Var = new s31(ylbVar, e34Var.getContext(), true);
        s31Var.b = pv3Var;
        m31Var.setButton(s31Var);
        if (dVar != null) {
            u31.g(dVar, m31Var, 1500).j();
        } else {
            u31.f(frameLayout, m31Var, 1500).j();
        }
    }

    @Override // fx2
    public final boolean t() {
        return true;
    }

    @Override // fx2
    public final void u(Object obj, Object obj2, boolean z, int i, int i2) {
        e34 e34Var = this.a;
        g04 g04Var = e34Var.i0;
        if (g04Var.getAdapter() == e34Var.o0) {
            e34Var.u1.u(null, obj, null, obj2, z, i, i2);
        } else if (g04Var.getAdapter() == e34Var.k0) {
            e34Var.u1.u(null, obj, null, obj2, z, i, i2);
        }
    }

    @Override // fx2
    public final k47 x() {
        return null;
    }

    @Override // fx2
    public final boolean y() {
        return false;
    }

    @Override // fx2
    public final void J(t5a t5aVar) {
    }

    @Override // fx2
    public final void M() {
    }

    @Override // fx2
    public final void R(String str) {
    }

    @Override // fx2
    public final void l(String str) {
    }

    @Override // fx2
    public final void p() {
    }

    @Override // fx2
    public final void w(String str) {
    }

    @Override // fx2
    public final void s(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override // fx2
    public final void z(CharSequence charSequence, String str, qy1 qy1Var) {
    }
}
