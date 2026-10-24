package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class uh extends AnimatorListenerAdapter {
    public final /* synthetic */ rn a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.n5 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ hn e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ sn h;

    public uh(sn snVar, rn rnVar, boolean z10, org.telegram.ui.ActionBar.n5 n5Var, boolean z11, hn hnVar, boolean z12) {
        this.h = snVar;
        this.a = rnVar;
        this.b = z10;
        this.c = n5Var;
        this.d = z11;
        this.e = hnVar;
        this.f = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        sn snVar = this.h;
        if (snVar.R2.getTag() != null) {
            snVar.R2.setVisibility(4);
            int L8 = snVar.L8();
            snVar.R2.a(Math.min(L8 - 1, Math.max(1, L8 - snVar.Y4[0])), false);
        } else {
            snVar.R2.setAlpha(1.0f);
        }
        snVar.R2.setTranslationY(0.0f);
        snVar.P2[0].setTranslationX(0.0f);
        snVar.P2[1].setTranslationX(0.0f);
        snVar.R2.setTranslationX(snVar.S2 + 0.0f);
        rn rnVar = this.a;
        rnVar.setTranslationY(0.0f);
        boolean z10 = this.b;
        if (!z10) {
            rnVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.n5 n5Var = this.c;
        if (!z10) {
            n5Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        hn hnVar = this.e;
        if (!z11) {
            hnVar.setTranslationY(0.0f);
        }
        snVar.O2[0].setTranslationX(0.0f);
        snVar.O2[1].setTranslationX(0.0f);
        snVar.N2[1].setAlpha(1.0f);
        snVar.N2[1].setScaleX(1.0f);
        snVar.N2[1].setScaleY(1.0f);
        snVar.N2[0].setAlpha(1.0f);
        snVar.N2[0].setScaleX(1.0f);
        snVar.N2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.n5[] n5VarArr = snVar.P2;
        org.telegram.ui.ActionBar.n5 n5Var2 = n5VarArr[0];
        n5VarArr[1] = n5Var2;
        n5VarArr[0] = n5Var;
        n5Var2.setVisibility(4);
        hn[] hnVarArr = snVar.Q2;
        hn hnVar2 = hnVarArr[0];
        hnVarArr[1] = hnVar2;
        hnVarArr[0] = hnVar;
        hnVar2.setVisibility(4);
        rn[] rnVarArr = snVar.O2;
        rn rnVar2 = rnVarArr[0];
        if (rnVar != rnVar2) {
            rnVarArr[1] = rnVar2;
            rnVarArr[0] = rnVar;
            rnVar2.setVisibility(4);
        }
        if (this.f) {
            snVar.N2[1].setImageBitmap(null);
            snVar.N2[1].setVisibility(4);
        }
        org.telegram.ui.Components.w9[] w9VarArr = snVar.N2;
        org.telegram.ui.Components.w9 w9Var = w9VarArr[1];
        org.telegram.ui.Components.w9 w9Var2 = w9VarArr[0];
        w9VarArr[1] = w9Var2;
        w9VarArr[0] = w9Var;
        w9Var2.setAlpha(1.0f);
        snVar.N2[1].setScaleX(1.0f);
        snVar.N2[1].setScaleY(1.0f);
        snVar.N2[1].setVisibility(4);
        snVar.T2[0] = null;
        snVar.M2 = false;
    }
}
