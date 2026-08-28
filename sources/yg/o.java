package yg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new o());
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        e00 e00Var = new e00(context, null);
        e00Var.setViewType(16);
        e00Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return e00Var;
    }
}
