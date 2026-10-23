package w7;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.y90;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public abstract class d6 {
    public static y90 a(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        int i11 = org.telegram.ui.ActionBar.k6.gc;
        y90 y90Var = new y90(context, null);
        y90Var.setTextSize(1, f7);
        org.telegram.ui.ActionBar.r6.W(y90Var, i10, g6Var);
        org.telegram.ui.ActionBar.r6.I(y90Var, i11, g6Var);
        if (z10) {
            y90Var.setTypeface(AndroidUtilities.bold());
        }
        return y90Var;
    }

    public static TextView b(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        TextView textView = new TextView(context);
        textView.setTextSize(1, f7);
        org.telegram.ui.ActionBar.r6.W(textView, i10, g6Var);
        if (z10) {
            textView.setTypeface(AndroidUtilities.bold());
        }
        return textView;
    }
}
