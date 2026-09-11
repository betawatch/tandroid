package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class z51 implements org.telegram.ui.Components.cl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ j71 e;

    public z51(j71 j71Var, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, Integer num) {
        this.e = j71Var;
        this.a = i10;
        this.b = context;
        this.c = f6Var;
        this.d = num;
    }

    @Override // org.telegram.ui.Components.cl0
    public final boolean d(float f7, float f10, int i10, View view) {
        j71 j71Var = this.e;
        int i11 = j71Var.V;
        int i12 = this.a;
        if (i12 != 11 && i12 != 13 && j71Var.h1) {
            boolean z10 = view instanceof s61;
            if (z10 && (i12 == 1 || i12 == 8)) {
                j71Var.l();
                try {
                    j71Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                s61 s61Var = (s61) view;
                if (!s61Var.s && !UserConfig.getInstance(i11).isPremium()) {
                    org.telegram.ui.Components.z5 z5Var = s61Var.e;
                    TLRPC.Document document = z5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.q5.f(i11, z5Var.documentId);
                    }
                    j71Var.p(s61Var, Long.valueOf(s61Var.e.documentId), document, s61Var.v, null);
                    return true;
                }
                j71Var.S0 = s61Var;
                j71Var.U0 = 0.0f;
                j71Var.T0 = false;
                if (s61Var.s) {
                    j71Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(j71Var.S0.x.f);
                    if (tL_availableReaction != null) {
                        j71Var.V0.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", j71Var.S0.x, 0);
                    }
                } else {
                    j71Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.q5(4, i11, j71Var.S0.e.documentId));
                }
                j71Var.h0.invalidate();
                j71Var.m();
                return true;
            }
            if (z10) {
                s61 s61Var2 = (s61) view;
                if (s61Var2.e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = s61Var2.v;
                    y51 y51Var = new y51(this, this.b, j71Var.T1, j71Var, s61Var2, this.c, view, tL_starGiftUnique);
                    j71Var.X0 = y51Var;
                    y51Var.show();
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

    @Override // org.telegram.ui.Components.cl0
    public final void h() {
        j71 j71Var = this.e;
        if (j71Var.S0 != null) {
            j71Var.T0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(j71Var.U0, 0.0f);
            ofFloat.addUpdateListener(new b21(this, 8));
            ofFloat.addListener(new gk0(this, 22));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.pr.f);
            ofFloat.start();
        }
    }

    @Override // org.telegram.ui.Components.cl0
    public final /* synthetic */ void q(float f7) {
    }
}
