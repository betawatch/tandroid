package yh;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class f0 extends ChatActivityEnterView {
    public final /* synthetic */ i0 s5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(i0 i0Var, Activity activity, e0 e0Var) {
        super(activity, e0Var, null, false, null);
        this.s5 = i0Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void e0(Menu menu) {
        sn.n8(menu, null, false, false, false, false);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void y0(float f7) {
        i0 i0Var = this.s5;
        i0Var.f.setInputBubbleHeight(f7);
        i0Var.r();
    }
}
