// default package

import android.animation.ValueAnimator;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ty7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fz7 b;

    public /* synthetic */ ty7(fz7 fz7Var, byte b) {
        this.a = b;
        this.b = fz7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        fz7 fz7Var = this.b;
        switch (b) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = fz7Var.r;
                if (!fz7Var.Q && fz7Var.isAttachedToWindow() && fz7Var.y.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    hl.E3(editTextBoldCursor);
                    break;
                }
                break;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fz7Var.b0, 0.0f);
                fz7Var.T = ofFloat;
                ofFloat.addUpdateListener(new uy7(fz7Var, (byte) 0));
                ofFloat.addListener(new ad5(fz7Var, (byte) 23));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(k43.h);
                ofFloat.start();
                break;
        }
    }
}
