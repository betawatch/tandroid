package sh;

import android.view.View;
import c8.l9;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.Components.e51;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class j extends e51 {
    public final /* synthetic */ int n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h2 h2Var, i iVar, int i7) {
        super(h2Var, iVar, null, null);
        this.n3 = i7;
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        int min = Math.min(g0.L(220.0f), View.MeasureSpec.getSize(i7));
        View.MeasureSpec.getSize(i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g0.L(l9.b(this.n3, 1, 5) * 48), TLObject.FLAG_30));
    }
}
