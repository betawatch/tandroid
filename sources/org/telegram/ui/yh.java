package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class yh extends AnimatorListenerAdapter {
    public final /* synthetic */ vn a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ln e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ wn h;

    public yh(wn wnVar, vn vnVar, boolean z10, org.telegram.ui.ActionBar.b6 b6Var, boolean z11, ln lnVar, boolean z12) {
        this.h = wnVar;
        this.a = vnVar;
        this.b = z10;
        this.c = b6Var;
        this.d = z11;
        this.e = lnVar;
        this.f = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        wn wnVar = this.h;
        if (wnVar.R2.getTag() != null) {
            wnVar.R2.setVisibility(4);
            int T8 = wnVar.T8();
            wnVar.R2.a(Math.min(T8 - 1, Math.max(1, T8 - wnVar.Y4[0])), false);
        } else {
            wnVar.R2.setAlpha(1.0f);
        }
        wnVar.R2.setTranslationY(0.0f);
        wnVar.P2[0].setTranslationX(0.0f);
        wnVar.P2[1].setTranslationX(0.0f);
        wnVar.R2.setTranslationX(wnVar.S2 + 0.0f);
        vn vnVar = this.a;
        vnVar.setTranslationY(0.0f);
        boolean z10 = this.b;
        if (!z10) {
            vnVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.c;
        if (!z10) {
            b6Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        ln lnVar = this.e;
        if (!z11) {
            lnVar.setTranslationY(0.0f);
        }
        wnVar.O2[0].setTranslationX(0.0f);
        wnVar.O2[1].setTranslationX(0.0f);
        wnVar.N2[1].setAlpha(1.0f);
        wnVar.N2[1].setScaleX(1.0f);
        wnVar.N2[1].setScaleY(1.0f);
        wnVar.N2[0].setAlpha(1.0f);
        wnVar.N2[0].setScaleX(1.0f);
        wnVar.N2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.b6[] b6VarArr = wnVar.P2;
        org.telegram.ui.ActionBar.b6 b6Var2 = b6VarArr[0];
        b6VarArr[1] = b6Var2;
        b6VarArr[0] = b6Var;
        b6Var2.setVisibility(4);
        ln[] lnVarArr = wnVar.Q2;
        ln lnVar2 = lnVarArr[0];
        lnVarArr[1] = lnVar2;
        lnVarArr[0] = lnVar;
        lnVar2.setVisibility(4);
        vn[] vnVarArr = wnVar.O2;
        vn vnVar2 = vnVarArr[0];
        if (vnVar != vnVar2) {
            vnVarArr[1] = vnVar2;
            vnVarArr[0] = vnVar;
            vnVar2.setVisibility(4);
        }
        if (this.f) {
            wnVar.N2[1].setImageBitmap(null);
            wnVar.N2[1].setVisibility(4);
        }
        org.telegram.ui.Components.y9[] y9VarArr = wnVar.N2;
        org.telegram.ui.Components.y9 y9Var = y9VarArr[1];
        org.telegram.ui.Components.y9 y9Var2 = y9VarArr[0];
        y9VarArr[1] = y9Var2;
        y9VarArr[0] = y9Var;
        y9Var2.setAlpha(1.0f);
        wnVar.N2[1].setScaleX(1.0f);
        wnVar.N2[1].setScaleY(1.0f);
        wnVar.N2[1].setVisibility(4);
        wnVar.T2[0] = null;
        wnVar.M2 = false;
    }
}
