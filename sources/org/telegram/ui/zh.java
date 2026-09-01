package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class zh extends AnimatorListenerAdapter {
    public final /* synthetic */ wn a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.l5 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ hg.q e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ xn h;

    public zh(xn xnVar, wn wnVar, boolean z4, org.telegram.ui.ActionBar.l5 l5Var, boolean z10, hg.q qVar, boolean z11) {
        this.h = xnVar;
        this.a = wnVar;
        this.b = z4;
        this.c = l5Var;
        this.d = z10;
        this.e = qVar;
        this.f = z11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        xn xnVar = this.h;
        if (xnVar.C2.getTag() != null) {
            xnVar.C2.setVisibility(4);
            int G8 = xnVar.G8();
            xnVar.C2.a(Math.min(G8 - 1, Math.max(1, G8 - xnVar.J4[0])), false);
        } else {
            xnVar.C2.setAlpha(1.0f);
        }
        xnVar.C2.setTranslationY(0.0f);
        xnVar.A2[0].setTranslationX(0.0f);
        xnVar.A2[1].setTranslationX(0.0f);
        xnVar.C2.setTranslationX(xnVar.D2 + 0.0f);
        wn wnVar = this.a;
        wnVar.setTranslationY(0.0f);
        boolean z4 = this.b;
        if (!z4) {
            wnVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.l5 l5Var = this.c;
        if (!z4) {
            l5Var.setTranslationY(0.0f);
        }
        boolean z10 = this.d;
        hg.q qVar = this.e;
        if (!z10) {
            qVar.setTranslationY(0.0f);
        }
        xnVar.z2[0].setTranslationX(0.0f);
        xnVar.z2[1].setTranslationX(0.0f);
        xnVar.y2[1].setAlpha(1.0f);
        xnVar.y2[1].setScaleX(1.0f);
        xnVar.y2[1].setScaleY(1.0f);
        xnVar.y2[0].setAlpha(1.0f);
        xnVar.y2[0].setScaleX(1.0f);
        xnVar.y2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.l5[] l5VarArr = xnVar.A2;
        org.telegram.ui.ActionBar.l5 l5Var2 = l5VarArr[0];
        l5VarArr[1] = l5Var2;
        l5VarArr[0] = l5Var;
        l5Var2.setVisibility(4);
        hg.q[] qVarArr = xnVar.B2;
        hg.q qVar2 = qVarArr[0];
        qVarArr[1] = qVar2;
        qVarArr[0] = qVar;
        qVar2.setVisibility(4);
        wn[] wnVarArr = xnVar.z2;
        wn wnVar2 = wnVarArr[0];
        if (wnVar != wnVar2) {
            wnVarArr[1] = wnVar2;
            wnVarArr[0] = wnVar;
            wnVar2.setVisibility(4);
        }
        if (this.f) {
            xnVar.y2[1].setImageBitmap(null);
            xnVar.y2[1].setVisibility(4);
        }
        org.telegram.ui.Components.p9[] p9VarArr = xnVar.y2;
        org.telegram.ui.Components.p9 p9Var = p9VarArr[1];
        org.telegram.ui.Components.p9 p9Var2 = p9VarArr[0];
        p9VarArr[1] = p9Var2;
        p9VarArr[0] = p9Var;
        p9Var2.setAlpha(1.0f);
        xnVar.y2[1].setScaleX(1.0f);
        xnVar.y2[1].setScaleY(1.0f);
        xnVar.y2[1].setVisibility(4);
        xnVar.E2[0] = null;
        xnVar.x2 = false;
    }
}
