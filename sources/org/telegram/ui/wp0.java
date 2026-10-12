package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class wp0 extends r71 {
    public final /* synthetic */ zp0 d2;
    public final /* synthetic */ i71[] e2;
    public final /* synthetic */ aq0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp0(aq0 aq0Var, org.telegram.ui.ActionBar.m2 m2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, int i12, zp0 zp0Var, i71[] i71VarArr) {
        super(m2Var, context, true, num, i10, true, c6Var, i11, i12);
        this.f2 = aq0Var;
        this.d2 = zp0Var;
        this.e2 = i71VarArr;
    }

    @Override // org.telegram.ui.r71
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.r71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        aq0 aq0Var = this.f2;
        if (tL_starGiftUnique != null) {
            if (aq0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                aq0Var.s = (TLRPC.TL_peerColorCollectible) peerColor;
                aq0Var.r = null;
            } else {
                aq0Var.s = null;
                aq0Var.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            aq0Var.I = null;
            aq0Var.h = -1;
        } else {
            aq0Var.n = l4 == null ? 0L : l4.longValue();
            aq0Var.r = null;
            aq0Var.s = null;
            aq0Var.I = null;
        }
        zp0 zp0Var = this.d2;
        if (zp0Var != null) {
            zp0Var.b(true);
        }
        aq0Var.j(true);
        aq0Var.i();
        aq0Var.f(true);
        i71 i71Var = this.e2[0];
        if (i71Var != null) {
            aq0Var.o0 = null;
            i71Var.dismiss();
        }
    }
}
