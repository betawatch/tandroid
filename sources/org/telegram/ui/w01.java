package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class w01 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.sl0 b;

    public /* synthetic */ w01(org.telegram.ui.Components.sl0 sl0Var, int i10) {
        this.a = i10;
        this.b = sl0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b.b;
                secretMediaViewer.X.getNextView().setText((CharSequence) null);
                dr0 dr0Var = secretMediaViewer.Y;
                dr0Var.l0 = false;
                if (dr0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) dr0Var.o0.getLayoutParams()).topMargin = dr0Var.m0;
                    dr0Var.m0 = -1;
                    dr0Var.requestLayout();
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
                dr0 dr0Var = ((SecretMediaViewer) this.b.b).Y;
                Method method = dr0Var.f0;
                if (method != null) {
                    try {
                        method.invoke(dr0Var, null);
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
