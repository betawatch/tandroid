// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class xy7 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yy7 b;

    public /* synthetic */ xy7(yy7 yy7Var, byte b) {
        this.a = b;
        this.b = yy7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        byte b = this.a;
        yy7 yy7Var = this.b;
        switch (b) {
            case 0:
                fz7 fz7Var = yy7Var.d;
                if (!fz7Var.Q) {
                    fz7Var.b0 = 1.0f;
                    fz7Var.h(1.0f);
                    break;
                }
                break;
            default:
                fz7 fz7Var2 = yy7Var.d;
                if (!fz7Var2.Q) {
                    tg5 tg5Var = yy7Var.c;
                    if (tg5Var != null) {
                        tg5Var.run();
                    }
                    if (xea.q == 1 && fz7Var2.y.getVisibility() != 0 && (editTextBoldCursor = fz7Var2.r) != null) {
                        editTextBoldCursor.requestFocus();
                        hl.E3(fz7Var2.r);
                        break;
                    }
                }
                break;
        }
    }
}
