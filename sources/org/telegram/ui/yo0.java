package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class yo0 extends x51 {
    public final /* synthetic */ bp0 d2;
    public final /* synthetic */ o51[] e2;
    public final /* synthetic */ cp0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo0(cp0 cp0Var, org.telegram.ui.ActionBar.n2 n2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, int i12, bp0 bp0Var, o51[] o51VarArr) {
        super(n2Var, context, true, num, i10, true, d6Var, i11, i12);
        this.f2 = cp0Var;
        this.d2 = bp0Var;
        this.e2 = o51VarArr;
    }

    @Override // org.telegram.ui.x51
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.x51
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        cp0 cp0Var = this.f2;
        if (tL_starGiftUnique != null) {
            if (cp0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                cp0Var.s = (TLRPC.TL_peerColorCollectible) peerColor;
                cp0Var.r = null;
            } else {
                cp0Var.s = null;
                cp0Var.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            cp0Var.I = null;
            cp0Var.h = -1;
        } else {
            cp0Var.n = l4 == null ? 0L : l4.longValue();
            cp0Var.r = null;
            cp0Var.s = null;
            cp0Var.I = null;
        }
        bp0 bp0Var = this.d2;
        if (bp0Var != null) {
            bp0Var.b(true);
        }
        cp0Var.j(true);
        cp0Var.i();
        cp0Var.f(true);
        o51 o51Var = this.e2[0];
        if (o51Var != null) {
            cp0Var.o0 = null;
            o51Var.dismiss();
        }
    }
}
