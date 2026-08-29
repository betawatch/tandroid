package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zs0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.cm0 b;

    public /* synthetic */ zs0(org.telegram.ui.Components.cm0 cm0Var, int i10) {
        this.a = i10;
        this.b = cm0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.b.b;
                photoViewer.M1.getNextView().setText((CharSequence) null);
                xs0 xs0Var = photoViewer.P1;
                xs0Var.h0 = false;
                if (xs0Var.i0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) xs0Var.k0.getLayoutParams()).topMargin = xs0Var.i0;
                    xs0Var.i0 = -1;
                    xs0Var.requestLayout();
                    break;
                }
                break;
            default:
                ((PhotoViewer) this.b.b).M1.setTranslationY(0.0f);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                xs0 xs0Var = ((PhotoViewer) this.b.b).P1;
                Method method = xs0Var.b0;
                if (method != null) {
                    try {
                        method.invoke(xs0Var, null);
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
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
