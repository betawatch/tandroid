package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class rp0 extends j71 {
    public final /* synthetic */ up0 d2;
    public final /* synthetic */ a71[] e2;
    public final /* synthetic */ vp0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp0(vp0 vp0Var, org.telegram.ui.ActionBar.n2 n2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, int i12, up0 up0Var, a71[] a71VarArr) {
        super(n2Var, context, true, num, i10, true, f6Var, i11, i12);
        this.f2 = vp0Var;
        this.d2 = up0Var;
        this.e2 = a71VarArr;
    }

    @Override // org.telegram.ui.j71
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.j71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        vp0 vp0Var = this.f2;
        if (tL_starGiftUnique != null) {
            if (vp0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                vp0Var.s = (TLRPC.TL_peerColorCollectible) peerColor;
                vp0Var.r = null;
            } else {
                vp0Var.s = null;
                vp0Var.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            vp0Var.I = null;
            vp0Var.h = -1;
        } else {
            vp0Var.n = l4 == null ? 0L : l4.longValue();
            vp0Var.r = null;
            vp0Var.s = null;
            vp0Var.I = null;
        }
        up0 up0Var = this.d2;
        if (up0Var != null) {
            up0Var.b(true);
        }
        vp0Var.j(true);
        vp0Var.i();
        vp0Var.f(true);
        a71 a71Var = this.e2[0];
        if (a71Var != null) {
            vp0Var.o0 = null;
            a71Var.dismiss();
        }
    }
}
