package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class wh extends AnimatorListenerAdapter {
    public final /* synthetic */ tn a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ jn e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ un h;

    public wh(un unVar, tn tnVar, boolean z10, org.telegram.ui.ActionBar.b6 b6Var, boolean z11, jn jnVar, boolean z12) {
        this.h = unVar;
        this.a = tnVar;
        this.b = z10;
        this.c = b6Var;
        this.d = z11;
        this.e = jnVar;
        this.f = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        un unVar = this.h;
        if (unVar.R2.getTag() != null) {
            unVar.R2.setVisibility(4);
            int Q8 = unVar.Q8();
            unVar.R2.a(Math.min(Q8 - 1, Math.max(1, Q8 - unVar.Y4[0])), false);
        } else {
            unVar.R2.setAlpha(1.0f);
        }
        unVar.R2.setTranslationY(0.0f);
        unVar.P2[0].setTranslationX(0.0f);
        unVar.P2[1].setTranslationX(0.0f);
        unVar.R2.setTranslationX(unVar.S2 + 0.0f);
        tn tnVar = this.a;
        tnVar.setTranslationY(0.0f);
        boolean z10 = this.b;
        if (!z10) {
            tnVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.c;
        if (!z10) {
            b6Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        jn jnVar = this.e;
        if (!z11) {
            jnVar.setTranslationY(0.0f);
        }
        unVar.O2[0].setTranslationX(0.0f);
        unVar.O2[1].setTranslationX(0.0f);
        unVar.N2[1].setAlpha(1.0f);
        unVar.N2[1].setScaleX(1.0f);
        unVar.N2[1].setScaleY(1.0f);
        unVar.N2[0].setAlpha(1.0f);
        unVar.N2[0].setScaleX(1.0f);
        unVar.N2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.b6[] b6VarArr = unVar.P2;
        org.telegram.ui.ActionBar.b6 b6Var2 = b6VarArr[0];
        b6VarArr[1] = b6Var2;
        b6VarArr[0] = b6Var;
        b6Var2.setVisibility(4);
        jn[] jnVarArr = unVar.Q2;
        jn jnVar2 = jnVarArr[0];
        jnVarArr[1] = jnVar2;
        jnVarArr[0] = jnVar;
        jnVar2.setVisibility(4);
        tn[] tnVarArr = unVar.O2;
        tn tnVar2 = tnVarArr[0];
        if (tnVar != tnVar2) {
            tnVarArr[1] = tnVar2;
            tnVarArr[0] = tnVar;
            tnVar2.setVisibility(4);
        }
        if (this.f) {
            unVar.N2[1].setImageBitmap(null);
            unVar.N2[1].setVisibility(4);
        }
        org.telegram.ui.Components.y9[] y9VarArr = unVar.N2;
        org.telegram.ui.Components.y9 y9Var = y9VarArr[1];
        org.telegram.ui.Components.y9 y9Var2 = y9VarArr[0];
        y9VarArr[1] = y9Var2;
        y9VarArr[0] = y9Var;
        y9Var2.setAlpha(1.0f);
        unVar.N2[1].setScaleX(1.0f);
        unVar.N2[1].setScaleY(1.0f);
        unVar.N2[1].setVisibility(4);
        unVar.T2[0] = null;
        unVar.M2 = false;
    }
}
