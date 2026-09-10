package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class zx extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ wy c;

    public /* synthetic */ zx(wy wyVar, float f7, int i10) {
        this.a = i10;
        this.c = wyVar;
        this.b = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                wy wyVar = this.c;
                wyVar.u3 = null;
                int i10 = 0;
                wyVar.O = false;
                wyVar.Q = true;
                wyVar.R = true;
                wyVar.fragmentView.invalidate();
                wyVar.x3 = -(AndroidUtilities.dp((wyVar.K ? 81 : 0) + 48) - this.b);
                wyVar.e0[0].setTranslationY(0.0f);
                while (true) {
                    vy[] vyVarArr = wyVar.e0;
                    if (i10 >= vyVarArr.length) {
                        wyVar.fragmentView.requestLayout();
                        my myVar = wyVar.X;
                        if (myVar != null && wyVar.b.f) {
                            myVar.r.requestFocus();
                            AndroidUtilities.showKeyboard(wyVar.X.r);
                            break;
                        }
                    } else {
                        vy vyVar = vyVarArr[i10];
                        if (vyVar != null) {
                            vyVar.a.requestLayout();
                        }
                        i10++;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                wy wyVar2 = this.c;
                wyVar2.u3 = null;
                wyVar2.P = 0;
                wyVar2.O = true;
                wyVar2.x3 = AndroidUtilities.dp((wyVar2.K ? 81 : 0) + 48) - this.b;
                wyVar2.e0[0].setTranslationY(0.0f);
                int i11 = 0;
                while (true) {
                    vy[] vyVarArr2 = wyVar2.e0;
                    if (i11 >= vyVarArr2.length) {
                        wyVar2.E0.l(1.0f, false);
                        wyVar2.fragmentView.requestLayout();
                        break;
                    } else {
                        vy vyVar2 = vyVarArr2[i11];
                        if (vyVar2 != null) {
                            vyVar2.a.requestLayout();
                        }
                        i11++;
                    }
                }
        }
    }
}
