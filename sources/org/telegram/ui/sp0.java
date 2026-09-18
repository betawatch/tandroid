package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class sp0 extends g71 {
    public final /* synthetic */ vp0 d2;
    public final /* synthetic */ x61[] e2;
    public final /* synthetic */ wp0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp0(wp0 wp0Var, org.telegram.ui.ActionBar.n2 n2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11, int i12, vp0 vp0Var, x61[] x61VarArr) {
        super(n2Var, context, true, num, i10, true, e6Var, i11, i12);
        this.f2 = wp0Var;
        this.d2 = vp0Var;
        this.e2 = x61VarArr;
    }

    @Override // org.telegram.ui.g71
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.g71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        wp0 wp0Var = this.f2;
        if (tL_starGiftUnique != null) {
            if (wp0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                wp0Var.s = (TLRPC.TL_peerColorCollectible) peerColor;
                wp0Var.r = null;
            } else {
                wp0Var.s = null;
                wp0Var.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            wp0Var.I = null;
            wp0Var.h = -1;
        } else {
            wp0Var.n = l4 == null ? 0L : l4.longValue();
            wp0Var.r = null;
            wp0Var.s = null;
            wp0Var.I = null;
        }
        vp0 vp0Var = this.d2;
        if (vp0Var != null) {
            vp0Var.b(true);
        }
        wp0Var.j(true);
        wp0Var.i();
        wp0Var.f(true);
        x61 x61Var = this.e2[0];
        if (x61Var != null) {
            wp0Var.o0 = null;
            x61Var.dismiss();
        }
    }
}
