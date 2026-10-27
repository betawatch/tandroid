package zh;

import android.content.Context;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.ws0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class h2 extends s71 {
    public final /* synthetic */ ws0 n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(Context context, int i10, q0 q0Var, g2 g2Var, g2 g2Var2, u6 u6Var, ws0 ws0Var) {
        super(context, i10, 0, false, q0Var, g2Var, g2Var2, u6Var, 3, 1);
        this.n3 = ws0Var;
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.n3.p();
    }
}
