package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class yl0 extends n11 {
    public final /* synthetic */ bm0 f2;
    public final /* synthetic */ e11[] g2;
    public final /* synthetic */ cm0 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl0(cm0 cm0Var, org.telegram.ui.ActionBar.e2 e2Var, Context context, Integer num, int i7, org.telegram.ui.ActionBar.e6 e6Var, int i10, int i11, bm0 bm0Var, e11[] e11VarArr) {
        super(e2Var, context, true, num, i7, true, e6Var, i10, i11);
        this.h2 = cm0Var;
        this.f2 = bm0Var;
        this.g2 = e11VarArr;
    }

    @Override // org.telegram.ui.n11
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.n11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        cm0 cm0Var = this.h2;
        if (tL_starGiftUnique != null) {
            if (cm0Var.n0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                cm0Var.s = (TLRPC.TL_peerColorCollectible) peerColor;
                cm0Var.r = null;
            } else {
                cm0Var.s = null;
                cm0Var.r = org.telegram.messenger.np.q0(tL_starGiftUnique);
            }
            cm0Var.J = null;
            cm0Var.h = -1;
        } else {
            cm0Var.n = l10 == null ? 0L : l10.longValue();
            cm0Var.r = null;
            cm0Var.s = null;
            cm0Var.J = null;
        }
        bm0 bm0Var = this.f2;
        if (bm0Var != null) {
            bm0Var.b(true);
        }
        cm0Var.j(true);
        cm0Var.i();
        cm0Var.f(true);
        e11 e11Var = this.g2[0];
        if (e11Var != null) {
            cm0Var.p0 = null;
            e11Var.dismiss();
        }
    }
}
