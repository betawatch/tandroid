package rh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.a71;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class k extends a71 {
    public final /* synthetic */ int d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n2 n2Var, j jVar, int i10) {
        super(n2Var, jVar, null, null);
        this.d3 = i10;
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i10));
        View.MeasureSpec.getSize(i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(w7.r.b(this.d3, 1, 5) * 48), TLObject.FLAG_30));
    }
}
