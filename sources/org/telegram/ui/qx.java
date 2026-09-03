package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class qx extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ py c;

    public /* synthetic */ qx(py pyVar, boolean z4, int i10) {
        this.a = i10;
        this.c = pyVar;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                py pyVar = this.c;
                pyVar.l3.unlock();
                if (pyVar.t1 == animator) {
                    if (this.b) {
                        pyVar.b0[0].a.b1();
                    } else {
                        ly lyVar = pyVar.b0[0].a;
                        if (lyVar.f1) {
                            lyVar.f1 = false;
                            lyVar.J0(false);
                        }
                    }
                    pyVar.t1 = null;
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
                py pyVar = this.c;
                pyVar.l3.unlock();
                if (pyVar.t1 == animator) {
                    pyVar.A4(false, true);
                    boolean z4 = this.b;
                    if (z4) {
                        pyVar.b0[0].a.b1();
                        hx hxVar = pyVar.B0;
                        if (hxVar != null) {
                            hxVar.setVisibility(8);
                        }
                        pyVar.n3 = true;
                        Activity parentActivity = pyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.p2) pyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        pyVar.g0.setVisibility(8);
                        kx kxVar = pyVar.C3;
                        if (kxVar != null) {
                            kxVar.setVisibility(8);
                        }
                    } else {
                        pyVar.o3 = false;
                        yx yxVar = pyVar.z0;
                        if (yxVar != null) {
                            yxVar.setVisibility(8);
                        }
                        fy fyVar = pyVar.U;
                        if (fyVar != null) {
                            fyVar.c();
                        }
                        yx yxVar2 = pyVar.z0;
                        if (yxVar2 != null) {
                            yxVar2.x0.clear();
                            yxVar2.J();
                        }
                        ly lyVar = pyVar.b0[0].a;
                        if (lyVar.f1) {
                            lyVar.f1 = false;
                            lyVar.J0(false);
                        }
                        pyVar.n3 = false;
                        kx kxVar2 = pyVar.C3;
                        if (kxVar2 != null) {
                            kxVar2.setVisibility(0);
                        }
                    }
                    View view = pyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    pyVar.D4(z4 ? 1.0f : 0.0f);
                    pyVar.b0[0].a.setVerticalScrollBarEnabled(true);
                    yx yxVar3 = pyVar.z0;
                    if (yxVar3 != null) {
                        yxVar3.setBackground(null);
                    }
                    pyVar.t1 = null;
                    break;
                }
                break;
            case 1:
                py pyVar2 = this.c;
                pyVar2.M3 = null;
                if (!this.b && (w0Var = pyVar2.j0) != null) {
                    w0Var.setVisibility(8);
                    break;
                }
                break;
            default:
                py pyVar3 = this.c;
                pyVar3.F = null;
                boolean z10 = this.b;
                pyVar3.H = z10;
                if (!z10 && !pyVar3.I) {
                    pyVar3.B0.setVisibility(8);
                }
                if (z10) {
                    pyVar3.u3 = -AndroidUtilities.dp(81.0f);
                    pyVar3.C4(-pyVar3.U3());
                } else {
                    pyVar3.C4(0.0f);
                    pyVar3.u3 = AndroidUtilities.dp(81.0f);
                }
                int i11 = 0;
                while (true) {
                    oy[] oyVarArr = pyVar3.b0;
                    if (i11 >= oyVarArr.length) {
                        View view2 = pyVar3.fragmentView;
                        if (view2 != null) {
                            view2.requestLayout();
                            break;
                        }
                    } else {
                        oy oyVar = oyVarArr[i11];
                        if (oyVar != null) {
                            oyVar.a.requestLayout();
                        }
                        i11++;
                    }
                }
                break;
        }
    }
}
