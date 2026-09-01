package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class zo0 extends r61 {
    public final /* synthetic */ cp0 a2;
    public final /* synthetic */ i61[] b2;
    public final /* synthetic */ dp0 c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo0(dp0 dp0Var, org.telegram.ui.ActionBar.p2 p2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11, int i12, cp0 cp0Var, i61[] i61VarArr) {
        super(p2Var, context, true, num, i10, true, g6Var, i11, i12);
        this.c2 = dp0Var;
        this.a2 = cp0Var;
        this.b2 = i61VarArr;
    }

    @Override // org.telegram.ui.r61
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.r61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        dp0 dp0Var = this.c2;
        if (tL_starGiftUnique != null) {
            if (dp0Var.d0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                dp0Var.v = (TLRPC.TL_peerColorCollectible) peerColor;
                dp0Var.s = null;
            } else {
                dp0Var.v = null;
                dp0Var.s = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            dp0Var.y = null;
            dp0Var.n = -1;
        } else {
            dp0Var.r = l10 == null ? 0L : l10.longValue();
            dp0Var.s = null;
            dp0Var.v = null;
            dp0Var.y = null;
        }
        cp0 cp0Var = this.a2;
        if (cp0Var != null) {
            cp0Var.b(true);
        }
        dp0Var.i(true);
        dp0Var.h();
        dp0Var.f();
        i61 i61Var = this.b2[0];
        if (i61Var != null) {
            dp0Var.f0 = null;
            i61Var.dismiss();
        }
    }
}
