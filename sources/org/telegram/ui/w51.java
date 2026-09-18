package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class w51 implements org.telegram.ui.Components.nl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ g71 e;

    public w51(g71 g71Var, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, Integer num) {
        this.e = g71Var;
        this.a = i10;
        this.b = context;
        this.c = e6Var;
        this.d = num;
    }

    @Override // org.telegram.ui.Components.nl0
    public final boolean c(float f7, float f10, int i10, View view) {
        g71 g71Var = this.e;
        int i11 = g71Var.V;
        int i12 = this.a;
        if (i12 != 11 && i12 != 13 && g71Var.h1) {
            boolean z10 = view instanceof p61;
            if (z10 && (i12 == 1 || i12 == 8)) {
                g71Var.l();
                try {
                    g71Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                p61 p61Var = (p61) view;
                if (!p61Var.s && !UserConfig.getInstance(i11).isPremium()) {
                    org.telegram.ui.Components.z5 z5Var = p61Var.e;
                    TLRPC.Document document = z5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.q5.f(i11, z5Var.documentId);
                    }
                    g71Var.p(p61Var, Long.valueOf(p61Var.e.documentId), document, p61Var.v, null);
                    return true;
                }
                g71Var.S0 = p61Var;
                g71Var.U0 = 0.0f;
                g71Var.T0 = false;
                if (p61Var.s) {
                    g71Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(g71Var.S0.x.f);
                    if (tL_availableReaction != null) {
                        g71Var.V0.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", g71Var.S0.x, 0);
                    }
                } else {
                    g71Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.q5(4, i11, g71Var.S0.e.documentId));
                }
                g71Var.h0.invalidate();
                g71Var.m();
                return true;
            }
            if (z10) {
                p61 p61Var2 = (p61) view;
                if (p61Var2.e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = p61Var2.v;
                    v51 v51Var = new v51(this, this.b, g71Var.T1, g71Var, p61Var2, this.c, view, tL_starGiftUnique);
                    g71Var.X0 = v51Var;
                    v51Var.show();
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

    @Override // org.telegram.ui.Components.nl0
    public final void g() {
        g71 g71Var = this.e;
        if (g71Var.S0 != null) {
            g71Var.T0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(g71Var.U0, 0.0f);
            ofFloat.addUpdateListener(new i21(this, 7));
            ofFloat.addListener(new gp0(this, 20));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.qr.f);
            ofFloat.start();
        }
    }

    @Override // org.telegram.ui.Components.nl0
    public final /* synthetic */ void q(float f7) {
    }
}
