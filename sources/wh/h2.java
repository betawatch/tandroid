package wh;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.wr0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class h2 extends r61 {
    public final /* synthetic */ wr0 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(Context context, int i10, gi.a aVar, g2 g2Var, g2 g2Var2, f6 f6Var, wr0 wr0Var) {
        super(context, i10, 0, false, aVar, g2Var, g2Var2, f6Var, 3, 1);
        this.f3 = wr0Var;
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f3.o();
    }
}
