package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class zl0 extends n11 {
    public final /* synthetic */ cm0 f2;
    public final /* synthetic */ e11[] g2;
    public final /* synthetic */ dm0 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl0(dm0 dm0Var, org.telegram.ui.ActionBar.e2 e2Var, Context context, Integer num, int i7, org.telegram.ui.ActionBar.e6 e6Var, int i10, int i11, cm0 cm0Var, e11[] e11VarArr) {
        super(e2Var, context, true, num, i7, true, e6Var, i10, i11);
        this.h2 = dm0Var;
        this.f2 = cm0Var;
        this.g2 = e11VarArr;
    }

    @Override // org.telegram.ui.n11
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.n11
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
                dm0Var.r = org.telegram.messenger.np.q0(tL_starGiftUnique);
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
        e11 e11Var = this.g2[0];
        if (e11Var != null) {
            dm0Var.p0 = null;
            e11Var.dismiss();
        }
    }
}
