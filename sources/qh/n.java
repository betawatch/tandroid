package qh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class n extends w51 {
    public static final /* synthetic */ int a = 0;

    static {
        w51.setup(new n());
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, d6 d6Var) {
        v00 v00Var = new v00(context, null);
        v00Var.setViewType(16);
        v00Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return v00Var;
    }
}
