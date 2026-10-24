package yh;

import android.content.Context;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.ns0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class g2 extends j71 {
    public final /* synthetic */ ns0 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(Context context, int i10, hg.o oVar, f2 f2Var, f2 f2Var2, g6 g6Var, ns0 ns0Var) {
        super(context, i10, 0, false, oVar, f2Var, f2Var2, g6Var, 3, 1);
        this.g3 = ns0Var;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.g3.o();
    }
}
