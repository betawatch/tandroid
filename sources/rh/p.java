package rh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class p extends k61 {
    public static final /* synthetic */ int a = 0;

    static {
        k61.setup(new p());
    }

    @Override // org.telegram.ui.Components.k61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        f10 f10Var = new f10(context, null);
        f10Var.setViewType(16);
        f10Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return f10Var;
    }
}
