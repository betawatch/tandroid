package zh;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class f0 extends ChatActivityEnterView {
    public final /* synthetic */ i0 s5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(i0 i0Var, Activity activity, e0 e0Var) {
        super(activity, e0Var, null, false, null);
        this.s5 = i0Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void d0(Menu menu) {
        wn.t8(menu, null, false, false, false, false);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void x0(float f7) {
        i0 i0Var = this.s5;
        i0Var.f.setInputBubbleHeight(f7);
        i0Var.q();
    }
}
