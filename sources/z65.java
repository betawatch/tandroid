// default package

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class z65 extends y95 {
    public final /* synthetic */ c75 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z65(c75 c75Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.h0 = c75Var;
    }

    @Override // y95
    public final void d(y95 y95Var) {
        h75 h75Var = this.h0.N;
        h75 h75Var2 = h75.s5;
        h75Var.A1(y95Var);
    }

    @Override // y95, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (gl.O1()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(420.0f), View.MeasureSpec.getSize(i)), TLObject.FLAG_30), i2);
        } else {
            super.onMeasure(i, i2);
        }
    }
}
