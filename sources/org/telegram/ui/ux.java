package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ux extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ uy c;

    public /* synthetic */ ux(uy uyVar, boolean z10, int i10) {
        this.a = i10;
        this.c = uyVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                uy uyVar = this.c;
                uyVar.o3.unlock();
                if (uyVar.w1 == animator) {
                    if (this.b) {
                        uyVar.e0[0].a.b1();
                    } else {
                        qy qyVar = uyVar.e0[0].a;
                        if (qyVar.i1) {
                            qyVar.i1 = false;
                            qyVar.J0(false);
                        }
                    }
                    uyVar.w1 = null;
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
                uy uyVar = this.c;
                uyVar.o3.unlock();
                if (uyVar.w1 == animator) {
                    uyVar.A4(false, true);
                    boolean z10 = this.b;
                    if (z10) {
                        uyVar.e0[0].a.b1();
                        lx lxVar = uyVar.E0;
                        if (lxVar != null) {
                            lxVar.setVisibility(8);
                        }
                        uyVar.q3 = true;
                        Activity parentActivity = uyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.n2) uyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        uyVar.j0.setVisibility(8);
                        ox oxVar = uyVar.F3;
                        if (oxVar != null) {
                            oxVar.setVisibility(8);
                        }
                    } else {
                        uyVar.r3 = false;
                        ey eyVar = uyVar.C0;
                        if (eyVar != null) {
                            eyVar.setVisibility(8);
                        }
                        ky kyVar = uyVar.X;
                        if (kyVar != null) {
                            kyVar.c();
                        }
                        ey eyVar2 = uyVar.C0;
                        if (eyVar2 != null) {
                            eyVar2.A0.clear();
                            eyVar2.J();
                        }
                        qy qyVar = uyVar.e0[0].a;
                        if (qyVar.i1) {
                            qyVar.i1 = false;
                            qyVar.J0(false);
                        }
                        uyVar.q3 = false;
                        ox oxVar2 = uyVar.F3;
                        if (oxVar2 != null) {
                            oxVar2.setVisibility(0);
                        }
                    }
                    View view = uyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    uyVar.D4(z10 ? 1.0f : 0.0f);
                    uyVar.e0[0].a.setVerticalScrollBarEnabled(true);
                    ey eyVar3 = uyVar.C0;
                    if (eyVar3 != null) {
                        eyVar3.setBackground(null);
                    }
                    uyVar.w1 = null;
                    break;
                }
                break;
            case 1:
                uy uyVar2 = this.c;
                uyVar2.P3 = null;
                if (!this.b && (v0Var = uyVar2.m0) != null) {
                    v0Var.setVisibility(8);
                    break;
                }
                break;
            default:
                uy uyVar3 = this.c;
                uyVar3.I = null;
                boolean z11 = this.b;
                uyVar3.K = z11;
                if (!z11 && !uyVar3.L) {
                    uyVar3.E0.setVisibility(8);
                }
                if (z11) {
                    uyVar3.x3 = -AndroidUtilities.dp(81.0f);
                    uyVar3.C4(-uyVar3.U3());
                } else {
                    uyVar3.C4(0.0f);
                    uyVar3.x3 = AndroidUtilities.dp(81.0f);
                }
                int i11 = 0;
                while (true) {
                    ty[] tyVarArr = uyVar3.e0;
                    if (i11 >= tyVarArr.length) {
                        View view2 = uyVar3.fragmentView;
                        if (view2 != null) {
                            view2.requestLayout();
                            break;
                        }
                    } else {
                        ty tyVar = tyVarArr[i11];
                        if (tyVar != null) {
                            tyVar.a.requestLayout();
                        }
                        i11++;
                    }
                }
                break;
        }
    }
}
