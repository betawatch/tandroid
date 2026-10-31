package vh;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f6 extends LinearLayout {
    public final TextView a;
    public final TextView b;

    public f6(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.j5, p6Var, 1, 20.0f);
        addView(textView, w7.b6.t(-1, -2, 55, 27, 16, 27, z10 ? 4 : 13));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.q5, p6Var);
        textView2.setTextSize(1, 14.0f);
        if (z10) {
            addView(textView2, w7.b6.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
