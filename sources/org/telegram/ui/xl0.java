package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class xl0 extends q11 {
    public final /* synthetic */ am0 e2;
    public final /* synthetic */ h11[] f2;
    public final /* synthetic */ bm0 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl0(bm0 bm0Var, org.telegram.ui.ActionBar.f2 f2Var, Context context, Integer num, int i7, org.telegram.ui.ActionBar.f6 f6Var, int i10, int i11, am0 am0Var, h11[] h11VarArr) {
        super(f2Var, context, true, num, i7, true, f6Var, i10, i11);
        this.g2 = bm0Var;
        this.e2 = am0Var;
        this.f2 = h11VarArr;
    }

    @Override // org.telegram.ui.q11
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.q11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        bm0 bm0Var = this.g2;
        if (tL_starGiftUnique != null) {
            if (bm0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                bm0Var.s = (TLRPC.TL_peerColorCollectible) peerColor;
                bm0Var.r = null;
            } else {
                bm0Var.s = null;
                bm0Var.r = org.telegram.messenger.qp.q0(tL_starGiftUnique);
            }
            bm0Var.I = null;
            bm0Var.h = -1;
        } else {
            bm0Var.n = l10 == null ? 0L : l10.longValue();
            bm0Var.r = null;
            bm0Var.s = null;
            bm0Var.I = null;
        }
        am0 am0Var = this.e2;
        if (am0Var != null) {
            am0Var.b(true);
        }
        bm0Var.j(true);
        bm0Var.i();
        bm0Var.f(true);
        h11 h11Var = this.f2[0];
        if (h11Var != null) {
            bm0Var.o0 = null;
            h11Var.dismiss();
        }
    }
}
