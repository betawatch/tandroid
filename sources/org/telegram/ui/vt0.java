package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class vt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.qm0 b;

    public /* synthetic */ vt0(org.telegram.ui.Components.qm0 qm0Var, int i10) {
        this.a = i10;
        this.b = qm0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.b.b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                tt0 tt0Var = photoViewer.T1;
                tt0Var.l0 = false;
                if (tt0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) tt0Var.o0.getLayoutParams()).topMargin = tt0Var.m0;
                    tt0Var.m0 = -1;
                    tt0Var.requestLayout();
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
                tt0 tt0Var = ((PhotoViewer) this.b.b).T1;
                Method method = tt0Var.f0;
                if (method != null) {
                    try {
                        method.invoke(tt0Var, null);
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
