// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class vk8 extends ImageView {
    public final byte a;
    public final /* synthetic */ yk8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vk8(yk8 yk8Var, Context context, int i, int i2) {
        super(context);
        this.b = yk8Var;
        this.a = i;
        setBackground(cmb.f0(1090519039, 1, -1));
        setScaleType(ImageView.ScaleType.CENTER);
        setImageResource(i2);
        setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        setOnClickListener(new hb(this, i, (byte) 5));
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(gm.L(40.0f), gm.L(40.0f));
    }
}
