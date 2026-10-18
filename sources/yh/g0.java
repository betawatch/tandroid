package yh;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class g0 extends ChatActivityEnterView {
    public final /* synthetic */ j0 o5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(j0 j0Var, Activity activity, f0 f0Var) {
        super(activity, f0Var, null, false, null);
        this.o5 = j0Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void f0(Menu menu) {
        sn.n8(menu, null, false, false, false, false);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void y0(float f7) {
        j0 j0Var = this.o5;
        j0Var.f.setInputBubbleHeight(f7);
        j0Var.p();
    }
}
