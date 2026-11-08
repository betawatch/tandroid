package zh;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.an;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class e0 extends ChatActivityEnterView {
    public final /* synthetic */ h0 t5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(h0 h0Var, Activity activity, d0 d0Var) {
        super(activity, d0Var, null, false, null);
        this.t5 = h0Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(float f10) {
        h0 h0Var = this.t5;
        h0Var.m1.setInputBubbleHeight(f10);
        h0Var.I0();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void e0(Menu menu) {
        an.A8(menu, null, false, false, false, false);
    }
}
