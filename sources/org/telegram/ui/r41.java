package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class r41 implements org.telegram.ui.Components.dm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ b61 e;

    public r41(b61 b61Var, int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, Integer num) {
        this.e = b61Var;
        this.a = i10;
        this.b = context;
        this.c = g6Var;
        this.d = num;
    }

    @Override // org.telegram.ui.Components.dm0
    public final boolean c(float f7, float f10, int i10, View view) {
        b61 b61Var = this.e;
        int i11 = b61Var.V;
        int i12 = this.a;
        if (i12 != 11 && i12 != 13 && b61Var.h1) {
            boolean z10 = view instanceof k51;
            if (z10 && (i12 == 1 || i12 == 8)) {
                b61Var.l();
                try {
                    b61Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                k51 k51Var = (k51) view;
                if (!k51Var.s && !UserConfig.getInstance(i11).isPremium()) {
                    org.telegram.ui.Components.a6 a6Var = k51Var.e;
                    TLRPC.Document document = a6Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.r5.f(i11, a6Var.documentId);
                    }
                    b61Var.p(k51Var, Long.valueOf(k51Var.e.documentId), document, k51Var.v, null);
                    return true;
                }
                b61Var.S0 = k51Var;
                b61Var.U0 = 0.0f;
                b61Var.T0 = false;
                if (k51Var.s) {
                    b61Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(b61Var.S0.x.f);
                    if (tL_availableReaction != null) {
                        b61Var.V0.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", b61Var.S0.x, 0);
                    }
                } else {
                    b61Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.r5(4, i11, b61Var.S0.e.documentId));
                }
                b61Var.h0.invalidate();
                b61Var.m();
                return true;
            }
            if (z10) {
                k51 k51Var2 = (k51) view;
                if (k51Var2.e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = k51Var2.v;
                    q41 q41Var = new q41(this, this.b, b61Var.U1, b61Var, k51Var2, this.c, view, tL_starGiftUnique);
                    b61Var.X0 = q41Var;
                    q41Var.show();
                    try {
                        view.performHapticFeedback(0, 1);
                    } catch (Exception unused2) {
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.dm0
    public final void h() {
        b61 b61Var = this.e;
        if (b61Var.S0 != null) {
            b61Var.T0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(b61Var.U0, 0.0f);
            ofFloat.addUpdateListener(new g11(this, 6));
            ofFloat.addListener(new v70(this, 25));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.bs.f);
            ofFloat.start();
        }
    }

    @Override // org.telegram.ui.Components.dm0
    public final /* synthetic */ void o(float f7) {
    }
}
