package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class xl extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.Components.p9 c;
    public final /* synthetic */ wn d;
    public final /* synthetic */ org.telegram.ui.ActionBar.l5 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ hg.q h;
    public final /* synthetic */ xn n;

    public xl(xn xnVar, boolean z4, boolean z10, org.telegram.ui.Components.p9 p9Var, wn wnVar, org.telegram.ui.ActionBar.l5 l5Var, boolean z11, hg.q qVar) {
        this.n = xnVar;
        this.a = z4;
        this.b = z10;
        this.c = p9Var;
        this.d = wnVar;
        this.e = l5Var;
        this.f = z11;
        this.h = qVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        xn xnVar = this.n;
        xnVar.E2[1] = null;
        xnVar.y2[1].setTranslationY(0.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet[] animatorSetArr = this.n.E2;
        if (animator.equals(animatorSetArr[1])) {
            org.telegram.ui.Components.p9 p9Var = this.c;
            boolean z4 = this.b;
            boolean z10 = this.a;
            if (!z10 && !z4 && p9Var == null) {
                animatorSetArr[1] = null;
                return;
            }
            animatorSetArr[1] = new AnimatorSet();
            animatorSetArr[1].setInterpolator(org.telegram.ui.Components.pr.h);
            animatorSetArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<wn, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (z4) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.ActionBar.l5, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (this.f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, (Property<hg.q, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (p9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(p9Var, (Property<org.telegram.ui.Components.p9, Float>) View.TRANSLATION_Y, 0.0f));
            }
            animatorSetArr[1].addListener(new s5(this, 19));
            animatorSetArr[1].playTogether(arrayList);
            animatorSetArr[1].start();
        }
    }
}
