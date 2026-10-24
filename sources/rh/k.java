package rh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.j71;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class k extends j71 {
    public final /* synthetic */ int g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o2 o2Var, j jVar, int i10) {
        super(o2Var, jVar, null, null);
        this.g3 = i10;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i10));
        View.MeasureSpec.getSize(i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(w7.r.b(this.g3, 1, 5) * 48), TLObject.FLAG_30));
    }
}
