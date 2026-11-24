// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class u07 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ u07(KeyEvent.Callback callback, boolean z, float f, byte b) {
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
                gt9 gt9Var = (gt9) callback;
                qmb qmbVar = gt9Var.e;
                gt9Var.i0 = null;
                gt9Var.j0 = z ? 1.0f : 0.0f;
                for (int i = 0; i < qmbVar.getChildCount(); i++) {
                    qmbVar.getChildAt(i).invalidate();
                }
                qmbVar.invalidate();
                gt9Var.p();
                if (!z) {
                    float childCount = gt9Var.l0 * qmbVar.getChildCount();
                    float scrollX = gt9Var.getScrollX();
                    float f = this.c;
                    float childCount2 = (scrollX + f) / (gt9Var.k0 * qmbVar.getChildCount());
                    float measuredWidth = (childCount - gt9Var.getMeasuredWidth()) / childCount;
                    if (childCount2 > measuredWidth) {
                        f = 0.0f;
                        childCount2 = measuredWidth;
                    }
                    float f2 = childCount * childCount2;
                    if (f2 - f < 0.0f) {
                        f2 = f;
                    }
                    gt9Var.m0 = (gt9Var.getScrollX() + f) - f2;
                    int i2 = (int) (f2 - f);
                    gt9Var.n0 = i2;
                    if (i2 < 0) {
                        gt9Var.n0 = 0;
                    }
                    for (int i3 = 0; i3 < qmbVar.getChildCount(); i3++) {
                        View childAt = qmbVar.getChildAt(i3);
                        if (childAt instanceof y1b) {
                            ((y1b) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = gm.L(33.0f);
                    }
                    gt9Var.h0 = false;
                    gt9Var.getLayoutParams().height = gm.L(36.0f);
                    qmbVar.requestLayout();
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
                v07 v07Var = ((w07) this.d).E;
                v07Var.setVisibility(0);
                if (this.b) {
                    float f = this.c;
                    v07Var.setScaleX(f);
                    v07Var.setScaleY(f);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
