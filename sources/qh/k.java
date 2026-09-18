package qh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.f61;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class k extends f61 {
    public final /* synthetic */ int f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o2 o2Var, j jVar, int i10) {
        super(o2Var, jVar, null, null);
        this.f3 = i10;
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i10));
        View.MeasureSpec.getSize(i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(w7.p.b(this.f3, 1, 5) * 48), TLObject.FLAG_30));
    }
}
