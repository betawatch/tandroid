package ph;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h0 extends ChatActivityEnterView {
    public final /* synthetic */ k0 t5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(k0 k0Var, Activity activity, g0 g0Var) {
        super(activity, g0Var, null, false, null);
        this.t5 = k0Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void d0(Menu menu) {
        un.t8(menu, null, false, false, false, false);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void y0(float f7) {
        k0 k0Var = this.t5;
        k0Var.m1.setInputBubbleHeight(f7);
        k0Var.I0();
    }
}
