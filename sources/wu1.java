// default package

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class wu1 extends LinearLayout {
    public final xu1[] a;

    public wu1(Context context) {
        super(context);
        this.a = new xu1[2];
    }

    public final void a(cr1 cr1Var, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = cr1Var;
            addView(cr1Var, layoutParams);
        }
    }

    public xu1[] getButtons() {
        return this.a;
    }
}
