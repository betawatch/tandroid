// default package

import android.animation.ValueAnimator;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ox7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ by7 b;

    public /* synthetic */ ox7(by7 by7Var, byte b) {
        this.a = b;
        this.b = by7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        by7 by7Var = this.b;
        switch (b) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = by7Var.r;
                if (!by7Var.Q && by7Var.isAttachedToWindow() && by7Var.y.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    gm.E3(editTextBoldCursor);
                    break;
                }
                break;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(by7Var.b0, 0.0f);
                by7Var.T = ofFloat;
                ofFloat.addUpdateListener(new px7(by7Var, (byte) 1));
                ofFloat.addListener(new v85(by7Var, (byte) 26));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(d53.h);
                ofFloat.start();
                break;
        }
    }
}
