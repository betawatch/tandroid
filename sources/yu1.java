// default package

import android.app.Activity;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class yu1 extends ema {
    public boolean N0;
    public final /* synthetic */ zu1 O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu1(zu1 zu1Var, Activity activity) {
        super(activity);
        this.O0 = zu1Var;
        this.N0 = true;
    }

    @Override // ema
    public final void d(int i) {
        super.d(i);
        if (this.N0 && getVisibility() == 0) {
            int L = hl.L(4.0f) + getTextWidth();
            zu1 zu1Var = this.O0;
            zu1Var.V2 = L;
            NumberTextView numberTextView = zu1Var.U2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(L);
            }
        }
    }
}
