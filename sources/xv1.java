// default package

import android.app.Activity;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xv1 extends lka {
    public boolean N0;
    public final /* synthetic */ yv1 O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv1(yv1 yv1Var, Activity activity) {
        super(activity);
        this.O0 = yv1Var;
        this.N0 = true;
    }

    @Override // lka
    public final void d(int i) {
        super.d(i);
        if (this.N0 && getVisibility() == 0) {
            int L = gm.L(4.0f) + getTextWidth();
            yv1 yv1Var = this.O0;
            yv1Var.V2 = L;
            NumberTextView numberTextView = yv1Var.U2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(L);
            }
        }
    }
}
