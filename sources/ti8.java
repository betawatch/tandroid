// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class ti8 extends ImageView {
    public final byte a;
    public final /* synthetic */ vi8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ti8(vi8 vi8Var, Context context, int i, int i2) {
        super(context);
        this.b = vi8Var;
        this.a = i;
        setBackground(bkb.f0(1090519039, 1, -1));
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
        setMeasuredDimension(gl.L(40.0f), gl.L(40.0f));
    }
}
