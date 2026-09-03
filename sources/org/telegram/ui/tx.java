package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class tx extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ qy c;

    public /* synthetic */ tx(qy qyVar, float f10, int i10) {
        this.a = i10;
        this.c = qyVar;
        this.b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                qy qyVar = this.c;
                qyVar.r3 = null;
                int i10 = 0;
                qyVar.L = false;
                qyVar.N = true;
                qyVar.O = true;
                qyVar.fragmentView.invalidate();
                qyVar.u3 = -(AndroidUtilities.dp((qyVar.H ? 81 : 0) + 48) - this.b);
                qyVar.b0[0].setTranslationY(0.0f);
                while (true) {
                    py[] pyVarArr = qyVar.b0;
                    if (i10 >= pyVarArr.length) {
                        qyVar.fragmentView.requestLayout();
                        gy gyVar = qyVar.U;
                        if (gyVar != null && qyVar.b.f) {
                            gyVar.r.requestFocus();
                            AndroidUtilities.showKeyboard(qyVar.U.r);
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
                qyVar2.r3 = null;
                qyVar2.M = 0;
                qyVar2.L = true;
                qyVar2.u3 = AndroidUtilities.dp((qyVar2.H ? 81 : 0) + 48) - this.b;
                qyVar2.b0[0].setTranslationY(0.0f);
                int i11 = 0;
                while (true) {
                    py[] pyVarArr2 = qyVar2.b0;
                    if (i11 >= pyVarArr2.length) {
                        qyVar2.B0.l(1.0f, false);
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
