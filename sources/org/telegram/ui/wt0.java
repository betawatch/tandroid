package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class wt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.fm0 b;

    public /* synthetic */ wt0(org.telegram.ui.Components.fm0 fm0Var, int i10) {
        this.a = i10;
        this.b = fm0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.b.b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                ut0 ut0Var = photoViewer.T1;
                ut0Var.l0 = false;
                if (ut0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) ut0Var.o0.getLayoutParams()).topMargin = ut0Var.m0;
                    ut0Var.m0 = -1;
                    ut0Var.requestLayout();
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
                ut0 ut0Var = ((PhotoViewer) this.b.b).T1;
                Method method = ut0Var.f0;
                if (method != null) {
                    try {
                        method.invoke(ut0Var, null);
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
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
