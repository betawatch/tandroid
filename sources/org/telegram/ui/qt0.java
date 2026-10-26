package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class qt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.ln0 b;

    public /* synthetic */ qt0(org.telegram.ui.Components.ln0 ln0Var, int i10) {
        this.a = i10;
        this.b = ln0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.b.b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                ot0 ot0Var = photoViewer.T1;
                ot0Var.l0 = false;
                if (ot0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) ot0Var.o0.getLayoutParams()).topMargin = ot0Var.m0;
                    ot0Var.m0 = -1;
                    ot0Var.requestLayout();
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
                ot0 ot0Var = ((PhotoViewer) this.b.b).T1;
                Method method = ot0Var.f0;
                if (method != null) {
                    try {
                        method.invoke(ot0Var, null);
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
