// default package

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xw9 extends FrameLayout {
    public FrameLayout a;
    public ri b;
    public ah8 c;
    public String d;
    public ValueAnimator e;
    public float f;
    public Boolean h;
    public ValueAnimator n;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        setPadding(gl.L(5.0f), gl.L(8.0f), gl.L(5.0f), gl.L(8.0f));
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + gl.L(44.0f), TLObject.FLAG_30));
    }
}
