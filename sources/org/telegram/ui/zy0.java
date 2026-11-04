package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zy0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.rk0 b;

    public /* synthetic */ zy0(org.telegram.ui.Components.rk0 rk0Var, int i3) {
        this.a = i3;
        this.b = rk0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b.b;
                secretMediaViewer.Y.getNextView().setText((CharSequence) null);
                mp0 mp0Var = secretMediaViewer.Z;
                mp0Var.m0 = false;
                if (mp0Var.n0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) mp0Var.p0.getLayoutParams()).topMargin = mp0Var.n0;
                    mp0Var.n0 = -1;
                    mp0Var.requestLayout();
                    break;
                }
                break;
            default:
                ((SecretMediaViewer) this.b.b).Y.setTranslationY(0.0f);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                mp0 mp0Var = ((SecretMediaViewer) this.b.b).Z;
                Method method = mp0Var.g0;
                if (method != null) {
                    try {
                        method.invoke(mp0Var, null);
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
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
