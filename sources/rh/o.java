package rh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.t00;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class o extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new o());
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, f6 f6Var) {
        t00 t00Var = new t00(context, null);
        t00Var.setViewType(16);
        t00Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return t00Var;
    }
}
