// default package

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class zs5 extends vac {
    public final TextView c0;
    public final TextView d0;

    public zs5(Context context) {
        super(context, 6, 0, true);
        LinearLayout j = uh9.j(context, 1);
        TextView textView = new TextView(context);
        this.c0 = textView;
        qd4.w(textView, aob.G6, null, 1, 16.0f);
        j.addView(textView, tre.r(-2, -2, 5));
        TextView textView2 = new TextView(context);
        this.d0 = textView2;
        yob.X(textView2, aob.z6, null);
        textView2.setTextSize(1, 13.0f);
        j.addView(textView2, tre.t(-2, -2, 5, 0, 1, 0, 0));
        addView(j, tre.d(-2, -2.0f, (ob6.a0 ? 3 : 5) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
    }
}
