package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class yv extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ww c;

    public /* synthetic */ yv(ww wwVar, boolean z9, int i7) {
        this.a = i7;
        this.c = wwVar;
        this.b = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ww wwVar = this.c;
                wwVar.p3.e();
                if (wwVar.w1 == animator) {
                    if (this.b) {
                        wwVar.e0[0].a.c1();
                    } else {
                        sw swVar = wwVar.e0[0].a;
                        if (swVar.g1) {
                            swVar.g1 = false;
                            swVar.K0(false);
                        }
                    }
                    wwVar.w1 = null;
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7;
        org.telegram.ui.ActionBar.r0 r0Var;
        switch (this.a) {
            case 0:
                ww wwVar = this.c;
                wwVar.p3.e();
                if (wwVar.w1 == animator) {
                    wwVar.M4(false, true);
                    boolean z9 = this.b;
                    if (z9) {
                        wwVar.e0[0].a.c1();
                        pv pvVar = wwVar.E0;
                        if (pvVar != null) {
                            pvVar.setVisibility(8);
                        }
                        wwVar.r3 = true;
                        Activity parentActivity = wwVar.getParentActivity();
                        i7 = ((org.telegram.ui.ActionBar.f2) wwVar).classGuid;
                        org.telegram.messenger.g0.a3(parentActivity, i7);
                        wwVar.j0.setVisibility(8);
                        sv svVar = wwVar.F3;
                        if (svVar != null) {
                            svVar.setVisibility(8);
                        }
                    } else {
                        wwVar.s3 = false;
                        fw fwVar = wwVar.C0;
                        if (fwVar != null) {
                            fwVar.setVisibility(8);
                        }
                        lw lwVar = wwVar.X;
                        if (lwVar != null) {
                            lwVar.c();
                        }
                        fw fwVar2 = wwVar.C0;
                        if (fwVar2 != null) {
                            fwVar2.C0.clear();
                            fwVar2.L();
                        }
                        sw swVar = wwVar.e0[0].a;
                        if (swVar.g1) {
                            swVar.g1 = false;
                            swVar.K0(false);
                        }
                        wwVar.r3 = false;
                        sv svVar2 = wwVar.F3;
                        if (svVar2 != null) {
                            svVar2.setVisibility(0);
                        }
                    }
                    View view = wwVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    wwVar.P4(z9 ? 1.0f : 0.0f);
                    wwVar.e0[0].a.setVerticalScrollBarEnabled(true);
                    fw fwVar3 = wwVar.C0;
                    if (fwVar3 != null) {
                        fwVar3.setBackground(null);
                    }
                    wwVar.w1 = null;
                    break;
                }
                break;
            case 1:
                ww wwVar2 = this.c;
                wwVar2.O3 = null;
                if (!this.b && (r0Var = wwVar2.m0) != null) {
                    r0Var.setVisibility(8);
                    break;
                }
                break;
            default:
                ww wwVar3 = this.c;
                wwVar3.I = null;
                boolean z10 = this.b;
                wwVar3.K = z10;
                if (!z10 && !wwVar3.L) {
                    wwVar3.E0.setVisibility(8);
                }
                if (z10) {
                    wwVar3.y3 = -org.telegram.messenger.g0.L(81.0f);
                    wwVar3.O4(-wwVar3.g4());
                } else {
                    wwVar3.O4(0.0f);
                    wwVar3.y3 = org.telegram.messenger.g0.L(81.0f);
                }
                int i10 = 0;
                while (true) {
                    vw[] vwVarArr = wwVar3.e0;
                    if (i10 >= vwVarArr.length) {
                        View view2 = wwVar3.fragmentView;
                        if (view2 != null) {
                            view2.requestLayout();
                            break;
                        }
                    } else {
                        vw vwVar = vwVarArr[i10];
                        if (vwVar != null) {
                            vwVar.a.requestLayout();
                        }
                        i10++;
                    }
                }
                break;
        }
    }
}
