package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class zp0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.ok0 b;

    public /* synthetic */ zp0(org.telegram.ui.Components.ok0 ok0Var, int i7) {
        this.a = i7;
        this.b = ok0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.b.b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                xp0 xp0Var = photoViewer.T1;
                xp0Var.l0 = false;
                if (xp0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) xp0Var.o0.getLayoutParams()).topMargin = xp0Var.m0;
                    xp0Var.m0 = -1;
                    xp0Var.requestLayout();
                    break;
                }
                break;
            default:
                ((PhotoViewer) this.b.b).Q1.setTranslationY(0.0f);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                xp0 xp0Var = ((PhotoViewer) this.b.b).T1;
                Method method = xp0Var.f0;
                if (method != null) {
                    try {
                        method.invoke(xp0Var, null);
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
