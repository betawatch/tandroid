package yg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.i51;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k extends i51 {
    public final /* synthetic */ int b3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o2 o2Var, j jVar, int i9) {
        super(o2Var, jVar, null, null);
        this.b3 = i9;
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i9, int i10) {
        int min = Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i9));
        View.MeasureSpec.getSize(i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(g7.n.b(this.b3, 1, 5) * 48), TLObject.FLAG_30));
    }
}
