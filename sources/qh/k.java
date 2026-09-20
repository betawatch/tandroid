package qh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.s61;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class k extends s61 {
    public final /* synthetic */ int f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n2 n2Var, j jVar, int i10) {
        super(n2Var, jVar, null, null);
        this.f3 = i10;
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i10));
        View.MeasureSpec.getSize(i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(w7.q.b(this.f3, 1, 5) * 48), TLObject.FLAG_30));
    }
}
