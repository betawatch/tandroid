package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vv extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ uw c;

    public /* synthetic */ vv(uw uwVar, boolean z10, int i3) {
        this.a = i3;
        this.c = uwVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                uw uwVar = this.c;
                uwVar.q3.e();
                if (uwVar.x1 == animator) {
                    if (this.b) {
                        uwVar.f0[0].a.c1();
                    } else {
                        pw pwVar = uwVar.f0[0].a;
                        if (pwVar.h1) {
                            pwVar.h1 = false;
                            pwVar.K0(false);
                        }
                    }
                    uwVar.x1 = null;
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
        int i3;
        org.telegram.ui.ActionBar.q0 q0Var;
        switch (this.a) {
            case 0:
                uw uwVar = this.c;
                uwVar.q3.e();
                if (uwVar.x1 == animator) {
                    uwVar.M4(false, true);
                    boolean z10 = this.b;
                    if (z10) {
                        uwVar.f0[0].a.c1();
                        mv mvVar = uwVar.F0;
                        if (mvVar != null) {
                            mvVar.setVisibility(8);
                        }
                        uwVar.s3 = true;
                        Activity parentActivity = uwVar.getParentActivity();
                        i3 = ((org.telegram.ui.ActionBar.d2) uwVar).classGuid;
                        org.telegram.messenger.g0.a3(parentActivity, i3);
                        uwVar.k0.setVisibility(8);
                        pv pvVar = uwVar.G3;
                        if (pvVar != null) {
                            pvVar.setVisibility(8);
                        }
                    } else {
                        uwVar.t3 = false;
                        cw cwVar = uwVar.D0;
                        if (cwVar != null) {
                            cwVar.setVisibility(8);
                        }
                        iw iwVar = uwVar.Y;
                        if (iwVar != null) {
                            iwVar.c();
                        }
                        cw cwVar2 = uwVar.D0;
                        if (cwVar2 != null) {
                            cwVar2.D0.clear();
                            cwVar2.L();
                        }
                        pw pwVar = uwVar.f0[0].a;
                        if (pwVar.h1) {
                            pwVar.h1 = false;
                            pwVar.K0(false);
                        }
                        uwVar.s3 = false;
                        pv pvVar2 = uwVar.G3;
                        if (pvVar2 != null) {
                            pvVar2.setVisibility(0);
                        }
                    }
                    View view = uwVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    uwVar.P4(z10 ? 1.0f : 0.0f);
                    uwVar.f0[0].a.setVerticalScrollBarEnabled(true);
                    cw cwVar3 = uwVar.D0;
                    if (cwVar3 != null) {
                        cwVar3.setBackground(null);
                    }
                    uwVar.x1 = null;
                    break;
                }
                break;
            case 1:
                uw uwVar2 = this.c;
                uwVar2.P3 = null;
                if (!this.b && (q0Var = uwVar2.n0) != null) {
                    q0Var.setVisibility(8);
                    break;
                }
                break;
            default:
                uw uwVar3 = this.c;
                uwVar3.J = null;
                boolean z11 = this.b;
                uwVar3.L = z11;
                if (!z11 && !uwVar3.M) {
                    uwVar3.F0.setVisibility(8);
                }
                if (z11) {
                    uwVar3.z3 = -org.telegram.messenger.g0.L(81.0f);
                    uwVar3.O4(-uwVar3.g4());
                } else {
                    uwVar3.O4(0.0f);
                    uwVar3.z3 = org.telegram.messenger.g0.L(81.0f);
                }
                int i10 = 0;
                while (true) {
                    tw[] twVarArr = uwVar3.f0;
                    if (i10 >= twVarArr.length) {
                        View view2 = uwVar3.fragmentView;
                        if (view2 != null) {
                            view2.requestLayout();
                            break;
                        }
                    } else {
                        tw twVar = twVarArr[i10];
                        if (twVar != null) {
                            twVar.a.requestLayout();
                        }
                        i10++;
                    }
                }
                break;
        }
    }
}
