package sh;

import android.view.View;
import c8.l9;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.h51;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class i extends h51 {
    public final /* synthetic */ int n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g2 g2Var, h hVar, int i7) {
        super(g2Var, hVar, null, null);
        this.n3 = i7;
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        int min = Math.min(g0.L(220.0f), View.MeasureSpec.getSize(i7));
        View.MeasureSpec.getSize(i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g0.L(l9.b(this.n3, 1, 5) * 48), TLObject.FLAG_30));
    }
}
