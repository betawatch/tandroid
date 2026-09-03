package qh;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class l7 extends LinearLayout {
    public final TextView a;
    public final TextView b;

    public l7(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.k6.j5, g6Var, textView, 1, 20.0f);
        addView(textView, k7.c6.t(-1, -2, 55, 27, 16, 27, z4 ? 4 : 13));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.q5, g6Var, textView2, 1, 14.0f);
        if (z4) {
            addView(textView2, k7.c6.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
