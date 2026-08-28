package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qo0 extends b61 {
    public final /* synthetic */ to0 Z1;
    public final /* synthetic */ s51[] a2;
    public final /* synthetic */ uo0 b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo0(uo0 uo0Var, org.telegram.ui.ActionBar.o2 o2Var, Context context, Integer num, int i9, org.telegram.ui.ActionBar.b6 b6Var, int i10, int i11, to0 to0Var, s51[] s51VarArr) {
        super(o2Var, context, true, num, i9, true, b6Var, i10, i11);
        this.b2 = uo0Var;
        this.Z1 = to0Var;
        this.a2 = s51VarArr;
    }

    @Override // org.telegram.ui.b61
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.b61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        uo0 uo0Var = this.b2;
        if (tL_starGiftUnique != null) {
            if (uo0Var.c0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                uo0Var.v = (TLRPC.TL_peerColorCollectible) peerColor;
                uo0Var.s = null;
            } else {
                uo0Var.v = null;
                uo0Var.s = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            uo0Var.y = null;
            uo0Var.n = -1;
        } else {
            uo0Var.r = l10 == null ? 0L : l10.longValue();
            uo0Var.s = null;
            uo0Var.v = null;
            uo0Var.y = null;
        }
        to0 to0Var = this.Z1;
        if (to0Var != null) {
            to0Var.b(true);
        }
        uo0Var.i(true);
        uo0Var.h();
        uo0Var.f();
        s51 s51Var = this.a2[0];
        if (s51Var != null) {
            uo0Var.e0 = null;
            s51Var.dismiss();
        }
    }
}
