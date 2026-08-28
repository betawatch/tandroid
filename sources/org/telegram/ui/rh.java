package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rh extends AnimatorListenerAdapter {
    public final /* synthetic */ pn a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h5 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ bg.t e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ qn h;

    public rh(qn qnVar, pn pnVar, boolean z10, org.telegram.ui.ActionBar.h5 h5Var, boolean z11, bg.t tVar, boolean z12) {
        this.h = qnVar;
        this.a = pnVar;
        this.b = z10;
        this.c = h5Var;
        this.d = z11;
        this.e = tVar;
        this.f = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        qn qnVar = this.h;
        if (qnVar.B2.getTag() != null) {
            qnVar.B2.setVisibility(4);
            int G8 = qnVar.G8();
            qnVar.B2.a(Math.min(G8 - 1, Math.max(1, G8 - qnVar.I4[0])), false);
        } else {
            qnVar.B2.setAlpha(1.0f);
        }
        qnVar.B2.setTranslationY(0.0f);
        qnVar.z2[0].setTranslationX(0.0f);
        qnVar.z2[1].setTranslationX(0.0f);
        qnVar.B2.setTranslationX(qnVar.C2 + 0.0f);
        pn pnVar = this.a;
        pnVar.setTranslationY(0.0f);
        boolean z10 = this.b;
        if (!z10) {
            pnVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.c;
        if (!z10) {
            h5Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        bg.t tVar = this.e;
        if (!z11) {
            tVar.setTranslationY(0.0f);
        }
        qnVar.y2[0].setTranslationX(0.0f);
        qnVar.y2[1].setTranslationX(0.0f);
        qnVar.x2[1].setAlpha(1.0f);
        qnVar.x2[1].setScaleX(1.0f);
        qnVar.x2[1].setScaleY(1.0f);
        qnVar.x2[0].setAlpha(1.0f);
        qnVar.x2[0].setScaleX(1.0f);
        qnVar.x2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.h5[] h5VarArr = qnVar.z2;
        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[0];
        h5VarArr[1] = h5Var2;
        h5VarArr[0] = h5Var;
        h5Var2.setVisibility(4);
        bg.t[] tVarArr = qnVar.A2;
        bg.t tVar2 = tVarArr[0];
        tVarArr[1] = tVar2;
        tVarArr[0] = tVar;
        tVar2.setVisibility(4);
        pn[] pnVarArr = qnVar.y2;
        pn pnVar2 = pnVarArr[0];
        if (pnVar != pnVar2) {
            pnVarArr[1] = pnVar2;
            pnVarArr[0] = pnVar;
            pnVar2.setVisibility(4);
        }
        if (this.f) {
            qnVar.x2[1].setImageBitmap(null);
            qnVar.x2[1].setVisibility(4);
        }
        org.telegram.ui.Components.o9[] o9VarArr = qnVar.x2;
        org.telegram.ui.Components.o9 o9Var = o9VarArr[1];
        org.telegram.ui.Components.o9 o9Var2 = o9VarArr[0];
        o9VarArr[1] = o9Var2;
        o9VarArr[0] = o9Var;
        o9Var2.setAlpha(1.0f);
        qnVar.x2[1].setScaleX(1.0f);
        qnVar.x2[1].setScaleY(1.0f);
        qnVar.x2[1].setVisibility(4);
        qnVar.D2[0] = null;
        qnVar.w2 = false;
    }
}
