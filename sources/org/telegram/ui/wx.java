package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class wx extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ wy c;

    public /* synthetic */ wx(wy wyVar, boolean z10, int i10) {
        this.a = i10;
        this.c = wyVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                wy wyVar = this.c;
                wyVar.o3.unlock();
                if (wyVar.w1 == animator) {
                    if (this.b) {
                        wyVar.e0[0].a.b1();
                    } else {
                        sy syVar = wyVar.e0[0].a;
                        if (syVar.i1) {
                            syVar.i1 = false;
                            syVar.J0(false);
                        }
                    }
                    wyVar.w1 = null;
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
                wy wyVar = this.c;
                wyVar.o3.unlock();
                if (wyVar.w1 == animator) {
                    wyVar.A4(false, true);
                    boolean z10 = this.b;
                    if (z10) {
                        wyVar.e0[0].a.b1();
                        nx nxVar = wyVar.E0;
                        if (nxVar != null) {
                            nxVar.setVisibility(8);
                        }
                        wyVar.q3 = true;
                        Activity parentActivity = wyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.p2) wyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        wyVar.j0.setVisibility(8);
                        qx qxVar = wyVar.F3;
                        if (qxVar != null) {
                            qxVar.setVisibility(8);
                        }
                    } else {
                        wyVar.r3 = false;
                        gy gyVar = wyVar.C0;
                        if (gyVar != null) {
                            gyVar.setVisibility(8);
                        }
                        my myVar = wyVar.X;
                        if (myVar != null) {
                            myVar.c();
                        }
                        gy gyVar2 = wyVar.C0;
                        if (gyVar2 != null) {
                            gyVar2.A0.clear();
                            gyVar2.J();
                        }
                        sy syVar = wyVar.e0[0].a;
                        if (syVar.i1) {
                            syVar.i1 = false;
                            syVar.J0(false);
                        }
                        wyVar.q3 = false;
                        qx qxVar2 = wyVar.F3;
                        if (qxVar2 != null) {
                            qxVar2.setVisibility(0);
                        }
                    }
                    View view = wyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    wyVar.D4(z10 ? 1.0f : 0.0f);
                    wyVar.e0[0].a.setVerticalScrollBarEnabled(true);
                    gy gyVar3 = wyVar.C0;
                    if (gyVar3 != null) {
                        gyVar3.setBackground(null);
                    }
                    wyVar.w1 = null;
                    break;
                }
                break;
            case 1:
                wy wyVar2 = this.c;
                wyVar2.P3 = null;
                if (!this.b && (w0Var = wyVar2.m0) != null) {
                    w0Var.setVisibility(8);
                    break;
                }
                break;
            default:
                wy wyVar3 = this.c;
                wyVar3.I = null;
                boolean z11 = this.b;
                wyVar3.K = z11;
                if (!z11 && !wyVar3.L) {
                    wyVar3.E0.setVisibility(8);
                }
                if (z11) {
                    wyVar3.x3 = -AndroidUtilities.dp(81.0f);
                    wyVar3.C4(-wyVar3.U3());
                } else {
                    wyVar3.C4(0.0f);
                    wyVar3.x3 = AndroidUtilities.dp(81.0f);
                }
                int i11 = 0;
                while (true) {
                    vy[] vyVarArr = wyVar3.e0;
                    if (i11 >= vyVarArr.length) {
                        View view2 = wyVar3.fragmentView;
                        if (view2 != null) {
                            view2.requestLayout();
                            break;
                        }
                    } else {
                        vy vyVar = vyVarArr[i11];
                        if (vyVar != null) {
                            vyVar.a.requestLayout();
                        }
                        i11++;
                    }
                }
                break;
        }
    }
}
