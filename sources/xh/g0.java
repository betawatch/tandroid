package xh;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class g0 extends ChatActivityEnterView {
    public final /* synthetic */ j0 o5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(j0 j0Var, Activity activity, f0 f0Var) {
        super(activity, f0Var, null, false, null);
        this.o5 = j0Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(float f7) {
        j0 j0Var = this.o5;
        j0Var.f.setInputBubbleHeight(f7);
        j0Var.o();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void h0(Menu menu) {
        zn.k8(menu, null, false, false, false, false);
    }
}
