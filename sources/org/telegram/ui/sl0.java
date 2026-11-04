package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sl0 extends g11 {
    public final /* synthetic */ vl0 f2;
    public final /* synthetic */ x01[] g2;
    public final /* synthetic */ wl0 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl0(wl0 wl0Var, org.telegram.ui.ActionBar.d2 d2Var, Context context, Integer num, int i3, org.telegram.ui.ActionBar.e6 e6Var, int i10, int i11, vl0 vl0Var, x01[] x01VarArr) {
        super(d2Var, context, true, num, i3, true, e6Var, i10, i11);
        this.h2 = wl0Var;
        this.f2 = vl0Var;
        this.g2 = x01VarArr;
    }

    @Override // org.telegram.ui.g11
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.g11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        wl0 wl0Var = this.h2;
        if (tL_starGiftUnique != null) {
            if (wl0Var.n0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                wl0Var.s = (TLRPC.TL_peerColorCollectible) peerColor;
                wl0Var.r = null;
            } else {
                wl0Var.s = null;
                wl0Var.r = org.telegram.messenger.hp.q0(tL_starGiftUnique);
            }
            wl0Var.J = null;
            wl0Var.h = -1;
        } else {
            wl0Var.n = l10 == null ? 0L : l10.longValue();
            wl0Var.r = null;
            wl0Var.s = null;
            wl0Var.J = null;
        }
        vl0 vl0Var = this.f2;
        if (vl0Var != null) {
            vl0Var.b(true);
        }
        wl0Var.j(true);
        wl0Var.i();
        wl0Var.f(true);
        x01 x01Var = this.g2[0];
        if (x01Var != null) {
            wl0Var.p0 = null;
            x01Var.dismiss();
        }
    }
}
