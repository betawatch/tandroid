package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class zo0 extends z51 {
    public final /* synthetic */ cp0 d2;
    public final /* synthetic */ q51[] e2;
    public final /* synthetic */ dp0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo0(dp0 dp0Var, org.telegram.ui.ActionBar.n2 n2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, int i12, cp0 cp0Var, q51[] q51VarArr) {
        super(n2Var, context, true, num, i10, true, d6Var, i11, i12);
        this.f2 = dp0Var;
        this.d2 = cp0Var;
        this.e2 = q51VarArr;
    }

    @Override // org.telegram.ui.z51
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.z51
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        dp0 dp0Var = this.f2;
        if (tL_starGiftUnique != null) {
            if (dp0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                dp0Var.s = (TLRPC.TL_peerColorCollectible) peerColor;
                dp0Var.r = null;
            } else {
                dp0Var.s = null;
                dp0Var.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            dp0Var.I = null;
            dp0Var.h = -1;
        } else {
            dp0Var.n = l4 == null ? 0L : l4.longValue();
            dp0Var.r = null;
            dp0Var.s = null;
            dp0Var.I = null;
        }
        cp0 cp0Var = this.d2;
        if (cp0Var != null) {
            cp0Var.b(true);
        }
        dp0Var.j(true);
        dp0Var.i();
        dp0Var.f(true);
        q51 q51Var = this.e2[0];
        if (q51Var != null) {
            dp0Var.o0 = null;
            q51Var.dismiss();
        }
    }
}
