package xh;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class i0 extends ChatActivityEnterView {
    public final /* synthetic */ l0 o5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(l0 l0Var, Activity activity, h0 h0Var) {
        super(activity, h0Var, null, false, null);
        this.o5 = l0Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void f0(Menu menu) {
        zn.n8(menu, null, false, false, false, false);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void y0(float f7) {
        l0 l0Var = this.o5;
        l0Var.f.setInputBubbleHeight(f7);
        l0Var.q();
    }
}
