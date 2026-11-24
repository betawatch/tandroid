// default package

import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ze implements View.OnClickListener {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ int[] c;

    public /* synthetic */ ze(LinearLayout linearLayout, int[] iArr) {
        this.b = linearLayout;
        this.c = iArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        int[] iArr = this.c;
        LinearLayout linearLayout = this.b;
        switch (b) {
            case 0:
                iArr[0] = ((Integer) view.getTag()).intValue();
                int childCount = linearLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = linearLayout.getChildAt(i);
                    if (childAt instanceof wy8) {
                        ((wy8) childAt).c.a(childAt == view, true);
                    }
                }
                break;
            default:
                int childCount2 = linearLayout.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    wy8 wy8Var = (wy8) linearLayout.getChildAt(i2);
                    wy8Var.c.a(wy8Var == view, true);
                }
                iArr[0] = chb.f[((Integer) view.getTag()).intValue()];
                break;
        }
    }

    public /* synthetic */ ze(int[] iArr, LinearLayout linearLayout) {
        this.c = iArr;
        this.b = linearLayout;
    }
}
