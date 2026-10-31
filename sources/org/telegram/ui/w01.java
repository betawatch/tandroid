package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w01 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.rl0 b;

    public /* synthetic */ w01(org.telegram.ui.Components.rl0 rl0Var, int i10) {
        this.a = i10;
        this.b = rl0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b.b;
                secretMediaViewer.X.getNextView().setText((CharSequence) null);
                fr0 fr0Var = secretMediaViewer.Y;
                fr0Var.l0 = false;
                if (fr0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) fr0Var.o0.getLayoutParams()).topMargin = fr0Var.m0;
                    fr0Var.m0 = -1;
                    fr0Var.requestLayout();
                    break;
                }
                break;
            default:
                ((SecretMediaViewer) this.b.b).X.setTranslationY(0.0f);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                fr0 fr0Var = ((SecretMediaViewer) this.b.b).Y;
                Method method = fr0Var.f0;
                if (method != null) {
                    try {
                        method.invoke(fr0Var, null);
                        break;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        return;
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
