package yh;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.fo;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class h0 extends ChatActivityEnterView {
    public final /* synthetic */ k0 o5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(k0 k0Var, Activity activity, g0 g0Var) {
        super(activity, g0Var, null, false, null);
        this.o5 = k0Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void f0(Menu menu) {
        fo.n8(menu, null, false, false, false, false);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void y0(float f7) {
        k0 k0Var = this.o5;
        k0Var.f.setInputBubbleHeight(f7);
        k0Var.q();
    }
}
