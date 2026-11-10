package zh;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        h0Var.p1.setInputBubbleHeight(f10);
        h0Var.I0();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void e0(Menu menu) {
        cn.B8(menu, null, false, false, false, false);
    }
}
