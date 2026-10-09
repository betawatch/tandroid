package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class wx extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ ty c;

    public /* synthetic */ wx(ty tyVar, float f7, int i10) {
        this.a = i10;
        this.c = tyVar;
        this.b = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                ty tyVar = this.c;
                tyVar.u3 = null;
                int i10 = 0;
                tyVar.O = false;
                tyVar.Q = true;
                tyVar.R = true;
                tyVar.fragmentView.invalidate();
                tyVar.x3 = -(AndroidUtilities.dp((tyVar.K ? 81 : 0) + 48) - this.b);
                tyVar.e0[0].setTranslationY(0.0f);
                while (true) {
                    sy[] syVarArr = tyVar.e0;
                    if (i10 >= syVarArr.length) {
                        tyVar.fragmentView.requestLayout();
                        jy jyVar = tyVar.X;
                        if (jyVar != null && tyVar.b.f) {
                            jyVar.r.requestFocus();
                            AndroidUtilities.showKeyboard(tyVar.X.r);
                            break;
                        }
                    } else {
                        sy syVar = syVarArr[i10];
                        if (syVar != null) {
                            syVar.a.requestLayout();
                        }
                        i10++;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                ty tyVar2 = this.c;
                tyVar2.u3 = null;
                tyVar2.P = 0;
                tyVar2.O = true;
                tyVar2.x3 = AndroidUtilities.dp((tyVar2.K ? 81 : 0) + 48) - this.b;
                tyVar2.e0[0].setTranslationY(0.0f);
                int i11 = 0;
                while (true) {
                    sy[] syVarArr2 = tyVar2.e0;
                    if (i11 >= syVarArr2.length) {
                        tyVar2.E0.l(1.0f, false);
                        tyVar2.fragmentView.requestLayout();
                        break;
                    } else {
                        sy syVar2 = syVarArr2[i11];
                        if (syVar2 != null) {
                            syVar2.a.requestLayout();
                        }
                        i11++;
                    }
                }
        }
    }
}
