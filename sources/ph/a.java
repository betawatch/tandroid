package ph;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.s71;
import org.telegram.ui.fx;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public abstract class a extends s71 {
    public a(Context context, int i10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, u6 u6Var) {
        super(context, i10, -1, false, callback2, callback5, null, u6Var, -1, 0);
        this.y2 = true;
        setOverScrollMode(2);
    }

    public final void O1(View view) {
        if (view == null) {
            return;
        }
        float dp = AndroidUtilities.dp(92.0f);
        float width = getWidth() - dp;
        float x9 = view.getX();
        float width2 = view.getWidth() + x9;
        int i10 = x9 < dp ? (int) (x9 - dp) : width2 > width ? (int) (width2 - width) : 0;
        if (i10 != 0) {
            AndroidUtilities.doOnLayout(this, new fx(this, view, i10, 22));
        }
    }
}
