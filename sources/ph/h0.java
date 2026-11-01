package ph;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.un;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
        un.x8(menu, null, false, false, false, false);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void y0(float f7) {
        k0 k0Var = this.t5;
        k0Var.m1.setInputBubbleHeight(f7);
        k0Var.I0();
    }
}
