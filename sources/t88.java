// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class t88 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u88 b;

    public /* synthetic */ t88(u88 u88Var, byte b) {
        this.a = b;
        this.b = u88Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        u88 u88Var = this.b;
        switch (b) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) u88Var.b;
                photoViewer.R1.getNextView().setText((CharSequence) null);
                r88 r88Var = photoViewer.U1;
                r88Var.l0 = false;
                if (r88Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) r88Var.o0.getLayoutParams()).topMargin = r88Var.m0;
                    r88Var.m0 = -1;
                    r88Var.requestLayout();
                    break;
                }
                break;
            default:
                ((PhotoViewer) u88Var.b).R1.setTranslationY(0.0f);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                r88 r88Var = ((PhotoViewer) this.b.b).U1;
                Method method = r88Var.f0;
                if (method != null) {
                    try {
                        method.invoke(r88Var, null);
                        break;
                    } catch (Exception e) {
                        fa4.g(e, true);
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
