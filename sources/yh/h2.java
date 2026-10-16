package yh;

import android.content.Context;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.ns0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class h2 extends i71 {
    public final /* synthetic */ ns0 d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(Context context, int i10, ii.a aVar, g2 g2Var, g2 g2Var2, c6 c6Var, ns0 ns0Var) {
        super(context, i10, 0, false, aVar, g2Var, g2Var2, c6Var, 3, 1);
        this.d3 = ns0Var;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.d3.o();
    }
}
