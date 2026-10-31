package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z11 implements org.telegram.ui.Components.jk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ i31 e;

    public z11(i31 i31Var, int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, Integer num) {
        this.e = i31Var;
        this.a = i10;
        this.b = context;
        this.c = p6Var;
        this.d = num;
    }

    @Override // org.telegram.ui.Components.jk0
    public final boolean b(float f7, float f10, int i10, View view) {
        i31 i31Var = this.e;
        int i11 = i31Var.V;
        int i12 = this.a;
        if (i12 != 11 && i12 != 13 && i31Var.h1) {
            boolean z10 = view instanceof s21;
            if (z10 && (i12 == 1 || i12 == 8)) {
                i31Var.l();
                try {
                    i31Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                s21 s21Var = (s21) view;
                if (!s21Var.s && !org.telegram.messenger.d20.i(i11).q()) {
                    org.telegram.ui.Components.o5 o5Var = s21Var.e;
                    TLRPC.Document document = o5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.f5.e(i11, o5Var.documentId);
                    }
                    i31Var.p(s21Var, Long.valueOf(s21Var.e.documentId), document, s21Var.w, null);
                    return true;
                }
                i31Var.S0 = s21Var;
                i31Var.U0 = 0.0f;
                i31Var.T0 = false;
                if (s21Var.s) {
                    i31Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(i11).r.get(i31Var.S0.y.f);
                    if (tL_availableReaction != null) {
                        i31Var.V0.r0(org.telegram.messenger.ic.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", i31Var.S0.y, 0);
                    }
                } else {
                    i31Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.f5(4, i11, i31Var.S0.e.documentId));
                }
                i31Var.h0.invalidate();
                i31Var.m();
                return true;
            }
            if (z10) {
                s21 s21Var2 = (s21) view;
                if (s21Var2.e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = s21Var2.w;
                    y11 y11Var = new y11(this, this.b, i31Var.U1, i31Var, s21Var2, this.c, view, tL_starGiftUnique);
                    i31Var.X0 = y11Var;
                    y11Var.show();
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

    @Override // org.telegram.ui.Components.jk0
    public final void g() {
        i31 i31Var = this.e;
        if (i31Var.S0 != null) {
            i31Var.T0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i31Var.U0, 0.0f);
            ofFloat.addUpdateListener(new u01(this, 4));
            ofFloat.addListener(new ns0(this, 7));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.gr.f);
            ofFloat.start();
        }
    }

    @Override // org.telegram.ui.Components.jk0
    public final /* synthetic */ void p(float f7) {
    }
}
