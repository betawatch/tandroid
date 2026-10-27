package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class v31 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.mn0 b;

    public /* synthetic */ v31(org.telegram.ui.Components.mn0 mn0Var, int i10) {
        this.a = i10;
        this.b = mn0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b.b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                qt0 qt0Var = secretMediaViewer.a0;
                qt0Var.l0 = false;
                if (qt0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) qt0Var.o0.getLayoutParams()).topMargin = qt0Var.m0;
                    qt0Var.m0 = -1;
                    qt0Var.requestLayout();
                    break;
                }
                break;
            default:
                ((SecretMediaViewer) this.b.b).Z.setTranslationY(0.0f);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                qt0 qt0Var = ((SecretMediaViewer) this.b.b).a0;
                Method method = qt0Var.f0;
                if (method != null) {
                    try {
                        method.invoke(qt0Var, null);
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
