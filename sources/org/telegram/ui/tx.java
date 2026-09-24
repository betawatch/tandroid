package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class tx extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ qy c;

    public /* synthetic */ tx(qy qyVar, float f7, int i10) {
        this.a = i10;
        this.c = qyVar;
        this.b = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                qy qyVar = this.c;
                qyVar.u3 = null;
                int i10 = 0;
                qyVar.O = false;
                qyVar.Q = true;
                qyVar.R = true;
                qyVar.fragmentView.invalidate();
                qyVar.x3 = -(AndroidUtilities.dp((qyVar.K ? 81 : 0) + 48) - this.b);
                qyVar.e0[0].setTranslationY(0.0f);
                while (true) {
                    py[] pyVarArr = qyVar.e0;
                    if (i10 >= pyVarArr.length) {
                        qyVar.fragmentView.requestLayout();
                        gy gyVar = qyVar.X;
                        if (gyVar != null && qyVar.b.f) {
                            gyVar.r.requestFocus();
                            AndroidUtilities.showKeyboard(qyVar.X.r);
                            break;
                        }
                    } else {
                        py pyVar = pyVarArr[i10];
                        if (pyVar != null) {
                            pyVar.a.requestLayout();
                        }
                        i10++;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                qy qyVar2 = this.c;
                qyVar2.u3 = null;
                qyVar2.P = 0;
                qyVar2.O = true;
                qyVar2.x3 = AndroidUtilities.dp((qyVar2.K ? 81 : 0) + 48) - this.b;
                qyVar2.e0[0].setTranslationY(0.0f);
                int i11 = 0;
                while (true) {
                    py[] pyVarArr2 = qyVar2.e0;
                    if (i11 >= pyVarArr2.length) {
                        qyVar2.E0.l(1.0f, false);
                        qyVar2.fragmentView.requestLayout();
                        break;
                    } else {
                        py pyVar2 = pyVarArr2[i11];
                        if (pyVar2 != null) {
                            pyVar2.a.requestLayout();
                        }
                        i11++;
                    }
                }
        }
    }
}
