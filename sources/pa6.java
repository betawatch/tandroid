// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pa6 extends FrameLayout {
    public final int a;

    public pa6(Context context, int i, int i2) {
        super(context);
        this.a = i2;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setSize(i);
        addView(radialProgressView, qoe.e(-2, -2, 17));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.a, TLObject.FLAG_30));
    }

    public pa6(Context context) {
        this(context, gm.L(40.0f), gm.L(54.0f));
    }
}
