package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class wp0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.sk0 b;

    public /* synthetic */ wp0(org.telegram.ui.Components.sk0 sk0Var, int i7) {
        this.a = i7;
        this.b = sk0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.b.b;
                photoViewer.R1.getNextView().setText((CharSequence) null);
                up0 up0Var = photoViewer.U1;
                up0Var.m0 = false;
                if (up0Var.n0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) up0Var.p0.getLayoutParams()).topMargin = up0Var.n0;
                    up0Var.n0 = -1;
                    up0Var.requestLayout();
                    break;
                }
                break;
            default:
                ((PhotoViewer) this.b.b).R1.setTranslationY(0.0f);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                up0 up0Var = ((PhotoViewer) this.b.b).U1;
                Method method = up0Var.g0;
                if (method != null) {
                    try {
                        method.invoke(up0Var, null);
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
