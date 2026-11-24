// default package

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
