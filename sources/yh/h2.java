package yh;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.is0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class h2 extends a71 {
    public final /* synthetic */ is0 d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(Context context, int i10, hg.o oVar, g2 g2Var, g2 g2Var2, d6 d6Var, is0 is0Var) {
        super(context, i10, 0, false, oVar, g2Var, g2Var2, d6Var, 3, 1);
        this.d3 = is0Var;
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.d3.o();
    }
}
