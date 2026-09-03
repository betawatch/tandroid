package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class sx extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ py c;

    public /* synthetic */ sx(py pyVar, float f10, int i10) {
        this.a = i10;
        this.c = pyVar;
        this.b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                py pyVar = this.c;
                pyVar.r3 = null;
                int i10 = 0;
                pyVar.L = false;
                pyVar.N = true;
                pyVar.O = true;
                pyVar.fragmentView.invalidate();
                pyVar.u3 = -(AndroidUtilities.dp((pyVar.H ? 81 : 0) + 48) - this.b);
                pyVar.b0[0].setTranslationY(0.0f);
                while (true) {
                    oy[] oyVarArr = pyVar.b0;
                    if (i10 >= oyVarArr.length) {
                        pyVar.fragmentView.requestLayout();
                        fy fyVar = pyVar.U;
                        if (fyVar != null && pyVar.b.f) {
                            fyVar.r.requestFocus();
                            AndroidUtilities.showKeyboard(pyVar.U.r);
                            break;
                        }
                    } else {
                        oy oyVar = oyVarArr[i10];
                        if (oyVar != null) {
                            oyVar.a.requestLayout();
                        }
                        i10++;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                py pyVar2 = this.c;
                pyVar2.r3 = null;
                pyVar2.M = 0;
                pyVar2.L = true;
                pyVar2.u3 = AndroidUtilities.dp((pyVar2.H ? 81 : 0) + 48) - this.b;
                pyVar2.b0[0].setTranslationY(0.0f);
                int i11 = 0;
                while (true) {
                    oy[] oyVarArr2 = pyVar2.b0;
                    if (i11 >= oyVarArr2.length) {
                        pyVar2.B0.l(1.0f, false);
                        pyVar2.fragmentView.requestLayout();
                        break;
                    } else {
                        oy oyVar2 = oyVarArr2[i11];
                        if (oyVar2 != null) {
                            oyVar2.a.requestLayout();
                        }
                        i11++;
                    }
                }
        }
    }
}
