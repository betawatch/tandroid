// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class uy6 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ uy6(KeyEvent.Callback callback, boolean z, float f, byte b) {
        this.a = b;
        this.d = callback;
        this.b = z;
        this.c = f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        boolean z = this.b;
        KeyEvent.Callback callback = this.d;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                if (!z) {
                    super/*android.app.Dialog*/.dismiss();
                    break;
                }
                break;
            default:
                er9 er9Var = (er9) callback;
                pkb pkbVar = er9Var.e;
                er9Var.i0 = null;
                er9Var.j0 = z ? 1.0f : 0.0f;
                for (int i = 0; i < pkbVar.getChildCount(); i++) {
                    pkbVar.getChildAt(i).invalidate();
                }
                pkbVar.invalidate();
                er9Var.p();
                if (!z) {
                    float childCount = er9Var.l0 * pkbVar.getChildCount();
                    float scrollX = er9Var.getScrollX();
                    float f = this.c;
                    float childCount2 = (scrollX + f) / (er9Var.k0 * pkbVar.getChildCount());
                    float measuredWidth = (childCount - er9Var.getMeasuredWidth()) / childCount;
                    if (childCount2 > measuredWidth) {
                        f = 0.0f;
                        childCount2 = measuredWidth;
                    }
                    float f2 = childCount * childCount2;
                    if (f2 - f < 0.0f) {
                        f2 = f;
                    }
                    er9Var.m0 = (er9Var.getScrollX() + f) - f2;
                    int i2 = (int) (f2 - f);
                    er9Var.n0 = i2;
                    if (i2 < 0) {
                        er9Var.n0 = 0;
                    }
                    for (int i3 = 0; i3 < pkbVar.getChildCount(); i3++) {
                        View childAt = pkbVar.getChildAt(i3);
                        if (childAt instanceof xza) {
                            ((xza) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = gl.L(33.0f);
                    }
                    er9Var.h0 = false;
                    er9Var.getLayoutParams().height = gl.L(36.0f);
                    pkbVar.requestLayout();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationStart(animator);
                vy6 vy6Var = ((wy6) this.d).E;
                vy6Var.setVisibility(0);
                if (this.b) {
                    float f = this.c;
                    vy6Var.setScaleX(f);
                    vy6Var.setScaleY(f);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
