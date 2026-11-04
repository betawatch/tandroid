package th;

import android.view.View;
import b8.be;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.l41;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i extends l41 {
    public final /* synthetic */ int n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d2 d2Var, h hVar, int i3) {
        super(d2Var, hVar, null, null);
        this.n3 = i3;
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i3, int i10) {
        int min = Math.min(g0.L(220.0f), View.MeasureSpec.getSize(i3));
        View.MeasureSpec.getSize(i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g0.L(be.b(this.n3, 1, 5) * 48), TLObject.FLAG_30));
    }
}
