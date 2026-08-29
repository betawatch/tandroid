package yg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.u51;
import org.telegram.ui.ll0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class a extends u51 {
    public a(Context context, int i10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, c6 c6Var) {
        super(context, i10, -1, false, callback2, callback5, null, c6Var, -1, 0);
        this.v2 = true;
        setOverScrollMode(2);
    }

    public final void I1(View view) {
        if (view == null) {
            return;
        }
        float dp = AndroidUtilities.dp(92.0f);
        float width = getWidth() - dp;
        float x4 = view.getX();
        float width2 = view.getWidth() + x4;
        int i10 = x4 < dp ? (int) (x4 - dp) : width2 > width ? (int) (width2 - width) : 0;
        if (i10 != 0) {
            AndroidUtilities.doOnLayout(this, new ll0(this, view, i10, 18));
        }
    }
}
