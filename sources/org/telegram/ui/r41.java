package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r41 implements org.telegram.ui.Components.pk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ b61 e;

    public r41(b61 b61Var, int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, Integer num) {
        this.e = b61Var;
        this.a = i9;
        this.b = context;
        this.c = b6Var;
        this.d = num;
    }

    @Override // org.telegram.ui.Components.pk0
    public final boolean c(float f10, float f11, int i9, View view) {
        b61 b61Var = this.e;
        int i10 = b61Var.R;
        int i11 = this.a;
        if (i11 != 11 && i11 != 13 && b61Var.d1) {
            boolean z10 = view instanceof k51;
            if (z10 && (i11 == 1 || i11 == 8)) {
                b61Var.l();
                try {
                    b61Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                k51 k51Var = (k51) view;
                if (!k51Var.s && !UserConfig.getInstance(i10).isPremium()) {
                    org.telegram.ui.Components.t5 t5Var = k51Var.e;
                    TLRPC.Document document = t5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.k5.f(i10, t5Var.documentId);
                    }
                    b61Var.p(k51Var, Long.valueOf(k51Var.e.documentId), document, k51Var.v, null);
                    return true;
                }
                b61Var.O0 = k51Var;
                b61Var.Q0 = 0.0f;
                b61Var.P0 = false;
                if (k51Var.s) {
                    b61Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(b61Var.O0.x.f);
                    if (tL_availableReaction != null) {
                        b61Var.R0.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", b61Var.O0.x, 0);
                    }
                } else {
                    b61Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.k5(4, i10, b61Var.O0.e.documentId));
                }
                b61Var.d0.invalidate();
                b61Var.m();
                return true;
            }
            if (z10) {
                k51 k51Var2 = (k51) view;
                if (k51Var2.e != null && (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = k51Var2.v;
                    q41 q41Var = new q41(this, this.b, b61Var.P1, b61Var, k51Var2, this.c, view, tL_starGiftUnique);
                    b61Var.T0 = q41Var;
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

    @Override // org.telegram.ui.Components.pk0
    public final void j() {
        b61 b61Var = this.e;
        if (b61Var.O0 != null) {
            b61Var.P0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(b61Var.Q0, 0.0f);
            ofFloat.addUpdateListener(new v01(this, 8));
            ofFloat.addListener(new bc0(this, 25));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.gr.f);
            ofFloat.start();
        }
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ void u(float f10) {
    }
}
