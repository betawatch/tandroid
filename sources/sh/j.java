package sh;

import android.view.View;
import c8.j9;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.r41;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class j extends r41 {
    public final /* synthetic */ int m3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f2 f2Var, i iVar, int i7) {
        super(f2Var, iVar, null, null);
        this.m3 = i7;
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        int min = Math.min(g0.L(220.0f), View.MeasureSpec.getSize(i7));
        View.MeasureSpec.getSize(i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g0.L(j9.b(this.m3, 1, 5) * 48), TLObject.FLAG_30));
    }
}
