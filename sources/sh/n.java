package sh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.s61;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class n extends s61 {
    public static final /* synthetic */ int a = 0;

    static {
        s61.setup(new n());
    }

    @Override // org.telegram.ui.Components.s61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        c10 c10Var = new c10(context, null);
        c10Var.setViewType(16);
        c10Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return c10Var;
    }
}
