// default package

import android.view.View;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class wz8 extends LinearLayout {
    public boolean a;

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        sz8 sz8Var = null;
        if (this.a) {
            i3 = 0;
        } else {
            i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                if (getChildAt(i4) instanceof a09) {
                    sz8Var = ((a09) getChildAt(i4)).e;
                    if (sz8Var.getAdapter().b() == sz8Var.getChildCount()) {
                        int childCount = sz8Var.getChildCount();
                        for (int i5 = 0; i5 < childCount; i5++) {
                            sz8Var.getChildAt(i5).measure(View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), 0), i2);
                            if (sz8Var.getChildAt(i5).getMeasuredWidth() > i3) {
                                i3 = sz8Var.getChildAt(i5).getMeasuredWidth();
                            }
                        }
                        i3 += gl.L(16.0f);
                    }
                }
            }
        }
        int size = View.MeasureSpec.getSize(i);
        if (size < gl.L(240.0f)) {
            size = gl.L(240.0f);
        }
        if (size > gl.L(280.0f)) {
            size = gl.L(280.0f);
        }
        if (size < 0) {
            size = 0;
        }
        if (i3 == 0 || i3 >= size) {
            i3 = size;
        }
        if (sz8Var != null) {
            for (int i6 = 0; i6 < sz8Var.getChildCount(); i6++) {
                sz8Var.getChildAt(i6).measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), i2);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), i2);
    }
}
