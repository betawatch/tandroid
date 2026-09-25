package qh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class n extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new n());
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, d6 d6Var) {
        u00 u00Var = new u00(context, null);
        u00Var.setViewType(16);
        u00Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return u00Var;
    }
}
