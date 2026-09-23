package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class rx extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ry c;

    public /* synthetic */ rx(ry ryVar, boolean z10, int i10) {
        this.a = i10;
        this.c = ryVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ry ryVar = this.c;
                ryVar.o3.unlock();
                if (ryVar.w1 == animator) {
                    if (this.b) {
                        ryVar.e0[0].a.c1();
                    } else {
                        ny nyVar = ryVar.e0[0].a;
                        if (nyVar.i1) {
                            nyVar.i1 = false;
                            nyVar.K0(false);
                        }
                    }
                    ryVar.w1 = null;
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
                ry ryVar = this.c;
                ryVar.o3.unlock();
                if (ryVar.w1 == animator) {
                    ryVar.A4(false, true);
                    boolean z10 = this.b;
                    if (z10) {
                        ryVar.e0[0].a.c1();
                        ix ixVar = ryVar.E0;
                        if (ixVar != null) {
                            ixVar.setVisibility(8);
                        }
                        ryVar.q3 = true;
                        Activity parentActivity = ryVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.n2) ryVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        ryVar.j0.setVisibility(8);
                        lx lxVar = ryVar.F3;
                        if (lxVar != null) {
                            lxVar.setVisibility(8);
                        }
                    } else {
                        ryVar.r3 = false;
                        ay ayVar = ryVar.C0;
                        if (ayVar != null) {
                            ayVar.setVisibility(8);
                        }
                        hy hyVar = ryVar.X;
                        if (hyVar != null) {
                            hyVar.c();
                        }
                        ay ayVar2 = ryVar.C0;
                        if (ayVar2 != null) {
                            ayVar2.A0.clear();
                            ayVar2.J();
                        }
                        ny nyVar = ryVar.e0[0].a;
                        if (nyVar.i1) {
                            nyVar.i1 = false;
                            nyVar.K0(false);
                        }
                        ryVar.q3 = false;
                        lx lxVar2 = ryVar.F3;
                        if (lxVar2 != null) {
                            lxVar2.setVisibility(0);
                        }
                    }
                    View view = ryVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    ryVar.D4(z10 ? 1.0f : 0.0f);
                    ryVar.e0[0].a.setVerticalScrollBarEnabled(true);
                    ay ayVar3 = ryVar.C0;
                    if (ayVar3 != null) {
                        ayVar3.setBackground(null);
                    }
                    ryVar.w1 = null;
                    break;
                }
                break;
            case 1:
                ry ryVar2 = this.c;
                ryVar2.O3 = null;
                if (!this.b && (v0Var = ryVar2.m0) != null) {
                    v0Var.setVisibility(8);
                    break;
                }
                break;
            default:
                ry ryVar3 = this.c;
                ryVar3.I = null;
                boolean z11 = this.b;
                ryVar3.K = z11;
                if (!z11 && !ryVar3.L) {
                    ryVar3.E0.setVisibility(8);
                }
                if (z11) {
                    ryVar3.x3 = -AndroidUtilities.dp(81.0f);
                    ryVar3.C4(-ryVar3.U3());
                } else {
                    ryVar3.C4(0.0f);
                    ryVar3.x3 = AndroidUtilities.dp(81.0f);
                }
                int i11 = 0;
                while (true) {
                    qy[] qyVarArr = ryVar3.e0;
                    if (i11 >= qyVarArr.length) {
                        View view2 = ryVar3.fragmentView;
                        if (view2 != null) {
                            view2.requestLayout();
                            break;
                        }
                    } else {
                        qy qyVar = qyVarArr[i11];
                        if (qyVar != null) {
                            qyVar.a.requestLayout();
                        }
                        i11++;
                    }
                }
                break;
        }
    }
}
