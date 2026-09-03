package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class zl extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.Components.p9 c;
    public final /* synthetic */ yn d;
    public final /* synthetic */ org.telegram.ui.ActionBar.k5 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ gg.q h;
    public final /* synthetic */ zn n;

    public zl(zn znVar, boolean z4, boolean z10, org.telegram.ui.Components.p9 p9Var, yn ynVar, org.telegram.ui.ActionBar.k5 k5Var, boolean z11, gg.q qVar) {
        this.n = znVar;
        this.a = z4;
        this.b = z10;
        this.c = p9Var;
        this.d = ynVar;
        this.e = k5Var;
        this.f = z11;
        this.h = qVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        zn znVar = this.n;
        znVar.E2[1] = null;
        znVar.y2[1].setTranslationY(0.0f);
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
            animatorSetArr[1].setInterpolator(org.telegram.ui.Components.mr.h);
            animatorSetArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<yn, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (z4) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.ActionBar.k5, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (this.f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, (Property<gg.q, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (p9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(p9Var, (Property<org.telegram.ui.Components.p9, Float>) View.TRANSLATION_Y, 0.0f));
            }
            animatorSetArr[1].addListener(new u5(this, 19));
            animatorSetArr[1].playTogether(arrayList);
            animatorSetArr[1].start();
        }
    }
}
