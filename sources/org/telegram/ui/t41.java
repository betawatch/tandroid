package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class t41 implements org.telegram.ui.Components.cl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ d61 e;

    public t41(d61 d61Var, int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, Integer num) {
        this.e = d61Var;
        this.a = i10;
        this.b = context;
        this.c = c6Var;
        this.d = num;
    }

    @Override // org.telegram.ui.Components.cl0
    public final boolean b(float f9, float f10, int i10, View view) {
        d61 d61Var = this.e;
        int i11 = d61Var.R;
        int i12 = this.a;
        if (i12 != 11 && i12 != 13 && d61Var.d1) {
            boolean z10 = view instanceof m51;
            if (z10 && (i12 == 1 || i12 == 8)) {
                d61Var.l();
                try {
                    d61Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                m51 m51Var = (m51) view;
                if (!m51Var.s && !UserConfig.getInstance(i11).isPremium()) {
                    org.telegram.ui.Components.y5 y5Var = m51Var.e;
                    TLRPC.Document document = y5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.p5.f(i11, y5Var.documentId);
                    }
                    d61Var.p(m51Var, Long.valueOf(m51Var.e.documentId), document, m51Var.v, null);
                    return true;
                }
                d61Var.O0 = m51Var;
                d61Var.Q0 = 0.0f;
                d61Var.P0 = false;
                if (m51Var.s) {
                    d61Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(d61Var.O0.x.f);
                    if (tL_availableReaction != null) {
                        d61Var.R0.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", d61Var.O0.x, 0);
                    }
                } else {
                    d61Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.p5(4, i11, d61Var.O0.e.documentId));
                }
                d61Var.d0.invalidate();
                d61Var.m();
                return true;
            }
            if (z10) {
                m51 m51Var2 = (m51) view;
                if (m51Var2.e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = m51Var2.v;
                    s41 s41Var = new s41(this, this.b, d61Var.P1, d61Var, m51Var2, this.c, view, tL_starGiftUnique);
                    d61Var.T0 = s41Var;
                    s41Var.show();
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
        d61 d61Var = this.e;
        if (d61Var.O0 != null) {
            d61Var.P0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(d61Var.Q0, 0.0f);
            ofFloat.addUpdateListener(new w01(this, 8));
            ofFloat.addListener(new e50(this, 27));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.jr.f);
            ofFloat.start();
        }
    }

    @Override // org.telegram.ui.Components.cl0
    public final /* synthetic */ void r(float f9) {
    }
}
