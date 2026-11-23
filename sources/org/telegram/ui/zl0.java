package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class zl0 extends q11 {
    public final /* synthetic */ cm0 f2;
    public final /* synthetic */ h11[] g2;
    public final /* synthetic */ dm0 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl0(dm0 dm0Var, org.telegram.ui.ActionBar.g2 g2Var, Context context, Integer num, int i7, org.telegram.ui.ActionBar.i6 i6Var, int i10, int i11, cm0 cm0Var, h11[] h11VarArr) {
        super(g2Var, context, true, num, i7, true, i6Var, i10, i11);
        this.h2 = dm0Var;
        this.f2 = cm0Var;
        this.g2 = h11VarArr;
    }

    @Override // org.telegram.ui.q11
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.q11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        dm0 dm0Var = this.h2;
        if (tL_starGiftUnique != null) {
            if (dm0Var.n0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                dm0Var.s = (TLRPC.TL_peerColorCollectible) peerColor;
                dm0Var.r = null;
            } else {
                dm0Var.s = null;
                dm0Var.r = org.telegram.messenger.mp.r0(tL_starGiftUnique);
            }
            dm0Var.J = null;
            dm0Var.h = -1;
        } else {
            dm0Var.n = l10 == null ? 0L : l10.longValue();
            dm0Var.r = null;
            dm0Var.s = null;
            dm0Var.J = null;
        }
        cm0 cm0Var = this.f2;
        if (cm0Var != null) {
            cm0Var.b(true);
        }
        dm0Var.j(true);
        dm0Var.i();
        dm0Var.f(true);
        h11 h11Var = this.g2[0];
        if (h11Var != null) {
            dm0Var.p0 = null;
            h11Var.dismiss();
        }
    }
}
