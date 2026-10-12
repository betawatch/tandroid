package rh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.h71;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class l extends h71 {
    public final /* synthetic */ int d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m2 m2Var, k kVar, int i10) {
        super(m2Var, kVar, null, null);
        this.d3 = i10;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i10));
        View.MeasureSpec.getSize(i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(w7.s.b(this.d3, 1, 5) * 48), TLObject.FLAG_30));
    }
}
