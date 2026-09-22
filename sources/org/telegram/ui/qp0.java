package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class qp0 extends h71 {
    public final /* synthetic */ tp0 d2;
    public final /* synthetic */ y61[] e2;
    public final /* synthetic */ up0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp0(up0 up0Var, org.telegram.ui.ActionBar.n2 n2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11, int i12, tp0 tp0Var, y61[] y61VarArr) {
        super(n2Var, context, true, num, i10, true, e6Var, i11, i12);
        this.f2 = up0Var;
        this.d2 = tp0Var;
        this.e2 = y61VarArr;
    }

    @Override // org.telegram.ui.h71
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.h71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        up0 up0Var = this.f2;
        if (tL_starGiftUnique != null) {
            if (up0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                up0Var.s = (TLRPC.TL_peerColorCollectible) peerColor;
                up0Var.r = null;
            } else {
                up0Var.s = null;
                up0Var.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            up0Var.I = null;
            up0Var.h = -1;
        } else {
            up0Var.n = l4 == null ? 0L : l4.longValue();
            up0Var.r = null;
            up0Var.s = null;
            up0Var.I = null;
        }
        tp0 tp0Var = this.d2;
        if (tp0Var != null) {
            tp0Var.b(true);
        }
        up0Var.j(true);
        up0Var.i();
        up0Var.f(true);
        y61 y61Var = this.e2[0];
        if (y61Var != null) {
            up0Var.o0 = null;
            y61Var.dismiss();
        }
    }
}
