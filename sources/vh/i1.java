package vh;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i1 extends FrameLayout {
    public org.telegram.ui.Components.g9 a;
    public int b;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.max(org.telegram.messenger.i0.L(170.0f), (org.telegram.messenger.i0.q.y * 0.34999996f) - org.telegram.messenger.i0.L(142.0f)), TLObject.FLAG_30));
    }
}
