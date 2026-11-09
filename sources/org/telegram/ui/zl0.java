package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class zl0 extends s11 {
    public final /* synthetic */ cm0 e2;
    public final /* synthetic */ j11[] f2;
    public final /* synthetic */ dm0 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl0(dm0 dm0Var, org.telegram.ui.ActionBar.f2 f2Var, Context context, Integer num, int i7, org.telegram.ui.ActionBar.g6 g6Var, int i10, int i11, cm0 cm0Var, j11[] j11VarArr) {
        super(f2Var, context, true, num, i7, true, g6Var, i10, i11);
        this.g2 = dm0Var;
        this.e2 = cm0Var;
        this.f2 = j11VarArr;
    }

    @Override // org.telegram.ui.s11
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.s11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        dm0 dm0Var = this.g2;
        if (tL_starGiftUnique != null) {
            if (dm0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                dm0Var.s = (TLRPC.TL_peerColorCollectible) peerColor;
                dm0Var.r = null;
            } else {
                dm0Var.s = null;
                dm0Var.r = org.telegram.messenger.qp.q0(tL_starGiftUnique);
            }
            dm0Var.I = null;
            dm0Var.h = -1;
        } else {
            dm0Var.n = l10 == null ? 0L : l10.longValue();
            dm0Var.r = null;
            dm0Var.s = null;
            dm0Var.I = null;
        }
        cm0 cm0Var = this.e2;
        if (cm0Var != null) {
            cm0Var.b(true);
        }
        dm0Var.j(true);
        dm0Var.i();
        dm0Var.f(true);
        j11 j11Var = this.f2[0];
        if (j11Var != null) {
            dm0Var.o0 = null;
            j11Var.dismiss();
        }
    }
}
