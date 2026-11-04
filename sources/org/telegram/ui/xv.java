package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xv extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ uw c;

    public /* synthetic */ xv(uw uwVar, float f10, int i3) {
        this.a = i3;
        this.c = uwVar;
        this.b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                uw uwVar = this.c;
                uwVar.w3 = null;
                int i3 = 0;
                uwVar.P = false;
                uwVar.R = true;
                uwVar.S = true;
                uwVar.fragmentView.invalidate();
                uwVar.z3 = -(org.telegram.messenger.g0.L((uwVar.L ? 81 : 0) + 48) - this.b);
                uwVar.f0[0].setTranslationY(0.0f);
                while (true) {
                    tw[] twVarArr = uwVar.f0;
                    if (i3 >= twVarArr.length) {
                        uwVar.fragmentView.requestLayout();
                        iw iwVar = uwVar.Y;
                        if (iwVar != null && uwVar.b.f) {
                            iwVar.r.requestFocus();
                            org.telegram.messenger.g0.K3(uwVar.Y.r);
                            break;
                        }
                    } else {
                        tw twVar = twVarArr[i3];
                        if (twVar != null) {
                            twVar.a.requestLayout();
                        }
                        i3++;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                uw uwVar2 = this.c;
                uwVar2.w3 = null;
                uwVar2.Q = 0;
                uwVar2.P = true;
                uwVar2.z3 = org.telegram.messenger.g0.L((uwVar2.L ? 81 : 0) + 48) - this.b;
                uwVar2.f0[0].setTranslationY(0.0f);
                int i10 = 0;
                while (true) {
                    tw[] twVarArr2 = uwVar2.f0;
                    if (i10 >= twVarArr2.length) {
                        uwVar2.F0.l(false, 1.0f);
                        uwVar2.fragmentView.requestLayout();
                        break;
                    } else {
                        tw twVar2 = twVarArr2[i10];
                        if (twVar2 != null) {
                            twVar2.a.requestLayout();
                        }
                        i10++;
                    }
                }
        }
    }
}
