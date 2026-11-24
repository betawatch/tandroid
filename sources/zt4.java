// default package

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class zt4 extends ChatActivityEnterView {
    public final /* synthetic */ du4 s7;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt4(du4 du4Var, Activity activity, yt4 yt4Var) {
        super(activity, yt4Var, null, false, null);
        this.s7 = du4Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void B0(Menu menu) {
        mu1.v6(menu, null, false, false, false, false);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void a1(float f) {
        du4 du4Var = this.s7;
        du4Var.p1.setInputBubbleHeight(f);
        du4Var.D0();
    }
}
