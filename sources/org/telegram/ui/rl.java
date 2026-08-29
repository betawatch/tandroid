package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class rl extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.Components.t9 c;
    public final /* synthetic */ sn d;
    public final /* synthetic */ org.telegram.ui.ActionBar.h5 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ eg.r h;
    public final /* synthetic */ tn n;

    public rl(tn tnVar, boolean z10, boolean z11, org.telegram.ui.Components.t9 t9Var, sn snVar, org.telegram.ui.ActionBar.h5 h5Var, boolean z12, eg.r rVar) {
        this.n = tnVar;
        this.a = z10;
        this.b = z11;
        this.c = t9Var;
        this.d = snVar;
        this.e = h5Var;
        this.f = z12;
        this.h = rVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        tn tnVar = this.n;
        tnVar.D2[1] = null;
        tnVar.x2[1].setTranslationY(0.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet[] animatorSetArr = this.n.D2;
        if (animator.equals(animatorSetArr[1])) {
            org.telegram.ui.Components.t9 t9Var = this.c;
            boolean z10 = this.b;
            boolean z11 = this.a;
            if (!z11 && !z10 && t9Var == null) {
                animatorSetArr[1] = null;
                return;
            }
            animatorSetArr[1] = new AnimatorSet();
            animatorSetArr[1].setInterpolator(org.telegram.ui.Components.jr.h);
            animatorSetArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<sn, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.ActionBar.h5, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (this.f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, (Property<eg.r, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (t9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(t9Var, (Property<org.telegram.ui.Components.t9, Float>) View.TRANSLATION_Y, 0.0f));
            }
            animatorSetArr[1].addListener(new nh.q5(this, 28));
            animatorSetArr[1].playTogether(arrayList);
            animatorSetArr[1].start();
        }
    }
}
