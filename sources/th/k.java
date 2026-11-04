package th;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new k());
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, e6 e6Var) {
        iz izVar = new iz(context, null);
        izVar.setViewType(16);
        izVar.setMinimumHeight(g0.L(48.0f));
        return izVar;
    }
}
