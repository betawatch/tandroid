package qh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.r61;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class k extends r61 {
    public final /* synthetic */ int f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m2 m2Var, j jVar, int i10) {
        super(m2Var, jVar, null, null);
        this.f3 = i10;
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i10));
        View.MeasureSpec.getSize(i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(w7.q.b(this.f3, 1, 5) * 48), TLObject.FLAG_30));
    }
}
