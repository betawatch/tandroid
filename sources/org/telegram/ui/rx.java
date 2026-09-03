package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class rx extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ qy c;

    public /* synthetic */ rx(qy qyVar, boolean z4, int i10) {
        this.a = i10;
        this.c = qyVar;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                qy qyVar = this.c;
                qyVar.l3.unlock();
                if (qyVar.t1 == animator) {
                    if (this.b) {
                        qyVar.b0[0].a.b1();
                    } else {
                        my myVar = qyVar.b0[0].a;
                        if (myVar.f1) {
                            myVar.f1 = false;
                            myVar.J0(false);
                        }
                    }
                    qyVar.t1 = null;
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
        org.telegram.ui.ActionBar.w0 w0Var;
        switch (this.a) {
            case 0:
                qy qyVar = this.c;
                qyVar.l3.unlock();
                if (qyVar.t1 == animator) {
                    qyVar.A4(false, true);
                    boolean z4 = this.b;
                    if (z4) {
                        qyVar.b0[0].a.b1();
                        ix ixVar = qyVar.B0;
                        if (ixVar != null) {
                            ixVar.setVisibility(8);
                        }
                        qyVar.n3 = true;
                        Activity parentActivity = qyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.p2) qyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        qyVar.g0.setVisibility(8);
                        lx lxVar = qyVar.C3;
                        if (lxVar != null) {
                            lxVar.setVisibility(8);
                        }
                    } else {
                        qyVar.o3 = false;
                        zx zxVar = qyVar.z0;
                        if (zxVar != null) {
                            zxVar.setVisibility(8);
                        }
                        gy gyVar = qyVar.U;
                        if (gyVar != null) {
                            gyVar.c();
                        }
                        zx zxVar2 = qyVar.z0;
                        if (zxVar2 != null) {
                            zxVar2.x0.clear();
                            zxVar2.J();
                        }
                        my myVar = qyVar.b0[0].a;
                        if (myVar.f1) {
                            myVar.f1 = false;
                            myVar.J0(false);
                        }
                        qyVar.n3 = false;
                        lx lxVar2 = qyVar.C3;
                        if (lxVar2 != null) {
                            lxVar2.setVisibility(0);
                        }
                    }
                    View view = qyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    qyVar.D4(z4 ? 1.0f : 0.0f);
                    qyVar.b0[0].a.setVerticalScrollBarEnabled(true);
                    zx zxVar3 = qyVar.z0;
                    if (zxVar3 != null) {
                        zxVar3.setBackground(null);
                    }
                    qyVar.t1 = null;
                    break;
                }
                break;
            case 1:
                qy qyVar2 = this.c;
                qyVar2.M3 = null;
                if (!this.b && (w0Var = qyVar2.j0) != null) {
                    w0Var.setVisibility(8);
                    break;
                }
                break;
            default:
                qy qyVar3 = this.c;
                qyVar3.F = null;
                boolean z10 = this.b;
                qyVar3.H = z10;
                if (!z10 && !qyVar3.I) {
                    qyVar3.B0.setVisibility(8);
                }
                if (z10) {
                    qyVar3.u3 = -AndroidUtilities.dp(81.0f);
                    qyVar3.C4(-qyVar3.U3());
                } else {
                    qyVar3.C4(0.0f);
                    qyVar3.u3 = AndroidUtilities.dp(81.0f);
                }
                int i11 = 0;
                while (true) {
                    py[] pyVarArr = qyVar3.b0;
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
