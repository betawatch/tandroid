// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qv7 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rv7 b;

    public /* synthetic */ qv7(rv7 rv7Var, byte b) {
        this.a = b;
        this.b = rv7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        byte b = this.a;
        rv7 rv7Var = this.b;
        switch (b) {
            case 0:
                yv7 yv7Var = rv7Var.d;
                if (!yv7Var.Q) {
                    yv7Var.b0 = 1.0f;
                    yv7Var.h(1.0f);
                    break;
                }
                break;
            default:
                yv7 yv7Var2 = rv7Var.d;
                if (!yv7Var2.Q) {
                    hb5 hb5Var = rv7Var.c;
                    if (hb5Var != null) {
                        hb5Var.run();
                    }
                    if (gba.q == 1 && yv7Var2.y.getVisibility() != 0 && (editTextBoldCursor = yv7Var2.r) != null) {
                        editTextBoldCursor.requestFocus();
                        gl.F3(yv7Var2.r);
                        break;
                    }
                }
                break;
        }
    }
}
