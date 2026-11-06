package zh;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.an;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class f0 extends ChatActivityEnterView {
    public final /* synthetic */ i0 t5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(i0 i0Var, Activity activity, e0 e0Var) {
        super(activity, e0Var, null, false, null);
        this.t5 = i0Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(float f10) {
        i0 i0Var = this.t5;
        i0Var.m1.setInputBubbleHeight(f10);
        i0Var.I0();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void e0(Menu menu) {
        an.A8(menu, null, false, false, false, false);
    }
}
