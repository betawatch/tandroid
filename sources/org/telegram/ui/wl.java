package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class wl extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.Components.w9 c;
    public final /* synthetic */ vn d;
    public final /* synthetic */ org.telegram.ui.ActionBar.h5 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ai.p4 h;
    public final /* synthetic */ wn n;

    public wl(wn wnVar, boolean z10, boolean z11, org.telegram.ui.Components.w9 w9Var, vn vnVar, org.telegram.ui.ActionBar.h5 h5Var, boolean z12, ai.p4 p4Var) {
        this.n = wnVar;
        this.a = z10;
        this.b = z11;
        this.c = w9Var;
        this.d = vnVar;
        this.e = h5Var;
        this.f = z12;
        this.h = p4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        wn wnVar = this.n;
        wnVar.H2[1] = null;
        wnVar.B2[1].setTranslationY(0.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet[] animatorSetArr = this.n.H2;
        if (animator.equals(animatorSetArr[1])) {
            org.telegram.ui.Components.w9 w9Var = this.c;
            boolean z10 = this.b;
            boolean z11 = this.a;
            if (!z11 && !z10 && w9Var == null) {
                animatorSetArr[1] = null;
                return;
            }
            animatorSetArr[1] = new AnimatorSet();
            animatorSetArr[1].setInterpolator(org.telegram.ui.Components.rr.h);
            animatorSetArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<vn, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.ActionBar.h5, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (this.f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, (Property<ai.p4, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (w9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(w9Var, (Property<org.telegram.ui.Components.w9, Float>) View.TRANSLATION_Y, 0.0f));
            }
            animatorSetArr[1].addListener(new t4(this, 20));
            animatorSetArr[1].playTogether(arrayList);
            animatorSetArr[1].start();
        }
    }
}
