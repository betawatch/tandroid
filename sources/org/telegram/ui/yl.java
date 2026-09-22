package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class yl extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.Components.v9 c;
    public final /* synthetic */ yn d;
    public final /* synthetic */ org.telegram.ui.ActionBar.j5 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ai.p4 h;
    public final /* synthetic */ zn n;

    public yl(zn znVar, boolean z10, boolean z11, org.telegram.ui.Components.v9 v9Var, yn ynVar, org.telegram.ui.ActionBar.j5 j5Var, boolean z12, ai.p4 p4Var) {
        this.n = znVar;
        this.a = z10;
        this.b = z11;
        this.c = v9Var;
        this.d = ynVar;
        this.e = j5Var;
        this.f = z12;
        this.h = p4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        zn znVar = this.n;
        znVar.H2[1] = null;
        znVar.B2[1].setTranslationY(0.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet[] animatorSetArr = this.n.H2;
        if (animator.equals(animatorSetArr[1])) {
            org.telegram.ui.Components.v9 v9Var = this.c;
            boolean z10 = this.b;
            boolean z11 = this.a;
            if (!z11 && !z10 && v9Var == null) {
                animatorSetArr[1] = null;
                return;
            }
            animatorSetArr[1] = new AnimatorSet();
            animatorSetArr[1].setInterpolator(org.telegram.ui.Components.qr.h);
            animatorSetArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<yn, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.ActionBar.j5, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (this.f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, (Property<ai.p4, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (v9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(v9Var, (Property<org.telegram.ui.Components.v9, Float>) View.TRANSLATION_Y, 0.0f));
            }
            animatorSetArr[1].addListener(new t4(this, 20));
            animatorSetArr[1].playTogether(arrayList);
            animatorSetArr[1].start();
        }
    }
}
