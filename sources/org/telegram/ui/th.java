package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class th extends AnimatorListenerAdapter {
    public final /* synthetic */ qn a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h5 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ cg.q e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ rn h;

    public th(rn rnVar, qn qnVar, boolean z10, org.telegram.ui.ActionBar.h5 h5Var, boolean z11, cg.q qVar, boolean z12) {
        this.h = rnVar;
        this.a = qnVar;
        this.b = z10;
        this.c = h5Var;
        this.d = z11;
        this.e = qVar;
        this.f = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        rn rnVar = this.h;
        if (rnVar.B2.getTag() != null) {
            rnVar.B2.setVisibility(4);
            int G8 = rnVar.G8();
            rnVar.B2.a(Math.min(G8 - 1, Math.max(1, G8 - rnVar.I4[0])), false);
        } else {
            rnVar.B2.setAlpha(1.0f);
        }
        rnVar.B2.setTranslationY(0.0f);
        rnVar.z2[0].setTranslationX(0.0f);
        rnVar.z2[1].setTranslationX(0.0f);
        rnVar.B2.setTranslationX(rnVar.C2 + 0.0f);
        qn qnVar = this.a;
        qnVar.setTranslationY(0.0f);
        boolean z10 = this.b;
        if (!z10) {
            qnVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.c;
        if (!z10) {
            h5Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        cg.q qVar = this.e;
        if (!z11) {
            qVar.setTranslationY(0.0f);
        }
        rnVar.y2[0].setTranslationX(0.0f);
        rnVar.y2[1].setTranslationX(0.0f);
        rnVar.x2[1].setAlpha(1.0f);
        rnVar.x2[1].setScaleX(1.0f);
        rnVar.x2[1].setScaleY(1.0f);
        rnVar.x2[0].setAlpha(1.0f);
        rnVar.x2[0].setScaleX(1.0f);
        rnVar.x2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.h5[] h5VarArr = rnVar.z2;
        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[0];
        h5VarArr[1] = h5Var2;
        h5VarArr[0] = h5Var;
        h5Var2.setVisibility(4);
        cg.q[] qVarArr = rnVar.A2;
        cg.q qVar2 = qVarArr[0];
        qVarArr[1] = qVar2;
        qVarArr[0] = qVar;
        qVar2.setVisibility(4);
        qn[] qnVarArr = rnVar.y2;
        qn qnVar2 = qnVarArr[0];
        if (qnVar != qnVar2) {
            qnVarArr[1] = qnVar2;
            qnVarArr[0] = qnVar;
            qnVar2.setVisibility(4);
        }
        if (this.f) {
            rnVar.x2[1].setImageBitmap(null);
            rnVar.x2[1].setVisibility(4);
        }
        org.telegram.ui.Components.n9[] n9VarArr = rnVar.x2;
        org.telegram.ui.Components.n9 n9Var = n9VarArr[1];
        org.telegram.ui.Components.n9 n9Var2 = n9VarArr[0];
        n9VarArr[1] = n9Var2;
        n9VarArr[0] = n9Var;
        n9Var2.setAlpha(1.0f);
        rnVar.x2[1].setScaleX(1.0f);
        rnVar.x2[1].setScaleY(1.0f);
        rnVar.x2[1].setVisibility(4);
        rnVar.D2[0] = null;
        rnVar.w2 = false;
    }
}
