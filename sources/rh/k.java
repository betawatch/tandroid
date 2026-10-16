package rh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.i71;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class k extends i71 {
    public final /* synthetic */ int d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m2 m2Var, j jVar, int i10) {
        super(m2Var, jVar, null, null);
        this.d3 = i10;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i10));
        View.MeasureSpec.getSize(i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(w7.r.b(this.d3, 1, 5) * 48), TLObject.FLAG_30));
    }
}
