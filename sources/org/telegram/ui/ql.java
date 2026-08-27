package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ql extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.Components.n9 c;
    public final /* synthetic */ qn d;
    public final /* synthetic */ org.telegram.ui.ActionBar.h5 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ cg.q h;
    public final /* synthetic */ rn n;

    public ql(rn rnVar, boolean z10, boolean z11, org.telegram.ui.Components.n9 n9Var, qn qnVar, org.telegram.ui.ActionBar.h5 h5Var, boolean z12, cg.q qVar) {
        this.n = rnVar;
        this.a = z10;
        this.b = z11;
        this.c = n9Var;
        this.d = qnVar;
        this.e = h5Var;
        this.f = z12;
        this.h = qVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        rn rnVar = this.n;
        rnVar.D2[1] = null;
        rnVar.x2[1].setTranslationY(0.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet[] animatorSetArr = this.n.D2;
        if (animator.equals(animatorSetArr[1])) {
            org.telegram.ui.Components.n9 n9Var = this.c;
            boolean z10 = this.b;
            boolean z11 = this.a;
            if (!z11 && !z10 && n9Var == null) {
                animatorSetArr[1] = null;
                return;
            }
            animatorSetArr[1] = new AnimatorSet();
            animatorSetArr[1].setInterpolator(org.telegram.ui.Components.er.h);
            animatorSetArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<qn, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.ActionBar.h5, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (this.f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, (Property<cg.q, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (n9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(n9Var, (Property<org.telegram.ui.Components.n9, Float>) View.TRANSLATION_Y, 0.0f));
            }
            animatorSetArr[1].addListener(new lh.h9(this, 28));
            animatorSetArr[1].playTogether(arrayList);
            animatorSetArr[1].start();
        }
    }
}
