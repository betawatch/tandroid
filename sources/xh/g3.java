package xh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f61;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class g3 extends f61 {
    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min((int) (AndroidUtilities.displaySize.y * 0.35f), View.MeasureSpec.getSize(i11)), View.MeasureSpec.getMode(i11)));
    }
}
