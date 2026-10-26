package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class zw extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ cy c;

    public /* synthetic */ zw(cy cyVar, boolean z10, int i10) {
        this.a = i10;
        this.c = cyVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                cy cyVar = this.c;
                cyVar.p3.unlock();
                if (cyVar.w1 == animator) {
                    if (this.b) {
                        cyVar.e0[0].a.c1();
                    } else {
                        wx wxVar = cyVar.e0[0].a;
                        if (wxVar.g1) {
                            wxVar.g1 = false;
                            wxVar.K0(false);
                        }
                    }
                    cyVar.w1 = null;
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
                cy cyVar = this.c;
                cyVar.p3.unlock();
                if (cyVar.w1 == animator) {
                    cyVar.I4(false, true);
                    boolean z10 = this.b;
                    if (z10) {
                        cyVar.e0[0].a.c1();
                        qw qwVar = cyVar.E0;
                        if (qwVar != null) {
                            qwVar.setVisibility(8);
                        }
                        cyVar.r3 = true;
                        Activity parentActivity = cyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.r2) cyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        cyVar.j0.setVisibility(8);
                        tw twVar = cyVar.G3;
                        if (twVar != null) {
                            twVar.setVisibility(8);
                        }
                    } else {
                        cyVar.s3 = false;
                        jx jxVar = cyVar.C0;
                        if (jxVar != null) {
                            jxVar.setVisibility(8);
                        }
                        ox oxVar = cyVar.X;
                        if (oxVar != null) {
                            oxVar.c();
                        }
                        jx jxVar2 = cyVar.C0;
                        if (jxVar2 != null) {
                            jxVar2.C0.clear();
                            jxVar2.L();
                        }
                        wx wxVar = cyVar.e0[0].a;
                        if (wxVar.g1) {
                            wxVar.g1 = false;
                            wxVar.K0(false);
                        }
                        cyVar.r3 = false;
                        tw twVar2 = cyVar.G3;
                        if (twVar2 != null) {
                            twVar2.setVisibility(0);
                        }
                    }
                    View view = cyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    cyVar.L4(z10 ? 1.0f : 0.0f);
                    cyVar.e0[0].a.setVerticalScrollBarEnabled(true);
                    jx jxVar3 = cyVar.C0;
                    if (jxVar3 != null) {
                        jxVar3.setBackground(null);
                    }
                    cyVar.w1 = null;
                    break;
                }
                break;
            case 1:
                cy cyVar2 = this.c;
                cyVar2.P3 = null;
                if (!this.b && (w0Var = cyVar2.m0) != null) {
                    w0Var.setVisibility(8);
                    break;
                }
                break;
            default:
                cy cyVar3 = this.c;
                cyVar3.I = null;
                boolean z11 = this.b;
                cyVar3.K = z11;
                if (!z11 && !cyVar3.L) {
                    cyVar3.E0.setVisibility(8);
                }
                if (z11) {
                    cyVar3.y3 = -AndroidUtilities.dp(81.0f);
                    cyVar3.K4(-cyVar3.c4());
                } else {
                    cyVar3.K4(0.0f);
                    cyVar3.y3 = AndroidUtilities.dp(81.0f);
                }
                int i11 = 0;
                while (true) {
                    ay[] ayVarArr = cyVar3.e0;
                    if (i11 >= ayVarArr.length) {
                        View view2 = cyVar3.fragmentView;
                        if (view2 != null) {
                            view2.requestLayout();
                            break;
                        }
                    } else {
                        ay ayVar = ayVarArr[i11];
                        if (ayVar != null) {
                            ayVar.a.requestLayout();
                        }
                        i11++;
                    }
                }
                break;
        }
    }
}
