// default package

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class y85 extends wb5 {
    public final /* synthetic */ b95 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y85(b95 b95Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.h0 = b95Var;
    }

    @Override // wb5
    public final void d(wb5 wb5Var) {
        g95 g95Var = this.h0.N;
        g95 g95Var2 = g95.s5;
        g95Var.A1(wb5Var);
    }

    @Override // wb5, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (gm.O1()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(420.0f), View.MeasureSpec.getSize(i)), TLObject.FLAG_30), i2);
        } else {
            super.onMeasure(i, i2);
        }
    }
}
