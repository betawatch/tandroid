package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class x11 implements org.telegram.ui.Components.kk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ g31 e;

    public x11(g31 g31Var, int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, Integer num) {
        this.e = g31Var;
        this.a = i10;
        this.b = context;
        this.c = p6Var;
        this.d = num;
    }

    @Override // org.telegram.ui.Components.kk0
    public final boolean b(float f7, float f10, int i10, View view) {
        g31 g31Var = this.e;
        int i11 = g31Var.V;
        int i12 = this.a;
        if (i12 != 11 && i12 != 13 && g31Var.h1) {
            boolean z10 = view instanceof q21;
            if (z10 && (i12 == 1 || i12 == 8)) {
                g31Var.l();
                try {
                    g31Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                q21 q21Var = (q21) view;
                if (!q21Var.s && !org.telegram.messenger.e20.i(i11).q()) {
                    org.telegram.ui.Components.o5 o5Var = q21Var.e;
                    TLRPC.Document document = o5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.f5.e(i11, o5Var.documentId);
                    }
                    g31Var.p(q21Var, Long.valueOf(q21Var.e.documentId), document, q21Var.w, null);
                    return true;
                }
                g31Var.S0 = q21Var;
                g31Var.U0 = 0.0f;
                g31Var.T0 = false;
                if (q21Var.s) {
                    g31Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.vi.b0(i11).r.get(g31Var.S0.y.f);
                    if (tL_availableReaction != null) {
                        g31Var.V0.r0(org.telegram.messenger.jc.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", g31Var.S0.y, 0);
                    }
                } else {
                    g31Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.f5(4, i11, g31Var.S0.e.documentId));
                }
                g31Var.h0.invalidate();
                g31Var.m();
                return true;
            }
            if (z10) {
                q21 q21Var2 = (q21) view;
                if (q21Var2.e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = q21Var2.w;
                    w11 w11Var = new w11(this, this.b, g31Var.U1, g31Var, q21Var2, this.c, view, tL_starGiftUnique);
                    g31Var.X0 = w11Var;
                    w11Var.show();
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

    @Override // org.telegram.ui.Components.kk0
    public final void g() {
        g31 g31Var = this.e;
        if (g31Var.S0 != null) {
            g31Var.T0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(g31Var.U0, 0.0f);
            ofFloat.addUpdateListener(new u01(this, 4));
            ofFloat.addListener(new ms0(this, 7));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.gr.f);
            ofFloat.start();
        }
    }

    @Override // org.telegram.ui.Components.kk0
    public final /* synthetic */ void p(float f7) {
    }
}
