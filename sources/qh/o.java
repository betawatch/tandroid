package qh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.t00;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class o extends i51 {
    public static final /* synthetic */ int a = 0;

    static {
        i51.setup(new o());
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, f6 f6Var) {
        t00 t00Var = new t00(context, null);
        t00Var.setViewType(16);
        t00Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return t00Var;
    }
}
