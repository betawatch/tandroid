package sh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class n extends t61 {
    public static final /* synthetic */ int a = 0;

    static {
        t61.setup(new n());
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        c10 c10Var = new c10(context, null);
        c10Var.setViewType(16);
        c10Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return c10Var;
    }
}
