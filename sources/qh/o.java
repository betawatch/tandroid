package qh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.j10;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.qm0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class o extends o61 {
    public static final /* synthetic */ int a = 0;

    static {
        o61.setup(new o());
    }

    @Override // org.telegram.ui.Components.o61
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, e6 e6Var) {
        j10 j10Var = new j10(context, null);
        j10Var.setViewType(16);
        j10Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return j10Var;
    }
}
