package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class xh extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.Components.y9 c;
    public final /* synthetic */ vn d;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ln h;
    public final /* synthetic */ wn n;

    public xh(wn wnVar, boolean z10, boolean z11, org.telegram.ui.Components.y9 y9Var, vn vnVar, org.telegram.ui.ActionBar.b6 b6Var, boolean z12, ln lnVar) {
        this.n = wnVar;
        this.a = z10;
        this.b = z11;
        this.c = y9Var;
        this.d = vnVar;
        this.e = b6Var;
        this.f = z12;
        this.h = lnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        wn wnVar = this.n;
        wnVar.T2[1] = null;
        wnVar.N2[1].setTranslationY(0.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet[] animatorSetArr = this.n.T2;
        if (animator.equals(animatorSetArr[1])) {
            org.telegram.ui.Components.y9 y9Var = this.c;
            boolean z10 = this.b;
            boolean z11 = this.a;
            if (!z11 && !z10 && y9Var == null) {
                animatorSetArr[1] = null;
                return;
            }
            animatorSetArr[1] = new AnimatorSet();
            animatorSetArr[1].setInterpolator(org.telegram.ui.Components.ds.h);
            animatorSetArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<vn, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.ActionBar.b6, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (this.f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, (Property<ln, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (y9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(y9Var, (Property<org.telegram.ui.Components.y9, Float>) View.TRANSLATION_Y, 0.0f));
            }
            animatorSetArr[1].addListener(new kg.e(this, 25));
            animatorSetArr[1].playTogether(arrayList);
            animatorSetArr[1].start();
        }
    }
}
