package rh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.im0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class n extends e61 {
    public static final /* synthetic */ int a = 0;

    static {
        e61.setup(new n());
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        b10 b10Var = new b10(context, null);
        b10Var.setViewType(16);
        b10Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return b10Var;
    }
}
