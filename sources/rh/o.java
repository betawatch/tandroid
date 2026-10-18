package rh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.im0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class o extends e61 {
    public static final /* synthetic */ int a = 0;

    static {
        e61.setup(new o());
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        b10 b10Var = new b10(context, null);
        b10Var.setViewType(16);
        b10Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return b10Var;
    }
}
