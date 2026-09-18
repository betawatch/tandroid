package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class y51 implements org.telegram.ui.Components.dl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ i71 e;

    public y51(i71 i71Var, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, Integer num) {
        this.e = i71Var;
        this.a = i10;
        this.b = context;
        this.c = f6Var;
        this.d = num;
    }

    @Override // org.telegram.ui.Components.dl0
    public final boolean c(float f7, float f10, int i10, View view) {
        i71 i71Var = this.e;
        int i11 = i71Var.V;
        int i12 = this.a;
        if (i12 != 11 && i12 != 13 && i71Var.h1) {
            boolean z10 = view instanceof r61;
            if (z10 && (i12 == 1 || i12 == 8)) {
                i71Var.l();
                try {
                    i71Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                r61 r61Var = (r61) view;
                if (!r61Var.s && !UserConfig.getInstance(i11).isPremium()) {
                    org.telegram.ui.Components.x5 x5Var = r61Var.e;
                    TLRPC.Document document = x5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.o5.f(i11, x5Var.documentId);
                    }
                    i71Var.p(r61Var, Long.valueOf(r61Var.e.documentId), document, r61Var.v, null);
                    return true;
                }
                i71Var.S0 = r61Var;
                i71Var.U0 = 0.0f;
                i71Var.T0 = false;
                if (r61Var.s) {
                    i71Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(i71Var.S0.x.f);
                    if (tL_availableReaction != null) {
                        i71Var.V0.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", i71Var.S0.x, 0);
                    }
                } else {
                    i71Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.o5(4, i11, i71Var.S0.e.documentId));
                }
                i71Var.h0.invalidate();
                i71Var.m();
                return true;
            }
            if (z10) {
                r61 r61Var2 = (r61) view;
                if (r61Var2.e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = r61Var2.v;
                    x51 x51Var = new x51(this, this.b, i71Var.T1, i71Var, r61Var2, this.c, view, tL_starGiftUnique);
                    i71Var.X0 = x51Var;
                    x51Var.show();
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

    @Override // org.telegram.ui.Components.dl0
    public final void g() {
        i71 i71Var = this.e;
        if (i71Var.S0 != null) {
            i71Var.T0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i71Var.U0, 0.0f);
            ofFloat.addUpdateListener(new k21(this, 7));
            ofFloat.addListener(new er0(this, 19));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.qr.f);
            ofFloat.start();
        }
    }

    @Override // org.telegram.ui.Components.dl0
    public final /* synthetic */ void q(float f7) {
    }
}
