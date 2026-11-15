package sh;

import android.view.View;
import c8.i9;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Components.u41;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i extends u41 {
    public final /* synthetic */ int n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e2 e2Var, h hVar, int i7) {
        super(e2Var, hVar, null, null);
        this.n3 = i7;
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        int min = Math.min(g0.L(220.0f), View.MeasureSpec.getSize(i7));
        View.MeasureSpec.getSize(i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g0.L(i9.b(this.n3, 1, 5) * 48), TLObject.FLAG_30));
    }
}
