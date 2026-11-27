// default package

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class q3b extends LinearLayout {
    public TextView a;
    public boolean b;

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View view;
        int measuredHeight;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
        if (!this.b || (view = (View) getParent()) == null || getMeasuredHeight() >= (measuredHeight = ((view.getMeasuredHeight() - view.getPaddingBottom()) - view.getPaddingTop()) - hl.L(24.0f))) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public void setIsLast(boolean z) {
        this.b = z;
        requestLayout();
    }
}
