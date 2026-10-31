package rh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.d20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x3 extends AnimatorListenerAdapter {
    public final /* synthetic */ y3 a;

    public x3(y3 y3Var) {
        this.a = y3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        y3 y3Var = this.a;
        ph.x1 x1Var = y3Var.l0;
        y3Var.v0 = y3Var.u0;
        y3Var.d(y3Var.a0);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = y3Var.e;
        int i10 = 2 - y3Var.u0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) y3Var.c0.f;
        h8.b1(y3Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - y3Var.u0].document, zs.q2);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) y3Var.d0.f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.f5 l4 = org.telegram.ui.Components.f5.l(d20.s0, 7, stargiftattributepattern.document);
            l4.m = true;
            l4.u();
        }
        org.telegram.messenger.i0.r(x1Var);
        org.telegram.messenger.i0.h3(x1Var, 2500L);
    }
}
