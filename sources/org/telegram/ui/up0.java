package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class up0 extends r71 {
    public final /* synthetic */ xp0 d2;
    public final /* synthetic */ i71[] e2;
    public final /* synthetic */ yp0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up0(yp0 yp0Var, org.telegram.ui.ActionBar.m2 m2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, int i12, xp0 xp0Var, i71[] i71VarArr) {
        super(m2Var, context, true, num, i10, true, c6Var, i11, i12);
        this.f2 = yp0Var;
        this.d2 = xp0Var;
        this.e2 = i71VarArr;
    }

    @Override // org.telegram.ui.r71
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.r71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        yp0 yp0Var = this.f2;
        if (tL_starGiftUnique != null) {
            if (yp0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                yp0Var.s = (TLRPC.TL_peerColorCollectible) peerColor;
                yp0Var.r = null;
            } else {
                yp0Var.s = null;
                yp0Var.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            yp0Var.I = null;
            yp0Var.h = -1;
        } else {
            yp0Var.n = l4 == null ? 0L : l4.longValue();
            yp0Var.r = null;
            yp0Var.s = null;
            yp0Var.I = null;
        }
        xp0 xp0Var = this.d2;
        if (xp0Var != null) {
            xp0Var.b(true);
        }
        yp0Var.j(true);
        yp0Var.i();
        yp0Var.f(true);
        i71 i71Var = this.e2[0];
        if (i71Var != null) {
            yp0Var.o0 = null;
            i71Var.dismiss();
        }
    }
}
