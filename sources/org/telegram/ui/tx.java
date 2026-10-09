package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class tx extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ty c;

    public /* synthetic */ tx(ty tyVar, boolean z10, int i10) {
        this.a = i10;
        this.c = tyVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ty tyVar = this.c;
                tyVar.o3.unlock();
                if (tyVar.w1 == animator) {
                    if (this.b) {
                        tyVar.e0[0].a.c1();
                    } else {
                        py pyVar = tyVar.e0[0].a;
                        if (pyVar.g1) {
                            pyVar.g1 = false;
                            pyVar.K0(false);
                        }
                    }
                    tyVar.w1 = null;
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
        int i10;
        org.telegram.ui.ActionBar.v0 v0Var;
        switch (this.a) {
            case 0:
                ty tyVar = this.c;
                tyVar.o3.unlock();
                if (tyVar.w1 == animator) {
                    tyVar.x4(false, true);
                    boolean z10 = this.b;
                    if (z10) {
                        tyVar.e0[0].a.c1();
                        kx kxVar = tyVar.E0;
                        if (kxVar != null) {
                            kxVar.setVisibility(8);
                        }
                        tyVar.q3 = true;
                        Activity parentActivity = tyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.n2) tyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        tyVar.j0.setVisibility(8);
                        nx nxVar = tyVar.F3;
                        if (nxVar != null) {
                            nxVar.setVisibility(8);
                        }
                    } else {
                        tyVar.r3 = false;
                        dy dyVar = tyVar.C0;
                        if (dyVar != null) {
                            dyVar.setVisibility(8);
                        }
                        jy jyVar = tyVar.X;
                        if (jyVar != null) {
                            jyVar.c();
                        }
                        dy dyVar2 = tyVar.C0;
                        if (dyVar2 != null) {
                            dyVar2.A0.clear();
                            dyVar2.J();
                        }
                        py pyVar = tyVar.e0[0].a;
                        if (pyVar.g1) {
                            pyVar.g1 = false;
                            pyVar.K0(false);
                        }
                        tyVar.q3 = false;
                        nx nxVar2 = tyVar.F3;
                        if (nxVar2 != null) {
                            nxVar2.setVisibility(0);
                        }
                    }
                    View view = tyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    tyVar.A4(z10 ? 1.0f : 0.0f);
                    tyVar.e0[0].a.setVerticalScrollBarEnabled(true);
                    dy dyVar3 = tyVar.C0;
                    if (dyVar3 != null) {
                        dyVar3.setBackground(null);
                    }
                    tyVar.w1 = null;
                    break;
                }
                break;
            case 1:
                ty tyVar2 = this.c;
                tyVar2.O3 = null;
                if (!this.b && (v0Var = tyVar2.m0) != null) {
                    v0Var.setVisibility(8);
                    break;
                }
                break;
            default:
                ty tyVar3 = this.c;
                tyVar3.I = null;
                boolean z11 = this.b;
                tyVar3.K = z11;
                if (!z11 && !tyVar3.L) {
                    tyVar3.E0.setVisibility(8);
                }
                if (z11) {
                    tyVar3.x3 = -AndroidUtilities.dp(81.0f);
                    tyVar3.z4(-tyVar3.R3());
                } else {
                    tyVar3.z4(0.0f);
                    tyVar3.x3 = AndroidUtilities.dp(81.0f);
                }
                int i11 = 0;
                while (true) {
                    sy[] syVarArr = tyVar3.e0;
                    if (i11 >= syVarArr.length) {
                        View view2 = tyVar3.fragmentView;
                        if (view2 != null) {
                            view2.requestLayout();
                            break;
                        }
                    } else {
                        sy syVar = syVarArr[i11];
                        if (syVar != null) {
                            syVar.a.requestLayout();
                        }
                        i11++;
                    }
                }
                break;
        }
    }
}
