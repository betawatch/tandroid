package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class xx extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ uy c;

    public /* synthetic */ xx(uy uyVar, float f7, int i10) {
        this.a = i10;
        this.c = uyVar;
        this.b = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                uy uyVar = this.c;
                uyVar.u3 = null;
                int i10 = 0;
                uyVar.O = false;
                uyVar.Q = true;
                uyVar.R = true;
                uyVar.fragmentView.invalidate();
                uyVar.x3 = -(AndroidUtilities.dp((uyVar.K ? 81 : 0) + 48) - this.b);
                uyVar.e0[0].setTranslationY(0.0f);
                while (true) {
                    ty[] tyVarArr = uyVar.e0;
                    if (i10 >= tyVarArr.length) {
                        uyVar.fragmentView.requestLayout();
                        ky kyVar = uyVar.X;
                        if (kyVar != null && uyVar.b.f) {
                            kyVar.r.requestFocus();
                            AndroidUtilities.showKeyboard(uyVar.X.r);
                            break;
                        }
                    } else {
                        ty tyVar = tyVarArr[i10];
                        if (tyVar != null) {
                            tyVar.a.requestLayout();
                        }
                        i10++;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                uy uyVar2 = this.c;
                uyVar2.u3 = null;
                uyVar2.P = 0;
                uyVar2.O = true;
                uyVar2.x3 = AndroidUtilities.dp((uyVar2.K ? 81 : 0) + 48) - this.b;
                uyVar2.e0[0].setTranslationY(0.0f);
                int i11 = 0;
                while (true) {
                    ty[] tyVarArr2 = uyVar2.e0;
                    if (i11 >= tyVarArr2.length) {
                        uyVar2.E0.l(1.0f, false);
                        uyVar2.fragmentView.requestLayout();
                        break;
                    } else {
                        ty tyVar2 = tyVarArr2[i11];
                        if (tyVar2 != null) {
                            tyVar2.a.requestLayout();
                        }
                        i11++;
                    }
                }
        }
    }
}
