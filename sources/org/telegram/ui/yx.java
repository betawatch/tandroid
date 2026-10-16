package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class yx extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ yy c;

    public /* synthetic */ yx(yy yyVar, boolean z10, int i10) {
        this.a = i10;
        this.c = yyVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                yy yyVar = this.c;
                yyVar.p3.unlock();
                if (yyVar.w1 == animator) {
                    if (this.b) {
                        yyVar.e0[0].a.c1();
                    } else {
                        uy uyVar = yyVar.e0[0].a;
                        if (uyVar.g1) {
                            uyVar.g1 = false;
                            uyVar.K0(false);
                        }
                    }
                    yyVar.w1 = null;
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
        org.telegram.ui.ActionBar.u0 u0Var;
        switch (this.a) {
            case 0:
                yy yyVar = this.c;
                yyVar.p3.unlock();
                if (yyVar.w1 == animator) {
                    yyVar.y4(false, true);
                    boolean z10 = this.b;
                    if (z10) {
                        yyVar.e0[0].a.c1();
                        px pxVar = yyVar.E0;
                        if (pxVar != null) {
                            pxVar.setVisibility(8);
                        }
                        yyVar.r3 = true;
                        Activity parentActivity = yyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.m2) yyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        yyVar.j0.setVisibility(8);
                        sx sxVar = yyVar.G3;
                        if (sxVar != null) {
                            sxVar.setVisibility(8);
                        }
                    } else {
                        yyVar.s3 = false;
                        iy iyVar = yyVar.C0;
                        if (iyVar != null) {
                            iyVar.setVisibility(8);
                        }
                        oy oyVar = yyVar.X;
                        if (oyVar != null) {
                            oyVar.c();
                        }
                        iy iyVar2 = yyVar.C0;
                        if (iyVar2 != null) {
                            iyVar2.A0.clear();
                            iyVar2.J();
                        }
                        uy uyVar = yyVar.e0[0].a;
                        if (uyVar.g1) {
                            uyVar.g1 = false;
                            uyVar.K0(false);
                        }
                        yyVar.r3 = false;
                        sx sxVar2 = yyVar.G3;
                        if (sxVar2 != null) {
                            sxVar2.setVisibility(0);
                        }
                    }
                    View view = yyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    yyVar.B4(z10 ? 1.0f : 0.0f);
                    yyVar.e0[0].a.setVerticalScrollBarEnabled(true);
                    iy iyVar3 = yyVar.C0;
                    if (iyVar3 != null) {
                        iyVar3.setBackground(null);
                    }
                    yyVar.w1 = null;
                    break;
                }
                break;
            case 1:
                yy yyVar2 = this.c;
                yyVar2.P3 = null;
                if (!this.b && (u0Var = yyVar2.m0) != null) {
                    u0Var.setVisibility(8);
                    break;
                }
                break;
            default:
                yy yyVar3 = this.c;
                yyVar3.I = null;
                boolean z11 = this.b;
                yyVar3.K = z11;
                if (!z11 && !yyVar3.L) {
                    yyVar3.E0.setVisibility(8);
                }
                if (z11) {
                    yyVar3.y3 = -AndroidUtilities.dp(81.0f);
                    yyVar3.A4(-yyVar3.S3());
                } else {
                    yyVar3.A4(0.0f);
                    yyVar3.y3 = AndroidUtilities.dp(81.0f);
                }
                int i11 = 0;
                while (true) {
                    xy[] xyVarArr = yyVar3.e0;
                    if (i11 >= xyVarArr.length) {
                        View view2 = yyVar3.fragmentView;
                        if (view2 != null) {
                            view2.requestLayout();
                            break;
                        }
                    } else {
                        xy xyVar = xyVarArr[i11];
                        if (xyVar != null) {
                            xyVar.a.requestLayout();
                        }
                        i11++;
                    }
                }
                break;
        }
    }
}
