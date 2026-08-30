package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class rx extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ oy c;

    public /* synthetic */ rx(oy oyVar, float f10, int i10) {
        this.a = i10;
        this.c = oyVar;
        this.b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                oy oyVar = this.c;
                oyVar.r3 = null;
                int i10 = 0;
                oyVar.L = false;
                oyVar.N = true;
                oyVar.O = true;
                oyVar.fragmentView.invalidate();
                oyVar.u3 = -(AndroidUtilities.dp((oyVar.H ? 81 : 0) + 48) - this.b);
                oyVar.b0[0].setTranslationY(0.0f);
                while (true) {
                    ny[] nyVarArr = oyVar.b0;
                    if (i10 >= nyVarArr.length) {
                        oyVar.fragmentView.requestLayout();
                        ey eyVar = oyVar.U;
                        if (eyVar != null && oyVar.b.f) {
                            eyVar.r.requestFocus();
                            AndroidUtilities.showKeyboard(oyVar.U.r);
                            break;
                        }
                    } else {
                        ny nyVar = nyVarArr[i10];
                        if (nyVar != null) {
                            nyVar.a.requestLayout();
                        }
                        i10++;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                oy oyVar2 = this.c;
                oyVar2.r3 = null;
                oyVar2.M = 0;
                oyVar2.L = true;
                oyVar2.u3 = AndroidUtilities.dp((oyVar2.H ? 81 : 0) + 48) - this.b;
                oyVar2.b0[0].setTranslationY(0.0f);
                int i11 = 0;
                while (true) {
                    ny[] nyVarArr2 = oyVar2.b0;
                    if (i11 >= nyVarArr2.length) {
                        oyVar2.B0.l(1.0f, false);
                        oyVar2.fragmentView.requestLayout();
                        break;
                    } else {
                        ny nyVar2 = nyVarArr2[i11];
                        if (nyVar2 != null) {
                            nyVar2.a.requestLayout();
                        }
                        i11++;
                    }
                }
        }
    }
}
