package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.or0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class i2 extends f61 {
    public final /* synthetic */ or0 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(Context context, int i10, hi.a aVar, h2 h2Var, h2 h2Var2, f6 f6Var, or0 or0Var) {
        super(context, i10, 0, false, aVar, h2Var, h2Var2, f6Var, 3, 1);
        this.f3 = or0Var;
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f3.o();
    }
}
