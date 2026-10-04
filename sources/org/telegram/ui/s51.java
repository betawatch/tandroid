package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class s51 implements org.telegram.ui.Components.pl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ c71 e;

    public s51(c71 c71Var, int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, Integer num) {
        this.e = c71Var;
        this.a = i10;
        this.b = context;
        this.c = d6Var;
        this.d = num;
    }

    @Override // org.telegram.ui.Components.pl0
    public final boolean c(float f7, float f10, int i10, View view) {
        c71 c71Var = this.e;
        int i11 = c71Var.V;
        int i12 = this.a;
        if (i12 != 11 && i12 != 13 && c71Var.h1) {
            boolean z10 = view instanceof l61;
            if (z10 && (i12 == 1 || i12 == 8)) {
                c71Var.l();
                try {
                    c71Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                l61 l61Var = (l61) view;
                if (!l61Var.s && !UserConfig.getInstance(i11).isPremium()) {
                    org.telegram.ui.Components.z5 z5Var = l61Var.e;
                    TLRPC.Document document = z5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.q5.f(i11, z5Var.documentId);
                    }
                    c71Var.p(l61Var, Long.valueOf(l61Var.e.documentId), document, l61Var.v, null);
                    return true;
                }
                c71Var.S0 = l61Var;
                c71Var.U0 = 0.0f;
                c71Var.T0 = false;
                if (l61Var.s) {
                    c71Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(c71Var.S0.x.f);
                    if (tL_availableReaction != null) {
                        c71Var.V0.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", c71Var.S0.x, 0);
                    }
                } else {
                    c71Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.q5(4, i11, c71Var.S0.e.documentId));
                }
                c71Var.h0.invalidate();
                c71Var.m();
                return true;
            }
            if (z10) {
                l61 l61Var2 = (l61) view;
                if (l61Var2.e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = l61Var2.v;
                    r51 r51Var = new r51(this, this.b, c71Var.T1, c71Var, l61Var2, this.c, view, tL_starGiftUnique);
                    c71Var.X0 = r51Var;
                    r51Var.show();
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

    @Override // org.telegram.ui.Components.pl0
    public final void i() {
        c71 c71Var = this.e;
        if (c71Var.S0 != null) {
            c71Var.T0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(c71Var.U0, 0.0f);
            ofFloat.addUpdateListener(new b21(this, 7));
            ofFloat.addListener(new ap0(this, 20));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.tr.f);
            ofFloat.start();
        }
    }

    @Override // org.telegram.ui.Components.pl0
    public final /* synthetic */ void q(float f7) {
    }
}
