// default package

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zy9 extends FrameLayout {
    public FrameLayout a;
    public rj b;
    public cj8 c;
    public String d;
    public ValueAnimator e;
    public float f;
    public Boolean h;
    public ValueAnimator n;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        setPadding(gm.L(5.0f), gm.L(8.0f), gm.L(5.0f), gm.L(8.0f));
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + gm.L(44.0f), TLObject.FLAG_30));
    }
}
