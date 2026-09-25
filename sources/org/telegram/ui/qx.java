package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class qx extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ qy c;

    public /* synthetic */ qx(qy qyVar, boolean z10, int i10) {
        this.a = i10;
        this.c = qyVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                qy qyVar = this.c;
                qyVar.o3.unlock();
                if (qyVar.w1 == animator) {
                    if (this.b) {
                        qyVar.e0[0].a.c1();
                    } else {
                        my myVar = qyVar.e0[0].a;
                        if (myVar.i1) {
                            myVar.i1 = false;
                            myVar.K0(false);
                        }
                    }
                    qyVar.w1 = null;
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
                qy qyVar = this.c;
                qyVar.o3.unlock();
                if (qyVar.w1 == animator) {
                    qyVar.A4(false, true);
                    boolean z10 = this.b;
                    if (z10) {
                        qyVar.e0[0].a.c1();
                        hx hxVar = qyVar.E0;
                        if (hxVar != null) {
                            hxVar.setVisibility(8);
                        }
                        qyVar.q3 = true;
                        Activity parentActivity = qyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.m2) qyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        qyVar.j0.setVisibility(8);
                        kx kxVar = qyVar.F3;
                        if (kxVar != null) {
                            kxVar.setVisibility(8);
                        }
                    } else {
                        qyVar.r3 = false;
                        zx zxVar = qyVar.C0;
                        if (zxVar != null) {
                            zxVar.setVisibility(8);
                        }
                        gy gyVar = qyVar.X;
                        if (gyVar != null) {
                            gyVar.c();
                        }
                        zx zxVar2 = qyVar.C0;
                        if (zxVar2 != null) {
                            zxVar2.A0.clear();
                            zxVar2.J();
                        }
                        my myVar = qyVar.e0[0].a;
                        if (myVar.i1) {
                            myVar.i1 = false;
                            myVar.K0(false);
                        }
                        qyVar.q3 = false;
                        kx kxVar2 = qyVar.F3;
                        if (kxVar2 != null) {
                            kxVar2.setVisibility(0);
                        }
                    }
                    View view = qyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    qyVar.D4(z10 ? 1.0f : 0.0f);
                    qyVar.e0[0].a.setVerticalScrollBarEnabled(true);
                    zx zxVar3 = qyVar.C0;
                    if (zxVar3 != null) {
                        zxVar3.setBackground(null);
                    }
                    qyVar.w1 = null;
                    break;
                }
                break;
            case 1:
                qy qyVar2 = this.c;
                qyVar2.O3 = null;
                if (!this.b && (u0Var = qyVar2.m0) != null) {
                    u0Var.setVisibility(8);
                    break;
                }
                break;
            default:
                qy qyVar3 = this.c;
                qyVar3.I = null;
                boolean z11 = this.b;
                qyVar3.K = z11;
                if (!z11 && !qyVar3.L) {
                    qyVar3.E0.setVisibility(8);
                }
                if (z11) {
                    qyVar3.x3 = -AndroidUtilities.dp(81.0f);
                    qyVar3.C4(-qyVar3.U3());
                } else {
                    qyVar3.C4(0.0f);
                    qyVar3.x3 = AndroidUtilities.dp(81.0f);
                }
                int i11 = 0;
                while (true) {
                    py[] pyVarArr = qyVar3.e0;
                    if (i11 >= pyVarArr.length) {
                        View view2 = qyVar3.fragmentView;
                        if (view2 != null) {
                            view2.requestLayout();
                            break;
                        }
                    } else {
                        py pyVar = pyVarArr[i11];
                        if (pyVar != null) {
                            pyVar.a.requestLayout();
                        }
                        i11++;
                    }
                }
                break;
        }
    }
}
