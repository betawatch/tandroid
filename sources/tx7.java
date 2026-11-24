// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tx7 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ux7 b;

    public /* synthetic */ tx7(ux7 ux7Var, byte b) {
        this.a = b;
        this.b = ux7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        byte b = this.a;
        ux7 ux7Var = this.b;
        switch (b) {
            case 0:
                by7 by7Var = ux7Var.d;
                if (!by7Var.Q) {
                    by7Var.b0 = 1.0f;
                    by7Var.h(1.0f);
                    break;
                }
                break;
            default:
                by7 by7Var2 = ux7Var.d;
                if (!by7Var2.Q) {
                    fd5 fd5Var = ux7Var.c;
                    if (fd5Var != null) {
                        fd5Var.run();
                    }
                    if (gda.q == 1 && by7Var2.y.getVisibility() != 0 && (editTextBoldCursor = by7Var2.r) != null) {
                        editTextBoldCursor.requestFocus();
                        gm.E3(by7Var2.r);
                        break;
                    }
                }
                break;
        }
    }
}
