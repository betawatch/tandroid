package qh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class n extends g61 {
    public static final /* synthetic */ int a = 0;

    static {
        g61.setup(new n());
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        w00 w00Var = new w00(context, null);
        w00Var.setViewType(16);
        w00Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return w00Var;
    }
}
