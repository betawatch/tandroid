package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class xo0 extends q61 {
    public final /* synthetic */ ap0 a2;
    public final /* synthetic */ g61[] b2;
    public final /* synthetic */ bp0 c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo0(bp0 bp0Var, org.telegram.ui.ActionBar.p2 p2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, int i12, ap0 ap0Var, g61[] g61VarArr) {
        super(p2Var, context, true, num, i10, true, f6Var, i11, i12);
        this.c2 = bp0Var;
        this.a2 = ap0Var;
        this.b2 = g61VarArr;
    }

    @Override // org.telegram.ui.q61
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.q61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        bp0 bp0Var = this.c2;
        if (tL_starGiftUnique != null) {
            if (bp0Var.d0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                bp0Var.v = (TLRPC.TL_peerColorCollectible) peerColor;
                bp0Var.s = null;
            } else {
                bp0Var.v = null;
                bp0Var.s = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            bp0Var.y = null;
            bp0Var.n = -1;
        } else {
            bp0Var.r = l10 == null ? 0L : l10.longValue();
            bp0Var.s = null;
            bp0Var.v = null;
            bp0Var.y = null;
        }
        ap0 ap0Var = this.a2;
        if (ap0Var != null) {
            ap0Var.b(true);
        }
        bp0Var.i(true);
        bp0Var.h();
        bp0Var.f();
        g61 g61Var = this.b2[0];
        if (g61Var != null) {
            bp0Var.f0 = null;
            g61Var.dismiss();
        }
    }
}
