package vh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d4 extends ImageView {
    public final int a;
    public final /* synthetic */ f4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(f4 f4Var, Context context, int i10, int i11) {
        super(context);
        this.b = f4Var;
        this.a = i10;
        setBackground(org.telegram.ui.ActionBar.t6.h0(1090519039, 1, -1));
        setScaleType(ImageView.ScaleType.CENTER);
        setImageResource(i11);
        setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        setOnClickListener(new rh.r0(this, i10, 2));
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(40.0f));
    }
}
