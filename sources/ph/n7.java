package ph;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class n7 extends LinearLayout {
    public final TextView a;
    public final TextView b;

    public n7(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.j6.j5, f6Var, textView, 1, 20.0f);
        addView(textView, k7.b6.t(-1, -2, 55, 27, 16, 27, z4 ? 4 : 13));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.q5, f6Var, textView2, 1, 14.0f);
        if (z4) {
            addView(textView2, k7.b6.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
