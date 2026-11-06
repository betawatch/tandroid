package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class xp0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.nk0 b;

    public /* synthetic */ xp0(org.telegram.ui.Components.nk0 nk0Var, int i7) {
        this.a = i7;
        this.b = nk0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.b.b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                vp0 vp0Var = photoViewer.T1;
                vp0Var.l0 = false;
                if (vp0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) vp0Var.o0.getLayoutParams()).topMargin = vp0Var.m0;
                    vp0Var.m0 = -1;
                    vp0Var.requestLayout();
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
                vp0 vp0Var = ((PhotoViewer) this.b.b).T1;
                Method method = vp0Var.f0;
                if (method != null) {
                    try {
                        method.invoke(vp0Var, null);
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
