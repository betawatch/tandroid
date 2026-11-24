// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class q86 extends FrameLayout {
    public final int a;

    public q86(Context context, int i, int i2) {
        super(context);
        this.a = i2;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setSize(i);
        addView(radialProgressView, nme.e(-2, -2, 17));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.a, TLObject.FLAG_30));
    }

    public q86(Context context) {
        this(context, gl.L(40.0f), gl.L(54.0f));
    }
}
